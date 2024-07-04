# Proxy Pattern

## Structural Design Pattern

The Proxy Pattern is a structural design pattern that provides an object representing another object. This proxy object
acts as an intermediary for accessing the original object, controlling the interaction with it, enhancing it, or
simplifying its interface. It is used to add a layer of control over the interaction between a client and an actual
target object.

## Key Components

1. **Proxy:**
    - Maintains a reference to the target object.
    - Controls access to the target by providing a surrogate or placeholder for another object to control access to it.

2. **Real Subject (Target):**
    - Defines the real object that the proxy represents.

3. **Subject Interface:**
    - Provides a common interface for both the real object and the proxy so that a proxy can be used anywhere a real
      object is expected.

4. **Client:**
    - Interacts with the Subject Interface, not knowing whether it is interacting with a real object or its proxy.

## Advantages

- **Access Control:** Can provide control over the operations performed on the real object, which is useful in scenarios
  like security management or initialization of resource-intensive objects.
- **Reduced System Complexity:** Can protect the real object from the complexity of the outside world.
- **Lazy Initialization:** Proxies can delay the instantiation of a large or resource-intensive object until it is
  actually needed.

## Use Cases

- Commonly used in scenarios where objects need to be loaded from a high-latency source, like large images or network
  resources.
- Useful for implementing access control for different types of objects.
- Often employed in systems that require caching of objects' states, such as virtual proxies in web browsers for caching
  images.

## Considerations

- Can introduce a lot of extra classes, which may complicate the code if not designed carefully.
- Might cause a delay in response time due to the extra layer of interaction through the proxy.
