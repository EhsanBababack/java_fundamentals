public class God2 {
    private final static God2 khoda = new God2();;

    private God2() {
    }

    public static God2 getInstance() {
        return khoda;
    }
}