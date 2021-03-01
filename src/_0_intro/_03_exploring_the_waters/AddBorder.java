/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

public class AddBorder {

/*
Given a rectangular matrix of characters, add a
border of asterisks(*) to it.
 */

    String[] addBorder(String[] picture) {
        String[] os = new String[picture.length+2];
        os[picture.length+1]=os[0]="*".repeat(picture[0].length()+2);
        for(int i=1;i<os.length-1;i++){
            os[i]="*"+picture[i-1]+"*";
        }//for(int i=1;i<os.length-1;i++){
        return os;
    }//String[] addBorder(String[] picture) {

/*
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 100,
1 ≤ picture[i].length ≤ 100.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.
 */

}//public class AddBorder {