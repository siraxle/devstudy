package net.devstudy.jse.lection01_classes_objects;

import java.util.Objects;

public class Student {
    protected String firstName;
    protected String lastName;
    protected int age;

    public Student(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }
    public Student() {}
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        if(firstName.length() > 1) {
            this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1) .toLowerCase();
        } else {this.firstName = firstName.toUpperCase();}
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        if(lastName.length() > 1) {
            this.lastName = Character.toUpperCase(lastName.charAt(0)) + lastName.substring(1) .toLowerCase();
        } else {this.lastName = lastName;}
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age > 17 && age < 50 ? age : 18;
    }
    public String getFullName() {
        return getLastName() + " " + getFirstName();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
