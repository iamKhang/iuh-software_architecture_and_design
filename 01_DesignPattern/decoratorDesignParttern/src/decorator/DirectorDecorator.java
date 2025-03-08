package decorator;

import interfaces.IEmployee;

public class DirectorDecorator extends EmployeeDecorator {
    
    public DirectorDecorator(IEmployee employee) {
        super(employee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Giám đốc";
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Nhiệm vụ của Giám đốc:");
        hoachDinhChienLuoc();
        quanLyNhanSu();
        phatTrienKinhDoanh();
        kyKetHopDong();
    }

    private void hoachDinhChienLuoc() {
        System.out.println("- Hoạch định chiến lược phát triển công ty");
    }

    private void quanLyNhanSu() {
        System.out.println("- Quản lý nhân sự cấp cao");
    }

    private void phatTrienKinhDoanh() {
        System.out.println("- Phát triển quan hệ đối tác kinh doanh");
    }

    private void kyKetHopDong() {
        System.out.println("- Ký kết hợp đồng quan trọng");
    }
} 