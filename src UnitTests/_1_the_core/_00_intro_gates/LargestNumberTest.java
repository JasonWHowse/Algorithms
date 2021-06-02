/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LargestNumberTest {

    @Test
    public void test1() {
        var testCase = 2;
        var solution = 99;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 1;
        var solution = 9;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 7;
        var solution = 9999999;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 4;
        var solution = 9999;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 3;
        var solution = 999;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 5;
        var solution = 99999;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 6;
        var solution = 999999;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 8;
        var solution = 99999999;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 9;
        var solution = 999999999;
        test(testCase, solution);
    }//public void test9() {

    private void test(int testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new LargestNumber().largestNumber(testCase));
        assertEquals(solution,new LargestNumber().largestNumber(testCase));
    }//private void test(int testCase, int solution){
}//class LargestNumberTest {