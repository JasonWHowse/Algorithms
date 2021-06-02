/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class LineUpTest {

    @Test
    public void test1() {
        var testCase1 = "LLARL";
        var solution = 3;
        test(testCase1, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = "RLR";
        var solution = 1;
        test(testCase1, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = "";
        var solution = 0;
        test(testCase1, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = "L";
        var solution = 0;
        test(testCase1, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = "A";
        var solution = 1;
        test(testCase1, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = "AAAAAAAAAAAAAAA";
        var solution = 15;
        test(testCase1, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = "RRRRRRRRRRLLLLLLLLLRRRRLLLLLLLLLL";
        var solution = 16;
        test(testCase1, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = "AALAAALARAR";
        var solution = 5;
        test(testCase1, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = "LRALARRAALARLALRAALLLRAALRALAALR";
        var solution = 17;
        test(testCase1, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = "LRLRLRRL";
        var solution = 4;
        test(testCase1, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = "LLRR";
        var solution = 2;
        test(testCase1, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = "R";
        var solution = 0;
        test(testCase1, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = "RLARA";
        var solution = 2;
        test(testCase1, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = "LALRRLRLRA";
        var solution = 5;
        test(testCase1, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = "LALRLLRRRRRAALAAARLRAAALL";
        var solution = 13;
        test(testCase1, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = "LAAARAAALARAAALAAALRAA";
        var solution = 9;
        test(testCase1, solution);
    }//public void test16() {

    private void test(String testCase, int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new LineUp().lineUp(testCase));
        assertEquals(solution, new LineUp().lineUp(testCase));
    }//private void test(){
}//class LineUpTest {