import java.util.Scanner;

class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    // Deposit Money
    public void deposit(String name, int amount) {
        System.out.println(name + " is depositing ₹" + amount);

        balance += amount;

        System.out.println("Deposit Successful");
        System.out.println("Current Balance : ₹" + balance);
        System.out.println("--------------------------------");
    }

    // Withdraw Money
    public void withdraw(String name, int amount) {

        System.out.println(name + " wants to withdraw ₹" + amount);

        if (balance >= amount) {
            balance -= amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance : ₹" + balance);
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("--------------------------------");
    }

    // Check Balance
    public void checkBalance(String name) {
        System.out.println(name + " checked balance.");
        System.out.println("Current Balance : ₹" + balance);
        System.out.println("--------------------------------");
    }
}

class Customer implements Runnable {

    private Account account;
    private String name;

    Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (account) {
            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("\n===== " + name + " Menu =====");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");

                System.out.print("Enter Choice : ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Deposit Amount : ");
                        int d = sc.nextInt();
                        account.deposit(name, d);
                        break;

                    case 2:
                        System.out.print("Enter Withdraw Amount : ");
                        int w = sc.nextInt();
                        account.withdraw(name, w);
                        break;

                    case 3:
                        account.checkBalance(name);
                        break;

                    case 4:
                        System.out.println(name + " exited.");
                        return;

                    default:
                        System.out.println("Invalid Choice");
                }
            }
        }
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        Account account = new Account(10000);

        Customer c1 = new Customer(account, "Raju");
        Customer c2 = new Customer(account, "Amit");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
