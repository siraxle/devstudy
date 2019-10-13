package JavaMethodsProgramming2015.chapter_3.homeWork.student;

import java.util.List;

import static JavaMethodsProgramming2015.chapter_3.homeWork.student.AppManager.*;

public class StudentTest {

    public static void main(String[] args) throws Exception {
//        ArrayList<Student> arrayOfStudents = readAllFromConsole();
//        writeInFile(arrayOfStudents);
        List<Student> students = readFromFileWriteInArray();
//
//        System.out.println(students.get(0).toString());
//        outputArrayOfStudentsInToConsole(arrayOfStudents);

//        Date date = new Date(85, 12, 01);
//        printStudentsWithYearAfter(date, students);


//        listStudentsFromSomeFaculty("MP3", students);

//        listStudentsForSomeCource("3", students);

        listStudentsForSomeGroup("Н51", students);

    }


}
