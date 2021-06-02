/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LineEncodingTest {

    @Test
    public void test1() {
        var testCase = "aabbbc";
        var solution = "2a3bc";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "abbcabb";
        var solution = "a2bca2b";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "abcd";
        var solution = "abcd";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "zzzz";
        var solution = "4z";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "wwwwwwwawwwwwww";
        var solution = "7wa7w";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "ccccccccccccccc";
        var solution = "15c";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "qwertyuioplkjhg";
        var solution = "qwertyuioplkjhg";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "ssiiggkooo";
        var solution = "2s2i2gk3o";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "adfaaa";
        var solution = "adf3a";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "bbjaadlkjdl";
        var solution = "2bj2adlkjdl";
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "aaaaa";
        var solution = "5a";
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "fifteenletters";
        var solution = "fift2enle2ters";
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "abaddddddddddaa";
        var solution = "aba10d2a";
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "qqqqqqqqqqpqqqq";
        var solution = "10qp4q";
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "fifteenletterrs";
        var solution = "fift2enle2te2rs";
        test(testCase, solution);
    }//public void test15() {
        
    @Test
    public void test16() {
        var testCase = "fourteen";
        var solution = "fourt2en";
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "thebesttest";
        var solution = "thebes2test";
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "sassasssasssa";
        var solution = "sa2sa3sa3sa";
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "aaaaabbaaaabhhh";
        var solution = "5a2b4ab3h";
        test(testCase, solution);
    }//public void test19() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()-> new LineEncoding().lineEncoding(testCase));
        assertEquals(solution,new LineEncoding().lineEncoding(testCase));
    }//private void test(String testCase, String solution){
}//class LineEncodingTest {