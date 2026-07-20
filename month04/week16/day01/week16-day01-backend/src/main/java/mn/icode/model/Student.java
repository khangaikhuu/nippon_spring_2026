package mn.icode.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    private int age;
    
    private String major;
    
    // Анхны constructor
    public Student() {}
    
    // Бүх утгатай constructor
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    // Getters болон Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', age=" + age + ", major='" + major + "'}";
    }
}
