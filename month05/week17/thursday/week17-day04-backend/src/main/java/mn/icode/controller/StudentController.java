package mn.icode.controller;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import mn.icode.models.Student;
import mn.icode.repository.EnrollmentRepository;
import mn.icode.repository.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {
	private final StudentRepository studentRepository;
	private final EnrollmentRepository enrollmentRepository;

	public StudentController(StudentRepository studentRepository, EnrollmentRepository enrollmentRepository) {
		this.studentRepository = studentRepository;
		this.enrollmentRepository = enrollmentRepository;
	}

	@GetMapping("/students")
	public List<Student> list(@RequestParam(defaultValue = "10") int limit) {
		return studentRepository.findAll(PageRequest.of(0, limit, Sort.by(Student::getName))).getContent();
	}

	@PostMapping("/students")
	public Map<String, String> add(@RequestBody Map<String, String> body) {

		studentRepository.save(new Student(body.get("name"), body.get("email")));

		return Map.of("status", "created");
	}

	@DeleteMapping("/students/{id}")
	public Map<String, String> delete(@PathVariable int id) {
		studentRepository.deleteById(id);
		return Map.of("status", "deleted");
	}

}
