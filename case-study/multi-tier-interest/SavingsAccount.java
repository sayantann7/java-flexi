public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        double interest = balance * 0.04;
        
        if (balance > 50000) {
            interest += 500;
        }
        
        return interest;
    }
}
