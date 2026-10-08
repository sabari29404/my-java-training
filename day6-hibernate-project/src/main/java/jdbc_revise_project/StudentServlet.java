package jdbc_revise_project;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/students")
public class StudentServlet
        extends HttpServlet {


    private final StudentRepository repository =
            new StudentRepository();


    // =========================
    // GET
    // =========================

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


        String idParameter =
                request.getParameter("id");


        try {

            // GET /students

            if (idParameter == null ||
                    idParameter.isBlank()) {


                List<Student> students =
                        repository.findAll();


                response.setStatus(
                        HttpServletResponse.SC_OK
                );


                for (Student student :
                        students) {

                    response.getWriter()
                            .println(student);
                }


                return;
            }


            // GET /students?id=1

            int id;


            try {

                id = Integer.parseInt(
                        idParameter.trim()
                );

            } catch (NumberFormatException e) {

                response.setStatus(
                        HttpServletResponse.SC_BAD_REQUEST
                );

                response.getWriter()
                        .println(
                                "Invalid student ID"
                        );

                return;
            }


            // Negative ID

            if (id < 0) {

                response.setStatus(
                        HttpServletResponse.SC_BAD_REQUEST
                );

                response.getWriter()
                        .println(
                                "ID must be positive"
                        );

                return;
            }


            Student student =
                    repository.findById(id);


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


            response.setStatus(
                    HttpServletResponse.SC_OK
            );


            response.getWriter()
                    .println(student);


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


    // =========================
    // POST
    // =========================

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {


        response.setContentType(
                "text/plain"
        );

        response.setCharacterEncoding(
                "UTF-8"
        );


        String name =
                request.getParameter("name");

        String email =
                request.getParameter("email");


        // NAME VALIDATION

        if (name == null ||
                name.isBlank()) {

            response.setStatus(
                    HttpServletResponse.SC_BAD_REQUEST
            );

            response.getWriter()
                    .println(
                            "Name is required"
                    );

            return;
        }


        // EMAIL VALIDATION

        if (email == null ||
                email.isBlank()) {

            response.setStatus(
                    HttpServletResponse.SC_BAD_REQUEST
            );

            response.getWriter()
                    .println(
                            "Email is required"
                    );

            return;
        }


        name = name.trim();

        email = email.trim();


        // Check duplicate email

        try {

            Student existing =
                    repository.findByEmail(
                            email
                    );


            if (existing != null) {

                response.setStatus(
                        HttpServletResponse.SC_CONFLICT
                );

                response.getWriter()
                        .println(
                                "Email already exists"
                        );

                return;
            }


            // CREATE STUDENT

            Student student =
                    new Student(
                            name,
                            email
                    );


            repository.save(student);


            // Location header

            String location =
                    request.getContextPath()
                            + "/students?id="
                            + student.getId();


            response.setHeader(
                    "Location",
                    location
            );


            response.setStatus(
                    HttpServletResponse.SC_CREATED
            );


            response.getWriter()
                    .println(
                            "Student created successfully"
                    );


            response.getWriter()
                    .println(
                            "Student ID: "
                                    + student.getId()
                    );


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