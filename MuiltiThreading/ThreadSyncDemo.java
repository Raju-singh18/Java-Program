import java.util.Scanner;

class Account {
    int bal;

    Account(int b) {
        bal = b;
    }

    boolean isSufficientbal(int w) {
        if (bal >= w) {
            return true;
        } else {
            return false;
        }
    }

    void withDraw(int amt, String s) {
        bal = bal - amt;
        System.out.println(s + " Transaction Successful.");
        System.out.println(s + " Current balance is: " + bal);
    }
}

class Customer implements Runnable {
    Account x1;
    String s2;

    Customer(Account j1, String s1) {
        x1 = j1;
        s2 = s1;
    }

    public void run() {
        Scanner s1 = new Scanner(System.in);
        synchronized (x1) {
            System.out.println("Enter amount to withdraw for " + s2 + ": ");
            int amt = s1.nextInt();

            if (x1.isSufficientbal(amt)) {
                x1.withDraw(amt, s2);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
    }

}

public class ThreadSyncDemo {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1, "Amit");
        Customer c2 = new Customer(a1, "Sumit");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
