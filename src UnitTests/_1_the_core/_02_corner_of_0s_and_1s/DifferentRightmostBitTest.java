/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class DifferentRightmostBitTest {

    @Test
    public void test1() {
        var testCase1 = 11;
        var testCase2 = 13;
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 7;
        var testCase2 = 23;
        var solution = 16;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 1;
        var testCase2 = 0;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 64;
        var testCase2 = 65;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 1073741823;
        var testCase2 = 1071513599;
        var solution = 131072;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 42;
        var testCase2 = 22;
        var solution = 4;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 0;
        var testCase2 = 1;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 16072704;
        var testCase2 = 11173888;
        var solution = 16384;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 33554431;
        var testCase2 = 67108863;
        var solution = 33554432;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 32;
        var testCase2 = 1073741824;
        var solution = 32;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 1023;
        var testCase2 = 3071;
        var solution = 2048;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 1073741824;
        var testCase2 = 32;
        var solution = 32;
        test(testCase1, testCase2, solution);
    }//public void test12() {

    private void test(int testCase1, int testCase2, int solution) {
        assertTimeout(Duration.ofSeconds(3),()-> new DifferentRightmostBit().differentRightmostBit(testCase1,testCase2));
        assertEquals(solution,new DifferentRightmostBit().differentRightmostBit(testCase1,testCase2));
    }//private void test(int testCase1, int testCase2, int solution) {
}//class DifferentRightmostBitTest {