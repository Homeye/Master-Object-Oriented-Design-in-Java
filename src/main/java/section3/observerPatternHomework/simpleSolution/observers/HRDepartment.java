package section3.observerPatternHomework.simpleSolution.observers;

public class HRDepartment implements IObserver {

    @Override
    public void callMe() {
        System.out.println("HR department notified");
    }
}
