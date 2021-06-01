/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._06_through_the_fog;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class DepositProfitTest {

    @Test
    public void test1() {
        var testCase1 = 100;
        var testCase2 = 20;
        var testCase3 = 170;
        var solution = 3;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 100;
        var testCase2 = 1;
        var testCase3 = 101;
        var solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 1;
        var testCase2 = 100;
        var testCase3 = 64;
        var solution = 6;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 20;
        var testCase2 = 20;
        var testCase3 = 50;
        var solution = 6;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 50;
        var testCase2 = 25;
        var testCase3 = 100;
        var solution = 4;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 70;
        var testCase2 = 10;
        var testCase3 = 77;
        var solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 1;
        var testCase2 = 1;
        var testCase3 = 200;
        var solution = 533;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test6() {

    @Test
    public void test8() {
        var testCase1 = 1;
        var testCase2 = 1;
        var testCase3 = 100;
        var solution = 463;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 60;
        var testCase2 = 5;
        var testCase3 = 80;
        var solution = 6;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 1;
        var testCase2 = 100;
        var testCase3 = 128;
        var solution = 7;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test10() {

    private void test(int testCase1, int testCase2, int testCase3, int solution) {
        assertTimeout(Duration.ofSeconds(3),()-> new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
        assertEquals(solution,new DepositProfit().depositProfit(testCase1,testCase2,testCase3));
    }//test(int testCase1, int testCase2, int testCase3, int solution){
}//class DepositProfitTest {