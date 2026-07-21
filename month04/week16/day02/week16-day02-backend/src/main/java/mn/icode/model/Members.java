package mn.icode.model;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import jakarta.persistence.*;

@Entity
@Table(name = "members")
public class Members {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // SERIAL
	private Long id;

	@Column(nullable = false, unique = true, length = 200)
	private String email;

	@Column(name = "full_name", nullable = false, length = 100)
	private String fullName;

	// NUMERIC(10, 2) төрлийг Java-д BigDecimal-аар төлөөлүүлнэ
	@Column(name = "subscription_fee", precision = 10, scale = 2)
	private BigDecimal subscriptionFee;

	// TIMESTAMPTZ төрөлд ZonedDateTime ашиглах нь хамгийн зөв
	@Column(name = "joined_at", updatable = false)
	private ZonedDateTime joinedAt = ZonedDateTime.now();
	
//	relationship with club
	// --- RELATIONSHIP: FOREIGN KEY ---
    // Олон гишүүн НЭГ клубт харьяалагдана
    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "club_id") // Бааз дээр үүсэх баганын (Foreign Key) нэр
    private Clubs clubs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public BigDecimal getSubscriptionFee() {
		return subscriptionFee;
	}

	public void setSubscriptionFee(BigDecimal subscriptionFee) {
		this.subscriptionFee = subscriptionFee;
	}

	public ZonedDateTime getJoinedAt() {
		return joinedAt;
	}

	public void setJoinedAt(ZonedDateTime joinedAt) {
		this.joinedAt = joinedAt;
	}

	public Clubs getClubs() {
		return clubs;
	}

	public void setClubs(Clubs clubs) {
		this.clubs = clubs;
	}

    
}
