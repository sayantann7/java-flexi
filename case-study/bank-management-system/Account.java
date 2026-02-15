public class Account{
    String accountNumber;
    String accountHolderName;
    double balance;

    public Account(String accountNumber, String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws Exception{
        if(amount>balance){
            throw new Exception("Cannot withdraw, not enough balance");
        }
        else{
            balance -= amount;
        }
    }

    public void transfer(Account targetAccount, double amount) throws Exception{
        if(amount>balance){
            throw new Exception("Cannot transfer, not enough balance");
        }
        else{
            balance -= amount;
            targetAccount.balance += amount;
        }
    }

    public void displayAccountDetails(){
        System.out.println("Account Holder Name : "+accountHolderName);
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}