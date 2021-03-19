/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class EqualPairOfBitsTest {

    @Test
    void test1() {
        int testCase1=10;
        int testCase2=11;
        int solution=2;
        test(testCase1,testCase2,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase1=0;
        int testCase2=0;
        int solution=1;
        test(testCase1,testCase2,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase1=28;
        int testCase2=27;
        int solution=8;
        test(testCase1,testCase2,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase1=895;
        int testCase2=928;
        int solution=32;
        test(testCase1,testCase2,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase1=1073741824;
        int testCase2=1006895103;
        int solution=262144;
        test(testCase1,testCase2,solution);
    }//void test5() {

    private void test(int testCase1,int testCase2,int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new EqualPairOfBits().equalPairOfBits(testCase1, testCase2));
        assertEquals(solution, new EqualPairOfBits().equalPairOfBits(testCase1, testCase2));
    }//private void test(int testCase1,int testCase2,int solution) {
}//class EqualPairOfBitsTest {