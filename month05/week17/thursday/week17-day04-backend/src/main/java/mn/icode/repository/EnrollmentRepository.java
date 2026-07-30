package mn.icode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mn.icode.models.Enrollment;
import mn.icode.models.EnrollmentView;

public interface EnrollmentRepository

		extends JpaRepository<Enrollment, Integer> {

	@Query("""
			SELECT new mn.icode.models.EnrollmentView(s.name, c.title, e.grade)
			FROM Enrollment e
			JOIN e.student s
			JOIN e.course c
			ORDER BY s.name, c.title
			""")
	List<EnrollmentView> findAllViews();
}
