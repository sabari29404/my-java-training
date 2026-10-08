package jdbc_revise_project;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    private Integer id;


    @Column(
            name = "title",
            nullable = false,
            length = 100
    )
    private String title;


    @Column(
            name = "capacity",
            nullable = false
    )
    private Integer capacity;


    @OneToMany(
            mappedBy = "course",
            fetch = FetchType.LAZY
    )
    private List<Enrollment> enrollments =
            new ArrayList<>();


    public Course() {
    }


    public Course(
            Integer id,
            String title,
            Integer capacity) {

        this.id = id;

        this.title = title;

        this.capacity = capacity;
    }


    public Integer getId() {

        return id;
    }


    public void setId(Integer id) {

        this.id = id;
    }


    public String getTitle() {

        return title;
    }


    public void setTitle(String title) {

        this.title = title;
    }


    public Integer getCapacity() {

        return capacity;
    }


    public void setCapacity(Integer capacity) {

        this.capacity = capacity;
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

        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}