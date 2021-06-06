/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleRotationTest {

    @Test
    public void test1() {
        var testCase1 = 6;
        var testCase2 = 4;
        var solution = 23;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 30;
        var testCase2 = 2;
        var solution = 65;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 8;
        var testCase2 = 6;
        var solution = 49;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 16;
        var testCase2 = 20;
        var solution = 333;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 20;
        var testCase2 = 32;
        var solution = 653;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 30;
        var testCase2 = 26;
        var solution = 795;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 50;
        var testCase2 = 4;
        var solution = 177;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 2;
        var testCase2 = 2;
        var solution = 5;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 50;
        var testCase2 = 50;
        var solution = 2521;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 38;
        var testCase2 = 42;
        var solution = 1563;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 18;
        var testCase2 = 42;
        var solution = 737;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 2;
        var testCase2 = 46;
        var solution = 97;
        test(testCase1, testCase2, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 16;
        var testCase2 = 38;
        var solution = 609;
        test(testCase1, testCase2, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 40;
        var testCase2 = 18;
        var solution = 713;
        test(testCase1, testCase2, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 50;
        var testCase2 = 2;
        var solution = 107;
        test(testCase1, testCase2, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 2;
        var testCase2 = 4;
        var solution = 7;
        test(testCase1, testCase2, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 26;
        var testCase2 = 26;
        var solution = 685;
        test(testCase1, testCase2, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 48;
        var testCase2 = 8;
        var solution = 369;
        test(testCase1, testCase2, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 12;
        var testCase2 = 36;
        var solution = 433;
        test(testCase1, testCase2, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = 30;
        var testCase2 = 46;
        var solution = 1397;
        test(testCase1, testCase2, solution);
    }//public void test20() {

    private void test(int testCase1,int testCase2,int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new RectangleRotation().rectangleRotation(testCase1,testCase2));
        assertEquals(solution, new RectangleRotation().rectangleRotation(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution) {
}//class RectangleRotationTest {