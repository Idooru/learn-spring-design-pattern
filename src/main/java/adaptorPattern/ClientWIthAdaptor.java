package adaptorPattern;

public class ClientWIthAdaptor {
    public static void main(String[] args) {
        AdaptorServiceA sa1 = new AdaptorServiceA();
        AdaptorServiceB sb1 = new AdaptorServiceB();

        sa1.runService();
        sb1.runService();
    }
}
