/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConstructSquareTest {

    @Test
    public void test1() {
        var testCase = "ab";
        var solution = 81;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "zzz";
        var solution = -1;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "aba";
        var solution = 900;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "abcbbb";
        var solution = 810000;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "abc";
        var solution = 961;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "aaaabbcde";
        var solution = 999950884;
        test(testCase, solution);
    }//public void test6() {

    private void test(String testCase, int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new ConstructSquare().constructSquare(testCase));
        assertEquals(solution, new ConstructSquare().constructSquare(testCase));
    }//private void test(String testCase, int solution) {
}//class ConstructSquareTest {