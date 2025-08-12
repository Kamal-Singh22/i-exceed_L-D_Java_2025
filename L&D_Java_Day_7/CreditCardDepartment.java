// Split into smaller, specific interfaces

public interface DepositService {

    void deposit(double amount);

}
 
public interface WithdrawService {

    void withdraw(double amount);

}
 
public interface FixedDepositService {

    void openFixedDeposit(double amount, int years);

}
 
public interface CreditCardService {

    void issueCreditCard();

}
 
public interface LoanService {

    void processLoan();

}
 
// SavingsAccount implements only what it needs

public class SavingsAccount implements DepositService, WithdrawService, FixedDepositService {

    @Override

    public void deposit(double amount) {

        System.out.println("Deposited " + amount);

    }
 
    @Override

    public void withdraw(double amount) {

        System.out.println("Withdrew " + amount);

    }
 
    @Override

    public void openFixedDeposit(double amount, int years) {

        System.out.println("Opened FD for " + years + " years");

    }

}
 
// CreditCardDepartment implements only relevant service

public class CreditCardDepartment implements CreditCardService {

    @Override

    public void issueCreditCard() {

        System.out.println("Credit card issued");

    }

}

 