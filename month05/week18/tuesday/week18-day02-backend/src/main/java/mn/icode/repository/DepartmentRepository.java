package mn.icode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mn.icode.entity.Departments;

public interface DepartmentRepository extends JpaRepository<Departments, Long> {
	List<Departments> findAllByOrderByDepartmentNameAsc();
	
	boolean existsByDepartmentNameIgnoreCase(String name);
	
	boolean existsByDepartmentNameIgnoreCaseAndIdNot(String name, Long id);
}
