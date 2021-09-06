/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MostFrequentDigitSumTest {

    @Test
    public void test1() {
        var testCase = 88;
        var solution = 9;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 8;
        var solution = 8;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 1;
        var solution = 1;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 17;
        var solution = 9;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 239;
        var solution = 9;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 994;
        var solution = 9;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 99999;
        var solution = 18;
        test(testCase, solution);
    }//public void test7() {


    private void test(int testCase, int solution) {
        assertEquals(solution, new MostFrequentDigitSum().mostFrequentDigitSum(testCase));
        assertTimeout(Duration.ofSeconds(3), () -> new MostFrequentDigitSum().mostFrequentDigitSum(testCase));
    }//private void test(int testCase, int solution) {
}//class MostFrequentDigitSumTest {