/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class CircleOfNumbersTest {

    @Test
    public void test1() {
        var testCase1 = 10;
        var testCase2 = 2;
        var solution = 7;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 10;
        var testCase2 = 7;
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 4;
        var testCase2 = 1;
        var solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 6;
        var testCase2 = 3;
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 18;
        var testCase2 = 6;
        var solution = 15;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 12;
        var testCase2 = 10;
        var solution = 4;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 18;
        var testCase2 = 5;
        var solution = 14;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 18;
        var testCase2 = 13;
        var solution = 4;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 18;
        var testCase2 = 0;
        var solution = 9;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 20;
        var testCase2 = 11;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 18;
        var testCase2 = 9;
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 4;
        var testCase2 = 3;
        var solution = 1;
        test(testCase1, testCase2, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 14;
        var testCase2 = 7;
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 12;
        var testCase2 = 3;
        var solution = 9;
        test(testCase1, testCase2, solution);
    }//public void test14() {

    private void test(int testCase1, int testCase2, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
        assertEquals(solution,new CircleOfNumbers().circleOfNumbers(testCase1,testCase2));
    }//private void testTest(int testCase1, int testCase2, int solution){
}//class CircleOfNumbersTest {