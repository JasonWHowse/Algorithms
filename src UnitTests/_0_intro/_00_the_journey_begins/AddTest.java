/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._00_the_journey_begins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest{
    
    @Test
    public void test1() {
        int testCase1 = 1;
        int testCase2 = 2;
        int solution = 3;
        test(testCase1, testCase2, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int testCase1 = 0;
        int testCase2 = 1000;
        int solution = 1000;
        test(testCase1, testCase2, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int testCase1 = 2;
        int testCase2 = -39;
        int solution = -37;
        test(testCase1, testCase2, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int testCase1 = 99;
        int testCase2 = 100;
        int solution = 199;
        test(testCase1, testCase2, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int testCase1 = -100;
        int testCase2 = 100;
        int solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int testCase1 = -1000;
        int testCase2 = -1000;
        int solution = -2000;
        test(testCase1, testCase2, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int testCase1 = -1000;
        int testCase2 = 999;
        int solution = -1;
        test(testCase1, testCase2, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int testCase1 = 100;
        int testCase2 = 100;
        int solution = 200;
        test(testCase1, testCase2, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int testCase1 = -100;
        int testCase2 = -100;
        int solution = -200;
        test(testCase1, testCase2, solution);
    }//public void test9() {

    @Test
    public void test10() {
        int testCase1 = -98;
        int testCase2 = 1;
        int solution = -97;
        test(testCase1, testCase2, solution);
    }//public void test10() {

    @Test
    public void test11() {
        int testCase1 = 1000;
        int testCase2 = 1000;
        int solution = 2000;
        test(testCase1, testCase2, solution);
    }//public void test11() {

    @Test
    public void test12() {
        int testCase1 = -1000;
        int testCase2 = 1000;
        int solution = 0;
        test(testCase1, testCase2, solution);
    }//public void test12() {
    
    private void test(int testCase1, int testCase2, int solution){
        Assertions.assertTimeout(Duration.ofSeconds(3),()->new Add().add(testCase1,testCase2));
        assertEquals(new Add().add(testCase1,testCase2),solution);
    }//private void test(int testCase1, int testCase2, int solution){
}//class AddTest{