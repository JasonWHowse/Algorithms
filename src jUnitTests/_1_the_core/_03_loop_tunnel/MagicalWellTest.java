/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MagicalWellTest {

    @Test
    void test1() {
        int testCase1 = 1;
        int testCase2 = 2;
        int testCase3 = 2;
        int solution = 8;
        test(testCase1, testCase2, testCase3, solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1 = 1;
        int testCase2 = 1;
        int testCase3 = 1;
        int solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1 = 6;
        int testCase2 = 5;
        int testCase3 = 3;
        int solution = 128;
        test(testCase1, testCase2, testCase3, solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1 = 1601;
        int testCase2 = 337;
        int testCase3 = 0;
        int solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1 = 1891;
        int testCase2 = 352;
        int testCase3 = 0;
        int solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1 = 1936;
        int testCase2 = 1835;
        int testCase3 = 5;
        int solution = 17800540;
        test(testCase1, testCase2, testCase3, solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase1 = 957;
        int testCase2 = 57;
        int testCase3 = 2;
        int solution = 110113;
        test(testCase1, testCase2, testCase3, solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase1 = 687;
        int testCase2 = 1337;
        int testCase3 = 0;
        int solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase1 = 491;
        int testCase2 = 1552;
        int testCase3 = 4;
        int solution = 3060400;
        test(testCase1, testCase2, testCase3, solution);
    }//void test9() {

    @Test
    void test10() {
        int testCase1 = 1275;
        int testCase2 = 362;
        int testCase3 = 2;
        int solution = 924738;
        test(testCase1, testCase2, testCase3, solution);
    }//void test10() {

    private void test(int testCase1, int testCase2, int testCase3, int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new MagicalWell().magicalWell(testCase1,testCase2,testCase3));
        assertEquals(solution, new MagicalWell().magicalWell(testCase1,testCase2,testCase3));
    }//private void test(){
}//class MagicalWellTest {