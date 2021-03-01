/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._01_edge_of_the_ocean;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;


class AlmostIncreasingSequenceTest {
    @Test
    void test1() {
        int[] testCase=new int[]{1, 3, 2, 1};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test1() {

    @Test
    void test2() {
        int[] testCase=new int[]{1, 3, 2};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertTrue(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test2() {

    @Test
    void test3() {
        int[] testCase=new int[]{1, 2, 1, 2};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test3() {

    @Test
    void test4() {
        int[] testCase=new int[]{3, 6, 5, 8, 10, 20, 15};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test4() {

    @Test
    void test5() {
        int[] testCase=new int[]{1, 1, 2, 3, 4, 4};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test5() {

    @Test
    void test6() {
        int[] testCase=new int[]{1, 4, 10, 4, 2};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test6() {

    @Test
    void test7() {
        int[] testCase=new int[]{10, 1, 2, 3, 4, 5};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertTrue(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test7() {

    @Test
    void test8() {
        int[] testCase=new int[]{1, 1, 1, 2, 3};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test8() {

    @Test
    void test9() {
        int[] testCase=new int[]{0, -2, 5, 6};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertTrue(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test9() {

    @Test
    void test10() {
        int[] testCase=new int[]{1, 2, 3, 4, 5, 3, 5, 6};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test10() {

    @Test
    void test11() {
        int[] testCase=new int[]{40, 50, 60, 10, 20, 30};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test11() {

    @Test
    void test12() {
        int[] testCase=new int[]{1, 1};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertTrue(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test12() {

    @Test
    void test13() {
        int[] testCase=new int[]{1, 2, 5, 3, 5};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertTrue(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test13() {

    @Test
    void test14() {
        int[] testCase=new int[]{1, 2, 5, 5, 5};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test14() {

    @Test
    void test15() {
        int[] testCase=new int[]{10, 1, 2, 3, 4, 5, 6, 1};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertFalse(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test15() {

    @Test
    void test16() {
        int[] testCase=new int[]{1, 2, 3, 4, 3, 6};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertTrue(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test16() {

    @Test
    void test17() {
        int[] testCase=new int[]{1, 2, 3, 4, 99, 5, 6};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertTrue(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test17() {

    @Test
    void test18() {
        int[] testCase=new int[]{123, -17, -5, 1, 2, 3, 12, 43, 45};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertTrue(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test18() {

    @Test
    void test19() {
        int[] testCase=new int[]{3, 5, 67, 98, 3};
        assertTimeout(Duration.ofSeconds(3),()->
                new AlmostIncreasingSequence().almostIncreasingSequence(
                testCase.clone()));
        assertTrue(new AlmostIncreasingSequence().
                almostIncreasingSequence(testCase.clone()));
    }//void test19() {
}//class AlmostIncreasingSequenceTest {