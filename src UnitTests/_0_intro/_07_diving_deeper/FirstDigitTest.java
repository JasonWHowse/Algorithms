/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_diving_deeper;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class FirstDigitTest {

    @Test
    public void test1() {
        var testCase = "var_1__Int";
        var solution = '1';
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "q2q-q";
        var solution = '2';
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "0ss";
        var solution = '0';
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "_Aas_23";
        var solution = '2';
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "a a_933";
        var solution = '9';
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "ok0";
        var solution = '0';
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "-15";
        var solution = '1';
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "a b c 4 e ";
        var solution = '4';
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "abcd efg8";
        var solution = '8';
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "ab cd 00";
        var solution = '0';
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "d91e073";
        var solution = '9';
        test(testCase, solution);
    }//public void test11() {

    private void test(String testCase, char solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new FirstDigit().firstDigit(testCase));
        assertEquals(solution,new FirstDigit().firstDigit(testCase));
    }//private void test(String testCase, char solution){
}//class FirstDigitTest {