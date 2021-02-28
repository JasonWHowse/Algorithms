/*
 * Authored by: Jason Wesley Howse
 */

package intro.edge_of_the_ocean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MakeArrayConsecutive2Test {

    @Test
    void test1() {
        int[] testCase=new int[]{6, 2, 3, 8};
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase),3);
    }//void test1() {

    @Test
    void test2() {
        int[] testCase=new int[]{0, 3};
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase),2);
    }//void test2() {

    @Test
    void test3() {
        int[] testCase=new int[]{5, 4, 6};
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase),0);
    }//void test3() {

    @Test
    void test4() {
        int[] testCase=new int[]{6, 3};
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase),2);
    }//void test4() {

    @Test
    void test5() {
        int[] testCase=new int[]{1};
        Assertions.assertTimeout(Duration.ofSeconds(3),()->
                new MakeArrayConsecutive2().makeArrayConsecutive2(
                testCase));
        assertEquals(new MakeArrayConsecutive2().
                makeArrayConsecutive2(testCase),0);
    }//void test5() {
}