# Memento Pattern

## Behavioral Design Pattern

The Memento Pattern is a behavioral design pattern that allows an object to save its state so that it can be restored to
this state at a later time. This pattern provides a way to restore an object to its previous state (undo via rollback)
without revealing the details of its implementation.

## Key Components

1. **Originator:**
    - The object whose state needs to be saved and restored.
    - Creates a memento containing a snapshot of its current internal state.
    - Uses the memento to restore its internal state.

2. **Memento:**
    - The object that stores the internal state of the Originator.
    - Protects against access by objects other than the originator.
    - May store any number of states but the originator's structure must not be exposed.

3. **Caretaker:**
    - Responsible for the memento's safekeeping.
    - Never operates on or examines the contents of a memento.
    - Keeps track of multiple mementos to implement history, undo or redo functionality.

## Advantages

- **Encapsulation:** Ensures that the internal state of the originator is not exposed outside.
- **Simplifies Originator:** By decoupling the caretaker from the originator, the originator's code is simplified since
  it does not need to manage versioning or the state restoration process.
- **Undo Mechanism:** Provides an easy mechanism for rollback to a previous state without implementing complex undo
  logic in the originator.

## Use Cases

- Ideal for implementing undo functionalities in applications such as editors.
- Useful in games for saving the current state to allow players to return to a previous point in the game.
- Applicable in any software that needs to provide snapshots of its state for restoration at a later time.

## Considerations

- Care must be taken to properly manage the lifecycle of mementos to avoid memory leaks.
- Implementing mementos in a highly changing object structure can be challenging as every change might necessitate a new
  memento structure.
