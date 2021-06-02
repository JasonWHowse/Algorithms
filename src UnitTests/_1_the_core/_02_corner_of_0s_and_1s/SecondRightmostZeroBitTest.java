/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class SecondRightmostZeroBitTest {

    @Test
    public void test1() {
        var testCase = 37;
        var solution = 8;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 1073741824;
        var solution = 2;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 83748;
        var solution = 2;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 4;
        var solution = 2;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 728782938;
        var solution = 4;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 594225528;
        var solution = 2;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 407127113;
        var solution = 4;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 103885767;
        var solution = 16;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 6977179;
        var solution = 32;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 221046318;
        var solution = 16;
        test(testCase, solution);
    }//public void test10() {

    private void test(int testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new SecondRightmostZeroBit().secondRightmostZeroBit(testCase));
        assertEquals(solution,new SecondRightmostZeroBit().secondRightmostZeroBit(testCase));
    }//private void test(int testCase, int solution){
}//class SecondRightmostZeroBitTest {