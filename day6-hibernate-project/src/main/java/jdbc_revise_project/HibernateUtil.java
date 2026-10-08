package jdbc_revise_project;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory(
                    "studentPU"
            );


    public static EntityManager createEntityManager() {

        return emf.createEntityManager();
    }


    public static void close() {

        if (emf.isOpen()) {

            emf.close();
        }
    }
}