package decorator;

import interfaces.IEmployee;

public class AccountingManagerDecorator extends EmployeeDecorator {
    
    public AccountingManagerDecorator(IEmployee employee) {
        super(employee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Kế toán trưởng";
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Nhiệm vụ của Kế toán trưởng:");
        quanLyTaiChinh();
        lapBaoCaoTaiChinh();
        kiemSoatChiPhi();
        quanLyThue();
    }

    private void quanLyTaiChinh() {
        System.out.println("- Quản lý tài chính công ty");
    }

    private void lapBaoCaoTaiChinh() {
        System.out.println("- Lập và phân tích báo cáo tài chính");
    }

    private void kiemSoatChiPhi() {
        System.out.println("- Kiểm soát chi phí và ngân sách");
    }

    private void quanLyThue() {
        System.out.println("- Quản lý thuế và tuân thủ quy định tài chính");
    }
} 