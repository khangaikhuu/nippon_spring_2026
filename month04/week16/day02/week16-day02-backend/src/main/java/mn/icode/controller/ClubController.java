package mn.icode.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mn.icode.model.Clubs;
import mn.icode.repository.ClubRepository;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {
	private final ClubRepository clubRepository;
	
	public ClubController(ClubRepository clubRepository) {
		this.clubRepository = clubRepository;
	}
	
	// READ: Бүх клубийн жагсаалт авах (GET)
	@GetMapping
    public List<Clubs> getAllClubs() {
        return clubRepository.findAll();
    }
	
	
	// READ: Нэг клубийг ID-аар нь олох (GET)
	@GetMapping("/{id}")
	public ResponseEntity<Clubs> getClubById(@PathVariable Long id) {
        Optional<Clubs> club = clubRepository.findById(id);
        
        // Хэрэв олдвол 200 OK буцаана, олдохгүй бол 404 Not Found буцаана
        return club.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }
	
	
}
