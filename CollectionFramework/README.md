
# Java Collection Framework – Short Revision Notes

---

# What is Collection Framework?

The **Java Collection Framework (JCF)** is a set of interfaces and classes in the `java.util` package used to store and manipulate groups of objects dynamically.

**Advantages**
- Dynamic size
- Easy insertion and deletion
- Built-in sorting and searching
- Code reusability
- Better performance
- Supports Generics

---

# Collection Framework Hierarchy

```text
Iterable
   │
Collection
 ├── List
 ├── Set
 └── Queue
      └── Deque

Map (Separate Interface)
```

> **Note:** `Map` is **not** a child of the `Collection` interface.

---

# List

Stores **ordered** elements.

### Features
- Ordered
- Duplicates allowed
- Index-based
- Multiple null values allowed

### Implementations
- ArrayList
- LinkedList
- Vector
- Stack

---

# ArrayList

- Dynamic Array
- Fast random access
- Slow insertion/deletion in middle

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add | O(1) |
| Get | O(1) |
| Remove | O(n) |
| Search | O(n) |

---

# LinkedList

- Doubly Linked List
- Fast insertion/deletion
- Slow random access

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Access | O(n) |
| Insert | O(1) |
| Delete | O(1) |

---

# Vector

- Dynamic Array
- Synchronized
- Thread-safe
- Slower than ArrayList

---

# Stack

- LIFO (Last In First Out)

### Methods

```java
push()
pop()
peek()
search()
empty()
```

---

# Set

Stores **unique** elements.

### Features
- No duplicates
- Not index-based
- At most one null value (HashSet)

### Implementations
- HashSet
- LinkedHashSet
- TreeSet

---

# HashSet

- Uses Hash Table
- Unordered
- Fast operations
- One null allowed

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add | O(1) |
| Remove | O(1) |
| Search | O(1) |

---

# LinkedHashSet

- Maintains insertion order
- No duplicates

---

# TreeSet

- Sorted order
- Uses Red-Black Tree
- No duplicates
- No null values

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add | O(log n) |
| Remove | O(log n) |
| Search | O(log n) |

---

# Queue

- FIFO (First In First Out)

### Methods

```java
offer()
poll()
peek()
```

### Implementations
- PriorityQueue
- ArrayDeque
- LinkedList

---

# PriorityQueue

- Elements processed by priority
- Default: Smallest element first

---

# Deque

Double Ended Queue

### Methods

```java
addFirst()
addLast()
removeFirst()
removeLast()
```

---

# Map

Stores data as **Key → Value**

### Features
- Unique keys
- Duplicate values allowed
- Not part of Collection interface

### Implementations
- HashMap
- LinkedHashMap
- TreeMap
- Hashtable

---

# HashMap

- One null key
- Multiple null values
- Fast lookup

### Time Complexity

| Operation | Complexity |
|-----------|------------|
| Put | O(1) |
| Get | O(1) |
| Remove | O(1) |

---

# LinkedHashMap

- Maintains insertion order

---

# TreeMap

- Sorted keys
- No null key

### Time Complexity

```text
O(log n)
```

---

# Hashtable

- Thread-safe
- No null key
- No null value

---

# Iterator

Used to traverse collections.

### Methods

```java
hasNext()
next()
remove()
```

---

# ListIterator

Works only with List.

### Features
- Forward traversal
- Backward traversal

### Methods

```java
next()
previous()
hasNext()
hasPrevious()
```

---

# Comparable

Used for **Natural Sorting**.

### Method

```java
compareTo()
```

---

# Comparator

Used for **Custom Sorting**.

### Method

```java
compare()
```

---

# Collections Utility Class

Useful Methods

```java
sort()
reverse()
shuffle()
swap()
max()
min()
binarySearch()
frequency()
copy()
fill()
rotate()
```

---

# Generics

Provides **Type Safety**.

```java
ArrayList<String> list = new ArrayList<>();
```

### Benefits
- Compile-time checking
- No explicit type casting
- Cleaner code

---

# Array vs Collection

