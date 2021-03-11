/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._03_loop_tunnel;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoundersTest {

    @Test
    void test1() {
        int testCase = 15;
        int solution = 20;
        test(testCase, solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase = 1234;
        int solution = 1000;
        test(testCase, solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase = 1445;
        int solution = 2000;
        test(testCase, solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase = 14;
        int solution = 10;
        test(testCase, solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase = 10;
        int solution = 10;
        test(testCase, solution);
    }//void test5() {

    @Test
    void test6() {
        int testCase = 7001;
        int solution = 7000;
        test(testCase, solution);
    }//void test6() {

    @Test
    void test7() {
        int testCase = 99;
        int solution = 100;
        test(testCase, solution);
    }//void test7() {

    @Test
    void CustomTest() {
        int testCase = 0;
        int solution = 0;
        for(int i=0;i<10;i++) {
            test(99999999, 100000000);
        }
    }//void test7() {

    private void test(int testCase, int solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new Rounders().rounders(testCase));
        assertEquals(solution, new Rounders().rounders(testCase));
    }//private void test(){
}//class RoundersTest {