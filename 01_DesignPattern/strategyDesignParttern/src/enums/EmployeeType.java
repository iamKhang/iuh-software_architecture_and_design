package enums;

public enum EmployeeType {
    TEAM_LEADER("Đội Trưởng"),
    DIRECTOR("Giám Đốc"),
    OFFICE_STAFF("Nhân Viên Văn Phòng"),
    FACTORY_WORKER("Nhân Viên Xưởng"),
    CHIEF_ACCOUNTANT("Kế Toán Trưởng");

    private final String employeeName;

    EmployeeType(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getemployeeName() {
        return employeeName;
    }
} 