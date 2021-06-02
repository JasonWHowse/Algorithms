/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class EqualPairOfBitsTest {

    @Test
    public void test1() {
        var testCase1 = 10;
        var testCase2 = 11;
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 0;
        var testCase2 = 0;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 28;
        var testCase2 = 27;
        var solution = 8;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 895;
        var testCase2 = 928;
        var solution = 32;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 1073741824;
        var testCase2 = 1006895103;
        var solution = 262144;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 1;
        var testCase2 = 1;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 524288;
        var testCase2 = 1048575;
        var solution = 524288;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 32767;
        var testCase2 = 32767;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 9936640;
        var testCase2 = 16777215;
        var solution = 256;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 536870911;
        var testCase2 = 1073741824;
        var solution = 536870912;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    private void test(int testCase1,int testCase2,int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new EqualPairOfBits().equalPairOfBits(testCase1, testCase2));
        assertEquals(solution, new EqualPairOfBits().equalPairOfBits(testCase1, testCase2));
    }//private void test(int testCase1,int testCase2,int solution) {
}//class EqualPairOfBitsTest {