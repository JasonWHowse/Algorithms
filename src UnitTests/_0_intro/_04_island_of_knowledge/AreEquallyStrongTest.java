/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class AreEquallyStrongTest {

    @Test
    public void test1() {
        var testCase1 = 10;
        var testCase2 = 15;
        var testCase3 = 15;
        var testCase4 = 10;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase1 = 15;
        var testCase2 = 10;
        var testCase3 = 15;
        var testCase4 = 10;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase1 = 15;
        var testCase2 = 10;
        var testCase3 = 15;
        var testCase4 = 9;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase1 = 10;
        var testCase2 = 5;
        var testCase3 = 5;
        var testCase4 = 10;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase1 = 10;
        var testCase2 = 15;
        var testCase3 = 5;
        var testCase4 = 20;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase1 = 10;
        var testCase2 = 20;
        var testCase3 = 10;
        var testCase4 = 20;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase1 = 5;
        var testCase2 = 20;
        var testCase3 = 20;
        var testCase4 = 5;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase1 = 20;
        var testCase2 = 15;
        var testCase3 = 5;
        var testCase4 = 20;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase1 = 5;
        var testCase2 = 10;
        var testCase3 = 5;
        var testCase4 = 10;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase1 = 1;
        var testCase2 = 10;
        var testCase3 = 10;
        var testCase4 = 0;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase1 = 5;
        var testCase2 = 5;
        var testCase3 = 10;
        var testCase4 = 10;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase1 = 10;
        var testCase2 = 5;
        var testCase3 = 10;
        var testCase4 = 6;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase1 = 1;
        var testCase2 = 1;
        var testCase3 = 1;
        var testCase4 = 1;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase1 = 0;
        var testCase2 = 10;
        var testCase3 = 10;
        var testCase4 = 0;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase1 = 0;
        var testCase2 = 11;
        var testCase3 = 10;
        var testCase4 = 0;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase1 = 0;
        var testCase2 = 15;
        var testCase3 = 15;
        var testCase4 = 0;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase1 = 10;
        var testCase2 = 10;
        var testCase3 = 8;
        var testCase4 = 12;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase1 = 7;
        var testCase2 = 8;
        var testCase3 = 5;
        var testCase4 = 10;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase1 = 15;
        var testCase2 = 15;
        var testCase3 = 15;
        var testCase4 = 15;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase1 = 15;
        var testCase2 = 1;
        var testCase3 = 1;
        var testCase4 = 15;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test20() {

    @Test
    public void test21() {
        var testCase1 = 15;
        var testCase2 = 15;
        var testCase3 = 1;
        var testCase4 = 1;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test21() {

    @Test
    public void test22() {
        var testCase1 = 14;
        var testCase2 = 2;
        var testCase3 = 3;
        var testCase4 = 13;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test22() {

    @Test
    public void test23() {
        var testCase1 = 14;
        var testCase2 = 2;
        var testCase3 = 3;
        var testCase4 = 12;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test23() {

    @Test
    public void test24() {
        var testCase1 = 20;
        var testCase2 = 6;
        var testCase3 = 5;
        var testCase4 = 19;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test24() {

    @Test
    public void test25() {
        var testCase1 = 20;
        var testCase2 = 20;
        var testCase3 = 20;
        var testCase4 = 20;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test25() {

    @Test
    public void test26() {
        var testCase1 = 20;
        var testCase2 = 20;
        var testCase3 = 10;
        var testCase4 = 10;
        test(testCase1, testCase2, testCase3, testCase4, false);
    }//public void test26() {

    @Test
    public void test27() {
        var testCase1 = 0;
        var testCase2 = 0;
        var testCase3 = 0;
        var testCase4 = 0;
        test(testCase1, testCase2, testCase3, testCase4, true);
    }//public void test27() {

    private void test(int testCase1, int testCase2, int testCase3, int testCase4, boolean solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new AreEquallyStrong().areEquallyStrong(testCase1, testCase2, testCase3, testCase4));
        if (solution) {
            assertTrue(new AreEquallyStrong().areEquallyStrong(testCase1, testCase2, testCase3, testCase4));
        }else{//if(solution){
            assertFalse(new AreEquallyStrong().areEquallyStrong(testCase1,testCase2,testCase3,testCase4));
        }//else{
    }//private void test(int testCase1, int testCase2, int testCase3, int testCase4, boolean solution){
}//class AreEquallyStrongTest {