/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._05_rains_of_reason;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class EvenDigitsOnlyTest {

    @Test
    void test1() {
        int testCase=248622;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertTrue(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test1() {

    @Test
    void test2() {
        int testCase=642386;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertFalse(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test2() {

    @Test
    void test3() {
        int testCase=248842;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertTrue(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test3() {

    @Test
    void test4() {
        int testCase=1;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertFalse(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test4() {

    @Test
    void test5() {
        int testCase=8;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertTrue(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test5() {

    @Test
    void test6() {
        int testCase=2462487;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertFalse(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test6() {

    @Test
    void test7() {
        int testCase=468402800;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertTrue(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test7() {

    @Test
    void test8() {
        int testCase=2468428;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertTrue(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test8() {

    @Test
    void test9() {
        int testCase=5468428;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertFalse(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test9() {

    @Test
    void test10() {
        int testCase=7468428;
        assertTimeout(Duration.ofSeconds(3),()->
                new EvenDigitsOnly().evenDigitsOnly(testCase));
        assertFalse(new EvenDigitsOnly().evenDigitsOnly(testCase));
    }//void test10() {
}//class EvenDigitsOnlyTest {