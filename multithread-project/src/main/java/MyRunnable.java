public class MyRunnable implements Runnable{

    private int numberOfThread ;

    public MyRunnable(int numberOfThread) {
        this.numberOfThread = numberOfThread;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("thread : " + numberOfThread + " loop : "+ i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }
}
