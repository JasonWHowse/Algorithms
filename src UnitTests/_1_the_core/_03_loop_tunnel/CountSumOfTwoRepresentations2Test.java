/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class CountSumOfTwoRepresentations2Test {

    @Test
    public void test1() {
        var testCase1 = 6;
        var testCase2 = 2;
        var testCase3 = 4;
        var solution = 2;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test2() {

    @Test
    public void test2() {
        var testCase1 = 6;
        var testCase2 = 3;
        var testCase3 = 3;
        var solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test3() {

    @Test
    public void test3() {
        var testCase1 = 10;
        var testCase2 = 9;
        var testCase3 = 11;
        var solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test4() {

    @Test
    public void test4() {
        var testCase1 = 24;
        var testCase2 = 8;
        var testCase3 = 16;
        var solution = 5;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test1() {

    @Test
    public void test5() {
        var testCase1 = 24;
        var testCase2 = 12;
        var testCase3 = 12;
        var solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 93;
        var testCase2 = 24;
        var testCase3 = 58;
        var solution = 12;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 1000000;
        var testCase2 = 490000;
        var testCase3 = 900000;
        var solution = 10001;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 1000;
        var testCase2 = 1;
        var testCase3 = 1000;
        var solution = 500;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 1000000000;
        var testCase2 = 999999000;
        var testCase3 = 1000000000;
        var solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 10000;
        var testCase2 = 8;
        var testCase3 = 9991;
        var solution = 4992;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 2400;
        var testCase2 = 12;
        var testCase3 = 1000000;
        var solution = 1189;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 88;
        var testCase2 = 27;
        var testCase3 = 58;
        var solution = 15;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test12() {

    private void test(int testCase1,int testCase2,int testCase3,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new CountSumOfTwoRepresentations2().countSumOfTwoRepresentations2(testCase1,testCase2,testCase3));
        assertEquals(solution,new CountSumOfTwoRepresentations2().countSumOfTwoRepresentations2(testCase1,testCase2,testCase3));
    }//private void test(int testCase1,int testCase2,int testCase3,int solution){
}//class CountSumOfTwoRepresentations2Test {