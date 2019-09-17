package net.devstudy.jse.lection02_classes_objects;

public class ForeignStudentTest {
    public static void main(String[] args) {
        ForeignStudent s = new ForeignStudent("Jack", "Smith", 25, "english");
        System.out.println(s.getFullName());
    }
}
