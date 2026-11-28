public class EncapsulationDemo
{
    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(5000);
        System.out.println("Balance = " + a.getBalance());
    }

    static class Account {
        private double balance;
        double getBalance() { return balance; }
        void setBalance(double b) { if (b >= 0) balance = b; }
    }
}
