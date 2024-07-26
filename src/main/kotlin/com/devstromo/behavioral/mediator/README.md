# Mediator Pattern

## Behavioral Design Pattern

The Mediator Pattern is a structural design pattern that reduces the complexity of communication between multiple
objects or classes. This pattern provides a mediator object that handles all the communication and controls the workflow
between various components, thus reducing the direct dependencies among them.

## Key Components

1. **Mediator:**
    - Defines an interface for communicating with Colleague objects.
    - Centralizes complex communication and control logic.

2. **Colleague (Participants):**
    - Objects that communicate with each other through the mediator.
    - Each colleague knows its mediator object.
    - They don't communicate directly with each other.

3. **Concrete Mediator:**
    - Implements the mediator interface and coordinates communication between colleague objects.
    - Often holds references to all colleagues.
    - Manages and redirects the communication between colleagues.

4. **Concrete Colleague:**
    - A concrete implementation of the colleague class.
    - Communicates with other colleagues through the mediator.
    - Implements the communication logic as defined by the mediator.

## Advantages

- **Reduces Coupling:** The pattern decouples colleagues from each other, thus reducing the complexity of dependencies.
- **Centralizes Control:** Allows for easier maintenance and modification of the communication logic.
- **Simplifies Object Protocols:** By centralizing the communication, it simplifies the protocol needed for objects to
  interact with each other.

## Use Cases

- Ideal for scenarios where a set of objects communicate in well-defined but complex ways. The mediator centralizes
  complex communication logic.
- Useful in GUI development where multiple components need to interact without knowing the existence of each other.

## Considerations

- Overuse can lead to a 'God Object' - a mediator that controls too much logic and becomes a bottleneck in the system.
- Requires careful design to balance between centralization and flexibility.

### For more details, visit

- [Mediator Pattern](https://refactoring.guru/design-patterns/mediator).
- [Mediator in Kotlin](https://asvid.github.io/kotlin_mediator_pattern)
- [Mediator Pattern in Kotlin](https://www.baeldung.com/kotlin/mediator)