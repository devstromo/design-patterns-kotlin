# Flyweight Pattern

## Structural Design Pattern

The Flyweight Pattern is a structural design pattern that focuses on reducing the number of objects created, to decrease
memory and resource usage thereby improving performance. This pattern achieves this by sharing as many data as possible
with similar objects; it is used when there is a need to create a large number of similar objects.

## Key Components

1. **Flyweight:**
    - Defines the interface through which flyweights can receive and act on extrinsic state.

2. **Concrete Flyweight:**
    - Implements the Flyweight interface and stores intrinsic state. Intrinsic state is independent of the context,
      hence shared and immutable.
    - Acts on the extrinsic state passed to it.

3. **Flyweight Factory:**
    - Manages flyweight objects and ensures that flyweights are shared properly. When requested, it returns an existing
      instance or creates a new one if none exists.

4. **Client:**
    - Maintains a reference to flyweights.
    - Computes or stores the extrinsic state of the flyweights.

## Advantages

- **Memory Savings:** Can dramatically reduce the amount of memory objects use when there is a large number of objects
  that share much of their state.
- **Improved Performance:** Reduces the overhead of creating instances and managing their lifecycle in high-volume
  systems.

## Use Cases

- Effective in large systems where objects are used in large numbers and typically do not vary much in state.
- Useful in applications where memory footprint reduction is crucial, such as real-time systems or applications running
  on limited hardware.
- Commonly used in graphics-intensive applications like gaming or graphics design software where many objects might
  share rendering information.

## Considerations

- Complexity: Implementing the Flyweight pattern can increase the complexity of the code.
- Runtime Cost: The savings in memory might come at the cost of increased runtime, particularly when computing extrinsic
  state.
- Initialization Overhead: The setup of shared objects can be complex and require careful management to ensure thread
  safety and performance.
