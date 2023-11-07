public class AccountsCounter {
    public static void main(String[] args) {
        Account account1= new Account("Ehsan");
        Account account2= new Account("Ali");
        Account account3= new Account("Reza");
        Account account4= new Account("Sara");
        Account account5= new Account("Sara");
        System.out.println(Account.getAccountCount());
//        static methods work with static variable.
    }
}
