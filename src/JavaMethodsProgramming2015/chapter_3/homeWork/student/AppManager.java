package JavaMethodsProgramming2015.chapter_3.homeWork.student;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AppManager {

    static void printStudentsWithYearAfter(Date date, List<Student> students) {
        List<Student> result = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getDateOfBirth().after(date)) {
                result.add(student);
                System.out.println(student);
            }
        }
    }

    public static List<Student> readFromFileWriteInArray() throws FileNotFoundException, ParseException {
        //      считывание студентов из файла и запись их в массив студентов
        StudentTest studentTest = new StudentTest();
        String path = "/Users/axle/Documents/CodeJava/devstudy/students.txt";
        return AppManager.readerDataAboutStudentFromFile(path);
    }

    public static void writeInFile(ArrayList<Student> arrayOfStudents) throws Exception {
        //цикл записи в файл
        for (int j=0; j<arrayOfStudents.size(); j++){
            arrayOfStudents.get(j).writerDataAboutStudentToFile(arrayOfStudents.get(j));
        }
    }

    public static ArrayList<Student> readAllFromConsole() throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<Student> arrayOfStudents = new ArrayList<Student>();

        //цикл чтения из консоли
        while (true){
            Student student = new Student();
            arrayOfStudents.add(student);
            student.readerDataAboutStudentFromConsole();
            System.out.println("Continue? y/n");
            String c = in.nextLine();
            if (c.equals("n")){
                break;
            }
        }
        return arrayOfStudents;
    }

    //метод чтения данных из файла
    public static List<Student> readerDataAboutStudentFromFile(String pathname) throws FileNotFoundException,
            ParseException {
        List<Student> students = new ArrayList<Student>();
        File file = new File(pathname);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] studentString = line.split(",");
            String surname = studentString[0];
            String name = studentString[1];
            String lastName = studentString[2];
            Date dateOfBirth = dateFormat.parse(studentString[3]);
            String address = studentString[4];
            String phoneNumber = studentString[5];
            String faculty = studentString[6];
            String course = studentString[7];
            String group = studentString[8];

            Student student = new Student(surname, name, lastName, dateOfBirth,
                    address, phoneNumber, faculty, course, group);
            students.add(student);
        }
        scanner.close();
        return students;
    }


    public static void outputArrayOfStudentsInToConsole(ArrayList<Student> arrayOfStudents) {
        //      вывод массива студентов в консоль
        for (int j = 0; j < arrayOfStudents.size(); j++) {
            //System.out.println(students.get(j));
        }
    }

    public static void listStudentsFromSomeFaculty(String faculty, List<Student> students) {

        ArrayList<Student> result = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFaculty().equals(faculty)) {
                result.add(students.get(i));
                System.out.println(students.get(i));
            }
        }

    }

    public static void listStudentsForSomeCource(String course, List<Student> students) {

        ArrayList<Student> result = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse().equals(course)){
                result.add(students.get(i));
                System.out.println(students.get(i));
            }
        }

    }

    public static void listStudentsForSomeGroup(String group, List<Student> students) {

        ArrayList<Student> result = new ArrayList<Student>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGroup().equals(group)){
                result.add(students.get(i));
                System.out.println(students.get(i));
            }
        }

    }

}
