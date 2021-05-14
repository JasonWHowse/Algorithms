/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleRotationTest {

    @Test
    void test1() {
        int testCase1 = 6;
        int testCase2 = 4;
        int solution = 23;
        test(testCase1, testCase2, solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1 = 30;
        int testCase2 = 2;
        int solution = 65;
        test(testCase1, testCase2, solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1 = 8;
        int testCase2 = 6;
        int solution = 49;
        test(testCase1, testCase2, solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1 = 16;
        int testCase2 = 20;
        int solution = 333;
        test(testCase1, testCase2, solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1 = 20;
        int testCase2 = 32;
        int solution = 653;
        test(testCase1, testCase2, solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1 = 30;
        int testCase2 = 26;
        int solution = 795;
        test(testCase1, testCase2, solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase1 = 50;
        int testCase2 = 4;
        int solution = 177;
        test(testCase1, testCase2, solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase1 = 2;
        int testCase2 = 2;
        int solution = 5;
        test(testCase1, testCase2, solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase1 = 50;
        int testCase2 = 50;
        int solution = 2521;
        test(testCase1, testCase2, solution);
    }//void test9() {

    @Test
    void test10() {
        int testCase1 = 38;
        int testCase2 = 42;
        int solution = 1563;
        test(testCase1, testCase2, solution);
    }//void test10() {

    private void test(int testCase1,int testCase2,int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new RectangleRotation().rectangleRotation(testCase1,testCase2));
        assertEquals(solution, new RectangleRotation().rectangleRotation(testCase1,testCase2));
    }//private void test(){
}//class RectangleRotationTest {