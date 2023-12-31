import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountFiltration {
    public static void main(String[] args) {

        Account account1 = new Account("0015488892", 300000, "B-Type");
        Account account2 = new Account("1122336655", 5000000, "A-Type");
        Account account3 = new Account("8855223366", 8000000, "C-Type");
        Account account4 = new Account("9988774455", 1500000, "A-Type");
        Account account5 = new Account("3366998852", 9532320, "B-Type");

        List<Account> accountList = new ArrayList<>();
        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);
        accountList.add(account5);

        System.out.println(filteredList(accountList, isBalanceMoreThan(2000000)));

    }

    public static Predicate<Account> isBalanceMoreThan(Integer x) {
        return p -> p.getAccountBalance() > x;
    }

    public static List<Account> filteredList(List<Account> accounts, Predicate<Account> predicate) {
        return accounts.stream()
                .filter(predicate)
                .collect(Collectors.<Account>toList());
    }
}

