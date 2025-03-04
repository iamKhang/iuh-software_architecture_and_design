package main;

import entities.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SỬ DỤNG STATE PATTERN");
        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN ===");
        
        // Nhập thông tin nhân viên
        System.out.print("Nhập mã nhân viên: ");
        String employeeId = scanner.nextLine();
        
        System.out.print("Nhập họ và tên: ");
        String name = scanner.nextLine();
        
        // Tạo nhân viên
        Employee employee = new Employee(name, employeeId);
        
        // Menu chọn chức vụ
        System.out.println("\n=== CHỌN CHỨC VỤ ===");
        System.out.println("1. Đội Trưởng");
        System.out.println("2. Giám Đốc");
        System.out.println("3. Nhân Viên Văn Phòng");
        System.out.println("4. Nhân Viên Xưởng");
        System.out.println("5. Kế Toán Trưởng");
        System.out.print("Nhập lựa chọn (1-5): ");
        
        int choice = scanner.nextInt();
        
        // Thiết lập chức vụ theo lựa chọn
        switch (choice) {
            case 1:
                employee.setState(new TeamLeaderState());
                break;
            case 2:
                employee.setState(new DirectorState());
                break;
            case 3:
                employee.setState(new OfficeEmployeeState());
                break;
            case 4:
                employee.setState(new FactoryWorkerState());
                break;
            case 5:
                employee.setState(new ChiefAccountantState());
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        
        // Hiển thị thông tin và công việc
        employee.work();
        
        scanner.close();
    }
}
