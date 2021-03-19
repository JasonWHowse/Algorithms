/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class TennisSetTest {

    @Test
    void test1() {
        int testCase1=3;
        int testCase2=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertTrue(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test1() {

    @Test
    void test2() {
        int testCase1=8;
        int testCase2=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertFalse(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test2() {

    @Test
    void test3() {
        int testCase1=6;
        int testCase2=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertFalse(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test3() {

    @Test
    void test4() {
        int testCase1=7;
        int testCase2=7;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertFalse(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test4() {

    @Test
    void test5() {
        int testCase1=6;
        int testCase2=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertTrue(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test5() {

    @Test
    void test6() {
        int testCase1=7;
        int testCase2=5;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertTrue(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test6() {

    @Test
    void test7() {
        int testCase1=7;
        int testCase2=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertFalse(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test7() {

    @Test
    void test8() {
        int testCase1=7;
        int testCase2=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertTrue(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test8() {

    @Test
    void test9() {
        int testCase1=4;
        int testCase2=10;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertFalse(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test9() {

    @Test
    void test10() {
        int testCase1=0;
        int testCase2=0;
        assertTimeout(Duration.ofSeconds(3),()->
                new TennisSet().tennisSet(testCase1,testCase2));
        assertFalse(new TennisSet().tennisSet(testCase1,testCase2));
    }//void test10() {
}//class TennisSetTest {