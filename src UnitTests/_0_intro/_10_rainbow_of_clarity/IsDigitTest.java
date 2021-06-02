/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class IsDigitTest {

    @Test
    public void test1() {
        var testCase = '0';
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = '-';
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 'O';
        test(testCase, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = '1';
        test(testCase, true);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = '2';
        test(testCase, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = '!';
        test(testCase, false);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = '@';
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = '+';
        test(testCase, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = '6';
        test(testCase, true);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = '(';
        test(testCase, false);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = ')';
        test(testCase, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 'g';
        test(testCase, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = '8';
        test(testCase, true);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = '*';
        test(testCase, false);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = '3';
        test(testCase, true);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = '4';
        test(testCase, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = '5';
        test(testCase, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = '/';
        test(testCase, false);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = ':';
        test(testCase, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = '7';
        test(testCase, true);
    }//public void test20() {

    @Test
    public void test21() {
        var testCase = '9';
        test(testCase, true);
    }//public void test21() {
    
    private void test(char testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new IsDigit().isDigit(testCase));
        if(solution){
            assertTrue(new IsDigit().isDigit(testCase));
        }else {//if(solution){
            assertFalse(new IsDigit().isDigit(testCase));
        }//else{
    }//private void test(char testCase, boolean solution){
}//class IsDigitTest {