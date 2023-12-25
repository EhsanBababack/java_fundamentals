import java.util.Scanner;

public class UseCustomException  {
    void method1() {
        int a = 69;
        int b = 0;
        int c =  a/b;
        if(b==0){
            try {
                throw new CustomException("THIS IS A EXCEPTION");
            } catch (CustomException e) {
                e.printStackTrace();
            }
        }
    }
    void method2() {
        method1();
    }
    public static void main(String[] args) {

    }
}
