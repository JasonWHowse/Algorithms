/*
 * Authored by: Jason Wesley Howse
 */

package intro.the_journey_begins;

public class CenturyFromYear {
    /*
    Given a year, return the century it is in.
    The first century spans from the year 1 up
    to and including the year 100, the second -
    from the year 101 up to and including the
    year 200, etc.
    */

    public int centuryFromYear(int year) {
        return (year-1)/100+1;
    }//public int centuryFromYear(int year) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer year

A positive integer, designating the year.

Guaranteed constraints:
1 ≤ year ≤ 2005.

[output] integer

The number of the century the year is in.
*/

}//public class CenturyFromYear {
