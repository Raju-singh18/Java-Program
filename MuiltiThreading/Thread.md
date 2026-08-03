# Thread Life Cycle in Java

A **thread life cycle** represents the different states through which a thread passes from its creation until its termination.

Java defines these states in the `Thread.State` enum.

---

# Thread Life Cycle Diagram

```text
                 NEW
                  │
             start()
                  │
                  ▼
             RUNNABLE
                  │
     (Selected by CPU Scheduler)
                  │
                  ▼
              RUNNING
        ┌─────────┼─────────┐
        │         │         │
        ▼         ▼         ▼
   BLOCKED   WAITING   TIMED_WAITING
        │         │         │
        └─────────┼─────────┘
                  │
                  ▼
             RUNNABLE
                  │
                  ▼
            TERMINATED
```

---

# 1. NEW State

### Definition

- A thread is in the **NEW** state after it is created but before the `start()` method is called.

### Explanation

- Memory is allocated for the thread.
- The thread has not started execution yet.

### Example

```java
Thread t = new Thread();

System.out.println(t.getState());
```

**Output**

```
NEW
```

---

# 2. RUNNABLE State

### Definition

- A thread enters the **RUNNABLE** state after the `start()` method is called.

### Explanation

- The thread is ready to execute.
- It waits for the CPU scheduler to assign CPU time.

### Example

```java
Thread t = new Thread();

t.start();
```

---

# 3. RUNNING State

### Definition

- A thread is in the **RUNNING** state when the CPU scheduler selects it for execution.

### Explanation

- The `run()` method is currently executing.
- Only one thread executes at a time on a single CPU core.

---

# 4. BLOCKED State

### Definition

- A thread enters the **BLOCKED** state when it is waiting to acquire a monitor lock.

### Explanation

- Another thread is using the synchronized resource.
- The blocked thread waits until the lock becomes available.

### Example

```java
synchronized(obj) {
    // Thread waits here if another thread owns the lock
}
```

---

# 5. WAITING State

### Definition

- A thread enters the **WAITING** state when it waits indefinitely for another thread to perform an action.

### Explanation

- It remains waiting until another thread wakes it up.

### Methods

- `wait()`
- `join()`
- `LockSupport.park()`

---

# 6. TIMED_WAITING State

### Definition

- A thread enters the **TIMED_WAITING** state when it waits for a specified amount of time.

### Explanation

- After the time expires, the thread becomes runnable again.

### Methods

- `sleep(time)`
- `join(time)`
- `wait(time)`

### Example

```java
Thread.sleep(2000);
```

---

# 7. TERMINATED (Dead) State

### Definition

- A thread enters the **TERMINATED** state after completing the execution of the `run()` method.

### Explanation

- The thread has finished its work.
- It cannot be restarted.

### Example

```java
class Demo extends Thread {

    public void run() {
        System.out.println("Thread Finished");
    }

    public static void main(String[] args) {

        Demo t = new Demo();
        t.start();
    }
}
```

---

# Complete Life Cycle

1. **NEW** → Thread object is created.
2. **RUNNABLE** → `start()` is called.
3. **RUNNING** → CPU executes the thread.
4. **BLOCKED / WAITING / TIMED_WAITING** → Thread pauses for a lock, notification, or time delay.
5. **RUNNABLE** → Thread becomes ready again.
6. **TERMINATED** → `run()` method finishes.

---

# Thread States in `Thread.State`

| State | Description |
|--------|-------------|
| **NEW** | Thread is created but not started. |
| **RUNNABLE** | Thread is ready to run and waiting for CPU time. |
| **RUNNING** | Thread is currently executing. *(Managed by the CPU scheduler; Java exposes this as part of RUNNABLE.)* |
| **BLOCKED** | Waiting to acquire a monitor lock. |
| **WAITING** | Waiting indefinitely for another thread's action. |
| **TIMED_WAITING** | Waiting for a specified period. |
| **TERMINATED** | Thread has completed execution. |

---

# Important Interview Points

- A thread starts in the **NEW** state.
- Calling **`start()`** moves it to the **RUNNABLE** state.
- The CPU scheduler selects a runnable thread for execution.
- A thread may enter **BLOCKED**, **WAITING**, or **TIMED_WAITING** during execution.
- After completing the `run()` method, the thread enters the **TERMINATED** state.
- A terminated thread **cannot be restarted**. Calling `start()` again throws an **`IllegalThreadStateException`**.

---

# Interview Question

### Q1. What are the states in the Java thread life cycle?

**Answer:**

- NEW
- RUNNABLE
- RUNNING *(conceptual execution state; the official `Thread.State` enum uses RUNNABLE)*
- BLOCKED
- WAITING
- TIMED_WAITING
- TERMINATED

> **Note:** The official `Thread.State` enum contains **6 constants**: `NEW`, `RUNNABLE`, `BLOCKED`, `WAITING`, `TIMED_WAITING`, and `TERMINATED`. "RUNNING" is commonly used to describe the period when a runnable thread is actually executing on the CPU.