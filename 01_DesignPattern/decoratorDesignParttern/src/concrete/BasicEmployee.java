package concrete;

import model.Employee;

public class BasicEmployee extends Employee {
    
    public BasicEmployee(String employeeId, String name) {
        super(employeeId, name);
        this.description = "Nhân viên cơ bản";
    }

    @Override
    public void performDuties() {
        System.out.println("Thực hiện công việc cơ bản");
    }
} 