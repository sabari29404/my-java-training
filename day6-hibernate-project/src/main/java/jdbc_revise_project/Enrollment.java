package jdbc_revise_project;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(
        name = "enrollments",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {
                                "student_id",
                                "course_id"
                        }
                )
        }
)
public class Enrollment {

    @Id
    private Integer id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "student_id",
            nullable = false
    )
    private Student student;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "course_id",
            nullable = false
    )
    private Course course;


    @Column(name = "enrolled_at")
    private LocalDateTime enrolledAt;


    public Enrollment() {
    }


    public Enrollment(
            Integer id,
            Student student,
            Course course,
            LocalDateTime enrolledAt) {

        this.id = id;

        this.student = student;

        this.course = course;

        this.enrolledAt = enrolledAt;
    }


    public Integer getId() {

        return id;
    }


    public void setId(Integer id) {

        this.id = id;
    }


    public Student getStudent() {

        return student;
    }


    public void setStudent(Student student) {

        this.student = student;
    }


    public Course getCourse() {

        return course;
    }


    public void setCourse(Course course) {

        this.course = course;
    }


    public LocalDateTime getEnrolledAt() {

        return enrolledAt;
    }


    public void setEnrolledAt(
            LocalDateTime enrolledAt) {

        this.enrolledAt = enrolledAt;
    }
}