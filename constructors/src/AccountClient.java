public class AccountClient {
    public static void main(String[] args) {
        Account account1 = new Account();
//        in constructor az meghdar default estefade mikonad
        Account account2 = new Account("Amin","Amiri");
        System.out.println(account1.getFirstName()+account1.getLastName());
        System.out.println(account2.getFirstName()+account2.getLastName());
    }
}
