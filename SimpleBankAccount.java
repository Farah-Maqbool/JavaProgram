class BankAccount{
    long accountNumber, balance;
    String accountHolderName;
    BankAccount(long accountNumber, long balance, String accountHolderName){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(int amount){
        balance+=amount;
        System.out.println("Current Balance: "+balance);
    }
    void withdraw(int amount){
        if (balance > amount){
            balance-=amount;
            System.out.println("Current Balance: "+balance);
        }
        else {
            System.out.println("Amount must be less than balance");
        }
    }
    void checkBalance(){
        System.out.println("Current Balance: "+balance);
    }
    void accountDetails(){
        System.out.println("Name: "+accountHolderName);
        System.out.println("Balance: "+balance);
        System.out.println("Account Number: "+accountNumber);
    }
}

public class SimpleBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(34455667676564L,250000, "Amna");
        BankAccount account2 = new BankAccount(54768956432346L,550000, "Faryal");
        account1.deposit(5000);
        account1.withdraw(5000);
        account1.checkBalance();
        account1.accountDetails();
        account2.deposit(40000);
        account2.withdraw(50000);
        account2.checkBalance();
        account2.accountDetails();
    }
}
