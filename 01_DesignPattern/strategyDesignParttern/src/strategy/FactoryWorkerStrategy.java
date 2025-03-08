package strategy;

public class FactoryWorkerStrategy implements WorkStrategy {
    @Override
    public String work() {
        return "Thực hiện công việc sản xuất tại xưởng";
    }

    @Override
    public String reportWork() {
        return "Báo cáo sản lượng cho đội trưởng";
    }

    @Override
    public String patrol() {
        return "Không có nhiệm vụ tuần tra";
    }

    @Override
    public String assignTasks() {
        return "Không có quyền phân công công việc";
    }

    @Override
    public String trainNewEmployees() {
        return "Hướng dẫn kỹ thuật cơ bản cho nhân viên mới";
    }

    @Override
    public String planWork() {
        return "Lập kế hoạch sản xuất cá nhân";
    }

    @Override
    public String manageBudget() {
        return "Không có quyền quản lý ngân sách";
    }

    @Override
    public String handleDocuments() {
        return "Ghi chép nhật ký sản xuất";
    }

    @Override
    public String operateMachinery() {
        return "Vận hành máy móc sản xuất theo quy trình";
    }

    @Override
    public String maintainEquipment() {
        return "Thực hiện bảo trì cơ bản cho máy móc được giao";
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