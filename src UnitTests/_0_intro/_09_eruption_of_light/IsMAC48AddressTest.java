/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class IsMAC48AddressTest {

    @Test
    public void test1() {
        var testCase = "00-1B-63-84-45-E6";
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "Z1-1B-63-84-45-E6";
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "not a MAC-48 address";
        test(testCase, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "FF-FF-FF-FF-FF-FF";
        test(testCase, true);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "00-00-00-00-00-00";
        test(testCase, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "G0-00-00-00-00-00";
        test(testCase, false);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "02-03-04-05-06-07-";
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "12-34-56-78-9A-BC";
        test(testCase, true);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "FF-FF-AB-CD-EA-BC";
        test(testCase, true);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "12-34-56-78-9A-BG";
        test(testCase, false);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "1234-56-78-9A-BC";
        test(testCase, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "12-34-56-78-9A-";
        test(testCase, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "12.34.56.78.9A.BC";
        test(testCase, false);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "-----------------";
        test(testCase, false);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "AB-CD-EF-12-34-56";
        test(testCase, true);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = "0-12-34-56-78-9A";
        test(testCase, false);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "02-03-04-05-06-070";
        test(testCase, false);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "00--00-00-00-00-00";
        test(testCase, false);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "23-25-E4-39-40-11-";
        test(testCase, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = "AB-CD-EF-12-34_56";
        test(testCase, false);
    }//public void test20() {
    
    private void test(String testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new IsMAC48Address().isMAC48Address(testCase));
        if(solution) {
            assertTrue(new IsMAC48Address().isMAC48Address(testCase));
        }else {//if(solution){
            assertFalse(new IsMAC48Address().isMAC48Address(testCase));
        }//else{
    }//private void test(String testCase, boolean solution){
}//class IsMAC48AddressTest {