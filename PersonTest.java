package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Asavela on 2016-03-25.
 */
public class PersonTest {
    private Student student;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        student = new Student("Asavela", "jaqombi", "8749544854858", "210697846", "Information Technology");
        employee = new Employee("zukisa", "qolo", "8758468521254",125, "Clerk");

    }

    @Test
    public void testPerson() throws Exception {
    System.out.print("Name: " + student.getName() + " " + student.getSurname() + "\nID number: " +
    student.getIdNumber() + "\nStudent Number: " + student.studentNumber + "\nCourse: " + student.getCourse() + "\n");
    student.occupation();

    System.out.print("\n");

    System.out.print("\nName: " + employee.getName() + " " + employee.getSurname() + "\nID number: " +
    employee.getIdNumber() + "\nEmployee Number: " + employee.getEmpNumber() + "\nDepartment: " + employee.getDepartment() + "\n");
    employee.occupation();

    Assert.assertEquals(student.getStudentNumber(),"210697846");
    }
}
