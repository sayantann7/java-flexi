public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}
