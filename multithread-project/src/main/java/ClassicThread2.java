public class ClassicThread2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("TASK IS RUNNING ... ");
            }
        });
        thread.start();
    }
}
