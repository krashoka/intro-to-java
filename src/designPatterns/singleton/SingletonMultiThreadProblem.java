package designPatterns.singleton;

public class SingletonMultiThreadProblem {
    private static SingletonMultiThreadProblem instance;

    private SingletonMultiThreadProblem(){}

    public static SingletonMultiThreadProblem getInstance(){
        if(instance == null){
            synchronized (SingletonMultiThreadProblem.class){
                if(instance == null){
                    instance = new SingletonMultiThreadProblem();
                }
            }
        }

        return instance;
    }
}
