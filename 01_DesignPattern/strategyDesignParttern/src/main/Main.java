package main;

import java.util.Scanner;
import enums.EmployeeType;
import model.Employee;
import strategy.*;

public class Main {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN CÔNG TY");
        System.out.println("---------------------------------------");

        System.out.print("Nhập mã nhân viên: ");
        String id = scanner.nextLine();

        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();

        System.out.println("\nChọn chức vụ của nhân viên:");
        EmployeeType[] types = EmployeeType.values();
        for (int i = 0; i < types.length; i++) {
            System.out.println((i + 1) + ". " + types[i].getemployeeName());
        }

        System.out.print("\nNhập số tương ứng với chức vụ: ");
        int choice = scanner.nextInt();
        EmployeeType selectedType = types[choice - 1];

        // Tạo strategy tương ứng với loại nhân viên
        WorkStrategy strategy;
        switch (selectedType) {
            case TEAM_LEADER:
                strategy = new TeamLeaderStrategy();
                break;
            case DIRECTOR:
                strategy = new DirectorStrategy();
                break;
            case OFFICE_STAFF:
                strategy = new OfficeStaffStrategy();
                break;
            case FACTORY_WORKER:
                strategy = new FactoryWorkerStrategy();
                break;
            case CHIEF_ACCOUNTANT:
                strategy = new ChiefAccountantStrategy();
                break;
            default:
                throw new IllegalStateException("Loại nhân viên không hợp lệ");
        }

        // Tạo đối tượng nhân viên
        Employee employee = new Employee(id, name, selectedType, strategy);

        // Hiển thị thông tin và công việc của nhân viên
        System.out.println("\n=== THÔNG TIN NHÂN VIÊN ===");
        System.out.println("Mã nhân viên: " + employee.getId());
        System.out.println("Tên nhân viên: " + employee.getName());
        System.out.println("Chức vụ: " + employee.getType().getemployeeName());

        // Hiển thị các công việc của nhân viên
        System.out.println("\n=== CÔNG VIỆC CỦA NHÂN VIÊN ===");
        System.out.println("1. Công việc chính: " + employee.work());
        System.out.println("2. Báo cáo: " + employee.reportWork());
        System.out.println("3. Tuần tra: " + employee.patrol());
        System.out.println("4. Phân công công việc: " + employee.assignTasks());
        System.out.println("5. Đào tạo: " + employee.trainNewEmployees());
        System.out.println("6. Lập kế hoạch: " + employee.planWork());
        System.out.println("7. Quản lý ngân sách: " + employee.manageBudget());
        System.out.println("8. Xử lý tài liệu: " + employee.handleDocuments());
        System.out.println("9. Vận hành máy móc: " + employee.operateMachinery());
        System.out.println("10. Bảo trì thiết bị: " + employee.maintainEquipment());
        System.out.println("11. Quản lý kế toán: " + employee.manageAccounting());
        System.out.println("12. Lập báo cáo tài chính: " + employee.prepareFinancialReports());

        scanner.close();
    }
} 