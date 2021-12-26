Write the UML class diagram and a JavaFX application for the following set of classes
• Write a class Point. It has an array of two double data members- the x and y
coordinates of a Point object. Define a full set of constructors (default, general
purpose and a copy constructor), set and get methods for the class data members,
as well as a toString() method.
• Next, write a class Rectangle. It has a Point uPoint with the coordinates of the
upper left corner of the rectangle and has double width and double height
datamembers. Define a full set of constructors (default, general purpose and a copy
constructor), set and get methods for the class data members, as well as a
toString() method (reuse the toString() method defined for class Point). Write
additionally a draw(Group pane) method allowing to draw this rectangle in the
Parent node of a JavaFX Scene, referenced by pane.
• Finally, write a class Line. It has two data members- the sPoint and ePoint
Points- the starting and the ending Point of the line. Define a full set of
constructors (default, general purpose and a copy constructor), set and get methods
for the class data members, as well as a toString() method (reuse the toString()
method defined for class Point). Write additionally a draw(Parent pane) method
allowing to draw this Line in the Parent node of a JavaFX Scene, referenced by
pane.
Generate a Jar artefact named geometry.jar with the above classes. Create a new JavaFX
application project to test the classes in geometry.jar. Use a Random number generator in this
JavaFX application project to instantiate in a couple of Point objects to serve as the vertexes of two
Rectangle objects. Next create Line objects to serve as the diagonals of the rectangles. Call the
respective draw(Parent pane) method of the objects of classes Rectangle and Line to draw
these objects in a Group parent node of the Scene.
