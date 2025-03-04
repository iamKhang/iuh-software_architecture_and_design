package entities;

public class OfficeStaff extends Employee {
    public OfficeStaff(String name, String id) {
        super(name, "Nhân viên VP", id);
    }

    public void makeCoffee() {
        System.out.println("Nhân viên VP " + getName() + " đang pha cà phê");
    }

    public void reviewDocuments() {
        System.out.println("Nhân viên VP " + getName() + " đang phê duyệt tài liệu");
    }

    public void displayDuties() {
        System.out.println("\nCông việc của Nhân viên VP " + getName() + ":");
        System.out.println("1. Pha cà phê");
        System.out.println("2. Phê duyệt tài liệu");
        System.out.println("3. Xử lý công văn");
        System.out.println("4. Sắp xếp lịch họp");
    }
} 