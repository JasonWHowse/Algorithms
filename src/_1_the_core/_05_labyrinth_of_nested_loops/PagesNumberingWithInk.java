/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

public class PagesNumberingWithInk {

    /*
You work in a company that prints and publishes books.
You are responsible for designing the page numbering
mechanism in the printer. You know how many digits a
printer can print with the leftover ink. Now you want
to write a function to determine what the last page of
the book is that you can number given the current page
and numberOfDigits left. A page is considered numbered
if it has the full number printed on it (e.g. if we are
working with page 102 but have ink only for two digits
then this page will not be considered numbered).

It's guaranteed that you can number the current page,
and that you can't number the last one in the book.
     */

    int pagesNumberingWithInk(int current, int numberOfDigits) {
        while(numberOfDigits>0){
            for(int multi=1;current/multi!=0;multi*=10) {
                numberOfDigits--;
            }//for(int multi=1;current/multi!=0;multi*=10) {
            current++;
        }//while(numberOfDigits>0){
        return (numberOfDigits<0)?current-2:--current;
    }//int pagesNumberingWithInk(int current, int numberOfDigits) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] integer current

A positive integer, the number on the current page which is not yet printed.

Guaranteed constraints:
1 ≤ current ≤ 1000.

[input] integer numberOfDigits

A positive integer, the number of digits which your printer can print.

Guaranteed constraints:
1 ≤ numberOfDigits ≤ 1000.

[output] integer

The last printed page number.


     */

}//public class PagesNumberingWithInk {
