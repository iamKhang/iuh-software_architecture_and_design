package strategy;

public class TeamLeaderStrategy implements WorkStrategy {
    @Override
    public String work() {
        return "Quản lý và điều phối công việc của nhóm";
    }

    @Override
    public String reportWork() {
        return "Báo cáo tiến độ công việc của nhóm cho cấp trên";
    }

    @Override
    public String patrol() {
        return "Tuần tra và kiểm tra công việc của nhân viên";
    }

    @Override
    public String assignTasks() {
        return "Phân công công việc cho các thành viên trong nhóm";
    }

    @Override
    public String trainNewEmployees() {
        return "Đào tạo nhân viên mới về quy trình làm việc";
    }

    @Override
    public String planWork() {
        return "Lập kế hoạch công việc cho tuần tới";
    }

    @Override
    public String manageBudget() {
        return "Không có quyền quản lý ngân sách";
    }

    @Override
    public String handleDocuments() {
        return "Xử lý tài liệu nội bộ của nhóm";
    }

    @Override
    public String operateMachinery() {
        return "Không có nhiệm vụ vận hành máy móc";
    }

    @Override
    public String maintainEquipment() {
        return "Giám sát việc bảo trì thiết bị của nhóm";
    }

    @Override
    public String manageAccounting() {
        return "Không có nhiệm vụ quản lý kế toán";
    }

    @Override
    public String prepareFinancialReports() {
        return "Không có nhiệm vụ lập báo cáo tài chính";
    }
} 