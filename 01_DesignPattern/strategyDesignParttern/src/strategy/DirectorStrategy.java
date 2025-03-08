package strategy;

public class DirectorStrategy implements WorkStrategy {
    @Override
    public String work() {
        return "Điều hành và quản lý hoạt động công ty";
    }

    @Override
    public String reportWork() {
        return "Báo cáo kết quả hoạt động cho hội đồng quản trị";
    }

    @Override
    public String patrol() {
        return "Kiểm tra hoạt động các phòng ban";
    }

    @Override
    public String assignTasks() {
        return "Phân công nhiệm vụ cho các trưởng phòng";
    }

    @Override
    public String trainNewEmployees() {
        return "Đào tạo và định hướng cho nhân sự cấp cao mới";
    }

    @Override
    public String planWork() {
        return "Hoạch định chiến lược phát triển công ty";
    }

    @Override
    public String manageBudget() {
        return "Phê duyệt ngân sách và kế hoạch đầu tư";
    }

    @Override
    public String handleDocuments() {
        return "Ký duyệt các văn bản quan trọng";
    }

    @Override
    public String operateMachinery() {
        return "Không trực tiếp vận hành máy móc";
    }

    @Override
    public String maintainEquipment() {
        return "Phê duyệt kế hoạch bảo trì thiết bị";
    }

    @Override
    public String manageAccounting() {
        return "Giám sát hoạt động kế toán của công ty";
    }

    @Override
    public String prepareFinancialReports() {
        return "Phê duyệt báo cáo tài chính";
    }
} 