package section2.singleResponsibilityPrincipleHomework.dao;

import section2.singleResponsibilityPrincipleHomework.domain.Employee;

public class EmployeeDAO {

    public EmployeeDAO() {
    }

    public void saveEmployee(Employee emp) {
//        DatabaseConnectionManager databaseConnectionManager = DatabaseConnectionManager.getInstance();
//        databaseConnectionManager.connect();
//        try {
//            databaseConnectionManager.getConnectionObject().prepareStatement("insert into Employee_tbl");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        databaseConnectionManager.disconnect();
        System.out.println("Saving employee to the database: " + emp);
    }

    public void deleteEmployee(Employee emp) {
        System.out.println("Deleting employee from the database");
    }
}
