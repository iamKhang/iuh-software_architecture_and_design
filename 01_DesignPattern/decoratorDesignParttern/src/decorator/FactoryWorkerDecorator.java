package decorator;

import interfaces.IEmployee;

public class FactoryWorkerDecorator extends EmployeeDecorator {
    
    public FactoryWorkerDecorator(IEmployee employee) {
        super(employee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Nhân viên xưởng";
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Nhiệm vụ của Nhân viên xưởng:");
        vanHanhMayMoc();
        kiemTraChatLuong();
        baoTriThietBi();
        tuanThuAnToan();
    }

    private void vanHanhMayMoc() {
        System.out.println("- Vận hành máy móc và thiết bị sản xuất");
    }

    private void kiemTraChatLuong() {
        System.out.println("- Kiểm tra chất lượng sản phẩm");
    }

    private void baoTriThietBi() {
        System.out.println("- Bảo trì cơ bản thiết bị");
    }

    private void tuanThuAnToan() {
        System.out.println("- Tuân thủ quy định an toàn lao động");
    }
} 