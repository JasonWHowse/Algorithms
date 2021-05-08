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

class PagesNumberingWithInkTest {

    @Test
    void test1() {
        int testCase1 = 1;
        int testCase2 = 5;
        int solution = 5;
        test(testCase1, testCase2, solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1 = 21;
        int testCase2 = 5;
        int solution = 22;
        test(testCase1, testCase2, solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1 = 8;
        int testCase2 = 4;
        int solution = 10;
        test(testCase1, testCase2, solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1 = 21;
        int testCase2 = 6;
        int solution = 23;
        test(testCase1, testCase2, solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1 = 10;
        int testCase2 = 3;
        int solution = 10;
        test(testCase1, testCase2, solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1 = 76;
        int testCase2 = 250;
        int solution = 166;
        test(testCase1, testCase2, solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase1 = 80;
        int testCase2 = 1000;
        int solution = 419;
        test(testCase1, testCase2, solution);
    }//void test7() {

    private void test(int testCase1,int testCase2,int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new PagesNumberingWithInk().pagesNumberingWithInk(testCase1,testCase2));
        assertEquals(solution, new PagesNumberingWithInk().pagesNumberingWithInk(testCase1,testCase2));
    }//private void test(){
}//class PagesNumberingWithInkTest {