Write a UML class diagram in IntelliJ for the following set of classes
• Write a class Point. It has an array of two integer data members- the x and y coordinates. Define a
full set of constructors (default, general purpose and a copy constructor), set and get methods
for the class data members, a set method with a Point argument and a get method returning a
Point object, as well as a toString() method.
• Next, write a class Line. A Line is a Point sPoint and has a data member Point ePoint
denoting respectively the starting and the ending Point of the line. Define a full set of
constructors (default, general purpose and a copy constructor), set and get methods for the class
data members, as well as a toString() method (reuse the toString() method defined for class Point).
Write additionally a measure() method returning the length of the Line.
• Finally, write a class Rectangle. Rectangle is a Point, which defines the upper left corner and
has a Point that defines the lower right corner of the rectangle. Define a full set of
constructors (default, general purpose and a copy constructor), set and get methods for the class
data members, as well as a toString() method (reuse the toString() method defined for class
Point). Write additionally a measure() method returning the perimeter of the Rectangle.
2. Generate a Jar artefact named geometry.jar with the above classes. Create a Java
Console application project to test the classes in geometry.jar. Test these three classes by
instantiating a couple of Point, Rectangle and Line objects in and calling the respective measure () for
objects of classes Rectangle and Line..
