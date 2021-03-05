/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class ChessKnightTest {

    @Test
    void test1() {
        String testCase="a1";
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="c2";
        int solution=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="d4";
        int solution=8;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="g6";
        int solution=6;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="a3";
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test5() {

    @Test
    void test6() {
        String testCase="b7";
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test6() {

    @Test
    void test7() {
        String testCase="h8";
        int solution=2;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test7() {

    @Test
    void test8() {
        String testCase="h6";
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test8() {

    @Test
    void test9() {
        String testCase="g8";
        int solution=3;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test9() {

    @Test
    void test10() {
        String testCase="a5";
        int solution=4;
        assertTimeout(Duration.ofSeconds(3),()->
                new ChessKnight().chessKnight(testCase));
        assertEquals(new ChessKnight().chessKnight(testCase),solution);
    }//void test10() {
}