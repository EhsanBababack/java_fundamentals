public class ClassicThread1 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("TASK IS RUNNING ... ");
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
