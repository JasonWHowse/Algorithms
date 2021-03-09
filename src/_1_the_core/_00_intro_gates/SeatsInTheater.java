/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

public class SeatsInTheater {

    /*
Your friend advised you to see a new performance in the most
popular theater in the city. He knows a lot about art and
his advice is usually good, but not this time: the
performance turned out to be awfully dull. It's so bad you
want to sneak out, which is quite simple, especially since
the exit is located right behind your row to the left. All
you need to do is climb over your seat and make your way to
the exit.

The main problem is your shyness: you're afraid that you'll
end up blocking the view (even if only for a couple of
seconds) of all the people who sit behind you and in your
column or the columns to your left. To gain some courage,
you decide to calculate the number of such people and see
if you can possibly make it to the exit without disturbing
too many people.

Given the total number of rows and columns in the theater
(nRows and nCols, respectively), and the row and column
you're sitting in, return the number of people who sit
strictly behind you and in your column or to the left,
assuming all seats are occupied.
     */

    int seatsInTheater(int nCols, int nRows, int col, int row) {
        return (nCols+1-col)*(nRows-row);
    }//int seatsInTheater(int nCols, int nRows, int col, int row) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer nCols

An integer, the number of theater's columns.

Guaranteed constraints:
1 ≤ nCols ≤ 1000.

[input] integer nRows

An integer, the number of theater's rows.

Guaranteed constraints:
1 ≤ nRows ≤ 1000.

[input] integer col

An integer, the column number of your own seat (1-based).

Guaranteed constraints:
1 ≤ col ≤ nCols.

[input] integer row

An integer, the row number of your own seat (1-based).

Guaranteed constraints:
1 ≤ row ≤ nRows.

[output] integer

The number of people who sit strictly behind you and in your column or to the left.
     */

}//public class SeatsInTheater {
