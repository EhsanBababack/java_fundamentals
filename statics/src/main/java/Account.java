public class Account {
    public String name;

    public Account(String name) {
        this.name = name;
        accountCount+=1;
    }

    private static int accountCount = 0;

    public static int getAccountCount() {
        return accountCount;
    }

    public static void setAccountCount(int accountCount) {
        Account.accountCount = accountCount;
    }
}
