public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit $" + amount + ".New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ".New balance : $" + balance);
        }
    }

    public static void main(String[] args){
        BankAccount account = new BankAccount("12345", 300000.0);
        // get account
        account.getBalance();

        // deposit into account
        account.deposit(45000.0);
        account.getBalance();

        // withdraw from account
        account.withdraw(34000.00);
        account.getBalance();



    }
}