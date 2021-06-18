/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncloseInBracketsTest {

    @Test
    public void test1() {
        var testCase = "abacaba";
        var solution = "(abacaba)";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "abcdef";
        var solution = "(abcdef)";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "aaad";
        var solution = "(aaad)";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "if";
        var solution = "(if)";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "it";
        var solution = "(it)";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "doesnt";
        var solution = "(doesnt)";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "challenge";
        var solution = "(challenge)";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "you";
        var solution = "(you)";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "itt";
        var solution = "(itt)";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "wont";
        var solution = "(wont)";
        test(testCase, solution);
    }//public void test10() {
    
    private void test(String testCase, String solution){
            assertTimeout(Duration.ofSeconds(3),()-> new EncloseInBrackets().encloseInBrackets(testCase));
            assertEquals(solution,new EncloseInBrackets().encloseInBrackets(testCase));
    }//private void test(String testCase, String solution){
}//class EncloseInBracketsTest {