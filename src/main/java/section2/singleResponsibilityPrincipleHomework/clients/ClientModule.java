package section2.singleResponsibilityPrincipleHomework.clients;

import section2.singleResponsibilityPrincipleHomework.dao.EmployeeDAO;
import section2.singleResponsibilityPrincipleHomework.domain.Employee;
import section2.singleResponsibilityPrincipleHomework.domain.Nurse;
import section2.singleResponsibilityPrincipleHomework.reporting.EmployeeReportFormatter;
import section2.singleResponsibilityPrincipleHomework.reporting.FormatType;

public class ClientModule {

    public static void main(String[] args) {

        Employee peggy = new Nurse(1, "Peggy", "emergency", true);

        ClientModule.hireNewEmployee(peggy);
        printEmployeeReport(peggy, FormatType.CSV);
        printEmployeeReport(peggy, FormatType.XML);
    }

    public static void hireNewEmployee(Employee emp) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(emp);
    }

    public static void terminateEmployee(Employee emp) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(emp);
    }

    public static void printEmployeeReport(Employee emp, FormatType formatType) {
        EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(emp, formatType);
        System.out.println(employeeReportFormatter.getFormattedEmployee());
    }
}
