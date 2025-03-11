package observer;

/**
 * Student class represents a student who can receive notifications
 * from the class monitor.
 */
public class Student implements Observer {
    private String studentId;
    private String name;

    /**
     * Constructor for Student class
     * @param studentId The unique identifier for the student
     * @param name The name of the student
     */
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public void update(String notification) {
        System.out.println("Student " + name + " (" + studentId + ") received notification: " + notification);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}