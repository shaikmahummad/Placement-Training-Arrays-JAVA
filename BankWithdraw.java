import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount! Enter positive value.");
        }

        if (amount > balance) {
            throw new Exception("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: " + balance);
    }
}

public class BankWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(5000); 
        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            acc.withdraw(amount);
        } 
        catch (Exception e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        } 
        finally {
            System.out.println("Transaction process completed.");
        }
    }
}
