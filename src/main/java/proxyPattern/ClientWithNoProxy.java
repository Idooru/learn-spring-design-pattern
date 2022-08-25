package proxyPattern;

public class ClientWithNoProxy {
    public static void main(String[] args) {
        // 프록시를 이용하지 않은 호출
        Service s1 = new Service();
        System.out.println(s1.runSomething());
    }
}
