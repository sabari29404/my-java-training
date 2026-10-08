package jdbc_revise_project;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(
            name = "name",
            nullable = false,
            length = 100
    )
    private String name;

    @Column(
            name = "email",
            nullable = false,
            unique = true,
            length = 150
    )
    private String email;


    @OneToMany(
            mappedBy = "student",
            fetch = FetchType.LAZY
    )
    private List<Enrollment> enrollments = new ArrayList<>();


    public Student() {
    }


    public Student(String name, String email) {

        this.name = name;

        this.email = email;
    }


    public Integer getId() {

        return id;
    }


    public void setId(Integer id) {

        this.id = id;
    }


    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }


    public String getEmail() {

        return email;
    }


    public void setEmail(String email) {

        this.email = email;
    }


    public List<Enrollment> getEnrollments() {

        return enrollments;
    }


    public void setEnrollments(
            List<Enrollment> enrollments) {

        this.enrollments = enrollments;
    }


    @Override
    public String toString() {

        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}