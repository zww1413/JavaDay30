package day14;

public class SingletonPatternHungry {
    private SingletonPatternHungry(){

    }
    private static SingletonPatternHungry instance = new SingletonPatternHungry();

    public static SingletonPatternHungry getInstance(){
        return instance;
    }
}
