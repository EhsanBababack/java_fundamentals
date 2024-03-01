public class Main2 {
    public static void main(String[] args) {
        for (int j = 1 ; j<=5 ; j++){
            MyRunnable myRunnable =  new MyRunnable(j);
            Thread myThread = new Thread(myRunnable);
            myThread.start();
        }
    }
}
