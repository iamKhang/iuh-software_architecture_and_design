package entities;

public class Director extends Employee {
    public Director(String name, String id) {
        super(name, "Giám Đốc", id);
    }

    public void makeDecisions() {
        System.out.println("Giám đốc " + getName() + " đang ra quyết định chiến lược");
    }

    public void attendMeetings() {
        System.out.println("Giám đốc " + getName() + " đang tham dự cuộc họp quan trọng");
    }

    public void displayDuties() {
        System.out.println("\nCông việc của Giám đốc " + getName() + ":");
        System.out.println("1. Ra quyết định chiến lược");
        System.out.println("2. Tham dự các cuộc họp quan trọng");
        System.out.println("3. Phê duyệt các kế hoạch");
        System.out.println("4. Đại diện công ty");
    }
} 