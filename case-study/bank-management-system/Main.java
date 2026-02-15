import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Bank Account Management System!");
        int exit = 0;

        while(exit==0){
            System.out.println("What do you want to do?");
            System.out.println("Option 1 : Display all accounts");
            System.out.println("Option 2 : Add a account");
            System.out.println("Option 3 : Find an account");
            System.out.println("Option 4 : Withdraw money");
            System.out.println("Option 5 : Deposit money");
            System.out.println("Option 6 : Transfer money");
            System.out.println("Option 7 : Exit the system");
            System.out.print("Enter your option (1/2/3/4) : ");
            int choice = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch(choice){
                case 1:
                    bank.displayAllAccounts();

                    System.out.println();
                    break;
                case 2:
                    System.out.print("Enter account holder name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter account number : ");
                    String number = sc.nextLine();
                    System.out.print("Enter account initial balance : ");
                    double balance = Double.parseDouble(sc.nextLine());
                    
                    bank.createAccount(number, name, balance);
                    System.out.println("The new account has been created!");

                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter your account number : ");
                    String accSearchNum = sc.nextLine();
                    Account accSearch = bank.getAccount(accSearchNum);
                    if(accSearch==null){
                        System.out.println("Account not found");
                        break;
                    }
                    System.out.println("Account details : ");
                    accSearch.displayAccountDetails();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter your account number : ");
                    String accNumWithdraw = sc.nextLine();
                    Account withdrawAcc = bank.getAccount(accNumWithdraw);
                    if(withdrawAcc==null){
                        System.out.println("Account not found");
                        break;
                    }
                    System.out.println("Enter amount to withdraw : ");
                    double amtToWithdraw = Double.parseDouble(sc.nextLine());
                    try {
                        withdrawAcc.withdraw(amtToWithdraw);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Enter your account number : ");
                    String accNumDeposit = sc.nextLine();
                    Account depositAcc = bank.getAccount(accNumDeposit);
                    if(depositAcc==null){
                        System.out.println("Account not found");
                        break;
                    }
                    System.out.println("Enter amount to deposit : ");
                    double amtToDeposit = Double.parseDouble(sc.nextLine());
                    depositAcc.deposit(amtToDeposit);
                    break;
                case 6:
                    System.out.println("Enter your account number : ");
                    String destAccNum = sc.nextLine();
                    Account destAcc = bank.getAccount(destAccNum);
                    if(destAcc==null){
                        System.out.println("Account not found");
                        break;
                    }
                    System.out.println("Enter target account number : ");
                    String targetAccNum = sc.nextLine();
                    Account targetAcc = bank.getAccount(targetAccNum);
                    if(targetAcc==null){
                        System.out.println("Account not found");
                        break;
                    }
                    System.out.println("Enter amount to transfer : ");
                    double amtToTransfer = Double.parseDouble(sc.nextLine());
                    try {
                        destAcc.transfer(targetAcc, amtToTransfer);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    exit = 1;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }
}
