package net.devstudy.jse.lection02_inheritance_polymorph;

import net.devstudy.jse.lection01_classes_objects.Student;

public class ForeignStudentTest {
    public static void main(String[] args) {
        Student s = new Student("Jack", "Smith", 25);
        System.out.println(s.getFullName());

        Student s1 = new ForeignStudent("Jack", "Smith", 25, "english");
        ForeignStudent s2 = new ForeignStudent("Jack", "Smith", 25, "english");
        Student s3 = s2;
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s2);
        System.out.println(s3.equals(s2));
        System.out.println(s1);
        System.out.println(s2);
    }
}
