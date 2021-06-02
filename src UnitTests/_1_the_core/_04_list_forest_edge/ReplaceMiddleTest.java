/*
 * Authored by: Jason Wesley Howse
 */

package _1_the_core._04_list_forest_edge;

import org.hamcrest.MatcherAssert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;

class ReplaceMiddleTest {
    private final static String path = "Test_Cases\\_1_the_core\\_04_list_forest_edge\\ReplaceMiddle\\";
    private int[] internedTestCase = new int[0];
    private int[] internedSolution = new int[0];

    @Test
    public void test1() {
        int[] testCase =  {7, 2, 2, 5, 10, 7};
        int[] solution =  {7, 2, 7, 10, 7};
        test(testCase,solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase =  {-5, -5, 10};
        int[] solution =  {-5, -5, 10};
        test(testCase,solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase =  {45, 23, 12, 33, 12, 453, -234, -45};
        int[] solution =  {45, 23, 12, 45, 453, -234, -45};
        test(testCase,solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase =  {2, 8};
        int[] solution =  {10};
        test(testCase,solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase =  {-12, 34, 40, -5, -12, 4, 0, 0, -12};
        int[] solution =  {-12, 34, 40, -5, -12, 4, 0, 0, -12};
        test(testCase,solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase =  {9, 0, 15, 9};
        int[] solution =  {9, 15, 9};
        test(testCase,solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase =  {-6, 6, -6};
        int[] solution =  {-6, 6, -6};
        test(testCase,solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase =  {26, 26, -17};
        int[] solution =  {26, 26, -17};
        test(testCase,solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase =  {-7, 5, 5, 10};
        int[] solution =  {-7, 10, 10};
        test(testCase,solution);
    }//public void test9() {

    @Test
    public void test10() {
        int[] testCase = { 5, 5, 10 };
        int[] solution = { 5, 5, 10 };
        test(testCase, solution);
    }//public void test10() {

    @Test
    public void test11() {
        int[] testCase = { 222, 23, 12, 210, 12, 453, -234, -222 };
        int[] solution = { 222, 23, 12, 222, 453, -234, -222 };
        test(testCase, solution);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase = { 0, 0, 1, 0 };
        int[] solution = { 0, 1, 0 };
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        int[] testCase = { -200, 50, 200, 50, -200 };
        int[] solution = { -200, 50, 200, 50, -200 };
        test(testCase, solution);
    }//public void test13() {

    @Test
    public void test14() {
        int[] testCase = { 55, 55, 54 };
        int[] solution = { 55, 55, 54 };
        test(testCase, solution);
    }//public void test14() {

    @Test
    public void test15() {
        int[] testCase = { 435, 23, 12, 435, -23, 0, 435 };
        int[] solution = { 435, 23, 12, 435, -23, 0, 435 };
        test(testCase, solution);
    }//public void test15() {

    @Test
    public void test16() {
        int[] testCase = { 17, -6, 23, 17 };
        int[] solution = { 17, 17, 17 };
        test(testCase, solution);
    }//public void test16() {

    @Test
    public void test17() {
        setTestCaseInfo("test-17.json");
        test(internedTestCase, internedSolution);
    }//public void test17() {

    @Test
    public void test18() {
        int[] testCase = { 39, -23 };
        int[] solution = { 16 };
        test(testCase, solution);
    }//public void test18() {

    private void test(int[] testCase,int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new ReplaceMiddle().replaceMiddle(testCase.clone()));
        MatcherAssert.assertThat(new ReplaceMiddle().replaceMiddle(testCase.clone()), is(solution));
    }//private void test(int[] testCase,int[] solution) {

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("arr");
            internedTestCase = new int[preInternedTestCase.size()];
            for(int i=0;i< internedTestCase.length;i++){
                internedTestCase[i] = ((Long) preInternedTestCase.get(i)).intValue();
            }//for(int i=0;i< internedTestCase.length;i++){
            var preInternedSolution = (JSONArray)testInfo.get("output");
            internedSolution = new int[preInternedSolution.size()];
            for(int i=0;i<internedSolution.length;i++){
                internedSolution[i] = ((Long) preInternedSolution.get(i)).intValue();
            }//for(int i=0;i<internedSolution.length;i++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class ReplaceMiddleTest {