# Factory Pattern
## Creational Design Pattern

The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern is particularly useful when a system needs to be independent of how its products are created, composed, and represented. It's often used when the creation process involves business logic that dictates the type of object to create.

## Key Components

1. **Factory:**
   - An interface for creating objects.
   - The factory method is typically a method that returns objects of a base class or interface type.

2. **Concrete Factory:**
   - Implements or extends the factory interface.
   - Overrides the factory method to return an instance of a specific Concrete Product.

3. **Product:**
   - Defines the interface of objects the factory method creates.
   - Acts as the base class or interface for all products that the factory will produce.

4. **Concrete Product:**
   - Implements the Product interface.
   - Defines product objects to be created by the corresponding Concrete Factory.

## Advantages

- **Flexibility and Reusability:** Separates the creation details of objects from the code that uses them, making it easier to extend or modify the logic of object creation without changing the existing code.
- **Encapsulation:** Encapsulates the creation of objects and thus reduces dependencies, adhering to the principle of high cohesion and low coupling.

## Use Cases

- Used when the creation logic of an object is expected to change, allowing the system to be independent of how its products are created and composed.
- Applicable when a class wants its subclasses to specify the objects it creates.
- Useful in the development of libraries or frameworks where the implementation details are hidden from the client.

## Considerations

- The introduction of new products may require changing the Creator class and other existing factory classes, potentially violating the open-closed principle.
- Can lead to the creation of many small classes, which can increase the complexity of the code.
