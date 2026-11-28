public class SavingsCurrentAccounts
{
    public static void main(String[] args) {
        Account s = new Savings(1000), c = new Current(1000);
        s.withdraw(950);
        c.withdraw(1200);
        System.out.println("Savings = " + s.balance + ", Current = " + c.balance);
    }

    static abstract class Account {
        double balance;
        Account(double b) { balance = b; }
        abstract void withdraw(double amt);
    }
    static class Savings extends Account {
        Savings(double b) { super(b); }
        void withdraw(double amt) { if (balance - amt >= 100) balance -= amt; else System.out.println("Min balance 100 required"); }
    }
    static class Current extends Account {
        Current(double b) { super(b); }
        void withdraw(double amt) { if (balance - amt >= -500) balance -= amt; else System.out.println("Overdraft limit exceeded"); }
    }
}
