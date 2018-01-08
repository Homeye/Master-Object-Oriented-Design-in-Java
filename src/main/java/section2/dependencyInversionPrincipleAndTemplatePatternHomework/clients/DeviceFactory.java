package section2.dependencyInversionPrincipleAndTemplatePatternHomework.clients;

import section2.dependencyInversionPrincipleAndTemplatePatternHomework.processes.GeneralManufacturingProcess;
import section2.dependencyInversionPrincipleAndTemplatePatternHomework.processes.LaptopManufacturingProcess;
import section2.dependencyInversionPrincipleAndTemplatePatternHomework.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {

        GeneralManufacturingProcess smartphone = new SmartphoneManufacturingProcess("LG Nexus 5x");
        GeneralManufacturingProcess laptop = new LaptopManufacturingProcess("Google Pixelbook");

        smartphone.launchProcess();
        laptop.launchProcess();
    }
}
