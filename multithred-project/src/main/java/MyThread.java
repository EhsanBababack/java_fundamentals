public class MyThread extends Thread {
    private int numberOfThread ;

    public MyThread(int numberOfThread) {
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
