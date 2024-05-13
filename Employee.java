package Clases;

/**
 * Class to store information about employees.
 * @author sheilaRodríguez.
 */
public class Employee extends User
{
    private int employeeCode;


    public int getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(int employeeCode) {
        this.employeeCode = employeeCode;
    }
}
