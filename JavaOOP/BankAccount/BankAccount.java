public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;

    public static int accounts = 0;
    public static double moneyInAccounts = 0.0;

    //constructor johnsons
    public BankAccount() {
        accounts++;
    }

    //method johnsons
    public void depositChecking(double amountIntoChecking) {
        this.checkingBalance += amountIntoChecking;
        System.out.println("Your current checking balance is " + this.checkingBalance);
    }

    public void depositSavings(double amountIntoSaving) {
        this.savingsBalance += amountIntoSaving;
        System.out.println("Your savings balance went up by " + amountIntoSaving + ".The balance is now" + this.savingsBalance);
    }

    public void withdrawChecking(double checkingWithdrawal) {
        if (this.checkingBalance >= checkingWithdrawal) {
            this.checkingBalance -= checkingWithdrawal;
            System.out.println("You have withdrawn " + checkingWithdrawal + ". And your checking account is now at " + this.checkingBalance);
        } else {
        System.out.println("You do not have enough funds to withdraw that amount of money");
        }
    }

    public void withdrawSavings(double savingsWithdrawal) {
        if (this.savingsBalance >= savingsWithdrawal) {
            this.savingsBalance -= savingsWithdrawal;
            System.out.println("You have withdrawn " + savingsWithdrawal + ", and your savings account is now at " + this.savingsBalance);
        } else {
            System.out.println("You do now have enough funds to withdraw that amount of money");
        }
    }

    public void amountInChecking() {
        System.out.println("Your checking balance is " + this.checkingBalance);
    }

    public void amountInSavings() {
        System.out.println("Your savings balance is " + this.savingsBalance);
    }

    public void amountInAccounts() {
        System.out.println("You have " + this.checkingBalance + " in your checking account, and " + this.savingsBalance + " in your savings account.");
    }

    //getters johnsons and setter johnsons
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }
}