package za.ac.mzilikazi;

/**
 * Created by Asavela on 2016-03-24.
 */
public class Student extends Person{
    String studentNumber;
    String course;
    public Student() {
    }

    public Student(String name, String surname, String idNumber, String studentNumber, String course) {
        super(name, surname, idNumber);
        this.studentNumber = studentNumber;
        this.course = course;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void occupation() {
        System.out.print("This is a student ");
    }

    @Override
    public String getIdNumber() {
        return super.getIdNumber();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
