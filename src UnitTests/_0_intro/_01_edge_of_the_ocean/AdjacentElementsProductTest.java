/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._01_edge_of_the_ocean;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class AdjacentElementsProductTest {

    @Test
    public void test1() {
        int[] testCase = { 3, 6, -2, -5, 7, 3 };
        var solution = 21;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { -1, -2 };
        var solution = 2;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { 5, 1, 2, 3, 1, 4 };
        var solution = 6;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 1, 2, 3, 0 };
        var solution = 6;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { 9, 5, 10, 2, 24, -1, -48 };
        var solution = 50;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { 5, 6, -4, 2, 3, 2, -23 };
        var solution = 30;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { 4, 1, 2, 3, 1, 5 };
        var solution = 6;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { -23, 4, -3, 8, -12 };
        var solution = -12;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase = { 1, 0, 1, 0, 1000 };
        var solution = 0;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase = { 2, 1, 3, 1, 2, 5  };
        var solution = 10;
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase = { 1, 1, -1, 10, -10, 1  };
        var solution = 1;
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase = { -1, 1, -1  };
        var solution = -1;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        int[] testCase = { -1, 100  };
        var solution = -100;
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        int[] testCase = { 7, 5, 8, 2, 17, -1, -34  };
        var solution = 40;
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        int[] testCase = { 34, -23, -100, 23, 44  };
        var solution = 2300;
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        int[] testCase = { 3, 4 };
        var solution = 12;
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        int[] testCase = { -1000, 4, 5, 8, 100, 50, 500  };
        var solution = 25000;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        int[] testCase = { -1000, -1000, 1, 1, 1, 5, 8, 100, 50, 500  };
        var solution = 1000000;
        test(testCase, solution);
    }//public void test18() {

    private void test(int[] testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new AdjacentElementsProduct().adjacentElementsProduct(testCase.clone()));
        assertEquals(solution,new AdjacentElementsProduct().adjacentElementsProduct(testCase));
    }//private void test(int[] testCase, int solution){
}//class AdjacentElementsProductTest {