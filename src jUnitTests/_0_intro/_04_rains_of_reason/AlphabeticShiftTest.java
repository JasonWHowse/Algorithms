/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_rains_of_reason;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class AlphabeticShiftTest {

    @Test
    void test1() {
        String testCase="crazy";
        String solution="dsbaz";
        assertTimeout(Duration.ofSeconds(3),()->
                new AlphabeticShift().alphabeticShift(testCase));
        assertEquals(new AlphabeticShift().alphabeticShift(testCase),solution);
    }//void test1() {

    @Test
    void test2() {
        String testCase="z";
        String solution="a";
        assertTimeout(Duration.ofSeconds(3),()->
                new AlphabeticShift().alphabeticShift(testCase));
        assertEquals(new AlphabeticShift().alphabeticShift(testCase),solution);
    }//void test2() {

    @Test
    void test3() {
        String testCase="aaaabbbccd";
        String solution="bbbbcccdde";
        assertTimeout(Duration.ofSeconds(3),()->
                new AlphabeticShift().alphabeticShift(testCase));
        assertEquals(new AlphabeticShift().alphabeticShift(testCase),solution);
    }//void test3() {

    @Test
    void test4() {
        String testCase="fuzzy";
        String solution="gvaaz";
        assertTimeout(Duration.ofSeconds(3),()->
                new AlphabeticShift().alphabeticShift(testCase));
        assertEquals(new AlphabeticShift().alphabeticShift(testCase),solution);
    }//void test4() {

    @Test
    void test5() {
        String testCase="codesignal";
        String solution="dpeftjhobm";
        assertTimeout(Duration.ofSeconds(3),()->
                new AlphabeticShift().alphabeticShift(testCase));
        assertEquals(new AlphabeticShift().alphabeticShift(testCase),solution);
    }//void test5() {
}//class AlphabeticShiftTest {