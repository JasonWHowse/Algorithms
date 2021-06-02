/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class RangeBitCountTest {

    @Test
    public void test1() {
        var testCase1 = 2;
        var testCase2 = 7;
        var solution = 11;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 0;
        var testCase2 = 1;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 1;
        var testCase2 = 10;
        var solution = 17;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 8;
        var testCase2 = 9;
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 9;
        var testCase2 = 10;
        var solution = 4;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 5;
        var testCase2 = 5;
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 7;
        var testCase2 = 7;
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 6;
        var testCase2 = 7;
        var solution = 5;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 10;
        var testCase2 = 10;
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 6;
        var testCase2 = 9;
        var solution = 8;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new RangeBitCount().rangeBitCount(testCase1,testCase2));
        assertEquals(solution,new RangeBitCount().rangeBitCount(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class RangeBitCountTest {