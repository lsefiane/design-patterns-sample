# Behavioral Design Patterns

## Chain of Responsibility Pattern

-  Creates a chain of receiver objects for a request. Decouples sender and receiver of a request based on type of request.

<h3> When to Use It ? </h3>

- When you want to decouple a request sender and receiver.
- Multiple objects, determined at runtime, are candidates to handle a request.
- When you don't want to specify handlers explicitly in your code.


## Command Pattern

- Encapsulates commands (method calls) in objects allowing to issue requests without knowing the requested operation or the requesting object.

<h3> When to Use It ? </h3>

- You want to support undo/redo operations.
- You want queueing or logging requests to be performed at different times.