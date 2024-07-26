# State Design Pattern

## A Behavioral Design Pattern

The State Design Pattern is a behavioral design pattern that allows an object to alter its behavior when its internal
state changes. This pattern is used to encapsulate varying behavior for the same object, based on its internal state.

## Key Concepts

1. **Context:**
    - Maintains an instance of a ConcreteState subclass that defines the current state.
    - Allows clients to request operations.

2. **State:**
    - An interface or abstract class defining the methods that all concrete states should implement.
    - Each method represents a behavior that can vary as the object's state changes.

3. **Concrete States:**
    - Classes that implement the State interface.
    - Each class represents a different state with its own unique behavior.
    - Override methods from the State interface to implement behaviors specific to that state.

## Functionality

- The context calls methods on the current state object to perform behavior.
- The state object can decide to change the context's current state, leading to a change in behavior.

## Advantages

- **Separation of Concerns:** The pattern separates state-specific behavior into distinct classes.
- **Open/Closed Principle:** Easy to introduce new states without changing existing states or the context.
- **Eliminates Conditional Statements:** Reduces the need for conditional statements in the context's code.

## Use Cases

- Used when an object's behavior depends on its state, and it must change its behavior at runtime depending on that
  state.
- Examples include UI elements with distinct modes, workflow processes, or game characters with different states.

## Considerations

- Overuse can lead to a proliferation of classes if many states are involved.
- Can be overkill for simple state changes that can be managed with simple conditional logic.