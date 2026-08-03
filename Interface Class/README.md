# Java Interface Properties

Interfaces define a **contract (blueprint)** that classes must follow. They provide abstraction, support multiple inheritance of behavior, and promote loose coupling in Java applications.

---

## 1. Interface cannot be instantiated

**Reason:**  
An interface is only a **blueprint (contract)** for classes. Since it does not contain a complete implementation, Java does not allow creating its object directly.

```java
interface Animal {
    void sound();
}

// Animal a = new Animal();   // ❌ Compile-time Error
```

---

## 2. Interface does not have constructors

**Reason:**  
Constructors are used to initialize objects. Since interfaces cannot create objects, constructors are not allowed.

```java
interface Demo {

    // Demo() { }   // ❌ Compile-time Error

}
```

---

## 3. All interface variables are `public static final` by default

**Reason:**  
Variables declared inside an interface are **constants** shared by all implementing classes.

```java
interface Demo {
    int MAX = 100;
}
```

Equivalent to:

```java
public static final int MAX = 100;
```

---

## 4. Abstract methods are `public` by default

**Reason:**  
An interface defines a contract that must be accessible to every implementing class.

```java
interface Demo {
    void show();
}
```

Equivalent to:

```java
public abstract void show();
```

---

## 5. An interface can contain abstract methods

**Reason:**  
It specifies **what** a class should do, while the implementing class decides **how** to do it.

```java
interface Shape {
    void draw();
}
```

---

## 6. An interface can contain `default` methods (Java 8+)

**Reason:**  
Default methods allow new functionality to be added without breaking existing implementing classes.

```java
interface Demo {

    default void display() {
        System.out.println("Default Method");
    }

}
```

---

## 7. An interface can contain `static` methods (Java 8+)

**Reason:**  
Static methods provide utility functionality related to the interface and can be called without creating an object.

```java
interface Demo {

    static void print() {
        System.out.println("Static Method");
    }

}
```

Usage:

```java
Demo.print();
```

---

## 8. An interface can contain `private` methods (Java 9+)

**Reason:**  
Private methods help reuse common code inside default and static methods while keeping it hidden from implementing classes.

```java
interface Demo {

    private void helper() {
        System.out.println("Helper Method");
    }

}
```

---

## 9. A class can implement multiple interfaces

**Reason:**  
Java does not support multiple inheritance of classes, but it allows multiple interface implementation to achieve multiple inheritance of behavior.

```java
interface Printable {}
interface Showable {}

class Student implements Printable, Showable {

}
```

---

## 10. An interface can extend multiple interfaces

**Reason:**  
This allows combining the features of multiple interfaces into a single interface.

```java
interface A {}

interface B {}

interface C extends A, B {

}
```

---

## 11. An implementing class must implement all abstract methods

**Reason:**  
A class must fulfill the contract defined by the interface. Otherwise, the class itself must be declared `abstract`.

```java
interface Animal {
    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Bark");
    }

}
```

---

## 12. Interfaces support abstraction

**Reason:**  
Interfaces expose only the required functionality while hiding implementation details.

```java
interface Payment {
    void pay();
}
```

---

## 13. Interfaces support polymorphism

**Reason:**  
Different classes can provide different implementations of the same interface, allowing one reference to represent multiple objects.

```java
interface Animal {
    void sound();
}

class Dog implements Animal {

    public void sound() {
        System.out.println("Bark");
    }

}

Animal a = new Dog();
a.sound();
```

---

## 14. Interfaces promote loose coupling

**Reason:**  
Code depends on the interface instead of a specific implementation, making applications easier to maintain, test, and extend.

```java
interface Payment {
    void pay();
}

class CreditCard implements Payment {

    public void pay() {
        System.out.println("Paid using Credit Card");
    }

}
```

---

## 15. Interfaces improve code reusability and flexibility

**Reason:**  
The same interface can be implemented by multiple classes, allowing implementations to be replaced without changing client code.

```java
interface Vehicle {
    void start();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car Started");
    }

}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike Started");
    }

}
```

---

# Quick Revision

| Property | Reason |
|----------|--------|
| Cannot be instantiated | It is only a blueprint, not an object. |
| No constructors | Constructors initialize objects, and interfaces cannot create objects. |
| Variables are `public static final` | They represent constants. |
| Methods are `public abstract` by default | They define a contract for implementing classes. |
| Supports abstract methods | Defines behavior without implementation. |
| Supports default methods | Allows backward compatibility. |
| Supports static methods | Provides utility methods. |
| Supports private methods | Reuses internal logic. |
| Multiple interfaces can be implemented | Achieves multiple inheritance of behavior. |
| Can extend multiple interfaces | Combines multiple contracts. |
| Supports abstraction | Hides implementation details. |
| Supports polymorphism | One interface, many implementations. |
| Promotes loose coupling | Depends on interfaces rather than implementations. |
| Improves reusability | Multiple classes can implement the same interface. |

> **Interview Tip:**  
> **Interface = "What to do" (Contract)**  
> **Class = "How to do it" (Implementation)**