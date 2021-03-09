/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReachNextLevelTest {

    @Test
    void test1() {
        int testCase1=10;
        int testCase2=15;
        int testCase3=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertTrue(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=10;
        int testCase2=15;
        int testCase3=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertFalse(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=3;
        int testCase2=6;
        int testCase3=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertTrue(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=84;
        int testCase2=135;
        int testCase3=36;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertFalse(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=74;
        int testCase2=170;
        int testCase3=58;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertFalse(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=80;
        int testCase2=199;
        int testCase3=15;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertFalse(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test6() {

    @Test
    void test7() {
        int testCase1=97;
        int testCase2=57;
        int testCase3=7;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertTrue(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test7() {

    @Test
    void test8() {
        int testCase1=235;
        int testCase2=293;
        int testCase3=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertFalse(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test8() {

    @Test
    void test9() {
        int testCase1=222;
        int testCase2=137;
        int testCase3=58;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertTrue(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test9() {

    @Test
    void test10() {
        int testCase1=16;
        int testCase2=23;
        int testCase3=16;
        assertTimeout(Duration.ofSeconds(3),()->
                new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        assertTrue(new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
    }//void test10() {
}//class ReachNextLevelTest {