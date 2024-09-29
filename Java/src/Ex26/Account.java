package Ex26;

public class Account {
    private final String accountNumber;
    private String AccountHolder;
    private double initialDeposit;


    public Account(String accountNumber, String getAccountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.AccountHolder = getAccountHolder;
        this.initialDeposit = initialDeposit;

    }

    public Account(String accountNumber, String getAccountHolder) {
        this.accountNumber = accountNumber;
        this.AccountHolder = getAccountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getGetAccountHolder() {
        return AccountHolder;
    }

    public void setGetAccountHolder(String getAccountHolder) {
        this.AccountHolder = getAccountHolder;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public double deposit(double balance) {
       balance = getInitialDeposit() + balance;
       return balance;
    }

    public double withdrawl(double drawl) {
        drawl -= getInitialDeposit() - 5.0;
        return drawl;
        }
    }

