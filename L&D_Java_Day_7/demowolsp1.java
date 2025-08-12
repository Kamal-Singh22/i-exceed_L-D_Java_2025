abstract class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void deposit(int amount);
    public abstract void withdraw(int amount);
    public abstract double getBalance();
}

class SavingBankAccount extends BankAccount {
    public SavingBankAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

class FixedBankAccount extends BankAccount {
    public FixedBankAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        throw new UnsupportedOperationException("Cannot withdraw before maturity");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

public class demowolsp1 {
    public static void main(String[] args) {
        BankAccount ba = new SavingBankAccount(1, 10000);
        ba.deposit(1000);
        System.out.println("Saving Account Balance: ₹" + ba.getBalance());

        BankAccount fa = new FixedBankAccount(2, 20000);
        fa.deposit(1000);
        System.out.println("Fixed Account Balance: ₹" + fa.getBalance());

        try {
            fa.withdraw(1000);
        } catch (UnsupportedOperationException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        }
    }
}
