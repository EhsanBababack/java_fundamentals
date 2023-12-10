public class Main {
    public static void main(String[] args) {
        Accountable acc = new SavingAccount();
        System.out.println(acc.createAccount());
    }
}
