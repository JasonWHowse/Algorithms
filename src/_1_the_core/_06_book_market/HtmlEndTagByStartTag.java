/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

import java.util.regex.Pattern;

public class HtmlEndTagByStartTag {

    /*
You are implementing your own HTML editor. To make it more comfortable for developers you would like to add an auto-completion feature to it.

Given the starting HTML tag, find the appropriate end tag which your editor should propose.

If you are not familiar with HTML, consult with this note.
     */

    String htmlEndTagByStartTag(String startTag) {
        return "</"+startTag.substring(1).split(">")[0].split(" ")[0]+">";
    }//String htmlEndTagByStartTag(String startTag) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] string startTag

Guaranteed constraints:
3 ≤ startTag.length ≤ 75.

[output] string
     */

}//public class HtmlEndTagByStartTag {
