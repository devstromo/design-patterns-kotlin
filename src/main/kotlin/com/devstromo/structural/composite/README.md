# Composite Pattern

## Structural Design Pattern

The Composite Pattern is a structural design pattern that allows you to compose objects into tree structures to
represent part-whole hierarchies. This pattern enables clients to treat individual objects and compositions of objects
uniformly. It's particularly useful for building a hierarchy of objects where the components can be treated as if they
were individual or part of a larger group.

## Key Components

1. **Component:**
    - Declares the interface for objects in the composition.
    - Can implement default behavior for the interface common to all classes, as appropriate.

2. **Leaf:**
    - Represents leaf objects in the composition. A leaf has no children.
    - Defines behavior for primitive objects in the composition.

3. **Composite:**
    - Defines behavior for components having children.
    - Stores child components.
    - Implements child-related operations in the Component interface.

4. **Client:**
    - Manipulates objects in the composition through the Component interface.

## Advantages

- **Uniformity:** Treats single objects and compositions uniformly via a common interface which simplifies client code.
- **Flexibility:** Makes it easier to add new kinds of components as long as they support the same interface.
- **Transparency:** Clients use the composite structure through a single interface which makes the client code
  independent of the actual object hierarchy.

## Use Cases

- Useful when you need to implement a part-whole hierarchy of objects.
- Applicable when clients should ignore the difference between compositions of objects and individual objects.
- Often used in graphics drawing applications, file systems, UI controls, and other structures where components can be
  composed into tree structures.

## Considerations

- Designing the Component interface with child management methods can make the interface less specific to leaf
  components.
- Overhead can be involved when organizing the data structures to support the numerous lightweight elements.
