package za.ac.mzilikazi;

/**
 * Created by Asavela on 2016-03-25.
 */
public class Employee extends Person{
    private int empNumber;
    private String department;

    public Employee() {
    }

    public Employee(String name, String surname, String idNumber, int empNumber, String department) {
        super(name, surname, idNumber);
        this.empNumber = empNumber;
        this.department = department;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getIdNumber() {
        return super.getIdNumber();
    }

    @Override
    public void occupation() {
        System.out.print("This is an employee");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
