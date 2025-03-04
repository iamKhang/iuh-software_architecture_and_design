package entities;

import entities.interfaces.IState;

public class FactoryWorkerState implements IState {
    @Override
    public void work() {
        System.out.println("Công việc của Nhân Viên Xưởng:");
        System.out.println("1. Vận hành máy móc");
        System.out.println("2. Sản xuất sản phẩm");
        System.out.println("3. Kiểm tra chất lượng");
        System.out.println("4. Bảo trì thiết bị");
    }

    @Override
    public String getPosition() {
        return "Nhân Viên Xưởng";
    }
} 