package model;

import enums.EmployeeType;
import strategy.WorkStrategy;

public class Employee {
    private String id;
    private String name;
    private EmployeeType type;
    private WorkStrategy workStrategy;

    public Employee(String id, String name, EmployeeType type, WorkStrategy workStrategy) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.workStrategy = workStrategy;
    }

    public String work() {
        return workStrategy.work();
    }

    public String reportWork() {
        return workStrategy.reportWork();
    }

    public String patrol() {
        return workStrategy.patrol();
    }

    public String assignTasks() {
        return workStrategy.assignTasks();
    }

    public String trainNewEmployees() {
        return workStrategy.trainNewEmployees();
    }

    public String planWork() {
        return workStrategy.planWork();
    }

    public String manageBudget() {
        return workStrategy.manageBudget();
    }

    public String handleDocuments() {
        return workStrategy.handleDocuments();
    }

    public String operateMachinery() {
        return workStrategy.operateMachinery();
    }

    public String maintainEquipment() {
        return workStrategy.maintainEquipment();
    }

    public String manageAccounting() {
        return workStrategy.manageAccounting();
    }

    public String prepareFinancialReports() {
        return workStrategy.prepareFinancialReports();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setWorkStrategy(WorkStrategy workStrategy) {
        this.workStrategy = workStrategy;
    }
} 