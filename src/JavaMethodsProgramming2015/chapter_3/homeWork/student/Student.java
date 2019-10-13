package JavaMethodsProgramming2015.chapter_3.homeWork.student;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {

    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private int id;
    private String surname;
    private String name;
    private String lastName;
    private Date dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private String course;
    private String group;

    public Student(String surname, String name, String lastName,
                   Date dateOfBirth, String address, String phoneNumber,
                   String faculty, String course, String group) {
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.setId();
    }

    public Student(){
        this.setId();
    }

    public int getId() {
        return id;
    }

    private void setId() {
        this.id = COUNTER.getAndIncrement();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date readDate() throws Exception{
        String dateFormat = "dd/MM/yyyy";
        Scanner scanner = new Scanner(System.in);
        return new SimpleDateFormat(dateFormat).parse(scanner.nextLine());
    }

    public void readerDataAboutStudentFromConsole() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter surname:");
        this.surname = in.nextLine();
//        System.out.println("Enter name:");
//        this.name = in.nextLine();
//        System.out.println("Enter lastName:");
//        this.lastName = in.nextLine();
        System.out.println("Enter dateOfBirth:");
        this.dateOfBirth = readDate();
//        System.out.println("Enter address:");
//        this.address = in.nextLine();
//        System.out.println("Enter phoneNumber:");
//        this.phoneNumber = in.nextLine();
//        System.out.println("Enter faculty:");
//        this.faculty = in.nextLine();
//        System.out.println("Enter course:");
//        this.course = in.nextLine();
//        System.out.println("Enter group:");
//        this.group = in.nextLine();
    }

    public void writerDataAboutStudentToFile(Student student) throws Exception{
        try(FileWriter writer = new FileWriter("students.txt", true)) {
            // запись всей строки
            String newLineStudent = student.toString();
            writer.append(newLineStudent);
            // запись по символам
            writer.append('\n');
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return        surname +
                "," + name +
                "," + lastName +
                "," + dateFormat.format(dateOfBirth) +
                "," + address +
                "," + phoneNumber +
                "," + faculty +
                "," + course +
                "," + group +
                "," + getId();
    }

}
