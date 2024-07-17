# Iterator Pattern

## Behavioral Design Pattern

The Iterator Pattern is a behavioral design pattern that provides a way to access the elements of an aggregate object
sequentially without exposing its underlying representation. This pattern allows the traversal of elements from a
collection without understanding the low-level workings of the collection. The iterator pattern is essential for
collections that need a standardized way to expose their elements one by one for use by client code.

## Key Components

1. **Iterator:**
    - An interface that defines the methods needed for traversing a collection, such as `next()`, `hasNext()`, and
      possibly methods like `remove()`.
    - Provides the means for accessing elements of an aggregate object sequentially without exposing the underlying
      structure.

2. **Concrete Iterator:**
    - Implements the Iterator interface and keeps track of the current position in the traversal of the aggregate.
    - Knows how to access and traverse a specific kind of aggregate object.

3. **Aggregate:**
    - An interface which declares one or more methods for creating instances of the Iterator interface. These methods
      return an iterator that is compatible with the aggregate object.

4. **Concrete Aggregate:**
    - Implements the Aggregate interface and returns an instance of the corresponding Concrete Iterator. The iterator
      created can access the collection's elements appropriately.

## Advantages

- **Decouples Collection and Traversal:** By separating collection mechanisms from the traversal mechanisms, the
  iterator pattern simplifies both components.
- **Supports Variations in Traversal:** Different iterators can be provided for different ways of traversing a
  collection.
- **Concurrent Modifications:** It provides a way to traverse a collection independently of client operations, which may
  modify the collection concurrently.

## Use Cases

- Useful for collections of various kinds, where a common interface for traversing items is needed regardless of how
  they are implemented.
- Applicable when your collection structure is complex, but you want to hide this complexity from the client.
- Often used in languages that support iterators natively within for-each loops and similar constructs.

## Considerations

- An iterator must be carefully designed to handle potential modifications to the collection during iteration, which can
  make implementation complex.
- Implementing multiple iterators can increase the complexity of the code if they need to interact with different kinds
  of collections or support different traversal policies.
