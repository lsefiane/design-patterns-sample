# Structural Design Patterns

## Adapter Pattern

- Makes existing classes work with others without modifying their source code.

<h3> When to Use It ? </h3>

- You can't change the source code.
- You might not have access.
- You are reusing legacy code.
- You want to use an existing class, and it doesn't fit into your hierarchy.

## Bridge Pattern

- Decouple an abstraction from its implementation so that the two can vary independently.

<h3> When to Use It ? </h3>

- You want to share an implementation among multiple objects.
- You need to map orthogonal class hierarchies.
- You need to simplify inheritance structures, making them more flexible and adaptable. 

## Composite Pattern

- Describes a group of objects that are treated the same way as a single instance of the same type of object.

<h3> When to Use It ? </h3>

- You want to treat single objects and groups of objects the same.   
- You have code that is very similar/identical to handle different types of objects.

## Decorator Pattern

- Allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.

<h3> When to Use It ? </h3>

- You want to add additional responsibilities to an object dynamically.
- You want more flexibility than subclassing