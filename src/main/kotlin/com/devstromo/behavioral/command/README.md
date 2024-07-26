# Command Pattern

## Behavioral Design Pattern

The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object that contains all
information about the request. This transformation allows for parameterizing methods with different requests, delaying
or queuing a request’s execution, and supporting undoable operations.

## Key Components

1. **Command:**
    - An interface or abstract class that declares the method for executing the command.
    - Encapsulates all details of an action or request.

2. **Concrete Command:**
    - Implements the Command interface.
    - Defines a binding between an action and a receiver.
    - Calls the method of the receiver whenever the command's execute method is called.

3. **Receiver:**
    - The object that performs the actual action when the command's execute method is called.
    - Has the knowledge of how to perform the operations associated with carrying out a request.

4. **Invoker:**
    - Asks the command to carry out the request.
    - Holds a command and at some point asks the command to execute a request.

5. **Client:**
    - Creates a Concrete Command object and sets its receiver.
    - Associates the command with the invoker.

## Advantages

- **Separation of Concerns:** Decouples classes that invoke operations from classes that perform these operations.
- **Extensibility:** New commands can be added without changing existing code.
- **Composite Commands:** You can compose several commands into one, creating macro commands.

## Use Cases

- Ideal for implementing features such as undo/redo functionality.
- Useful in scenarios where you need to issue requests, queue them, execute them at different times, or keep a history
  of requests.

## Considerations

- The pattern may increase the complexity of the code due to the additional classes.
- Careful design is needed to avoid an excessive number of concrete command classes for fine-grained commands.
