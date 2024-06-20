public class God {
    private static God khoda = null;

    private God() {
    }

    public static God getInstance() {
        if (khoda == null) {
            khoda = new God();
        }
        return khoda;
    }
}
