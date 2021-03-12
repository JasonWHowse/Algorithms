/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import java.time.Duration;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

class CreateArrayTest {

    @Test
    void test1() {
        int testCase = 4;
        int[] solution = {1, 1, 1, 1};
        test(testCase,solution);
    }//void test1() {

    @Test
    void test2() {
        int testCase = 2;
        int[] solution = {1, 1};
        test(testCase,solution);
    }//void test2() {

    @Test
    void test3() {
        int testCase = 1;
        int[] solution = {1};
        test(testCase,solution);
    }//void test3() {

    @Test
    void test4() {
        int testCase = 5;
        int[] solution = {1, 1, 1, 1, 1};
        test(testCase,solution);
    }//void test4() {

    @Test
    void test5() {
        int testCase = 49;
        int[] solution = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        test(testCase,solution);
    }//void test5() {

    private void test(int testCase,int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () ->
                new CreateArray().createArray(testCase));
        MatcherAssert.assertThat(new CreateArray().createArray(testCase), is(solution));
    }//private void test(){
}//class CreateArrayTest {