package mn.icode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mn.icode.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student> findByNameContainingIgnoreCase(String q);
}
