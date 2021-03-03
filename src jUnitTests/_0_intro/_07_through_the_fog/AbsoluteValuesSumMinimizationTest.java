/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._07_through_the_fog;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValuesSumMinimizationTest {

    @Test
    void test1() {
        int[] testCase={2, 4, 7};
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test1() {

    @Test
    void test2() {
        int[] testCase={2, 3};
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test2() {

    @Test
    void test3() {
        int[] testCase={1, 1, 3, 4};
        int solution=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test3() {

    @Test
    void test4() {
        int[] testCase={23};
        int solution=23;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test4() {

    @Test
    void test5() {
        int[] testCase={-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        int solution=15;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test5() {

    @Test
    void test6() {
        int[] testCase={-4, -1};
        int solution=-4;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test6() {

    @Test
    void test7() {
        int[] testCase={0, 7, 9};
        int solution=7;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test7() {

    @Test
    void test8() {
        int[] testCase={-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000};
        int solution=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test8() {

    @Test
    void test9() {
        int[] testCase={-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150};
        int solution=65;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test9() {

    @Test
    void test10() {
        int[] testCase={-10,100,200,300,400,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500};
        int solution=500;
        assertTimeout(Duration.ofSeconds(3),()->
                new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
        assertEquals(solution, new AbsoluteValuesSumMinimization().absoluteValuesSumMinimization(testCase.clone()));
    }//void test10() {
}//class AbsoluteValuesSumMinimizationTest {