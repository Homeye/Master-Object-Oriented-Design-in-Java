package section2.singleResponsibilityPrincipleHomework.clients;

import section2.singleResponsibilityPrincipleHomework.dao.HospitalManagement;
import section2.singleResponsibilityPrincipleHomework.domain.Doctor;
import section2.singleResponsibilityPrincipleHomework.domain.Employee;
import section2.singleResponsibilityPrincipleHomework.domain.Nurse;

public class EmergencyRoomProcess {

    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse(1, "Peggy", "emergency", true);
        ERDirector.callUpon(peggy);

        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        ERDirector.callUpon(suzan);
    }
}
