package jdbc_revise_project;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/student-courses")
public class StudentCoursesServlet
        extends HttpServlet {


    private final StudentRepository repository =
            new StudentRepository();


    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {


        response.setContentType(
                "text/plain"
        );

        response.setCharacterEncoding(
                "UTF-8"
        );


        String studentIdParameter =
                request.getParameter(
                        "studentId"
                );


        // Missing studentId

        if (studentIdParameter == null ||
                studentIdParameter.isBlank()) {


            response.setStatus(
                    HttpServletResponse.SC_BAD_REQUEST
            );


            response.getWriter()
                    .println(
                            "studentId is required"
                    );

            return;
        }


        int studentId;


        try {

            studentId =
                    Integer.parseInt(
                            studentIdParameter.trim()
                    );

        } catch (NumberFormatException e) {

            response.setStatus(
                    HttpServletResponse.SC_BAD_REQUEST
            );

            response.getWriter()
                    .println(
                            "studentId must be a number"
                    );

            return;
        }


        if (studentId < 0) {

            response.setStatus(
                    HttpServletResponse.SC_BAD_REQUEST
            );

            response.getWriter()
                    .println(
                            "studentId must be positive"
                    );

            return;
        }


        try {

            // First check student exists

            Student student =
                    repository.findById(studentId);


            if (student == null) {

                response.setStatus(
                        HttpServletResponse.SC_NOT_FOUND
                );

                response.getWriter()
                        .println(
                                "Student not found"
                        );

                return;
            }


            List<StudentCourseDTO> courses =
                    repository.findCoursesByStudentId(
                            studentId
                    );


            response.setStatus(
                    HttpServletResponse.SC_OK
            );


            response.getWriter()
                    .println(
                            "Student: "
                                    + student.getName()
                    );


            response.getWriter()
                    .println(
                            "Email: "
                                    + student.getEmail()
                    );


            response.getWriter()
                    .println();


            if (courses.isEmpty()) {

                response.getWriter()
                        .println(
                                "No courses enrolled"
                        );

                return;
            }


            for (StudentCourseDTO course :
                    courses) {


                response.getWriter()
                        .println(
                                "Course ID: "
                                        + course.courseId()
                        );


                response.getWriter()
                        .println(
                                "Course: "
                                        + course.courseTitle()
                        );


                response.getWriter()
                        .println(
                                "Enrolled At: "
                                        + course.enrolledAt()
                        );


                response.getWriter()
                        .println(
                                "----------------------"
                        );
            }


        } catch (Exception e) {

            e.printStackTrace();


            response.setStatus(
                    HttpServletResponse.SC_INTERNAL_SERVER_ERROR
            );

            response.getWriter()
                    .println(
                            "Internal server error"
                    );
        }
    }
}