/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class ValidTimeTest {

    @Test
    public void test1() {
        var testCase = "13:58";
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = "25:51";
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = "02:76";
        test(testCase, false);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = "24:00";
        test(testCase, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = "02:61";
        test(testCase, false);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = "27:00";
        test(testCase, false);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = "19:66";
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = "12:31";
        test(testCase, true);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = "25:73";
        test(testCase, false);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = "09:56";
        test(testCase, true);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = "03:29";
        test(testCase, true);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = "20:65";
        test(testCase, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = "15:48";
        test(testCase, true);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = "04:38";
        test(testCase, true);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = "25:79";
        test(testCase, false);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = "10:04";
        test(testCase, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = "14:66";
        test(testCase, false);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = "23:59";
        test(testCase, true);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = "00:60";
        test(testCase, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = "24:01";
        test(testCase, false);
    }//public void test20() {

    @Test
    public void test21() {
        var testCase = "99:99";
        test(testCase, false);
    }//public void test21() {

    @Test
    public void test22() {
        var testCase = "00:01";
        test(testCase, true);
    }//public void test22() {

    private void test(String testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()-> new ValidTime().validTime(testCase));
        if(solution) {
            assertTrue(new ValidTime().validTime(testCase));
        }else {//if(solution){
            assertFalse(new ValidTime().validTime(testCase));
        }//else{
    }//private void test(String testCase, boolean solution){
}//class ValidTimeTest {