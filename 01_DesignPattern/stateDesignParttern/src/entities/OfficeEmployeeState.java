package entities;

import entities.interfaces.IState;

public class OfficeEmployeeState implements IState {
    @Override
    public void work() {
        System.out.println("Công việc của Nhân Viên Văn Phòng:");
        System.out.println("1. Pha và phê duyệt tài liệu");
        System.out.println("2. Xử lý công văn, giấy tờ");
        System.out.println("3. Tiếp khách và hỗ trợ các phòng ban");
    }

    @Override
    public String getPosition() {
        return "Nhân Viên Văn Phòng";
    }
} 