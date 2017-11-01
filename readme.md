# Design Patterns

### Visitor pattern
* The operation that gets performed on each element of an object structure is always delegated to the Visitor object.

### State pattern 
* An object delegates the request to a State object that represents its current state.

### Strategy pattern:
* An object delegates a specific request to an object tha represents a strategy for carrying out the request.

### Mediator pattern:
* Introduces an object to mediate communication between other objects.

## *Notes*
Composing behavior in object-oriented system can be achieved by:
* class inheritance: allows providing default implementations for operations and lets subclasses override them
* object composition: change the behaviour composed at run-time 
* parameterized types (generics or templates): change the types that a class can use


Suggestions based on what you are building:
* if you are building an application program such as a document editor or spreadsheet, the *internal* reuse, *maintainability*
and *extension* come as high priorities.

## *General information*
Toolkit vs Framework:
* **Toolkit**: A set of related and reusable classes designed to provide useful, general-purpose functionality.
Ex.: A set of collection for lists, stacks or other data structures. They do not impose a particular design on
your application, just provide functionality that can help your app do its job.

* **Framework**: A set of cooperating classes that make up a reusable design for a specific class of software.
Eg.: Building financial modeling applications or  music composition or mechanical CAD.
The framework dictates the architecture of your application by defining the overall structure, its partitioning 
into classes and objects, the key responsibilities thereof, how classes and objects collaborate, and the 
thread of control. Frameworks emphasize **design reuse** over code reuse.
    * Frameworks often pose a steep learning curve that must be overcome before they're useful.  