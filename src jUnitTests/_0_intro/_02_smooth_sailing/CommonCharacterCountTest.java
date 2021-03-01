/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class CommonCharacterCountTest {
    @Test
    void test1() {
        String testCase1="aabcc";
        String testCase2="adcaa";

        assertTimeout(Duration.ofSeconds(3),()->new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
        assertEquals(3,new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
    }//void test1() {

    @Test
    void test2() {
        String testCase1="zzzz";
        String testCase2="zzzzzzz";

        assertTimeout(Duration.ofSeconds(3),()->new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
        assertEquals(4,new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
    }//void test2() {

    @Test
    void test3() {
        String testCase1="abca";
        String testCase2="xyzbac";

        assertTimeout(Duration.ofSeconds(3),()->new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
        assertEquals(3,new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
    }//void test3() {

    @Test
    void test4() {
        String testCase1="a";
        String testCase2="b";

        assertTimeout(Duration.ofSeconds(3),()->new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
        assertEquals(0,new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
    }//void test4() {

    @Test
    void test5() {
        String testCase1="a";
        String testCase2="aaa";

        assertTimeout(Duration.ofSeconds(3),()->new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
        assertEquals(1,new CommonCharacterCount().
                commonCharacterCount(testCase1,testCase2));
    }//void test5() {
}//class CommonCharacterCountTest {