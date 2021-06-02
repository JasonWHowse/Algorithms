/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class ReachNextLevelTest {

    @Test
    public void test1() {
        var testCase1 = 10;
        var testCase2 = 15;
        var testCase3 = 5;
        test(testCase1, testCase2, testCase3, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 10;
        var testCase2 = 15;
        var testCase3 = 4;
        test(testCase1, testCase2, testCase3, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 3;
        var testCase2 = 6;
        var testCase3 = 4;
        test(testCase1, testCase2, testCase3, true);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 84;
        var testCase2 = 135;
        var testCase3 = 36;
        test(testCase1, testCase2, testCase3, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 74;
        var testCase2 = 170;
        var testCase3 = 58;
        test(testCase1, testCase2, testCase3, false);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 80;
        var testCase2 = 199;
        var testCase3 = 15;
        test(testCase1, testCase2, testCase3, false);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 97;
        var testCase2 = 57;
        var testCase3 = 7;
        test(testCase1, testCase2, testCase3, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 235;
        var testCase2 = 293;
        var testCase3 = 4;
        test(testCase1, testCase2, testCase3, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 222;
        var testCase2 = 137;
        var testCase3 = 58;
        test(testCase1, testCase2, testCase3, true);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 16;
        var testCase2 = 23;
        var testCase3 = 16;
        test(testCase1, testCase2, testCase3, true);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 249;
        var testCase2 = 117;
        var testCase3 = 44;
        test(testCase1, testCase2, testCase3, true);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 250;
        var testCase2 = 300;
        var testCase3 = 46;
        test(testCase1, testCase2, testCase3, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 154;
        var testCase2 = 188;
        var testCase3 = 31;
        test(testCase1, testCase2, testCase3, false);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 170;
        var testCase2 = 199;
        var testCase3 = 51;
        test(testCase1, testCase2, testCase3, true);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 22;
        var testCase2 = 43;
        var testCase3 = 63;
        test(testCase1, testCase2, testCase3, true);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 234;
        var testCase2 = 300;
        var testCase3 = 65;
        test(testCase1, testCase2, testCase3, false);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 230;
        var testCase2 = 285;
        var testCase3 = 56;
        test(testCase1, testCase2, testCase3, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 3;
        var testCase2 = 5;
        var testCase3 = 2;
        test(testCase1, testCase2, testCase3, true);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 10;
        var testCase2 = 15;
        var testCase3 = 2;
        test(testCase1, testCase2, testCase3, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = 239;
        var testCase2 = 300;
        var testCase3 = 63;
        test(testCase1, testCase2, testCase3, true);
    }//public void test20() {

    private void test(int testCase1, int testCase2, int testCase3, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new ReachNextLevel().reachNextLevel(testCase1,testCase2,testCase3));
        if(solution) {
            assertTrue(new ReachNextLevel().reachNextLevel(testCase1, testCase2, testCase3));
        }else {//if(solution) {
            assertFalse(new ReachNextLevel().reachNextLevel(testCase1, testCase2, testCase3));
        }//else{
    }//private void test(int testCase1, int testCase2, int testCase3, boolean solution){
}//class ReachNextLevelTest {