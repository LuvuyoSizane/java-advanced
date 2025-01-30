package Chapter8.Exercise;

public class ThrowDepartmentException {
    public static void main(String[] args) {
        Department[] departments = new Department[6];
        int index = 0;

        // Try to create valid and invalid departments
        try {
            departments[index++] = new Department("IT", 101, 5);

        } catch (DepartmentException e) {
            System.err.println(e.getMessage());
        }

        try {
            departments[index++] = new Department("HR", 200, 28);

        } catch (DepartmentException e) {
            System.err.println(e.getMessage());
        }

        try {
            departments[index++] = new Department("SA", 450, 6);

        } catch (DepartmentException e) {
            System.err.println(e.getMessage());
        }

        try {
            departments[index++] = new Department("QAW", 175, 9);  // Invalid ID, less than 100

        } catch (DepartmentException e) {
            System.err.println(e.getMessage());
        }

        try {
            departments[index++] = new Department("RD", 501, 12); // Invalid ID, greater than 499 and employees > 10

        } catch (DepartmentException e) {
            System.err.println(e.getMessage());
        }

        try {
            departments[index++] = new Department("MK", 350, 4);

        } catch (DepartmentException e) {
            System.err.println(e.getMessage());
        }
    }
}
