package mn.icode;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// PathVariable
// /api/students
@RestController
@RequestMapping("/api/students")
public class StudentController {

	private record Student(int id, String firstName, String lastName, 
			String email, String major, int enrollmentYear,
			boolean isActive, int credits) {
	};

	private List<Student> students;

	public StudentController() {
		students = new ArrayList<>(List.of(
				new Student(1, "Alan", "Turing", "a.turing@university.com", "Computer Science", 2021, false, 120),
				new Student(2, "Ada", "Lovelace", "a.lovelace@university.com", "Mathematics", 2022, true, 95),
				new Student(3, "Grace", "Hopper", "g.hopper@university.com", "Systems Engineering", 2022, true, 110),
				new Student(4, "Margaret", "Hamilton", "m.hamilton@university", "Software Engineering", 2023, true, 45),
				new Student(5, "John", "Von Neumann", "j.vonneumann@university.com", "Physics", 2019, false, 135)

		));
	}

	// RequestParam
	// 1. /search?name=Saraa
	@GetMapping("/search")
	public List<Student> searchByName(@RequestParam String firstName) {
		List<Student> matches = new ArrayList<>();
		for (Student student : students) {
			// BUG
			if (student.firstName.equalsIgnoreCase(firstName)) {
				matches.add(student);
			}
		}
		return matches;
	}

	// 1.5 /search?name=Saraa&major=Computer Science
	@GetMapping("/search/advanced")
	public List<Student> searchByNameAndMajor(@RequestParam String firstName, @RequestParam String major){
		List<Student> matches = new ArrayList<>();
		for(Student student: students) {
			if(student.firstName.equalsIgnoreCase(firstName) && student.major.equalsIgnoreCase(major)) {
				matches.add(student);
			}
		}
		return matches;
	}

	// 2. /greet/{username} => '/api/students/greet/khangai
	@GetMapping("/greet/{username}")
	public String greetStudent(@PathVariable String username) {
		return "Welcome to the class, " + username + "!";
	}

	// 3. /profile/{id}
	// Output Profile: Alan Turing - Computer Science 
	// When id not found, "Error 404, Student ID - 10 not found in the database

	
	// 4. /{id}
	// Output: student буцаана. 
	// Хэрвээ тухайн id-д таарсан оюутан байхгүй бол null буцаана
}
