public class LambdaThread {
    public static void main(String[] args) {
        Runnable task = () ->{
            System.out.println("TASK IS RUNNING ... ");
        };
        new Thread(task).start();
    }
}
