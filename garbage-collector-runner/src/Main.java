public class Main {
    public static void main(String[] args) {

//        heap memory total size ----> totalMemory
//        heap memory free size ----> freeMemory
//        number of cpu cores  ----> availableProcessors
        long l = Runtime.getRuntime().freeMemory();
        System.out.println(l);
                if (Runtime.getRuntime().freeMemory()<1000000){
            System.gc();
            System.out.println("GARBAGE COLLECTOR WORKED");
        }
        else {
            System.out.println("GARBAGE COLLECTOR DONT WORKED");
        }
    }
}
