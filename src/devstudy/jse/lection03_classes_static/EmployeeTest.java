package devstudy.jse.lection03_classes_static;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println(Employee.counter);
        new Employee();
        new Employee();
        new Employee();
        new Employee();
        new Employee();
        System.out.println(Employee.counter);
    }
}
