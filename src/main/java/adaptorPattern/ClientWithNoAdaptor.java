package adaptorPattern;

public class ClientWithNoAdaptor {
    public static void main(String[] args) {
        AdaptorServiceA asa1 = new AdaptorServiceA();
        AdaptorServiceB asb1 = new AdaptorServiceB();

        asa1.runService();
        asb1.runService();
    }
}
