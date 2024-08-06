package bt.employee.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
public class Course {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String Name;

    @OneToMany(mappedBy = "course")
    Set<StudentCourse> ratings;

    @ManyToMany(mappedBy = "likedCourses")
    private Set<Student> likes;
}
