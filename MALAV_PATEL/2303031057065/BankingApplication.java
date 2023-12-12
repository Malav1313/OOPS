public class BankingApplication {
    private double balance = 2000.00;
    private int pinNumber = 1234;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount, int enteredPin) throws InsufficientFundsException, InvalidPinNumberException {
        if (enteredPin != pinNumber) {
            throw new InvalidPinNumberException("Invalid Pin Number");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Not Sufficient Fund");
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        BankingApplication account = new BankingApplication();
        account.deposit(2000.00);
        try {
            account.withdraw(1400.00, 1234);
            account.withdraw(300.00, 1234);
            account.withdraw(500.00, 1234);
            account.withdraw(500.00, 1111);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidPinNumberException extends Exception {
    public InvalidPinNumberException(String message) {
        super(message);
    }
}
