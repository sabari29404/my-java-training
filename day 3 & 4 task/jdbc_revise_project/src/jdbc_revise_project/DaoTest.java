package jdbc_revise_project;

import java.util.List;

public class DaoTest {

	public static void main(String[] args) {
		
		StudentDao dao=new StudentDao();

        Student student = new Student(10, "Arun", "arun@example.com");
        dao.insert(student);

        Student s1 = dao.findById(8);
        System.out.println(s1);

        Student s2 = dao.findByEmail("arun@example.com");
        System.out.println(s2);

        dao.updateEmail(4, "arun@example.com");

        List<Student> students = dao.listAll();

        for (Student s : students) {
            System.out.println(s);
        }

        dao.deleteById(8L);


	}

}
