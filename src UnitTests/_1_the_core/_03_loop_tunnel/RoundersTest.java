/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class RoundersTest {

    @Test
    public void test1() {
        var testCase = 15;
        var solution = 20;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 1234;
        var solution = 1000;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 1445;
        var solution = 2000;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 14;
        var solution = 10;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 10;
        var solution = 10;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 7001;
        var solution = 7000;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 99;
        var solution = 100;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 12345678;
        var solution = 10000000;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 98765432;
        var solution = 100000000;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 44444445;
        var solution = 50000000;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 2445;
        var solution = 3000;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 446;
        var solution = 500;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 1;
        var solution = 1;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 44444444;
        var solution = 40000000;
        test(testCase, solution);
    }//public void test14() {

    private void test(int testCase, int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new Rounders().rounders(testCase));
        assertEquals(solution, new Rounders().rounders(testCase));
    }//private void test(){
}//class RoundersTest {