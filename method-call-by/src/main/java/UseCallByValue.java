public class UseCallByValue {
    public static void main(String[] args) {
        CallByValue cbv = new CallByValue();
        System.out.println("before change " + cbv.data);
        cbv.change(500); // passing value
        System.out.println("after change " + cbv.data);
    }
}
