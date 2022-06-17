public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = getAmount() + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount >= sum) {
            amount = getAmount() - sum;
        } else
            throw new LimitException("\nError" + "\nAccount Balance: " + getAmount(), amount);
    }
}