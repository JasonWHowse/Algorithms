/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_rains_of_reason;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardCellColorTest {

    @Test
    void test1() {
        String testCase1="A1";
        String testCase2="C3";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertTrue(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test1() {

    @Test
    void test2() {
        String testCase1="A1";
        String testCase2="H3";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertFalse(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test2() {

    @Test
    void test3() {
        String testCase1="A1";
        String testCase2="A2";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertFalse(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test3() {

    @Test
    void test4() {
        String testCase1="A1";
        String testCase2="B2";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertTrue(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test4() {

    @Test
    void test5() {
        String testCase1="B3";
        String testCase2="H8";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertFalse(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test5() {

    @Test
    void test6() {
        String testCase1="C3";
        String testCase2="B5";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertFalse(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test6() {

    @Test
    void test7() {
        String testCase1="G5";
        String testCase2="E7";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertTrue(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test7() {

    @Test
    void test8() {
        String testCase1="C8";
        String testCase2="H8";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertFalse(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test8() {

    @Test
    void test9() {
        String testCase1="D2";
        String testCase2="D2";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertTrue(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test9() {

    @Test
    void test10() {
        String testCase1="A2";
        String testCase2="A5";
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
        assertFalse(new ChessBoardCellColor().chessBoardCellColor(testCase1,testCase2));
    }//void test10() {
}