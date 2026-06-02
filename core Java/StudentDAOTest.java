
public class StudentDAOTest {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        try {
            dao.insertStudent(101, "Nandini");
            dao.updateStudent(101, "Nandini G");

            System.out.println("Operations completed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
