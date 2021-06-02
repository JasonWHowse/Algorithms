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

class RemoveArrayPartTest {
    private final static String path = "Test_Cases\\_1_the_core\\_04_list_forest_edge\\RemoveArrayPart\\";
    private int[] internedTestCase1 = new int[0];
    private int internedTestCase2 = 0;
    private int internedTestCase3 = 0;
    private int[] internedSolution = new int[0];

    @Test
    public void test1() {
        int[] testCase1 = {2, 3, 2, 3, 4, 5};
        int testCase2 = 2;
        int testCase3 = 4;
        int[] solution = {2, 3, 5};
        test(testCase1, testCase2, testCase3, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase1 = {2, 4, 10, 1};
        int testCase2 = 0;
        int testCase3 = 2;
        int[] solution = {1};
        test(testCase1, testCase2, testCase3, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase1 = {5, 3, 2, 3, 4};
        int testCase2 = 1;
        int testCase3 = 1;
        int[] solution = {5, 2, 3, 4};
        test(testCase1, testCase2, testCase3, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase1 = {1, 1};
        int testCase2 = 0;
        int testCase3 = 1;
        int[] solution = {};
        test(testCase1, testCase2, testCase3, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase1 = {0, -2, 5, 6};
        int testCase2 = 3;
        int testCase3 = 3;
        int[] solution = {0, -2, 5};
        test(testCase1, testCase2, testCase3, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase1 = {4, 3, 2, 1, 3, 4, 5};
        int testCase2 = 1;
        int testCase3 = 3;
        int[] solution = {4, 3, 4, 5};
        test(testCase1, testCase2, testCase3, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase1 = {24, -40, -30, 30, 80, -94, 18, -56, -31, -68, -94, 67, -28, -2, -10, -83, -41, 43, -27, 0, -39, -83, -76, -59, -32, 87, -31, -55, -35, 20, 67, -78, -32, -90, 72, 15, -59, 4, 69, -82, 2, 96, -99, -78, 93, -68, -39, 68, 49, -9, -49, 77, 81, -55, -16, -9, -11, 80, 29, -6, 90, 83, 16, 68, -62, -73, -5, -86, 0, -48, 88, -35, 87, 12, 92, 12, 46, 57, 71, 91, -55, -62, -24, -78, -40, 30, -97, 64, -9, 40, 93, -67, -26, 53, -81, -7, -16, 14, -70, 88};
        int testCase2 = 19;
        int testCase3 = 98;
        int[] solution = {24, -40, -30, 30, 80, -94, 18, -56, -31, -68, -94, 67, -28, -2, -10, -83, -41, 43, -27, 88};
        test(testCase1, testCase2, testCase3, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase1 = {66, -94, -83, -39, -27, 50, 58, 58, -68, -85, 55, -21, 83, -89, 52, -80, 17, -89, -56, 90, 75, 23, -74, -91, 93, -36, 90, 97, 52, 8, 0, -88, -5, -34, 55, 88, 96, -29, 30, -51, -69, 57, 85, -86, -47, 85, 77, 62, 55, 11, -4, 85, 32, 96, 69, 80, 78, -79, 70, 79, 77, 98, 85, 94, -34, 21, 5, 19, 85, 54, 50, 6, 31, -100, 74, -32, 35, 38, 59, 43, 89, 89, -60, 36, 46, 78, 43, 53, 84, -76, -24, -53, -5, 91, 100, 65, 23, 87, 20, 5};
        int testCase2 = 0;
        int testCase3 = 99;
        int[] solution = {};
        test(testCase1, testCase2, testCase3, solution);
    }//public void test8() {

    @Test
    public void test9() {
        setTestCaseInfo("test-9.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test9() {

    @Test
    public void test10() {
        setTestCaseInfo("test-10.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test10() {

    @Test
    public void test11() {
        setTestCaseInfo("test-11.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test11() {

    @Test
    public void test12() {
        setTestCaseInfo("test-12.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test12() {

    @Test
    public void test13() {
        setTestCaseInfo("test-13.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test13() {

    @Test
    public void test14() {
        setTestCaseInfo("test-14.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test14() {

    @Test
    public void test15() {
        setTestCaseInfo("test-15.json");
        test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
    }//public void test15() {

    private void test(int[] testCase1, int testCase2, int testCase3,int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new RemoveArrayPart().removeArrayPart(testCase1.clone(),testCase2,testCase3));
        MatcherAssert.assertThat(new RemoveArrayPart().removeArrayPart(testCase1.clone(),testCase2,testCase3), is(solution));
    }//private void test(int[] testCase1, int testCase2, int testCase3,int[] solution) {

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase1 = (JSONArray) ((JSONObject) testInfo.get("input")).get("inputArray");
            internedTestCase1 = new int[preInternedTestCase1.size()];
            for(int i=0;i< internedTestCase1.length;i++){
                internedTestCase1[i] = ((Long) preInternedTestCase1.get(i)).intValue();
            }//for(int i=0;i< internedTestCase1.length;i++){
            internedTestCase2 = ((Long) ((JSONObject) testInfo.get("input")).get("l")).intValue();
            internedTestCase3 = ((Long) ((JSONObject) testInfo.get("input")).get("r")).intValue();
            var preInternedSolution = (JSONArray) testInfo.get("output");
            internedSolution = new int[preInternedSolution.size()];
            for(int i=0;i<internedSolution.length;i++){
                internedSolution[i]=((Long) preInternedSolution.get(i)).intValue();
            }//for(int i=0;i<internedSolution.length;i++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class RemoveArrayPartTest {