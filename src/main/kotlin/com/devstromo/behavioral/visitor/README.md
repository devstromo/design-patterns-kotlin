# Visitor Pattern

## Behavioral Design Pattern

The Visitor Pattern is a behavioral design pattern that allows you to add new operations to existing object structures
without modifying the structures. It achieves this by using a visitor class that changes the executing operation based
on the class of the object it encounters. This pattern is particularly useful when you need to perform a variety of
unrelated operations across a complex object structure, like an object tree.

## Key Components

1. **Visitor:**
    - An interface or abstract class with visit methods, which are overloaded for each class of element in the object
      structure that can be visited.

2. **Concrete Visitor:**
    - Implements each of the visit methods declared by the Visitor. Each method is tailored to a particular class of
      element object.
    - Contains the operation to be performed on elements of the object structure.

3. **Element:**
    - An interface containing a method `accept(Visitor)`, which takes a visitor object as an argument.

4. **Concrete Element:**
    - Implements the Element interface.
    - The `accept` method typically calls the visit method on the Visitor and passes itself as the argument, thus
      linking the visitor with the element.

5. **Object Structure:**
    - A collection that can enumerate its elements and provide a high-level interface to allow the visitor to visit its
      elements.

## Advantages

- **Separation of Concerns:** Separates the algorithm from the objects on which it operates, which can help in keeping
  changes from affecting the objects' classes.
- **Adding Operations:** Makes it easy to add operations over object structures without modifying the structures.
- **Accumulating State:** Visitors can accumulate state as they visit elements, which can be useful for collecting
  results or performing aggregations.

## Use Cases

- Useful in parsers and compilers where objects representing syntax trees may need various operations to be performed,
  like interpretation, code generation, or type checking.
- Ideal for maintaining various operations across a composite object structure without changing the elements on which
  they operate.
- Effective in scenarios requiring a report to be generated from a complex object structure.

## Considerations

- Can lead to violations of encapsulation as the visitor depends on the details of the elements.
- May become cumbersome if every time new element types are added, each Visitor needs to be updated (which can
  contradict the open/closed principle).
