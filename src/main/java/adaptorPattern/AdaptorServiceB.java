package adaptorPattern;

public class AdaptorServiceB implements ServiceRunner {
    ServiceB sb1 = new ServiceB();

    @Override
    public void runService() {
        sb1.runServiceB();
    }
}
