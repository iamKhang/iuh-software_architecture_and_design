package strategy;

public interface WorkStrategy {
    // Các phương thức chung cho mọi nhân viên
    String work();
    String reportWork();
    
    // Các phương thức đặc thù cho từng loại nhân viên
    String patrol();
    String assignTasks();
    String trainNewEmployees();
    String planWork();
    String manageBudget();
    String handleDocuments();
    String operateMachinery();
    String maintainEquipment();
    String manageAccounting();
    String prepareFinancialReports();
} 