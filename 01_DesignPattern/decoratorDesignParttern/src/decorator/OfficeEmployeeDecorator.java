package decorator;

import interfaces.IEmployee;

public class OfficeEmployeeDecorator extends EmployeeDecorator {
    
    public OfficeEmployeeDecorator(IEmployee employee) {
        super(employee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Nhân viên văn phòng";
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Nhiệm vụ của Nhân viên văn phòng:");
        xuLyVanBan();
        quanLyHoSo();
        thamGiaHop();
        hoTroHanhChinh();
    }

    private void xuLyVanBan() {
        System.out.println("- Xử lý văn bản và tài liệu");
    }

    private void quanLyHoSo() {
        System.out.println("- Quản lý hồ sơ và lưu trữ");
    }

    private void thamGiaHop() {
        System.out.println("- Tham gia các cuộc họp và ghi biên bản");
    }

    private void hoTroHanhChinh() {
        System.out.println("- Hỗ trợ công việc hành chính văn phòng");
    }
} 