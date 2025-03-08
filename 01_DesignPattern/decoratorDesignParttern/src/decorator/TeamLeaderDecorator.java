package decorator;

import interfaces.IEmployee;

public class TeamLeaderDecorator extends EmployeeDecorator {
    
    public TeamLeaderDecorator(IEmployee employee) {
        super(employee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Đội trưởng";
    }

    @Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Nhiệm vụ của Đội trưởng:");
        diTuan();
        phanCongCongViec();
        kiemTraTienDo();
        hopDoiNhom();
    }

    private void diTuan() {
        System.out.println("- Đi tuần kiểm tra công việc");
    }

    private void phanCongCongViec() {
        System.out.println("- Phân công công việc cho nhân viên");
    }

    private void kiemTraTienDo() {
        System.out.println("- Kiểm tra tiến độ công việc");
    }

    private void hopDoiNhom() {
        System.out.println("- Tổ chức họp đội nhóm hàng tuần");
    }
} 