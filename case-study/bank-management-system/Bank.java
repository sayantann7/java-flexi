import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts = new ArrayList<>();
    static int noOfAccounts = 0;

    public void createAccount(String accountNumber, String accountHolderName, double initialBalance){
        Account account = new Account(accountNumber, accountHolderName, initialBalance);
        accounts.add(account);
        noOfAccounts++;
    }

    public Account getAccount(String accountNumber){
        for(Account account : accounts){
            if(account.accountNumber.equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public void displayAllAccounts(){
        System.out.println("All Bank Accounts Details : ");
        for(Account account : accounts){
            account.displayAccountDetails();
        }
    }
}
