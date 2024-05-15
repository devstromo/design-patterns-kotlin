# Adapter Pattern

## Structural Design Pattern

The Adapter Pattern is a structural design pattern that allows objects with incompatible interfaces to collaborate. It
acts as a bridge between two incompatible interfaces by converting the interface of one class into another interface
clients expect. This pattern is particularly useful when needing to use existing classes that work together without
modifying their source code.

## Key Components

1. **Target:**
    - Defines the domain-specific interface that the client uses.

2. **Adapter:**
    - Adapts the interface of the Adaptee to the Target interface.
    - Implements the Target interface and holds an instance of the Adaptee.

3. **Adaptee:**
    - An existing class that needs adapting.
    - Has a different interface from what the client expects and needs to be used in the application.

4. **Client:**
    - Works with objects through the Target interface.
    - Calls operations on the Adapter instance which translates them into calls on the Adaptee's methods.

## Advantages

- **Interface Compatibility:** Allows otherwise incompatible classes to work together by converting the interface of one
  class into an interface expected by the clients.
- **Reusability:** Enables the use of existing classes even if their interfaces do not match the ones needed.
- **Flexibility:** Introduces only a few new classes, keeping the system flexible.

## Use Cases

- Useful when wanting to use an existing class that has an interface incompatible with the rest of the application.
- Applicable when creating reusable classes that cooperate with unforeseen classes, i.e., classes that don't necessarily
  have compatible interfaces.
- Ideal in situations where a class that needs to be reused is missing some of the required functionality which can be
  added by the Adapter.

## Considerations

- Overhead: Introduces an extra layer of abstraction which can sometimes complicate code or reduce performance.
- Direct coupling: The adapter might depend on a concrete Adaptee class, which can directly couple the Adapter to
  Adaptee and limit its use to the specific Adaptee.
