/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class SwapAdjacentBitsTest {

    @Test
    public void test1() {
        var testCase = 13;
        var solution = 14;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 74;
        var solution = 133;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 1073741823;
        var solution = 1073741823;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 0;
        var solution = 0;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 1;
        var solution = 2;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 83748;
        var solution = 166680;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 728782938;
        var solution = 397452453;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 594225528;
        var solution = 328668852;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 407127113;
        var solution = 612927622;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 103885767;
        var solution = 154277835;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 6977179;
        var solution = 9812327;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 221046318;
        var solution = 236771613;
        test(testCase, solution);
    }//public void test12() {

    private void test(int testCase,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new SwapAdjacentBits().swapAdjacentBits(testCase));
        assertEquals(solution,new SwapAdjacentBits().swapAdjacentBits(testCase));
    }//private void test(int testCase,int solution){
}//class SwapAdjacentBitsTest {