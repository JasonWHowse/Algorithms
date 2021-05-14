/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

public class RectangleRotation {

    /*
A rectangle with sides equal to even integers a and b
is drawn on the Cartesian plane. Its center (the
intersection point of its diagonals) coincides with
the point (0, 0), but the sides of the rectangle are
not parallel to the axes; instead, they are forming 45
degree angles with the axes.

How many points with integer coordinates are located
inside the given rectangle (including on its sides)?
     */

    int rectangleRotation(int a, int b) {
        double Sqrt2 = Math.sqrt(2);
        int output = (int)(a / Sqrt2) * (int)(b / Sqrt2) + ((int)(a / Sqrt2) + 1) * ((int)(b / Sqrt2) + 1);
        return output % 2 == 0 ? output - 1 : output;
    }//int rectangleRotation(int a, int b) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer a

A positive even integer.

Guaranteed constraints:
2 ≤ a ≤ 50.

[input] integer b

A positive even integer.

Guaranteed constraints:
2 ≤ b ≤ 50.

[output] integer

The number of inner points with integer coordinates.
     */

}//public class RectangleRotation {
