package jdbc_revise_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class StudentRepository {


    // CREATE

    public void save(Student student) {

        EntityManager em =
                HibernateUtil.createEntityManager();

        EntityTransaction transaction =
                em.getTransaction();


        try {

            transaction.begin();

            em.persist(student);

            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {

                transaction.rollback();
            }

            throw e;

        } finally {

            em.close();
        }
    }


    // FIND BY ID

    public Student findById(Integer id) {

        EntityManager em =
                HibernateUtil.createEntityManager();


        try {

            return em.find(
                    Student.class,
                    id
            );

        } finally {

            em.close();
        }
    }


    // FIND BY EMAIL

    public Student findByEmail(
            String email) {

        EntityManager em =
                HibernateUtil.createEntityManager();


        try {

            String jpql =
                    "SELECT s " +
                            "FROM Student s " +
                            "WHERE s.email = :email";


            return em.createQuery(
                            jpql,
                            Student.class
                    )
                    .setParameter(
                            "email",
                            email
                    )
                    .getResultStream()
                    .findFirst()
                    .orElse(null);

        } finally {

            em.close();
        }
    }


    // FIND ALL

    public List<Student> findAll() {

        EntityManager em =
                HibernateUtil.createEntityManager();


        try {

            String jpql =
                    "SELECT s FROM Student s";


            return em.createQuery(
                    jpql,
                    Student.class
            ).getResultList();

        } finally {

            em.close();
        }
    }


    // UPDATE

    public void updateEmail(
            Integer id,
            String newEmail) {

        EntityManager em =
                HibernateUtil.createEntityManager();

        EntityTransaction transaction =
                em.getTransaction();


        try {

            transaction.begin();


            Student student =
                    em.find(
                            Student.class,
                            id
                    );


            if (student == null) {

                transaction.rollback();

                throw new StudentNotFoundException(
                        "Student not found"
                );
            }


            student.setEmail(newEmail);


            /*
             * No UPDATE query written manually.
             *
             * Hibernate detects the change
             * because student is managed.
             */

            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {

                transaction.rollback();
            }

            throw e;

        } finally {

            em.close();
        }
    }


    // DELETE

    public void delete(
            Integer id) {

        EntityManager em =
                HibernateUtil.createEntityManager();

        EntityTransaction transaction =
                em.getTransaction();


        try {

            transaction.begin();


            Student student =
                    em.find(
                            Student.class,
                            id
                    );


            if (student == null) {

                transaction.rollback();

                throw new StudentNotFoundException(
                        "Student not found"
                );
            }


            em.remove(student);


            transaction.commit();

        } catch (Exception e) {

            if (transaction.isActive()) {

                transaction.rollback();
            }

            throw e;

        } finally {

            em.close();
        }
    }


    // STUDENT COURSES

    public List<StudentCourseDTO>
    findCoursesByStudentId(
            Integer studentId) {

        EntityManager em =
                HibernateUtil.createEntityManager();


        try {

            String jpql =
                    """
                    SELECT new jdbc_revise_project.StudentCourseDTO(
                        s.id,
                        s.name,
                        c.id,
                        c.title,
                        e.enrolledAt
                    )
                    FROM Enrollment e
                    JOIN e.student s
                    JOIN e.course c
                    WHERE s.id = :studentId
                    ORDER BY c.title
                    """;


            return em.createQuery(
                            jpql,
                            StudentCourseDTO.class
                    )
                    .setParameter(
                            "studentId",
                            studentId
                    )
                    .getResultList();

        } finally {

            em.close();
        }
    }
}