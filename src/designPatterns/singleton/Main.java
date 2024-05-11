package designPatterns.singleton;

public class Main {
    public static void main(String[] args){
        Singleton s1 = Singleton.getObject();
        System.out.println(s1);
        Singleton s2 = Singleton.getObject();
        System.out.println(s2);
        Singleton s3 = Singleton.getObject();
        System.out.println(s3);
        Singleton s4 = Singleton.getObject();
        System.out.println(s4);

        System.out.println("=======================================================");

        SingletonMultiThreadProblem sm1 = SingletonMultiThreadProblem.getInstance();
        System.out.println(sm1);
        SingletonMultiThreadProblem sm2 = SingletonMultiThreadProblem.getInstance();
        System.out.println(sm2);
        SingletonMultiThreadProblem sm3 = SingletonMultiThreadProblem.getInstance();
        System.out.println(sm3);
        SingletonMultiThreadProblem sm4 = SingletonMultiThreadProblem.getInstance();
        System.out.println(sm4);

    }

}
