/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._01_edge_of_the_ocean;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class MakeArrayConsecutive2Test {
    @Test
    void test1() {
        int[] testCase=new int[]{6, 2, 3, 8};
        assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase.clone()));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase.clone()),3);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase=new int[]{0, 3};
        assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase.clone()));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase.clone()),2);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase=new int[]{5, 4, 6};
        assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase.clone()));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase.clone()),0);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase=new int[]{6, 3};
        assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase.clone()));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase.clone()),2);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase=new int[]{1};
        assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase.clone()));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase.clone()),0);
    }//void test5() {
}//class MakeArrayConsecutive2Test {