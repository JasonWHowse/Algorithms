/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._08_dark_wilderness;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class BishopAndPawnTest {

    @Test
    void test1() {
        String testCase1="a1";
        String testCase2="c3";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertTrue(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test1() {

    @Test
    void test2() {
        String testCase1="h1";
        String testCase2="h3";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertFalse(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test2() {

    @Test
    void test3() {
        String testCase1="a5";
        String testCase2="c3";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertTrue(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test3() {

    @Test
    void test4() {
        String testCase1="g1";
        String testCase2="f3";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertFalse(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test4() {

    @Test
    void test5() {
        String testCase1="e7";
        String testCase2="d6";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertTrue(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test5() {

    @Test
    void test6() {
        String testCase1="e7";
        String testCase2="a3";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertTrue(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test6() {

    @Test
    void test7() {
        String testCase1="e3";
        String testCase2="a7";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertTrue(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test7() {

    @Test
    void test8() {
        String testCase1="a1";
        String testCase2="h8";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertTrue(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test8() {

    @Test
    void test9() {
        String testCase1="a1";
        String testCase2="h7";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertFalse(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test9() {

    @Test
    void test10() {
        String testCase1="h1";
        String testCase2="a8";
        assertTimeout(Duration.ofSeconds(3),()->
                new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
        assertTrue(new BishopAndPawn().bishopAndPawn(testCase1,testCase2));
    }//void test10() {
}//class BishopAndPawnTest {