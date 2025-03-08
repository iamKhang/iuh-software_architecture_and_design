package strategy;

public class ChiefAccountantStrategy implements WorkStrategy {
    @Override
    public String work() {
        return "Quản lý công việc kế toán của công ty";
    }

    @Override
    public String reportWork() {
        return "Báo cáo tài chính cho ban giám đốc";
    }

    @Override
    public String patrol() {
        return "Kiểm tra công việc của nhân viên kế toán";
    }

    @Override
    public String assignTasks() {
        return "Phân công công việc cho nhân viên kế toán";
    }

    @Override
    public String trainNewEmployees() {
        return "Đào tạo nghiệp vụ kế toán cho nhân viên mới";
    }

    @Override
    public String planWork() {
        return "Lập kế hoạch tài chính";
    }

    @Override
    public String manageBudget() {
        return "Quản lý ngân sách và dòng tiền của công ty";
    }

    @Override
    public String handleDocuments() {
        return "Xử lý chứng từ và sổ sách kế toán";
    }

    @Override
    public String operateMachinery() {
        return "Không có nhiệm vụ vận hành máy móc";
    }

    @Override
    public String maintainEquipment() {
        return "Bảo quản thiết bị văn phòng kế toán";
    }

    @Override
    public String manageAccounting() {
        return "Quản lý toàn bộ hoạt động kế toán";
    }

    @Override
    public String prepareFinancialReports() {
        return "Lập và trình bày báo cáo tài chính";
    }
} 