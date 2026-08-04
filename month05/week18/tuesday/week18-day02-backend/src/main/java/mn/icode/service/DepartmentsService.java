package mn.icode.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mn.icode.dto.DepartmentResponse;
import mn.icode.dto.DepartmentsRequest;
import mn.icode.entity.Departments;
import mn.icode.exception.ConflictException;
import mn.icode.exception.ResourceNotFoundException;
import mn.icode.repository.DepartmentRepository;
import mn.icode.repository.StudentsRepository;

@Service
@Transactional(readOnly = true)
public class DepartmentsService {
	private final DepartmentRepository departmentRepository;
	private final StudentsRepository studentsRepository;

	public DepartmentsService(DepartmentRepository departmentRepository, StudentsRepository studentsRepository) {
		this.departmentRepository = departmentRepository;
		this.studentsRepository = studentsRepository;
	}

	public List<DepartmentResponse> findAll() {
		return departmentRepository.findAllByOrderByDepartmentNameAsc().stream().map(this::toResponse).toList();
	}

	public DepartmentResponse findById(Long id) {
		Departments department = findDepartment(id);
		return toResponse(department);
	}

	
	@Transactional
	public DepartmentResponse create(DepartmentsRequest request) {
		String name = request.departmentName().trim();
		if (departmentRepository.existsByDepartmentNameIgnoreCase(name)) {
			throw new ConflictException("A department with this name already exists");
		}

		Departments department = new Departments(name);
		Departments saveDepartment = departmentRepository.save(department);
		return toResponse(saveDepartment);
	}

	@Transactional
	public DepartmentResponse update(Long id, DepartmentsRequest request) {
		Departments department = findDepartment(id);
		String name = request.departmentName().trim();
		boolean nameAlreadyUsed = departmentRepository.existsByDepartmentNameIgnoreCaseAndIdNot(name, id);
		if (nameAlreadyUsed) {
			throw new ConflictException("Another department already uses this name");
		}

		department.setDepartmentName(name);
		Departments updateDepartment = departmentRepository.save(department);
		return toResponse(updateDepartment);
	}

	@Transactional
	public void delete(Long id) {
		Departments department = findDepartment(id);
		boolean containsStudents = studentsRepository.existsByDepartmentsId(id);
		if (containsStudents) {
			throw new ConflictException("The department cannot be deleted, because it contains students");
		}

		departmentRepository.delete(department);
	}

	public Departments findDepartmentEntity(Long id) {
		return findDepartment(id);
	}

	private Departments findDepartment(Long id) {
		return departmentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Department with ID " + id));
	}

	private DepartmentResponse toResponse(Departments department) {
		return new DepartmentResponse(department.getId(), department.getDepartmentName());
	}
}
