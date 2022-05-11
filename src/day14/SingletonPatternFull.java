package day14;
//不安全的懒汉式
public class SingletonPatternFull {
    private  SingletonPatternFull(){

    }
    private static SingletonPatternFull instance = null;
    public  static SingletonPatternFull getInstance(){
        if(instance == null){
            instance = new SingletonPatternFull();
        }
        return  instance;
    }
}
