/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._02_smooth_sailing;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

class IsLuckyTest {

    @Test
    public void test1() {
        var testCase = 1230;
        test(testCase, true);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 239017;
        test(testCase, false);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 134008;
        test(testCase, true);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 10;
        test(testCase, false);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 11;
        test(testCase, true);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 1010;
        test(testCase, true);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 261534;
        test(testCase, false);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 100000;
        test(testCase, false);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 999999;
        test(testCase, true);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 123321;
        test(testCase, true);
    }//public void test10() {

    @Test
    public void test11() {
        var testCase = 700340;
        test(testCase, true);
    }//public void test11() {

    @Test
    public void test12() {
        var testCase = 312412;
        test(testCase, false);
    }//public void test12() {

    @Test
    public void test13() {
        var testCase = 718321;
        test(testCase, false);
    }//public void test13() {

    @Test
    public void test14() {
        var testCase = 132222;
        test(testCase, true);
    }//public void test14() {

    @Test
    public void test15() {
        var testCase = 42;
        test(testCase, false);
    }//public void test15() {

    @Test
    public void test16() {
        var testCase = 6758;
        test(testCase, true);
    }//public void test16() {

    @Test
    public void test17() {
        var testCase = 66;
        test(testCase, true);
    }//public void test17() {

    @Test
    public void test18() {
        var testCase = 134007;
        test(testCase, false);
    }//public void test18() {

    @Test
    public void test19() {
        var testCase = 12;
        test(testCase, false);
    }//public void test19() {

    @Test
    public void test20() {
        var testCase = 111300;
        test(testCase, true);
    }//public void test20() {

    private void test(int testCase, boolean solution){
        assertTimeout(Duration.ofSeconds(3),()->new IsLucky().isLucky(testCase));
        if(solution) {
            assertTrue(new IsLucky().isLucky(testCase));
        }else {//if(solution){
            assertFalse(new IsLucky().isLucky(testCase));
        }//else{
    }//private void test(int testCase, boolean solution){
}//class IsLuckyTest {