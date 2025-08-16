package Basics.Programs.Reference_Data_Type;

public class Student {
    public static void main(String[] args) {

        int val = 10;

        Employee employee = new Employee();

        employee.setEmployeeId(10);

        System.out.println("Employee ID: " + employee.getEmployeeId() + " Val: " + val); // 10 10

        modify(employee, val);

        System.out.println("Employee ID: " + employee.getEmployeeId() + " Val: " + val); // 20 10


        System.out.println("------------------------------------------------------------------------");

        Employee employee2 = employee;

        employee2.setEmployeeId(30);

        System.out.println("Employee ID: " + employee.getEmployeeId() + " Employee2 ID: " + employee2.getEmployeeId()); // 30 30

    }

    public static void modify(Employee employee, int val) {
        employee.setEmployeeId(20);
        val = 20;
    }
}
