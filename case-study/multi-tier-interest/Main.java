public class Main {
    public static void main(String[] args) {
        Account tc1 = new SavingsAccount(10000);
        System.out.println("TC 1 SavingsAccount(10000): " + tc1.calculateInterest());

        Account tc2 = new SavingsAccount(60000);
        System.out.println("TC 2 SavingsAccount(60000): " + tc2.calculateInterest());

        Account tc3 = new FixedDeposit(60000);
        System.out.println("TC 3 FixedDeposit(60000):   " + tc3.calculateInterest());
    }
}
