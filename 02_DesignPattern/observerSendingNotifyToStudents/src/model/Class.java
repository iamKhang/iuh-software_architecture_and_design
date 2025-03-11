package model;

import java.util.ArrayList;
import java.util.List;
import observer.ClassMonitor;
import observer.Student;

/**
 * Class represents a class in the faculty with its students and class monitor
 */
public class Class {
    private String className;
    private ClassMonitor monitor;
    private List<Student> students;

    /**
     * Constructor for Class
     * @param className The name of the class
     */
    public Class(String className) {
        this.className = className;
        this.monitor = new ClassMonitor();
        this.students = new ArrayList<>();
    }

    /**
     * Adds a student to the class and registers them as an observer
     * @param student The student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
        monitor.attach(student);
    }

    /**
     * Gets the class monitor
     * @return The ClassMonitor object
     */
    public ClassMonitor getMonitor() {
        return monitor;
    }

    /**
     * Gets the class name
     * @return The name of the class
     */
    public String getClassName() {
        return className;
    }
}