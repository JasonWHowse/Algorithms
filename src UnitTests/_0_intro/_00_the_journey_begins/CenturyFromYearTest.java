/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._00_the_journey_begins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CenturyFromYearTest {

    @Test
    public void test1() {
        int testCase = 1905;
        int solution = 20;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int testCase = 1700;
        int solution = 17;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int testCase = 1988;
        int solution = 20;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int testCase = 2000;
        int solution = 20;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int testCase = 2001;
        int solution = 21;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int testCase = 200;
        int solution = 2;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int testCase = 374;
        int solution = 4;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int testCase = 45;
        int solution = 1;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int testCase = 8;
        int solution = 1;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int testCase = 300;
        int solution = 3;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        int testCase = 1588;
        int solution = 16;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        int testCase = 1;
        int solution = 1;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        int testCase = 50;
        int solution = 1;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        int testCase = 101;
        int solution = 2;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        int testCase = 34;
        int solution = 1;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        int testCase = 827;
        int solution = 9;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        int testCase = 2005;
        int solution = 21;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        int testCase = 1200;
        int solution = 12;
        test(testCase, solution);
    }//public void test18() {

    @Test
    private void test(int testCase, int solution) {
        Assertions.assertTimeout(Duration.ofSeconds(3),()->new CenturyFromYear().centuryFromYear(testCase));
        assertEquals(solution,new CenturyFromYear().centuryFromYear(testCase));
    }//private void test() {
}//class CenturyFromYearTest {