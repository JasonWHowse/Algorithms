/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._01_at_the_crossroads;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class MetroCardTest {

    @Test
    public void test1() {
        var testCase = 30;
        int[] solution = { 31 };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 31;
        int[] solution = { 28, 30, 31 };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 28;
        int[] solution = { 31 };
        test(testCase, solution);
    }//public void test3() {

    private void test(int testCase, int[] solution){
        assertTimeout(Duration.ofSeconds(3),()-> new MetroCard().metroCard(testCase));
        MatcherAssert.assertThat(new MetroCard().metroCard(testCase),is(solution));
    }//private void test(int testCase, int[] solution){
}//class MetroCardTest {