
import java.util.Scanner;

class Account {
    int bal;

    Account(int b) {
        bal = b;
    }

    public boolean isSufficient(int withdraw) {
        if (bal >= withdraw) {
            return true;
        } else {
            return false;
        }
    }

    public void Withdraw(int wb) {
        bal = bal - wb;
        System.out.println("Withdraw successful");
        System.out.println("Current Bal is:" + bal);
    }
}

class Customer implements Runnable {
    Account h1;
    String name;

    Customer(Account g1, String s1) {
        h1 = g1;
        name = s1;
    }

    public void run() {
        synchronized (h1) {
            Scanner sc = new Scanner(System.in);
            System.out.println(name + " Enter your amount: ");
            int amt = sc.nextInt();
            if (h1.isSufficient(amt)) {
                h1.Withdraw(amt);
            } else {
                System.out.println("Insufficient Amount");
            }
        }
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        Account a1 = new Account(5000);
        Customer c1 = new Customer(a1, "Piyush");
        Customer c2 = new Customer(a1, "Yash");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
