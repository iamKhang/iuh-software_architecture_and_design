package main;
import model.Class;
import model.Faculty;
import observer.Student;

/**
 * Main class to demonstrate the Observer pattern implementation
 * in a faculty notification system
 */
public class Main {
    public static void main(String[] args) {
        // Create a faculty
        Faculty faculty = new Faculty("Khoa Công nghệ thông tin");

        // Create classes
        Class class1 = new Class("DHKTPM17C");
        Class class2 = new Class("DHKTPM17B");

        // Add classes to faculty
        faculty.addClass(class1);
        faculty.addClass(class2);

        // Create students
        Student student1 = new Student("SE001", "Lê Hoàng Khang");
        Student student2 = new Student("SE002", "Trần Đình Kiên");
        Student student3 = new Student("SE003", "Nguyễn Thanh Cảnh");
        Student student4 = new Student("SE004", "Vũ Quốc Huy");

        // Add students to classes
        class1.addStudent(student1);
        class1.addStudent(student2);
        class2.addStudent(student3);
        class2.addStudent(student4);

        // Demonstrate notifications
        System.out.println("=== Faculty: " + faculty.getFacultyName() + " ===");
        
        // Send notifications to class SE1
        System.out.println("\n=== Class: " + class1.getClassName() + " ===");
        class1.getMonitor().sendNotification("Chiều nay đi ăn chè.");

        // Send notifications to class SE2
        System.out.println("\n=== Class: " + class2.getClassName() + " ===");
        class2.getMonitor().sendNotification("Ai nghỉ học bị 0 điểm.");
    }
}