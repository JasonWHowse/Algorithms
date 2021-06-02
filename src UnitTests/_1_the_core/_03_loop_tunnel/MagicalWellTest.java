/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MagicalWellTest {

    @Test
    public void test1() {
        var testCase1 = 1;
        var testCase2 = 2;
        var testCase3 = 2;
        var solution = 8;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 1;
        var testCase2 = 1;
        var testCase3 = 1;
        var solution = 1;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 6;
        var testCase2 = 5;
        var testCase3 = 3;
        var solution = 128;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 1601;
        var testCase2 = 337;
        var testCase3 = 0;
        var solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 1891;
        var testCase2 = 352;
        var testCase3 = 0;
        var solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 1936;
        var testCase2 = 1835;
        var testCase3 = 5;
        var solution = 17800540;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 957;
        var testCase2 = 57;
        var testCase3 = 2;
        var solution = 110113;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 687;
        var testCase2 = 1337;
        var testCase3 = 0;
        var solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 491;
        var testCase2 = 1552;
        var testCase3 = 4;
        var solution = 3060400;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 1275;
        var testCase2 = 362;
        var testCase3 = 2;
        var solution = 924738;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 1556;
        var testCase2 = 406;
        var testCase3 = 5;
        var solution = 3178330;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 488;
        var testCase2 = 508;
        var testCase3 = 3;
        var solution = 746705;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 706;
        var testCase2 = 1555;
        var testCase3 = 5;
        var solution = 5511790;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 1375;
        var testCase2 = 995;
        var testCase3 = 0;
        var solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 1956;
        var testCase2 = 62;
        var testCase3 = 3;
        var solution = 369875;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 1671;
        var testCase2 = 1236;
        var testCase3 = 1;
        var solution = 2065356;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 278;
        var testCase2 = 1520;
        var testCase3 = 4;
        var solution = 1701042;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 206;
        var testCase2 = 1282;
        var testCase3 = 1;
        var solution = 264092;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 1560;
        var testCase2 = 1650;
        var testCase3 = 0;
        var solution = 0;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = 4;
        var testCase2 = 7;
        var testCase3 = 5;
        var solution = 280;
        test(testCase1, testCase2, testCase3, solution);
    }//public void test20() {

    private void test(int testCase1, int testCase2, int testCase3, int solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new MagicalWell().magicalWell(testCase1,testCase2,testCase3));
        assertEquals(solution, new MagicalWell().magicalWell(testCase1,testCase2,testCase3));
    }//private void test(){
}//class MagicalWellTest {