public class Main {
    public static void main(String[] args) {
        for (int j = 1 ; j<=5 ; j++){
            MyThread myThread =  new MyThread(j);
            myThread.start();
        }
        throw new RuntimeException();
    }
}
