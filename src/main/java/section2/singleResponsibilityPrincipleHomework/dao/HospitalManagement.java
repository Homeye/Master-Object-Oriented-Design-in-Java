package section2.singleResponsibilityPrincipleHomework.dao;

import section2.singleResponsibilityPrincipleHomework.domain.Employee;

public class HospitalManagement {

    public void callUpon(Employee employee) {
        employee.performDuties();
    }
}
