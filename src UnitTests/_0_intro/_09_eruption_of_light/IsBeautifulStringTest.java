/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._09_eruption_of_light;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class IsBeautifulStringTest {

    @Test
    public void test1() {
        var testCase = "bbbaacdafe";
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "aabbb";
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "bbc";
        test(testCase, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "bbbaa";
        test(testCase, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "abcdefghijklmnopqrstuvwxyzz";
        test(testCase, false);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "abcdefghijklmnopqrstuvwxyz";
        test(testCase, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "abcdefghijklmnopqrstuvwxyzqwertuiopasdfghjklxcvbnm";
        test(testCase, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "fyudhrygiuhdfeis";
        test(testCase, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "zaa";
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "zyy";
        test(testCase, false);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "zzy";
        test(testCase, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "aaa";
        test(testCase, true);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "abcdefghijklmnopqrstuvwxy";
        test(testCase, true);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "zzz";
        test(testCase, false);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "aaaaaaaaaabbbbbbbbbccccc";
        test(testCase, true);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = "bxcdefghijklmnopqrstuvwyzaaaaaaaaaaaaaaaaaaaaaaaaa";
        test(testCase, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "bxcdefghijklmnopqrstuvwyza";
        test(testCase, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "abcdefghijklmabcdefghijklmnpnopqrstuvwxyzz";
        test(testCase, false);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "bba";
        test(testCase, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = "aabb";
        test(testCase, true);
    }//public void test20() {
    
    private void test(String testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new IsBeautifulString().isBeautifulString(testCase));
        if(solution) {
            assertTrue(new IsBeautifulString().isBeautifulString(testCase));
        }else {//if(solution){
            assertFalse(new IsBeautifulString().isBeautifulString(testCase));
        }//else{
    }//private void test(String testCase, boolean solution){
}//class IsBeautifulStringTest {