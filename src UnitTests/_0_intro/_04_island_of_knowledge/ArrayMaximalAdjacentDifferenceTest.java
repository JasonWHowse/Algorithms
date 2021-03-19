/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ArrayMaximalAdjacentDifferenceTest {

    @Test
    void test1() {
        int [] testCase = {2, 4, 1, 0};
        int solution = 3;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()));
        assertEquals(new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()),solution);
    }//void test1() {

    @Test
    void test2() {
        int [] testCase = {1, 1, 1, 1};
        int solution = 0;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()));
        assertEquals(new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()),solution);
    }//void test2() {

    @Test
    void test3() {
        int [] testCase = {-1, 4, 10, 3, -2};
        int solution = 7;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()));
        assertEquals(new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()),solution);
    }//void test3() {

    @Test
    void test4() {
        int [] testCase = {10, 11, 13};
        int solution = 2
                ;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()));
        assertEquals(new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()),solution);
    }//void test4() {

    @Test
    void test5() {
        int [] testCase = {-2, -2, -2, -2, -2};
        int solution = 0;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()));
        assertEquals(new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()),solution);
    }//void test5() {

    @Test
    void test6() {
        int [] testCase = {-1, 1, -3, -4};
        int solution = 4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()));
        assertEquals(new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()),solution);
    }//void test6() {

    @Test
    void test7() {
        int [] testCase = {-14, 15, -15};
        int solution = 30;
        assertTimeout(Duration.ofSeconds(3),()->
                new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()));
        assertEquals(new ArrayMaximalAdjacentDifference().arrayMaximalAdjacentDifference(testCase.clone()),solution);
    }//void test7() {
}