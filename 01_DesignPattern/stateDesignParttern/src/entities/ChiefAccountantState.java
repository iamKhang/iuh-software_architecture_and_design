package entities;

import entities.interfaces.IState;

public class ChiefAccountantState implements IState {
    @Override
    public void work() {
        System.out.println("Công việc của Kế Toán Trưởng:");
        System.out.println("1. Quản lý tài chính công ty");
        System.out.println("2. Lập báo cáo tài chính");
        System.out.println("3. Kiểm soát chi tiêu");
        System.out.println("4. Quản lý đội ngũ kế toán");
    }

    @Override
    public String getPosition() {
        return "Kế Toán Trưởng";
    }
} 