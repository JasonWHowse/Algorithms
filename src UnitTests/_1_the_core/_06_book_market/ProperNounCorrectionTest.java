/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProperNounCorrectionTest {

    @Test
    public void test1() {
        var testCase = "pARiS";
        var solution = "Paris";
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "John";
        var solution = "John";
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "mary";
        var solution = "Mary";
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "a";
        var solution = "A";
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "B";
        var solution = "B";
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "yFZMlGvUQP";
        var solution = "Yfzmlgvuqp";
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "HQQrrDxuqe";
        var solution = "Hqqrrdxuqe";
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "atDh";
        var solution = "Atdh";
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "pJHSYVAZB";
        var solution = "Pjhsyvazb";
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "dKrqO";
        var solution = "Dkrqo";
        test(testCase, solution);
    }//public void test10() {

    private void test(String testCase, String solution){
        assertTimeout(Duration.ofSeconds(3),()->new ProperNounCorrection().properNounCorrection(testCase));
        assertEquals(solution,new ProperNounCorrection().properNounCorrection(testCase));
    }//private void test(String testCase, String testCase){
}//class ProperNounCorrectionTest {