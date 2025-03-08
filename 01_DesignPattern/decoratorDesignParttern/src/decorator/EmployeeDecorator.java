package decorator;

import interfaces.IEmployee;

public abstract class EmployeeDecorator implements IEmployee {
    protected IEmployee employee;

    public EmployeeDecorator(IEmployee employee) {
        this.employee = employee;
    }

    @Override
    public String getDescription() {
        return employee.getDescription();
    }

    @Override
    public String getEmployeeId() {
        return employee.getEmployeeId();
    }

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void performDuties() {
        employee.performDuties();
    }
} 