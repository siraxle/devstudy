package net.devstudy.jse.lection02_classes_objects;

import net.devstudy.jse.lection01_classes_objects.Student;

public class ForeignStudent extends Student {

    private String language;
    public ForeignStudent(String firstName, String lastName, int age, String language) {
        super(firstName, lastName, age);
        setLanguage(language);
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

}
