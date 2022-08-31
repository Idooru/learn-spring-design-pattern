package myPractice;

class Singleton {
    public static Singleton singletonObject;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }
        return singletonObject;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton();

        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        Singleton s3 = Singleton.getSingleton();

        Singleton[] singletonArray = {s1, s2, s3};

        for (Singleton idx : singletonArray) {
            System.out.println(idx.toString());
            // 객체참조변수 배열을 출력해보면 모두 같은 객체를 참조하는것을 알 수 있다.
        }
    }
}
