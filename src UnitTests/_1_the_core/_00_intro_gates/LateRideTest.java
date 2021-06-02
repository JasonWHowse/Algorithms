/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._00_intro_gates;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LateRideTest {

    @Test
    public void test1() {
        var testCase = 240;
        var solution = 4;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 808;
        var solution = 14;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 1439;
        var solution = 19;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 0;
        var solution = 0;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 23;
        var solution = 5;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 8;
        var solution = 8;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 194;
        var solution = 8;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 619;
        var solution = 11;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 1003;
        var solution = 14;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 55;
        var solution = 10;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 391;
        var solution = 10;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 3;
        var solution = 3;
        test(testCase, solution);
    }//public void test12() {

    private void test(int testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()->new LateRide().lateRide(testCase));
        assertEquals(solution,new LateRide().lateRide(testCase));
    }//private void test(testCase, solution){
}//class LateRideTest {