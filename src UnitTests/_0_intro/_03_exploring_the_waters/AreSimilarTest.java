/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class AreSimilarTest {

    @Test
    public void test1() {
        int[] testCase1 = { 1, 2, 3 };
        int[] testCase2 = { 1, 2, 3 };
        test(testCase1, testCase2, true);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = { 1, 2, 3 };
        int[] testCase2 = { 2, 1, 3 };
        test(testCase1, testCase2, true);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = { 1, 2, 2 };
        int[] testCase2 = { 2, 1, 1 };
        test(testCase1, testCase2, false);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = { 1, 1, 4 };
        int[] testCase2 = { 1, 2, 3 };
        test(testCase1, testCase2, false);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = { 1, 2, 3 };
        int[] testCase2 = { 1, 10, 2 };
        test(testCase1, testCase2, false);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase1 = { 2, 3, 1 };
        int[] testCase2 = { 1, 3, 2 };
        test(testCase1, testCase2, true);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = { 2, 3, 9 };
        int[] testCase2 = { 10, 3, 2 };
        test(testCase1, testCase2, false);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase1 = { 4, 6, 3 };
        int[] testCase2 = { 3, 4, 6 };
        test(testCase1, testCase2, false);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase1 = { 832, 998, 148, 570, 533, 561, 894, 147, 455, 279 };
        int[] testCase2 = { 832, 998, 148, 570, 533, 561, 455, 147, 894, 279 };
        test(testCase1, testCase2, true);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase1 = { 832, 998, 148, 570, 533, 561, 894, 147, 455, 279 };
        int[] testCase2 = { 832, 570, 148, 998, 533, 561, 455, 147, 894, 279 };
        test(testCase1, testCase2, false);
    }//public void test10() {

    private void test(int[] testCase1, int[] testCase2, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->new AreSimilar().areSimilar(testCase1.clone(),testCase2.clone()));
        if(solution) {
            assertTrue(new AreSimilar().areSimilar(testCase1, testCase2));
        }else {//if(solution){
            assertFalse(new AreSimilar().areSimilar(testCase1, testCase2));
        }//else{
    }//private void test(int[] testCase1, int[] testCase2, boolean solution){
}//class AreSimilarTest