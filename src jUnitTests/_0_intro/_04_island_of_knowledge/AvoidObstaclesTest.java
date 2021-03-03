/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AvoidObstaclesTest {

    @Test
    void test1() {
        int[] testCase={5, 3, 6, 7, 9};
        int solution = 4;
        assertTimeout(Duration.ofSeconds(3),()->
                new AvoidObstacles().avoidObstacles(testCase.clone()));
        assertEquals(new AvoidObstacles().avoidObstacles(testCase.clone()),solution);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase={2, 3};
        int solution = 4;
        assertTimeout(Duration.ofSeconds(3),()->
                new AvoidObstacles().avoidObstacles(testCase.clone()));
        assertEquals(new AvoidObstacles().avoidObstacles(testCase.clone()),solution);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase={1, 4, 10, 6, 2};
        int solution = 7;
        assertTimeout(Duration.ofSeconds(3),()->
                new AvoidObstacles().avoidObstacles(testCase.clone()));
        assertEquals(new AvoidObstacles().avoidObstacles(testCase.clone()),solution);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase={1000, 999};
        int solution = 6;
        assertTimeout(Duration.ofSeconds(3),()->
                new AvoidObstacles().avoidObstacles(testCase.clone()));
        assertEquals(new AvoidObstacles().avoidObstacles(testCase.clone()),solution);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase={19, 32, 11, 23};
        int solution = 3;
        assertTimeout(Duration.ofSeconds(3),()->
                new AvoidObstacles().avoidObstacles(testCase.clone()));
        assertEquals(new AvoidObstacles().avoidObstacles(testCase.clone()),solution);
    }//void test5() {

    @Test
    void test6() {
        int[] testCase={5, 8, 9, 13, 14};
        int solution = 6;
        assertTimeout(Duration.ofSeconds(3),()->
                new AvoidObstacles().avoidObstacles(testCase.clone()));
        assertEquals(new AvoidObstacles().avoidObstacles(testCase.clone()),solution);
    }//void test6() {
}//class AvoidObstaclesTest {