package task1;

public class CreditCard {
    private final int accountNumber;
    private double currentAmount;

    public CreditCard (int accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public double setCurrentAmount (double amount) {
        currentAmount += amount;
        return currentAmount;
    }

    public boolean getAmount (double amount) {
        if (currentAmount >= amount) {
            currentAmount -= amount;
            return  true;
        }
        return false;
    }

    public void getCardInfo () {
        System.out.printf("Current account number: %2d \namount: %.2f\n", accountNumber, currentAmount);
    }
}
