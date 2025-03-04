package main;

import entities.ChiefAccountant;
import entities.Director;
import entities.Employee;
import entities.FactoryWorker;
import entities.OfficeStaff;
import entities.TeamLeader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN CÔNG TY");
        System.out.println("=======================================");
        System.out.println("Nhập thông tin nhân viên:");
        
        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        
        System.out.print("Nhập mã nhân viên: ");
        String id = scanner.nextLine();
        
        System.out.println("\nChọn chức vụ:");
        System.out.println("1. Đội Trưởng");
        System.out.println("2. Giám Đốc");
        System.out.println("3. Nhân viên VP");
        System.out.println("4. Nhân Viên Xưởng");
        System.out.println("5. Kế Toán Trưởng");
        System.out.print("Nhập lựa chọn (1-5): ");
        
        int choice = scanner.nextInt();
        Employee employee = null;
        
        switch (choice) {
            case 1:
                employee = new TeamLeader(name, id);
                ((TeamLeader) employee).displayDuties();
                ((TeamLeader) employee).patrol();
                ((TeamLeader) employee).assignTasks();
                break;
            case 2:
                employee = new Director(name, id);
                ((Director) employee).displayDuties();
                ((Director) employee).makeDecisions();
                ((Director) employee).attendMeetings();
                break;
            case 3:
                employee = new OfficeStaff(name, id);
                ((OfficeStaff) employee).displayDuties();
                ((OfficeStaff) employee).makeCoffee();
                ((OfficeStaff) employee).reviewDocuments();
                break;
            case 4:
                employee = new FactoryWorker(name, id);
                ((FactoryWorker) employee).displayDuties();
                ((FactoryWorker) employee).operate();
                ((FactoryWorker) employee).maintain();
                break;
            case 5:
                employee = new ChiefAccountant(name, id);
                ((ChiefAccountant) employee).displayDuties();
                ((ChiefAccountant) employee).reviewFinancials();
                ((ChiefAccountant) employee).approveBudget();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        
        System.out.println("\nThông tin nhân viên:");
        System.out.println(employee);
        
        scanner.close();
    }
} 