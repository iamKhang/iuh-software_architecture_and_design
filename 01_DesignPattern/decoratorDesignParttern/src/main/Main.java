package main;

import java.util.Scanner;
import concrete.BasicEmployee;
import decorator.*;
import interfaces.IEmployee;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN ===");
        System.out.print("Nhập mã nhân viên: ");
        String employeeId = scanner.nextLine();
        
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        
        System.out.println("\nChọn chức vụ của nhân viên:");
        System.out.println("1. Đội trưởng");
        System.out.println("2. Giám đốc");
        System.out.println("3. Kế toán trưởng");
        System.out.println("4. Nhân viên văn phòng");
        System.out.println("5. Nhân viên xưởng");
        System.out.print("Nhập lựa chọn (1-5): ");
        
        int choice = scanner.nextInt();
        
        // Tạo nhân viên cơ bản
        IEmployee employee = new BasicEmployee(employeeId, name);
        
        // Áp dụng decorator tương ứng với chức vụ
        switch (choice) {
            case 1:
                employee = new TeamLeaderDecorator(employee);
                break;
            case 2:
                employee = new DirectorDecorator(employee);
                break;
            case 3:
                employee = new AccountingManagerDecorator(employee);
                break;
            case 4:
                employee = new OfficeEmployeeDecorator(employee);
                break;
            case 5:
                employee = new FactoryWorkerDecorator(employee);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                scanner.close();
                return;
        }
        
        // Hiển thị thông tin và nhiệm vụ của nhân viên
        System.out.println("\n=== THÔNG TIN NHÂN VIÊN ===");
        System.out.println("Mã nhân viên: " + employee.getEmployeeId());
        System.out.println("Tên: " + employee.getName());
        System.out.println("Chức vụ: " + employee.getDescription());
        System.out.println("\n=== DANH SÁCH NHIỆM VỤ ===");
        employee.performDuties();
        
        scanner.close();
    }
} 