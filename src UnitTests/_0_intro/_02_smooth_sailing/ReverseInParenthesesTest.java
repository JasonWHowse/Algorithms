/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ReverseInParenthesesTest {

    @Test
    public void test1() {
        var testCase = "(bar)";
        var solution = "rab";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "foo(bar)baz";
        var solution = "foorabbaz";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "foo(bar)baz(blim)";
        var solution = "foorabbazmilb";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "foo(bar(baz))blim";
        var solution = "foobazrabblim";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "";
        var solution = "";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "()";
        var solution = "";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "(abc)d(efg)";
        var solution = "cbadgfe";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "foobarbaz";
        var solution = "foobarbaz";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "(())(((())))";
        var solution = "";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "((bar))";
        var solution = "bar";
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "wi(ez)(((il)))(en)";
        var solution = "wizeline";
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "foo()bar";
        var solution = "foobar";
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "abc((ghi((mno((stu((xyz)wv))rqp))lkj))fed)";
        var solution = "abcdefghijklmnopqrstuvwxyz";
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "abc((ghi((mno((stu((xyz)wv))rqp))lkj))fed)((abcd))";
        var solution = "abcdefghijklmnopqrstuvwxyzabcd";
        test(testCase, solution);
    }//public void test14() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()->new ReverseInParentheses().reverseInParentheses(testCase));
        assertEquals(solution,new ReverseInParentheses().reverseInParentheses(testCase));
    }//private void test(String testCase, String solution){
}//class ReverseInParenthesesTest {