| Array | Collection |
|--------|------------|
| Fixed size | Dynamic size |
| Faster | Flexible |
| Limited methods | Rich API |
| Stores primitives & objects | Stores objects (use wrapper classes for primitives) |

---

# Collection vs Collections

| Collection | Collections |
|------------|-------------|
| Interface | Utility Class |
| Parent of List, Set, Queue | Contains static utility methods |
| Stores objects | Performs operations on collections |

---

# Fail-Fast vs Fail-Safe

## Fail-Fast
Examples
- ArrayList
- HashMap
- HashSet

Throws

```java
ConcurrentModificationException
```

---

## Fail-Safe

Examples
- CopyOnWriteArrayList
- ConcurrentHashMap

Works on a copy of the collection.

---

# Time Complexity Cheat Sheet

| Collection | Access | Insert | Delete | Search |
|------------|:------:|:------:|:------:|:------:|
| ArrayList | O(1) | O(1)* | O(n) | O(n) |
| LinkedList | O(n) | O(1) | O(1) | O(n) |
| HashSet | — | O(1) | O(1) | O(1) |
| TreeSet | — | O(log n) | O(log n) | O(log n) |
| HashMap | O(1) | O(1) | O(1) | O(1) |
| TreeMap | O(log n) | O(log n) | O(log n) | O(log n) |

> *O(1) for `ArrayList.add()` is amortized when appending.

---

# Which Collection Should You Use?

| Requirement | Collection |
|-------------|------------|
| Fast random access | ArrayList |
| Frequent insertion/deletion | LinkedList |
| Unique elements | HashSet |
| Unique + insertion order | LinkedHashSet |
| Unique + sorted | TreeSet |
| Key-Value storage | HashMap |
| Key-Value + insertion order | LinkedHashMap |
| Key-Value + sorted keys | TreeMap |
| FIFO operations | Queue / ArrayDeque |
| Priority-based processing | PriorityQueue |
| LIFO operations | Stack / Deque |

---

# One-Line Revision

- **Collection** → Root interface
- **Map** → Key-Value pair (Separate interface)
- **List** → Ordered + Duplicate
- **Set** → Unique elements
- **Queue** → FIFO
- **Deque** → Double-ended queue
- **Stack** → LIFO
- **ArrayList** → Fast read
- **LinkedList** → Fast insert/delete
- **HashSet** → Fast unique storage
- **LinkedHashSet** → Insertion order
- **TreeSet** → Sorted unique elements
- **HashMap** → Fast key-value storage
- **LinkedHashMap** → Insertion order
- **TreeMap** → Sorted keys
- **Hashtable** → Thread-safe, no nulls
- **Iterator** → Forward traversal
- **ListIterator** → Forward & backward traversal
- **Comparable** → Natural sorting
- **Comparator** → Custom sorting
- **Collections** → Utility methods
- **Generics** → Type safety

---

# Frequently Asked Interview Questions

1. What is the Collection Framework?
2. Difference between List and Set?
3. Difference between ArrayList and LinkedList?
4. Difference between HashSet and TreeSet?
5. Difference between HashMap and Hashtable?
6. Difference between HashMap and TreeMap?
7. Difference between Comparable and Comparator?
8. Difference between Collection and Collections?
9. What are Generics?
10. What are fail-fast and fail-safe iterators?

---

# Final Revision Keywords

- **List** → Ordered ✔ Duplicate ✔
- **Set** → Unique ✔
- **Queue** → FIFO ✔
- **Stack** → LIFO ✔
- **HashMap** → Fast Lookup ✔
- **TreeMap** → Sorted Keys ✔
- **TreeSet** → Sorted Elements ✔
- **ArrayList** → Fast Access ✔
- **LinkedList** → Fast Insert/Delete ✔
- **Comparable** → `compareTo()` ✔
- **Comparator** → `compare()` ✔
- **Iterator** → `hasNext()`, `next()` ✔
- **Generics** → Compile-time Type Safety ✔
- **Collections** → `sort()`, `reverse()`, `shuffle()` ✔