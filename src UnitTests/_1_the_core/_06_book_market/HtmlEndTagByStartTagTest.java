/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HtmlEndTagByStartTagTest {

    @Test
    public void test1() {
        var testCase = "<button type='button' disabled>";
        var solution = "</button>";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "<i>";
        var solution = "</i>";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "<div id='my_area' class='data' title='This is a test for title on Div tag'>";
        var solution = "</div>";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "<html>";
        var solution = "</html>";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "<TABLE border='1'>";
        var solution = "</TABLE>";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "<li class='test'>";
        var solution = "</li>";
        test(testCase, solution);
    }//public void test6() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()-> new HtmlEndTagByStartTag().htmlEndTagByStartTag(testCase));
        assertEquals(solution,new HtmlEndTagByStartTag().htmlEndTagByStartTag(testCase));
    }//private void test(String testCase, String solution){
}//class HtmlEndTagByStartTagTest {