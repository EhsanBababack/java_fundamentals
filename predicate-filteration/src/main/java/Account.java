public class Account {
    private String accountNo;
    private Integer accountBalance;
    private String accountType;

    public Account(String accountNo, Integer accountBalance, String accountType) {
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "{" +
                "accountNo='" + accountNo + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
