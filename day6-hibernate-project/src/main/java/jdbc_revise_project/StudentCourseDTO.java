package jdbc_revise_project;

import java.time.LocalDateTime;

public record StudentCourseDTO(

        Integer studentId,

        String studentName,

        Integer courseId,

        String courseTitle,

        LocalDateTime enrolledAt

) {
}