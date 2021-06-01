/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LongestDigitsPrefixTest {

    @Test
    public void test1() {
        var testCase = "123aa1";
        var solution = "123";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "0123456789";
        var solution = "0123456789";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "  3) always check for whitespaces";
        var solution = "";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "12abc34";
        var solution = "12";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "the output is 42";
        var solution = "";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "aaaaaaa";
        var solution = "";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "090a2";
        var solution = "090";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = " 123";
        var solution = "";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "233";
        var solution = "233";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "1j2c42ciu5ie99xr0vq5w1slwhq985fp2239qc196d66m";
        var solution = "1";
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "812jo3qwj22i306273kz2iq6v6m4w68w66v8s77n727gj2o7s4364g78k6kgrk7wt291820m1";
        var solution = "812";
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "49325fx6t3g3t1j440903383567a522vt17a45yy31i9dve53mw8346il4uedqfj731rg3y3mjtug0nl0h4a0e64mak4gb1x83nr";
        var solution = "49325";
        test(testCase, solution);
    }//public void test12() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()-> new LongestDigitsPrefix().longestDigitsPrefix(testCase));
        assertEquals(solution,new LongestDigitsPrefix().longestDigitsPrefix(testCase));
    }//private void test(String testCase, String solution){
}//class LongestDigitsPrefixTest {