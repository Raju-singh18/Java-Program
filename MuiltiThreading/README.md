# Ways to Achieve Multithreading in Java

Java provides **two fundamental ways** to create multithreading. Modern Java also provides additional APIs for better thread management.

---

## 🔹 1. By Extending the `Thread` Class

- Create a class that **extends the `Thread` class**.
- Override the **`run()`** method.
- Call the **`start()`** method to create and execute a new thread.

**Explanation:**
- The `run()` method contains the task that the thread will execute.
- Calling `start()` creates a new thread and internally invokes the `run()` method.
- Since Java supports **single inheritance**, a class that extends `Thread` **cannot extend any other class**.

**Example:**

```java
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

**Advantages**
- Simple and easy to understand.
- Direct access to all methods of the `Thread` class.

**Disadvantages**
- Cannot extend another class because Java does not support multiple inheritance.

---

## 🔹 2. By Implementing the `Runnable` Interface

- Create a class that **implements the `Runnable` interface**.
- Override the **`run()`** method.
- Pass the object to the `Thread` constructor.
- Call the **`start()`** method.

**Explanation:**
- The task is separated from the thread.
- Multiple threads can execute the same `Runnable` object.
- This is the **recommended and most commonly used approach**.

**Example:**

```java
class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();

        Thread t1 = new Thread(obj);
        t1.start();
    }
}
```

**Advantages**
- Allows the class to extend another class.
- Better code reusability.
- Suitable for sharing resources among multiple threads.

**Disadvantages**
- Requires creating a separate `Thread` object.

---

# Modern Ways (Java 5+)

Although the above two are the basic methods, modern Java provides additional APIs for creating and managing threads.

---

## 🔹 3. Using `Callable` Interface

- Similar to `Runnable`.
- Can **return a value**.
- Can **throw checked exceptions**.
- Used together with `Future` and `ExecutorService`.

**Use Case:** When a task needs to return a result.

---

## 🔹 4. Using `ExecutorService` (Thread Pool)

- Manages a pool of reusable threads.
- Eliminates the need to create threads manually.
- Improves application performance.
- Recommended for enterprise applications.

**Use Case:** Executing multiple tasks efficiently.

---

## 🔹 5. Using Lambda Expressions (Java 8+)

- Provides a shorter syntax for creating a `Runnable`.
- Makes multithreaded code cleaner and more readable.

**Example:**

```java
Thread t = new Thread(() -> {
    System.out.println("Thread is running...");
});

t.start();
```

---

# Quick Revision

| Method | Description |
|---------|-------------|
| **Extending `Thread`** | Create a class that extends `Thread` and override `run()`. |
| **Implementing `Runnable`** | Implement `Runnable`, override `run()`, and pass it to a `Thread` object. *(Recommended)* |
| **Using `Callable`** | Similar to `Runnable`, but returns a value and can throw exceptions. |
| **Using `ExecutorService`** | Uses a thread pool for efficient thread management. |
| **Using Lambda Expression** | Simplified way to create a `Runnable` (Java 8+). |

---

## Interview Tip

- **Basic Java Interview:** There are **2 ways** to achieve multithreading:
  1. Extending the `Thread` class
  2. Implementing the `Runnable` interface

- **Advanced Java Interview:** You can also mention:
  - `Callable`
  - `ExecutorService`
  - Lambda Expressions
