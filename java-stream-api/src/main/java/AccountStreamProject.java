import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AccountStreamProject {
    public static void main(String[] args) {
//        List<Account> allAccounts =
//                Arrays.asList(
//                        new Account("0014579219", 2000),
//                        new Account("1122334455", 1000),
//                        new Account("5544112233", 2000),
//                        new Account("6633552266", 3000),
//                        new Account("0014521219", 3000),
//                        new Account("0002223336", 5000),
//                        new Account("3366998877", 10000),
//                        new Account("7788995544", 7000),
//                        new Account("7788998877", 7000),
//                        new Account("9988774455", 1000));
//        List<Account> filtered =
//                allAccounts.stream()
//                        .filter(acc -> acc.getBalance() >= 2000)
//                        .collect(Collectors.toList());
//        Map<Integer, List<Account>> AccountByBalance =
//                filtered
//                        .stream()
//                        .collect(Collectors.groupingBy(p -> p.getBalance()));
//        AccountByBalance
//                .forEach((balance, accounts) -> System.out.format("balance %d: %s \n", balance, accounts));



        List<Account> allAcc =
                Arrays.asList(
                        new Account("0014579219", 2000),
                        new Account("1122334455", 1000),
                        new Account("5544112233", 2000),
                        new Account("6633552266", 3000),
                        new Account("0014521219", 3000),
                        new Account("0002223336", 5000),
                        new Account("3366998877", 10000),
                        new Account("7788995544", 7000),
                        new Account("7788998877", 7000),
                        new Account("9988774455", 1000));
        List<Account> filtered =
                allAcc
                        .stream()
                        .filter(acc -> acc.getBalance() >= 2000)
                        .collect(Collectors.toList());
        System.out.println("----------------------------------");
        Map<Integer, List<Account>> accByBalance = filtered
                .stream()
                .collect(Collectors.groupingBy(acc->acc.getBalance()));
        accByBalance
                .forEach((num, balance) -> System.out.format("balance %s: %s\n", num, balance));
    }
}
