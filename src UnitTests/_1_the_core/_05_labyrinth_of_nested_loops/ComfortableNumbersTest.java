/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComfortableNumbersTest {

    @Test
    public void test1() {
        var testCase1 = 10;
        var testCase2 = 12;
        var solution = 2;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 1;
        var testCase2 = 9;
        var solution = 20;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 13;
        var testCase2 = 13;
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 12;
        var testCase2 = 108;
        var solution = 707;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 239;
        var testCase2 = 777;
        var solution = 6166;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 1;
        var testCase2 = 1000;
        var solution = 11435;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 123;
        var testCase2 = 1000;
        var solution = 10605;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 13;
        var testCase2 = 76;
        var solution = 428;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 23;
        var testCase2 = 200;
        var solution = 1437;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 100;
        var testCase2 = 400;
        var solution = 2698;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 101;
        var testCase2 = 101;
        var solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 901;
        var testCase2 = 910;
        var solution = 45;
        test(testCase1, testCase2, solution);
    }//public void test12() {

    private void test(int testCase1, int testCase2, int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new ComfortableNumbers().comfortableNumbers(testCase1,testCase2));
        assertEquals(solution, new ComfortableNumbers().comfortableNumbers(testCase1,testCase2));
    }//private void test(int testCase1, int testCase2, int solution) {
}//class ComfortableNumbersTest {