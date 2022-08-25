package adaptorPattern;

public class AdaptorServiceA implements ServiceRunner {
    ServiceA sa1 = new ServiceA();

    @Override
    public void runService() {
        sa1.runServiceA();
    }
}
