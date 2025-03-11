package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Faculty class manages multiple classes in the faculty
 */
public class Faculty {
    private String facultyName;
    private List<Class> classes;

    /**
     * Constructor for Faculty
     * @param facultyName The name of the faculty
     */
    public Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.classes = new ArrayList<>();
    }

    /**
     * Adds a class to the faculty
     * @param class_ The class to be added
     */
    public void addClass(Class class_) {
        classes.add(class_);
    }

    /**
     * Gets the faculty name
     * @return The name of the faculty
     */
    public String getFacultyName() {
        return facultyName;
    }

    /**
     * Gets the list of classes in the faculty
     * @return List of classes
     */
    public List<Class> getClasses() {
        return classes;
    }
}