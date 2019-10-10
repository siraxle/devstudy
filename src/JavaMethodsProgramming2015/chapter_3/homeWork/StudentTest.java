package JavaMethodsProgramming2015.chapter_3.homeWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArrayList<Student> arrayOfStudents = new ArrayList<Student>();
        int i = 0;
        while (true){
            arrayOfStudents.add(new Student());
            arrayOfStudents.get(i).readerDataAboutStudentFromConsole();
            System.out.println("Continue? y/n");
            String c = in.nextLine();
            if (c.equals("n")){
                for (int j=0; j<arrayOfStudents.size(); j++){
                    arrayOfStudents.get(j).writerDataAboutStudentToFile(arrayOfStudents.get(j));
                }
                break;
            }else {
                i++;
            }
        }
//      вывод массива студентов в консоль
        for (int j = 0; j < arrayOfStudents.size(); j++){
            //System.out.println(arrayOfStudents.get(j));
        }
//      считывание студентов из файла и запись их в массив студентов
        StudentTest studentTest = new StudentTest();
        String path = "./Users/Evgeney/IdeaProjects/devstudy-jse/students.txt";
        studentTest.readerDataAboutStudentFromFile(path);

    }

    public Student readerDataAboutStudentFromFile(String pathname) throws FileNotFoundException,
            ParseException {
        File file = new File(pathname);
        String dateFormat = "dd/MM/yyyy";
        Scanner scanner = new Scanner(file);

        String line = scanner.nextLine();
        String[] studentString = line.split(",");
        String surname = studentString[0];
        String name = studentString[1];
        String lastName = studentString[2];
        Date dateOfBirth = new SimpleDateFormat(dateFormat).parse(studentString[3]);
        String address = studentString[4];
        String phoneNumber = studentString[5];
        String faculty = studentString[6];
        String course = studentString[7];
        String group = studentString[8];

        Student student = new Student(surname,name,lastName,dateOfBirth,
                address,phoneNumber,faculty,course,group);
        scanner.close();
        return student;
    }

    public ArrayList<Student> writerInToArrayOfStudents (Student student){
        ArrayList<Student> arrayOfStudents = new ArrayList<Student>();
        return null;
    }


}
