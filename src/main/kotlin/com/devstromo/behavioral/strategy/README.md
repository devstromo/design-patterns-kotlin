# Strategy Pattern

## Behavioral Design Pattern

The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm’s runtime behavior among a
family of algorithms. It defines a set of algorithms, encapsulates each one of them, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.

## Key Components

1. **Context:**
    - Maintains a reference to one of the concrete strategies and communicates with this object only via the strategy
      interface.
    - Can define an interface that lets the strategy access its data.

2. **Strategy:**
    - Declares an interface common to all supported algorithms. Context uses this interface to call the algorithm
      defined by a Concrete Strategy.

3. **Concrete Strategy:**
    - Implements the strategy interface and provides the concrete algorithm implementation.
    - Multiple Concrete Strategies offer a different implementation of the same behavior the context uses.

## Advantages

- **Flexibility:** Enables switching between different algorithms or strategies at runtime.
- **Decoupling:** Separates the implementation details of an algorithm from the code that uses it.
- **Ease of Expansion:** Adding new strategies or modifying existing ones does not affect the context.

## Use Cases

- Useful when there are several ways to achieve a task, and the best approach depends on the circumstances.
- Ideal for when a class defines many behaviors, and these appear as multiple conditional statements in its operations.

## Considerations

- The application must be aware of all the strategies to select the right one for the right situation.
- There’s a trade-off between the number of strategies and their complexity. More strategies can mean more complexity in
  understanding and maintaining the code.

