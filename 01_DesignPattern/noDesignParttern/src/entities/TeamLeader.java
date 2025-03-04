package entities;

public class TeamLeader extends Employee {
    public TeamLeader(String name, String id) {
        super(name, "Đội Trưởng", id);
    }

    public void patrol() {
        System.out.println("Đội trưởng " + getName() + " đang đi tuần tra");
    }

    public void assignTasks() {
        System.out.println("Đội trưởng " + getName() + " đang phân công công việc cho nhân viên");
    }

    public void displayDuties() {
        System.out.println("\nCông việc của Đội trưởng " + getName() + ":");
        System.out.println("1. Đi tuần tra");
        System.out.println("2. Phân công công việc cho nhân viên");
        System.out.println("3. Giám sát công việc");
        System.out.println("4. Báo cáo tiến độ");
    }
} 