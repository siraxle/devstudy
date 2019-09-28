package net.devstudy.jse.lection02_inheritance_polymorph;

import net.devstudy.jse.lection01_classes_objects.Student;

import java.util.Objects;

public class ForeignStudent extends Student {

    private String language;

    public ForeignStudent(String firstName, String lastName, int age, String language) {
        super(firstName, lastName, age);
        setLanguage(language);
        super.firstName = firstName;
    }
    public ForeignStudent() {
        super();
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public String toString() {
        return "ForeignStudent{" +
                "language='" + language + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForeignStudent that = (ForeignStudent) o;
        return language.equals(that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language);
    }
}
