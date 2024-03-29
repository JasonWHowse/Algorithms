namespace Algorithms.src._0_intro._01_edge_of_the_ocean {
    public class ShapeArea {

        /*

Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.

               x
        x     xxx
   x   xxx   xxxxx
x xxx xxxxx xxxxxxx
   x   xxx   xxxxx
        x     xxx
               x


Example

For n = 2, the output should be
shapeArea(n) = 5;
For n = 3, the output should be
shapeArea(n) = 13.
Input/Output

[execution time limit] 3 seconds (cs)

[input] integer n

Guaranteed constraints:
1 ≤ n < 104.

[output] integer

The area of the n-interesting polygon.

        */

        public
        int shapeArea(int n) {
            return n * n + (n - 1) * (n - 1);
        }//int shapeArea(int n) {
    }//public class ShapeArea {
}//namespace Algorithms.src._0_intro._01_edge_of_the_ocean {