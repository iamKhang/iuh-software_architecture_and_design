package entities;

import entities.interfaces.IState;

public class Employee {
    private String name;
    private String employeeId;
    private IState state;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void work() {
        System.out.println("\n=== THÔNG TIN NHÂN VIÊN ===");
        System.out.println("Mã nhân viên: " + employeeId);
        System.out.println("Họ và tên: " + name);
        if (state != null) {
            System.out.println("Chức vụ: " + state.getPosition());
            System.out.println("\n=== DANH SÁCH CÔNG VIỆC ===");
            state.work();
        } else {
            System.out.println("Chưa được phân công chức vụ!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
} 