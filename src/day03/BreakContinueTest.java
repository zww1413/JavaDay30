package day03;

public class BreakContinueTest {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if((i+j) == 10 ){
                    System.out.println(i+","+ j);
                    break;
                }
            }
        }
    }
}
