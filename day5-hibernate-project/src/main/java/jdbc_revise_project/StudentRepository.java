package jdbc_revise_project;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class StudentRepository {

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

    public Student findById(Integer id) {

        EntityManager em =
                HibernateUtil.createEntityManager();

        try {

            return em.find(Student.class, id);

        } finally {

            em.close();
        }
    }

    public Student findByEmail(String email) {

        EntityManager em =
                HibernateUtil.createEntityManager();

        try {

            String jpql =
                    "SELECT s FROM Student s WHERE s.email = :email";

            return em.createQuery(jpql, Student.class)
                    .setParameter("email", email)
                    .getResultStream()
                    .findFirst()
                    .orElse(null);

        } finally {

            em.close();
        }
    }

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

    public void updateEmail(Integer id, String newEmail) {

        EntityManager em =
                HibernateUtil.createEntityManager();

        EntityTransaction transaction =
                em.getTransaction();

        try {

            transaction.begin();

            Student student =
                    em.find(Student.class, id);

            if (student == null) {

                System.out.println("Student not found");

                transaction.rollback();

                return;
            }

            student.setEmail(newEmail);

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

    public void delete(Integer id) {

        EntityManager em =
                HibernateUtil.createEntityManager();

        EntityTransaction transaction =
                em.getTransaction();

        try {

            transaction.begin();

            Student student =
                    em.find(Student.class, id);

            if (student == null) {

                System.out.println("Student not found");

                transaction.rollback();

                return;
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
}
