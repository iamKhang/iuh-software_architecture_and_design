package entities;

import entities.interfaces.IState;

public class DirectorState implements IState {
    @Override
    public void work() {
        System.out.println("Công việc của Giám Đốc:");
        System.out.println("1. Hoạch định chiến lược công ty");
        System.out.println("2. Quản lý và điều hành công ty");
        System.out.println("3. Đưa ra quyết định quan trọng");
        System.out.println("4. Họp hội đồng quản trị");
    }

    @Override
    public String getPosition() {
        return "Giám Đốc";
    }
} 