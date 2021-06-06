/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagesNumberingWithInkTest {

    @Test
    public void test1() {
        var testCase1 = 1;
        var testCase2 = 5;
        var solution = 5;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 21;
        var testCase2 = 5;
        var solution = 22;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 8;
        var testCase2 = 4;
        var solution = 10;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 21;
        var testCase2 = 6;
        var solution = 23;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 10;
        var testCase2 = 3;
        var solution = 10;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 76;
        var testCase2 = 250;
        var solution = 166;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 80;
        var testCase2 = 1000;
        var solution = 419;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 9;
        var testCase2 = 4;
        var solution = 10;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 100;
        var testCase2 = 3;
        var solution = 100;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 325;
        var testCase2 = 4;
        var solution = 325;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 761;
        var testCase2 = 5;
        var solution = 761;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 543;
        var testCase2 = 6;
        var solution = 544;
        test(testCase1, testCase2, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 987;
        var testCase2 = 543;
        var solution = 1125;
        test(testCase1, testCase2, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 987;
        var testCase2 = 544;
        var solution = 1125;
        test(testCase1, testCase2, solution);
    }//public void test14() {

    private void test(int testCase1,int testCase2,int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new PagesNumberingWithInk().pagesNumberingWithInk(testCase1,testCase2));
        assertEquals(solution, new PagesNumberingWithInk().pagesNumberingWithInk(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution) {
}//class PagesNumberingWithInkTest {