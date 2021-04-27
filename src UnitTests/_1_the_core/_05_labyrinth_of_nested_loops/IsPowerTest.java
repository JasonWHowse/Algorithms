/*
 * Authored by: Jason Wesley Howse
 */

/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._05_labyrinth_of_nested_loops;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPowerTest {

    @Test
    void test1() {
        int testCase = 125;
        test(testCase,true);
    }//void test1() {

    @Test
    void test2() {
        int testCase = 72;
        test(testCase,false);
    }//void test2() {

    @Test
    void test3() {
        int testCase = 100;
        test(testCase,true);
    }//void test3() {

    @Test
    void test4() {
        int testCase = 11;
        test(testCase,false);
    }//void test4() {

    @Test
    void test5() {
        int testCase = 324;
        test(testCase,true);
    }//void test5() {

    @Test
    void test6() {
        int testCase = 256;
        test(testCase,true);
    }//void test6() {

    @Test
    void test7() {
        int testCase = 119;
        test(testCase,false);
    }//void test7() {

    @Test
    void test8() {
        int testCase = 400;
        test(testCase,true);
    }//void test8() {

    @Test
    void test9() {
        int testCase = 350;
        test(testCase,false);
    }//void test9() {

    @Test
    void test10() {
        int testCase = 361;
        test(testCase,true);
    }//void test10() {

    private void test(int testCase,boolean solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new IsPower().isPower(testCase));
        if(solution) {
            assertTrue(new IsPower().isPower(testCase));
        }else{
            assertFalse(new IsPower().isPower(testCase));
        }
    }//private void test(){
}//class IsPowerTest {