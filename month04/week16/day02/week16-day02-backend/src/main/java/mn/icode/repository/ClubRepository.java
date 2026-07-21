package mn.icode.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.icode.model.Clubs;

@Repository
public interface ClubRepository extends JpaRepository<Clubs, Long>{
	
	// 1. Spring Data JPA-ийн "Query Method" - SQL бичихгүйгээр нэрээр хайх
    // Ард нь: SELECT * FROM clubs WHERE name = ? гэж ажиллана.
    
	Optional<Clubs> findByName(String name);
    
 // 2. Зөвхөн идэвхтэй (is_active = true) клубуудыг шүүж авах
    // Ард нь: SELECT * FROM clubs WHERE is_active = true гэж ажиллана.

    List<Clubs> findByIsActiveTrue();
    
    // 3. Тодорхой ангиллын (category) клубуудыг олох
    
    List<Clubs> findByCategory(String category);
}
