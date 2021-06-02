/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LongestWordTest {

    @Test
    public void test1() {
        var testCase = "Ready, steady, go";
        var solution = "steady";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "Ready[[[, steady, go!";
        var solution = "steady";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "ABCd";
        var solution = "ABCd";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "To be or not to be";
        var solution = "not";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "You are the best!!!!!!!!!!!! CodeFighter ever!";
        var solution = "CodeFighter";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "A!! AA[]z";
        var solution = "AA";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = " ss ";
        var solution = "ss";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX";
        var solution = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWX";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "aa bbb ccc dddd eeeee";
        var solution = "eeeee";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "ab-CDE-fg_hi";
        var solution = "CDE";
        test(testCase, solution);
    }//public void test10() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()-> new LongestWord().longestWord(testCase));
        assertEquals(new LongestWord().longestWord(testCase),solution);
    }//private void test(String testCase, String solution){
}//class LongestWordTest {