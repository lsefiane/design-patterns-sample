# Behavioral Design Patterns

## Chain of Responsibility Pattern

-  Creates a chain of receiver objects for a request. Decouples sender and receiver of a request based on type of request.

<h3> When to Use It ? </h3>

- When you want to decouple a request's sender and receiver.
- Multiple objects, determined at runtime, are candidates to handle a request.
- When you don't want to specify handlers explicitly in your code.