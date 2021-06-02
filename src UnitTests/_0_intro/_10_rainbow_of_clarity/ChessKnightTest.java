/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._10_rainbow_of_clarity;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class ChessKnightTest {

    @Test
    public void test1() {
        var testCase = "a1";
        var solution = 2;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "c2";
        var solution = 6;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "d4";
        var solution = 8;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "g6";
        var solution = 6;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "a3";
        var solution = 4;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "b7";
        var solution = 4;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "h8";
        var solution = 2;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "h6";
        var solution = 4;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "g8";
        var solution = 3;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "a5";
        var solution = 4;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "h1";
        var solution = 2;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "e7";
        var solution = 6;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "f6";
        var solution = 8;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "b3";
        var solution = 6;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "b2";
        var solution = 4;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = "g7";
        var solution = 4;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "h5";
        var solution = 4;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "g4";
        var solution = 6;
        test(testCase, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "e5";
        var solution = 8;
        test(testCase, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = "d6";
        var solution = 8;
        test(testCase, solution);
    }//public void test20() {

    private void test(String testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new ChessKnight().chessKnight(testCase));
        assertEquals(solution,new ChessKnight().chessKnight(testCase));
    }//private void test(String testCase, int solution){
}//class ChessKnightTest {