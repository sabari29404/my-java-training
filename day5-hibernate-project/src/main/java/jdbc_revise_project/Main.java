package jdbc_revise_project;


public class Main {

    public static void main(String[] args) {

        StudentRepository repository =
                new StudentRepository();

        try {

            // CREATE
            Student student =
                    new Student(
                            "Arun",
                            "arun_hibernate@example.com"
                    );

            repository.save(student);

            System.out.println(
                    "Created: " + student
            );

            // FIND BY ID
            Student found =
                    repository.findById(
                            student.getId()
                    );

            System.out.println(
                    "Found by ID: " + found
            );

            // FIND BY EMAIL
            Student emailStudent =
                    repository.findByEmail(
                            "arun_hibernate@example.com"
                    );

            System.out.println(
                    "Found by email: " + emailStudent
            );

            // FIND ALL
            System.out.println("All students:");

            repository.findAll()
                    .forEach(System.out::println);

            // UPDATE
            repository.updateEmail(
                    student.getId(),
                    "arun_updated@example.com"
            );

            System.out.println(
                    "After update: " +
                            repository.findById(student.getId())
            );

            // DELETE
            repository.delete(student.getId());

            System.out.println(
                    "After delete: " +
                            repository.findById(student.getId())
            );

        } finally {

            HibernateUtil.close();
        }
    }
}
