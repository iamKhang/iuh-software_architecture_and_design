package entities;

public class FactoryWorker extends Employee {
    public FactoryWorker(String name, String id) {
        super(name, "Nhân Viên Xưởng", id);
    }

    public void operate() {
        System.out.println("Nhân viên xưởng " + getName() + " đang vận hành máy móc");
    }

    public void maintain() {
        System.out.println("Nhân viên xưởng " + getName() + " đang bảo trì thiết bị");
    }

    public void displayDuties() {
        System.out.println("\nCông việc của Nhân viên xưởng " + getName() + ":");
        System.out.println("1. Vận hành máy móc");
        System.out.println("2. Bảo trì thiết bị");
        System.out.println("3. Kiểm tra chất lượng sản phẩm");
        System.out.println("4. Báo cáo sự cố");
    }
} 