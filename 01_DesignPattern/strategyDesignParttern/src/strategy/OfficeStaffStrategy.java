package strategy;

public class OfficeStaffStrategy implements WorkStrategy {
    @Override
    public String work() {
        return "Xử lý công việc hành chính văn phòng";
    }

    @Override
    public String reportWork() {
        return "Báo cáo công việc cho quản lý trực tiếp";
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
        return "Hướng dẫn quy trình hành chính cho nhân viên mới";
    }

    @Override
    public String planWork() {
        return "Lập kế hoạch công việc cá nhân";
    }

    @Override
    public String manageBudget() {
        return "Không có quyền quản lý ngân sách";
    }

    @Override
    public String handleDocuments() {
        return "Xử lý và lưu trữ tài liệu hành chính";
    }

    @Override
    public String operateMachinery() {
        return "Sử dụng các thiết bị văn phòng cơ bản";
    }

    @Override
    public String maintainEquipment() {
        return "Bảo quản thiết bị văn phòng được giao";
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