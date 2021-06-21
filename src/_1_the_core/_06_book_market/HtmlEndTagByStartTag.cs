namespace Algorithms.src._1_the_core._06_book_market {
    public class HtmlEndTagByStartTag {

        /*

You are implementing your own HTML editor. To make it more comfortable for developers you would like to add an auto-completion feature to it.

Given the starting HTML tag, find the appropriate end tag which your editor should propose.

If you are not familiar with HTML, consult with this note.

Example

For startTag = "<button type='button' disabled>", the output should be
htmlEndTagByStartTag(startTag) = "</button>";
For startTag = "<i>", the output should be
htmlEndTagByStartTag(startTag) = "</i>".
Input/Output

[execution time limit] 3 seconds (cs)

[input] string startTag

Guaranteed constraints:
3 ≤ startTag.length ≤ 75.

[output] string

        */

        public
        string htmlEndTagByStartTag(string startTag) {
            return "</"+startTag.Remove(startTag.IndexOf(" ")>0? startTag.IndexOf(" ") : startTag.IndexOf(">"))[1..]+">";
        }//string htmlEndTagByStartTag(string startTag) {
    }//public class HtmlEndTagByStartTag {
}//namespace Algorithms.src._1_the_core._06_book_market {
