package section3.observerPatternHomework.simpleSolution.clients;

import section3.observerPatternHomework.simpleSolution.dao.EmployeeManagementSystem;
import section3.observerPatternHomework.simpleSolution.domain.Employee;
import section3.observerPatternHomework.simpleSolution.observers.HRDepartment;
import section3.observerPatternHomework.simpleSolution.observers.IObserver;
import section3.observerPatternHomework.simpleSolution.observers.PayrollDepartment;

public class App {

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Joe");
        Employee employee2 = new Employee(2, "Jane");
        Employee employee3 = new Employee(3, "Fitz");

        IObserver hrDepartment = new HRDepartment();
        IObserver payrollDepartment = new PayrollDepartment();

        EmployeeManagementSystem employeeManagementSystem = EmployeeManagementSystem.getInstance();

        employeeManagementSystem.addObserver(hrDepartment);
        employeeManagementSystem.addObserver(payrollDepartment);
        employeeManagementSystem.addEmployee(employee1);
        employeeManagementSystem.addEmployee(employee2);
        employeeManagementSystem.addEmployee(employee3);
    }
}
