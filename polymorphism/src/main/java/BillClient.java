public class BillClient {
    public static void main(String[] args) {

//      about polymorphism

        Bill bill = new MobileBill();
        System.out.println(bill.doPayment());
    }
}
