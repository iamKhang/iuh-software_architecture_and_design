package model;

import interfaces.IEmployee;

public abstract class Employee implements IEmployee {
    protected String employeeId;
    protected String name;
    protected String description;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
} 