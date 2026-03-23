public class FixedDeposit extends SavingsAccount {

    public FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() + (balance * 0.02);
    }
}
