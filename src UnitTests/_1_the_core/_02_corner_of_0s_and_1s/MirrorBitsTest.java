/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._02_corner_of_0s_and_1s;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MirrorBitsTest {

    @Test
    public void test1() {
        var testCase = 97;
        var solution = 67;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 8;
        var solution = 1;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 123;
        var solution = 111;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 86782;
        var solution = 65173;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 5;
        var solution = 5;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 100000;
        var solution = 2755;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        var testCase = 59940;
        var solution = 9303;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        var testCase = 65535;
        var solution = 65535;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        var testCase = 53629;
        var solution = 48779;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        var testCase = 48779;
        var solution = 53629;
        test(testCase, solution);
    }//public void test10() {

    private void test(int testCase,int solution){
        assertTimeout(Duration.ofSeconds(3),()-> new MirrorBits().mirrorBits(testCase));
        assertEquals(solution,new MirrorBits().mirrorBits(testCase));
    }//private void test(int testCase,int solution){
}//class MirrorBitsTest {