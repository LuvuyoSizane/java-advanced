package Chapter8.Exercise;


public class Department {
    private String departmentName;
    private int departmentId;
    private int maxEmployees;

    public Department(String departmentName, int departmentId, int maxEmployees) throws DepartmentException {

        setDepartmentName(departmentName);
        setDepartmentId(departmentId);
        setMaxEmployees(maxEmployees);

        display();
    }

    public void setDepartmentName(String departmentName) throws DepartmentException {
        if (departmentName.length() != 2) {
            throw new DepartmentException("Invalid department data - Name: " + departmentName +" Either the department Name does not consist of two letters");
        }else
        this.departmentName = departmentName;
    }

    public void setDepartmentId(int departmentId) throws DepartmentException {
        if (departmentId < 100 || departmentId > 499) {
            throw new DepartmentException( "ID: " + departmentId + " the department ID does not consist of three digits between 100 and 499 inclusive");
        }else
        this.departmentId = departmentId;
    }

    public void setMaxEmployees(int maxEmployees) throws DepartmentException {
        if (maxEmployees < 4 || maxEmployees > 10) {
            throw new DepartmentException("Employees: " + maxEmployees+" the number of employees is less than 4 or more than 10");
        } else
        this.maxEmployees = maxEmployees;
    }

    public void display(){
        System.out.println("Department "+departmentName+" was created successfully.\n");
    }
}
