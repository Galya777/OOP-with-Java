package task3;

public class BubbleSort implements Comparable {
    public void sortArray(Comparable[] arr){
        var itemMoved = false;
        do
        {
            itemMoved = false;
            for (int i = 0; i < arr.length - 1; i++)
            {
                if (arr[i].greater(arr[i + 1]))
                {
                    var lowerValue = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = lowerValue;
                    itemMoved = true;
                }
            }
        } while (itemMoved);
    }


    @Override
    public boolean greater(Comparable obj) {
        return false;
    }
}
    /*Consider the following inheritance hierarchy Shape-Point- Circle- Cylinder all of which implement
interface Comparable.
        A Point has two coordinates – x and y integer values
        A Circle is a Point and has a radius (integer value)
        A Cylinder is a Circle and has a height (integer value)
        1. Write the respective UML class diagram in NetBeans for the above inheritance
        hierarchy where interface Comparable is defined as follows:
interface Comparable
{
    bool greater(Comparable obj);
    // this function
// compares the this reference in the implementation class
// with the obj reference, according to the class definition
// of the meaning of the relation greater
// Use operator “instanceof “ to check for the obj reference
    type and
// make an explicit type conversion
}
2. Write a class BubbleSort with a static method
public void sortArray(Comparable[] arr)
        allowing you to sort in ascending order (using the bubble sort algorithm) an array of objects of any
        kind that implement interface Comparable.For instance, class BubbleSort should be able to
        sort arrays of Vehicles or Shapes that implement interface Comparable .
        Define the function greater() for Point- Circle- Cylinder objects as follows:
        a) a Point object P1 is greater than another Point
        object P2, if P1.mX > P2.mX and P1.mY > P2.mY, when P1.mX = P2.mX. (for instance
        point (1,2) is greater than point (1,1) ) Two points are equal when their coordinates
        are equal
        b) a Circle object C1 is greater than another Circle
        object C2, if the center point of C1 (which is a point object) is greater than the center
        point of C2 (which is also a point object) and C1.mRadius > C2.mRadius, when the
        center point of C1 is equal to the center point of C2. Two circles are equal when their
        center points and radiuses are equal
        c) a Cylinder object C1 is greater than another
        Cylinder object C2, if the circle of C1 (which is a Circle object) is greater than the circle
        of C2 (which is also a Circle object) and C1.mHeight > C2.mHeight, when the circle of C1
        is equal to the circle of C2 Two cyllinders are equal when their circles and heights
        are equal
        3. Write a class BubbleSortTest to test class BubbleSort where class
BubbleSortTest is a Console application. The application class must have a class
member- a reference to an array arrComparable of type Comparable with 3 elements.
        Employ arrComparable to sort in sequence with sortArray(Comparable[] arr):
        a) three Points (the coordinates should be random generated in the interval
        [10,50]) by assigning the Points to arrComparable.
        b) three Circles (the centers of the circles should be the three points, the
        radiuses of the circles should be random generated in the interval [10,30] ) by
        assigning the Circles to arrComparable.
        c) three Cylinders (the circles of the circles should be the above defined Circle
        objects, the heights of the cylinders should be random generated in the
        interval [10,60] ) by assigning the Cylinders to arrComparable.
        Display in a Dialog box (JOptionPane) the objects for each case ( a- c) in the respective
        array sorted by the sortArray(Comparable[] arr) method of class BubbleSort
in ascending order. You must use overriding of function toString() and late
        binding (polymorphism) to display each one object in the message box to get the whole
        number of marks allocated for this part of the problem.*/