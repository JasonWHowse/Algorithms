/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._06_book_market;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsMAC48AddressTest {

    @Test
    public void test1() {
        var testCase = "00-1B-63-84-45-E6";
        test(testCase, true);
    }//public void test1() {

    @Test
    public void Test2() {
        var testCase = "Z1-1B-63-84-45-E6";
        test(testCase, false);
    }//public void Test2() {

    @Test
    public void Test3() {
        var testCase = "not a MAC-48 address";
        test(testCase, false);
    }//public void Test3() {

    @Test
    public void Test4() {
        var testCase = "FF-FF-FF-FF-FF-FF";
        test(testCase, true);
    }//public void Test4() {

    @Test
    public void Test5() {
        var testCase = "00-00-00-00-00-00";
        test(testCase, true);
    }//public void Test5() {

    @Test
    public void Test6() {
        var testCase = "G0-00-00-00-00-00";
        test(testCase, false);
    }//public void Test6() {

    @Test
    public void Test7() {
        var testCase = "02-03-04-05-06-07-";
        test(testCase, false);
    }//public void Test7() {

    @Test
    public void Test8() {
        var testCase = "12-34-56-78-9A-BC";
        test(testCase, true);
    }//public void Test8() {

    @Test
    public void Test9() {
        var testCase = "FF-FF-AB-CD-EA-BC";
        test(testCase, true);
    }//public void Test9() {

    @Test
    public void test10() {
        var testCase = "12-34-56-78-9A-BG";
        test(testCase, false);
    }//public void test10() {

    private void test(String testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->new IsMAC48Address().isMAC48Address(testCase));
        if(solution){
            assertTrue(new IsMAC48Address().isMAC48Address(testCase));
        }else{//if(solution){
            assertFalse(new IsMAC48Address().isMAC48Address(testCase));
        }//else{
    }//private void test(String testCase, boolean solution){
}//class IsMAC48AddressTest {