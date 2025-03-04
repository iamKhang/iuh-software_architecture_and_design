package entities;

import entities.interfaces.IState;

public class TeamLeaderState implements IState {
    @Override
    public void work() {
        System.out.println("Công việc của Đội Trưởng:");
        System.out.println("1. Đi tuần tra và kiểm tra công việc");
        System.out.println("2. Gán việc cho nhân viên");
        System.out.println("3. Báo cáo tiến độ công việc");
    }

    @Override
    public String getPosition() {
        return "Đội Trưởng";
    }
} 