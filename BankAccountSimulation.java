public class BankAccountSimulation
{
    public static void main(String[] args) {
        Bank acc = new Bank(1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(5000);
        System.out.println("Final balance = " + acc.balance);
    }

    static class Bank {
        double balance;
        Bank(double b) { balance = b; }
        void deposit(double amt) {
            balance += amt;
            System.out.println("Deposited " + amt);
        }
        void withdraw(double amt) {
            if (amt > balance) System.out.println("Insufficient funds");
            else { balance -= amt; System.out.println("Withdrew " + amt); }
        }
    }
}
