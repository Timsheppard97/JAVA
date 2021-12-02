public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount Tim = new BankAccount();
        System.out.println(BankAccount.accounts);
        Tim.depositChecking(2500);
        Tim.withdrawChecking(2000);
        Tim.depositSavings(2000);
        Tim.withdrawSavings(2500);
        Tim.amountInChecking();
        Tim.amountInSavings();
        Tim.amountInAccounts();
    }
}