/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import org.hamcrest.MatcherAssert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.deepClone;
import static helper_functions.Helpers.getJsonObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class GroupingDishesTest {
    private final static String path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_2_Hash_Tables\\GroupingDishes\\";
    private String[][] internedTestCase = new String[0][];
    private String[][] internedSolution = new String[0][];

    @Test
    public void test1() {
        String[][] testCase = { new String[] { "Salad", "Tomato", "Cucumber", "Salad", "Sauce" }, new String[] { "Pizza", "Tomato", "Sausage", "Sauce", "Dough" }, new String[] { "Quesadilla", "Chicken", "Cheese", "Sauce" }, new String[] { "Sandwich", "Salad", "Bread", "Tomato", "Cheese" } };
        String[][] solution = { new String[] { "Cheese", "Quesadilla", "Sandwich" }, new String[] { "Salad", "Salad", "Sandwich" }, new String[] { "Sauce", "Pizza", "Quesadilla", "Salad" }, new String[] { "Tomato", "Pizza", "Salad", "Sandwich" } };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        String[][] testCase = { new String[] { "Pasta", "Tomato Sauce", "Onions", "Garlic" }, new String[] { "Chicken Curry", "Chicken", "Curry Sauce" }, new String[] { "Fried Rice", "Rice", "Onions", "Nuts" }, new String[] { "Salad", "Spinach", "Nuts" }, new String[] { "Sandwich", "Cheese", "Bread" }, new String[] { "Quesadilla", "Chicken", "Cheese" } };
        String[][] solution = { new String[] { "Cheese", "Quesadilla", "Sandwich" }, new String[] { "Chicken", "Chicken Curry", "Quesadilla" }, new String[] { "Nuts", "Fried Rice", "Salad" }, new String[] { "Onions", "Fried Rice", "Pasta" } };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        String[][] testCase = { new String[] { "Pasta", "Tomato Sauce", "Onions", "Garlic" }, new String[] { "Chicken Curry", "Chicken", "Curry Sauce" }, new String[] { "Fried Rice", "Rice", "Onion", "Nuts" }, new String[] { "Salad", "Spinach", "Nut" }, new String[] { "Sandwich", "Cheese", "Bread" }, new String[] { "Quesadilla", "Chickens", "Cheeseeee" } };
        String[][] solution = { };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        String[][] testCase = { new String[] { "First", "a", "b", "c", "d", "e", "f", "g", "h", "i" }, new String[] { "Second", "i", "h", "g", "f", "e", "x", "c", "b", "a" } };
        String[][] solution = { new String[] { "a", "First", "Second" }, new String[] { "b", "First", "Second" }, new String[] { "c", "First", "Second" }, new String[] { "e", "First", "Second" }, new String[] { "f", "First", "Second" }, new String[] { "g", "First", "Second" }, new String[] { "h", "First", "Second" }, new String[] { "i", "First", "Second" } };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        String[][] testCase = { new String[] { "dSaLKJGbxlxcBBv kMNOmzdojCluYeCb", "zjxwKcRmpQTPSPRUKLfAhkIXxfzniZjsDfaKOJOcVDaxAnCF" }, new String[] { "R GBgXIv", "fPhNHIdOTeKPnqaIPAYXScGrDyGWwlqktYtyOzondayKp", "xJ hfufIWL", "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "WHYOLUzwSHKUuCNry" }, new String[] { "kvHxWutzASOCBHV", "wpzmQKLROsw ", "sxgFkhrwFKB", "reRqP TFlpmiQa GoZTuErWVB", "LA", "BGQgMdEGXutmmE InKtapSHbwZlPHrvPwbSmRWclamnTW", "QgBClPTxsIpAl", "SWbXtEIFeVqoUgtSfXKcVmnwDrijLYsPeXfUauFVbBkbEmGDa" }, new String[] { "Hgpu", "fvORUPNvHmBtpKpbTRbmdXzicYOZotLmfoLmQIqBInPnbCFN", "WHYOLUzwSHKUuCNry" }, new String[] { "gZxWYomyYO", "fvORUPNvHmBtpKpbTRbmdXzicYOZotLmfoLmQIqBInPnbCFN", "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "XxRAIFwrGmaarKfz", "yJffViKwbqCATxHcQFDLgMX", "poEnqRtrANh", "QgBClPTxsIpAl", "dyqdvHDdflvzxVAGRyxWPMBtIDJhv paNyJbWab" }, new String[] { "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL", "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "QgBClPTxsIpAl", "fPhNHIdOTeKPnqaIPAYXScGrDyGWwlqktYtyOzondayKp", "udzzsbLVValZOWpRLhUKumkROw", "dyqdvHDdflvzxVAGRyxWPMBtIDJhv paNyJbWab", "WHYOLUzwSHKUuCNry", "LA", "fvORUPNvHmBtpKpbTRbmdXzicYOZotLmfoLmQIqBInPnbCFN" }, new String[] { "GrWh ROg zHXhYguurdcGjNAv", "dyqdvHDdflvzxVAGRyxWPMBtIDJhv paNyJbWab", "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "AQglifKDgZIivthzfoWRklaKs", "UcIBqQckdEJgLeWMlaRPlqfkhVRXjtZHAYDVRhPsFqPOuEVN", "LA", "MWhqbkFrSTnOuWKexjPewdd AOISBnSCilJ", "QgBClPTxsIpAl" }, new String[] { "dLuvsltPzUjfXkynBCMgxBUTXhVCd", "udzzsbLVValZOWpRLhUKumkROw", "BGQgMdEGXutmmE InKtapSHbwZlPHrvPwbSmRWclamnTW", "BjRRCVKznaySRzyAuNxAbkSYTmcUGlvOND", "wpzmQKLROsw ", "qLKOIfeBowxWwxPJWrWjtVXMkG NXOLxYxvCKoAagSHYRxVgK", "WdfleYASWwVMQKoBINhwpjDbVBEaOOogkKMZ", "AQglifKDgZIivthzfoWRklaKs", "qRUsCllaFzNWuXIMvbOsNtTTAlbR" }, new String[] { "jOubIROdYWOKxwbZTLDueBiln", "fTUBneoUSWxFERZjwPMrAQq", "NPuomEOeOXBiozrNZXlXcKKB", "ibogPWJoEbermlJfuizYaE", "zpNFvjef mpEbEqy rdudPTGpzo n FwxTA" }, new String[] { "BiNYUHMFrRoSICZ", "ufYAxvBidQjinsDCurHyjlzRHrOQ MbIVKGLwAq", "nvHaaRJdHgRIgXXQteAchX MKldBbM", "TdBMoUrYiEcJPlERejkAQdxYMTatLYXX", "qLKOIfeBowxWwxPJWrWjtVXMkG NXOLxYxvCKoAagSHYRxVgK" } };
        String[][] solution = { new String[] { "AQglifKDgZIivthzfoWRklaKs", "GrWh ROg zHXhYguurdcGjNAv", "dLuvsltPzUjfXkynBCMgxBUTXhVCd" }, new String[] { "BGQgMdEGXutmmE InKtapSHbwZlPHrvPwbSmRWclamnTW", "dLuvsltPzUjfXkynBCMgxBUTXhVCd", "kvHxWutzASOCBHV" }, new String[] { "LA", "GrWh ROg zHXhYguurdcGjNAv", "kvHxWutzASOCBHV", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new String[] { "QgBClPTxsIpAl", "GrWh ROg zHXhYguurdcGjNAv", "gZxWYomyYO", "kvHxWutzASOCBHV", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new String[] { "WHYOLUzwSHKUuCNry", "Hgpu", "R GBgXIv", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new String[] { "YduFVZrZEeqVmvACdSTdQd uMswBcadvet", "GrWh ROg zHXhYguurdcGjNAv", "R GBgXIv", "gZxWYomyYO", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new String[] { "dyqdvHDdflvzxVAGRyxWPMBtIDJhv paNyJbWab", "GrWh ROg zHXhYguurdcGjNAv", "gZxWYomyYO", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new String[] { "fPhNHIdOTeKPnqaIPAYXScGrDyGWwlqktYtyOzondayKp", "R GBgXIv", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new String[] { "fvORUPNvHmBtpKpbTRbmdXzicYOZotLmfoLmQIqBInPnbCFN", "Hgpu", "gZxWYomyYO", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new String[] { "qLKOIfeBowxWwxPJWrWjtVXMkG NXOLxYxvCKoAagSHYRxVgK", "BiNYUHMFrRoSICZ", "dLuvsltPzUjfXkynBCMgxBUTXhVCd" }, new String[] { "udzzsbLVValZOWpRLhUKumkROw", "dLuvsltPzUjfXkynBCMgxBUTXhVCd", "rMSYkYkFKlcdBTrUpCTdFgEIdgdTOcEucJdPqiLUWUZNjcoL" }, new String[] { "wpzmQKLROsw ", "dLuvsltPzUjfXkynBCMgxBUTXhVCd", "kvHxWutzASOCBHV" } };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        setTestCaseInfo("test-6.json");
        test(internedTestCase, internedSolution);
    }//public void test6() {

    @Test
    public void test7() {
        setTestCaseInfo("test-7.json");
        test(internedTestCase, internedSolution);
    }//public void test7() {

    @Test
    public void test8() {
        setTestCaseInfo("test-8.json");
        test(internedTestCase, internedSolution);
    }//public void test8() {

    private void test(String[][] testCase, String[][] solution){
        MatcherAssert.assertThat(new GroupingDishes().groupingDishes(deepClone(testCase)),is(solution));
        assertTimeout(Duration.ofSeconds(3),()-> new GroupingDishes().groupingDishes(testCase));
    }//void private test(String[][] testCase, String[][] solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("dishes");
            internedTestCase = new String[preInternedTestCase.size()][];
            for(int x=0;x< internedTestCase.length;x++){
                internedTestCase[x] = new String[((JSONArray)preInternedTestCase.get(x)).size()];
                for(int y=0;y<internedTestCase[x].length;y++){
                    internedTestCase[x][y]=(String)((JSONArray)preInternedTestCase.get(x)).get(y);
                }//for(int y=0;y<internedTestCase[x].length;y++){
            }//for(int x=0;x< internedTestCase.length;x++){
            var preInternedSolution = (JSONArray) testInfo.get("output");
            internedSolution = new String[preInternedSolution.size()][];
            for(int x=0;x<internedSolution.length;x++){
                internedSolution[x]= new String[((JSONArray)preInternedSolution.get(x)).size()];
                for(int y=0;y<internedSolution[x].length;y++){
                    internedSolution[x][y]=(String)((JSONArray)preInternedSolution.get(x)).get(y);
                }//for(int y=0;y<internedSolution[x].length;x++){
            }//for(int x=0;x<internedSolution.length;x++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class GroupingDishesTest {