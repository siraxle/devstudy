package JavaMethodsProgramming2015.chapter_3.homeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //Student student_01 = new Student();
        //student_01.readerDataAboutStudent();
        //System.out.println(student_01);

        //Student student_02 = new Student().readerDataAboutStudent();
        //student_02.readerDataAboutStudent();
        //System.out.println(student_02);

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

        for (int j = 0; j < arrayOfStudents.size(); j++){
            System.out.println(arrayOfStudents.get(j));
        }

//        Student student = new Student();
//        student.writerDataAboutStudentToFile();

    }

}
