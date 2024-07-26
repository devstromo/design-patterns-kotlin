# Decorator Design Pattern

## A Structural Design Pattern

The Decorator Pattern is a structural design pattern that allows behavior to be added to individual objects, either
statically or dynamically, without affecting the behavior of other objects from the same class.

## Key Concepts

1. **Component:**
    - An interface or abstract class defining the operations that can be altered by decorators.
    - Acts as the base interface for concrete components and decorators.

2. **Concrete Component:**
    - A class that implements the Component interface.
    - Defines an object to which additional responsibilities can be attached.

3. **Decorator:**
    - An abstract class that implements the Component interface and contains a reference to a Component object.
    - Maintains a reference to a Component object and defines an interface that conforms to Component's interface.

4. **Concrete Decorators:**
    - Classes that extend the Decorator class.
    - Add responsibilities to the component (can add their own state or behavior).

## Functionality

- Decorators provide a flexible alternative to subclassing for extending functionality.
- The client code works with all objects using the Component interface. It can remain unaware of the specific types of
  objects it works with, whether they are decorated or not.

## Advantages

- **Flexibility:** More flexible than inheritance for extending functionality.
- **Avoids Feature-Laden Classes:** Rather than having one class that handles many variations of behavior, you can
  distribute these variations among separate classes.
- **Decorators Can Be Combined:** Different decorators can be added to or removed from the object independently.

## Use Cases

- Used in scenarios where responsibilities and behaviors should be added dynamically to objects.
- Common in GUI toolkits to add behaviors like scrolling, borders, or shadows to components.

## Considerations

- Can lead to a large number of small classes, which can be confusing.
- Overuse can make designs complex, especially when trying to trace a component's functionalities.

## Other examples

- https://www.baeldung.com/kotlin/decorator-pattern 