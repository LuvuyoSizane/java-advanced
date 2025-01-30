package Chapter8.UserExceptions;

public class StudentRunner {
    public static void main(String[] args) {

        try {
            Student st = new Student("2005631","asas",50,50,50);
            System.out.println(st.display(50));

        } catch (NoExamEntryException e) {
            System.err.println(e.getMessage());
        }

    }
}
