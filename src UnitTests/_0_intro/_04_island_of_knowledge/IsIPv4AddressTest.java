/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._04_island_of_knowledge;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class IsIPv4AddressTest {

    @Test
    public void test1() {
        var testCase = "172.16.254.1";
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "172.316.254.1";
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = ".254.255.0";
        test(testCase, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "1.1.1.1a";
        test(testCase, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "1";
        test(testCase, false);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "0.254.255.0";
        test(testCase, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "1.23.256.255";
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "1.23.256..";
        test(testCase, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "0..1.0";
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "64.233.161.00";
        test(testCase, false);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "64.00.161.131";
        test(testCase, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "01.233.161.131";
        test(testCase, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "35..36.9.9.0";
        test(testCase, false);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "1.1.1.1.1";
        test(testCase, false);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "1.256.1.1";
        test(testCase, false);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = "a0.1.1.1";
        test(testCase, false);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "0.1.1.256";
        test(testCase, false);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "129380129831213981.255.255.255";
        test(testCase, false);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "255.255.255.255abcdekjhf";
        test(testCase, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = "7283728";
        test(testCase, false);
    }//public void test20() {

    @Test
    public void test21() {
        var testCase = "0..1.0.0";
        test(testCase, false);
    }//public void test21() {

    @Test
    public void test22() {
        var testCase = "256.255.255.0";
        test(testCase, false);
    }//public void test22() {

    @Test
    public void test23() {
        var testCase = "255.255.255.255";
        test(testCase, true);
    }//public void test23() {

    @Test
    public void test24() {
        var testCase = "255.255.256.255";
        test(testCase, false);
    }//public void test24() {

    @Test
    public void test25() {
        var testCase = "255..255.255";
        test(testCase, false);
    }//public void test25() {

    @Test
    public void test26() {
        var testCase = "0.0.0.0";
        test(testCase, true);
    }//public void test26() {

    @Test
    public void test27() {
        var testCase = ".0.0.0";
        test(testCase, false);
    }//public void test27() {

    @Test
    public void test28() {
        var testCase = "0.0.0z.0";
        test(testCase, false);
    }//public void test28() {

    @Test
    public void test29() {
        var testCase = "0.0.0.0.0";
        test(testCase, false);
    }//public void test29() {

    @Test
    public void test30() {
        var testCase = "12345";
        test(testCase, false);
    }//public void test30() {

    @Test
    public void test31() {
        var testCase = "12.14.24";
        test(testCase, false);
    }//public void test31() {

    @Test
    public void test32() {
        var testCase = "1.23.256.1.";
        test(testCase, false);
    }//public void test32() {

    @Test
    public void test33() {
        var testCase = "255255255255";
        test(testCase, false);
    }//public void test33() {

    @Test
    public void test34() {
        var testCase = "250";
        test(testCase, false);
    }//public void test34() {

    @Test
    public void test35() {
        var testCase = "255255.255.255";
        test(testCase, false);
    }//public void test35() {

    @Test
    public void test36() {
        var testCase = "9";
        test(testCase, false);
    }//public void test36() {

    @Test
    public void test37() {
        var testCase = "0.0.0.249";
        test(testCase, true);
    }//public void test37() {

    @Test
    public void test38() {
        var testCase = "25..26.8.8.1";
        test(testCase, false);
    }//public void test38() {

    @Test
    public void test39() {
        var testCase = "64.233.161.01";
        test(testCase, false);
    }//public void test39() {

    @Test
    public void test40() {
        var testCase = "64.01.161.131";
        test(testCase, false);
    }//public void test40() {

    @Test
    public void test41() {
        var testCase = "00.233.161.131";
        test(testCase, false);
    }//public void test41() {

    private void test(String testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->
                new IsIPv4Address().isIPv4Address(testCase));
        if(solution) {
            assertTrue(new IsIPv4Address().isIPv4Address(testCase));
        }else {//if(solution) {
            assertFalse(new IsIPv4Address().isIPv4Address(testCase));
        }//else{
    }//private void test(String testCase, boolean solution){
}//class IsIPv4AddressTest {