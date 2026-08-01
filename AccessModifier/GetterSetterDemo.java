class Bank {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}

public class GetterSetterDemo {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.setBalance(5000);

        System.out.println("Balance = " + b.getBalance());
    }
}
