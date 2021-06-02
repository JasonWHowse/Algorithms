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

class CreateArrayTest {
    private final static String path = "Test_Cases\\_1_the_core\\_04_list_forest_edge\\CreateArray\\";
    private int internedTestCase = 0;
    private int[] internedSolution = new int[0];

    @Test
    public void test1() {
        var testCase = 4;
        int[] solution = { 1, 1, 1, 1 };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        var testCase = 2;
        int[] solution = { 1, 1 };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        var testCase = 1;
        int[] solution = { 1 };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        var testCase = 5;
        int[] solution = { 1, 1, 1, 1, 1 };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        var testCase = 49;
        int[] solution = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        var testCase = 91;
        int[] solution = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        setTestCaseInfo("test-7.json");
        test(internedTestCase,internedSolution);
    }//public void test7() {

    @Test
    public void test8() {
        setTestCaseInfo("test-8.json");
        test(internedTestCase,internedSolution);
    }//public void test8() {

    @Test
    public void test9() {
        setTestCaseInfo("test-9.json");
        test(internedTestCase,internedSolution);
    }//public void test9() {

    @Test
    public void test10() {
        setTestCaseInfo("test-10.json");
        test(internedTestCase,internedSolution);
    }//public void test10() {

    private void test(int testCase,int[] solution) {
        assertTimeout(Duration.ofSeconds(3), () -> new CreateArray().createArray(testCase));
        MatcherAssert.assertThat(new CreateArray().createArray(testCase), is(solution));
    }//private void test(int testCase,int[] solution) {

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            internedTestCase = ((Long) ((JSONObject) testInfo.get("input")).get("size")).intValue();
            var preInternedSolution = (JSONArray) testInfo.get("output");
            internedSolution = new int[preInternedSolution.size()];
            for(int i=0; i<internedSolution.length;i++){
                internedSolution[i]=((Long)preInternedSolution.get(i)).intValue();
            }//for(int i=0; i<internedSolution.length;i++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class CreateArrayTest {