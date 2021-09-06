/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._07_mirror_lake;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumbersGroupingTest {

    @Test
    public void test1() {
        int[] testCase = new int[]{20000, 239, 10001, 999999, 10000, 20566, 29999};
        var solution = 11;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = new int[]{10000, 20000, 30000, 40000, 50000, 60000, 10000, 120000, 150000, 200000, 300000, 1000000, 10000000, 100000000, 10000000};
        var solution = 28;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = new int[]{10000};
        var solution = 2;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = new int[]{10000, 1};
        var solution = 3;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = new int[]{685400881, 696804468, 696804942, 803902442, 976412678, 976414920, 47763597, 803900633, 233144924, 47764349, 233149077, 214990733, 214994039, 280528089, 280524347, 685401797};
        var solution = 24;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = new int[]{598589004, 92986320, 520103781, 808743817, 635098665, 95244159, 808747008, 867017063, 635092226, 867013865, 92989995, 520100093, 95245838, 84897101, 598583113, 84893918};
        var solution = 24;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = new int[]{1000000000, 999990000, 999980000, 999970000, 999960000, 999950000, 999940000, 999930000, 999920000, 999910000};
        var solution = 20;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = new int[]{102382103, 21039898, 39823, 433, 30928398, 40283209, 23234, 342534, 98473483, 498398424, 9384984, 9839239};
        var solution = 24;
        test(testCase, solution);
    }//public void test8() {

    private void test(int[] testCase, int solution) {
        assertEquals(solution, new NumbersGrouping().numbersGrouping(testCase.clone()));
        assertTimeout(Duration.ofSeconds(3), () -> new NumbersGrouping().numbersGrouping(testCase));
    }//private void test(int[] testCase, int solution) {
}//class NumbersGroupingTest {