/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._01_edge_of_the_ocean;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;


class AlmostIncreasingSequenceTest {

    @Test
    public void test1() {
        int[] testCase = { 1, 3, 2, 1 };
        test(testCase,false);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { 1, 3, 2 };
        test(testCase,true);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { 1, 2, 1, 2 };
        test(testCase,false);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 3, 6, 5, 8, 10, 20, 15 };
        test(testCase,false);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { 1, 1, 2, 3, 4, 4 };
        test(testCase,false);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { 1, 4, 10, 4, 2 };
        test(testCase,false);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { 10, 1, 2, 3, 4, 5 };
        test(testCase,true);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { 1, 1, 1, 2, 3 };
        test(testCase,false);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase = { 0, -2, 5, 6 };
        test(testCase,true);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase = { 1, 2, 3, 4, 5, 3, 5, 6 };
        test(testCase,false);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase = { 40, 50, 60, 10, 20, 30 };
        test(testCase,false);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase = { 1, 1 };
        test(testCase,true);
    }//public void test12() {

    @Test
    public void test13() {
        int[] testCase = { 1, 2, 5, 3, 5 };
        test(testCase,true);
    }//public void test13() {

    @Test
    public void test14() {
        int[] testCase = { 1, 2, 5, 5, 5 };
        test(testCase,false);
    }//public void test14() {

    @Test
    public void test15() {
        int[] testCase = { 10, 1, 2, 3, 4, 5, 6, 1 };
        test(testCase,false);
    }//public void test15() {

    @Test
    public void test16() {
        int[] testCase = { 1, 2, 3, 4, 3, 6 };
        test(testCase,true);
    }//public void test16() {

    @Test
    public void test17() {
        int[] testCase = { 1, 2, 3, 4, 99, 5, 6 };
        test(testCase,true);
    }//public void test17() {

    @Test
    public void test18() {
        int[] testCase = { 123, -17, -5, 1, 2, 3, 12, 43, 45 };
        test(testCase,true);
    }//public void test18() {

    @Test
    public void test19() {
        int[] testCase = { 3, 5, 67, 98, 3 };
        test(testCase,true);
    }//public void test19() {

    private void test(int[] testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new AlmostIncreasingSequence().almostIncreasingSequence(testCase.clone()));
        if(solution){
            assertTrue(new AlmostIncreasingSequence().almostIncreasingSequence(testCase));
        }else{//if(solution){
            assertFalse(new AlmostIncreasingSequence().almostIncreasingSequence(testCase));
        }//else{
    }//private void test(int[] testCase, boolean solution){
}//class AlmostIncreasingSequenceTest {