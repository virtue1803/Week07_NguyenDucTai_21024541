package dev.week7_nguyenductai_21024541.backend.enums;

public enum EmployeeStatus {
    ACTIVE(1),
    IN_ACTIVE(0),
    TERMINATED(-1);
    private int value;

    EmployeeStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static EmployeeStatus getValue(String type) {
        if(type.toUpperCase().equalsIgnoreCase(ACTIVE.toString())) {
            return ACTIVE;
        } else if(type.toUpperCase().equalsIgnoreCase(IN_ACTIVE.toString())) {
            return IN_ACTIVE;
        } else {
            return TERMINATED;
        }
    }
}
