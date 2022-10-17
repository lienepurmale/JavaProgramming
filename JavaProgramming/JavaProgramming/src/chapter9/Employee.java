package chapter9;

public class Employee extends Person{

    private String department;
    private int employeeId;

    public Employee(){
       super("Liene"); // Explicit call 
        System.out.println("In Employee default constructor");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getId() {
        return employeeId;
    }

    public void setId(int id) {
        this.employeeId = id;
    }


}
