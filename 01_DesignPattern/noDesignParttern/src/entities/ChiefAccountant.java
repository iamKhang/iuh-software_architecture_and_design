package entities;

public class ChiefAccountant extends Employee {
    public ChiefAccountant(String name, String id) {
        super(name, "Kế Toán Trưởng", id);
    }

    public void reviewFinancials() {
        System.out.println("Kế toán trưởng " + getName() + " đang kiểm tra báo cáo tài chính");
    }

    public void approveBudget() {
        System.out.println("Kế toán trưởng " + getName() + " đang phê duyệt ngân sách");
    }

    public void displayDuties() {
        System.out.println("\nCông việc của Kế toán trưởng " + getName() + ":");
        System.out.println("1. Kiểm tra báo cáo tài chính");
        System.out.println("2. Phê duyệt ngân sách");
        System.out.println("3. Quản lý team kế toán");
        System.out.println("4. Lập kế hoạch tài chính");
    }
} 