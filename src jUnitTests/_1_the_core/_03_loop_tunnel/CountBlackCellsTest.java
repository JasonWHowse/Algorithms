/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountBlackCellsTest {

    @Test
    void test1() {
        int testCase1=3;
        int testCase2=4;
        int solution=6;
        test(testCase1,testCase2,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1=3;
        int testCase2=3;
        int solution=7;
        test(testCase1,testCase2,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1=2;
        int testCase2=5;
        int solution=6;
        test(testCase1,testCase2,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1=1;
        int testCase2=1;
        int solution=1;
        test(testCase1,testCase2,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1=1;
        int testCase2=2;
        int solution=2;
        test(testCase1,testCase2,solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase1=1;
        int testCase2=3;
        int solution=3;
        test(testCase1,testCase2,solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase1=1;
        int testCase2=239;
        int solution=239;
        test(testCase1,testCase2,solution);
    }//void test7() {

    @Test
    void test8() {
        int testCase1=33;
        int testCase2=44;
        int solution=86;
        test(testCase1,testCase2,solution);
    }//void test8() {

    @Test
    void test9() {
        int testCase1=16;
        int testCase2=8;
        int solution=30;
        test(testCase1,testCase2,solution);
    }//void test9() {

    @Test
    void test10() {
        int testCase1=66666;
        int testCase2=88888;
        int solution=177774;
        test(testCase1,testCase2,solution);
    }//void test10() {

    @Test
    void customTest(){
        int testCase1=10;
        int testCase2=1;
        int solution=10;
        test(testCase1,testCase2,solution);
    }

    private void test(int testCase1,int testCase2,int solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new CountBlackCells().countBlackCells(testCase1,testCase2));
        assertEquals(solution,new CountBlackCells().countBlackCells(testCase1,testCase2));
    }//private void test(int testCase1,int testCase2,int solution){
}//class CountBlackCellsTest {