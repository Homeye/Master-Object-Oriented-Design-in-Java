package section3.observerPatternHomework.simpleSolution.observers;

public class PayrollDepartment implements IObserver {

    @Override
    public void callMe() {
        System.out.println("Payroll department notified");
    }
}
