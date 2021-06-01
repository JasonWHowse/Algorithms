/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._05_rains_of_reason;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class VariableNameTest {

    @Test
    public void test1() {
        var testCase = "var_1__Int";
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "qq-q";
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "2w2";
        test(testCase, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = " variable";
        test(testCase, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "va[riable0";
        test(testCase, false);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "variable0";
        test(testCase, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "a";
        test(testCase, true);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "_Aas_23";
        test(testCase, true);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "a a_2";
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "0ss";
        test(testCase, false);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "&ss";
        test(testCase, false);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "va]riable0";
        test(testCase, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "GoodVar";
        test(testCase, true);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "BadV.ar";
        test(testCase, false);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "TheWoman";
        test(testCase, true);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = "TheBestVar";
        test(testCase, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "_AreYouMad";
        test(testCase, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "_Int128";
        test(testCase, true);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "!true";
        test(testCase, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = "s0s";
        test(testCase, true);
    }//public void test20() {

    private void test(String testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->new VariableName().variableName(testCase));
        if(solution){
            assertTrue(new VariableName().variableName(testCase));
        }else {//if(solution){
            assertFalse(new VariableName().variableName(testCase));
        }//else{
    }//private void test(String testCase, boolean solution){
}//class VariableNameTest {