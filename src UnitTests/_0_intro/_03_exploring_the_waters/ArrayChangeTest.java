/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._03_exploring_the_waters;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class ArrayChangeTest {
    private final static String path = "Test_Cases\\_0_intro\\_03_exploring_the_waters\\ArrayChange\\";
    private int[] internedTestCase = new int[0];
    private int internedSolution = 0;

    @Test
    public void test1() {
        int[] testCase = { 1, 1, 1 };
        var solution = 3;
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        int[] testCase = { -1000, 0, -2, 0 };
        var solution = 5;
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        int[] testCase = { 2, 1, 10, 1 };
        var solution = 12;
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        int[] testCase = { 2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15 };
        var solution = 13;
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        int[] testCase = { 3122, -645, 2616, 13213, -8069 };
        var solution = 25559;
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        int[] testCase = { -787, -773, -93, 867, -28, 118, 372, 255, 355, 598, -179, -752, 794, 961, -84, 296, -714, 14, 666, -265, -905, 942, -691, -379, -698, -650, 637, 523, 709, -674, 574, -239, 805, -434, 597, -677, 664, 384, 726, -389, -387, 772, -603, 685, 249, 446, -631, 454, 983, 867, -158, 932, -440, 891, -12, 400, -916, 503, 185, -802, -255, 207, -952, -506, -689, 425, 747, -907, -30, 102, 553, 981, -664, 75, -957, -42, 99, -750, -277, 686, -884, -972, 470, 32, 439, 163, 887, 895, -555, -654, 793, 333, 143, 73, 181, -512, -915, -68, 542, 799 };
        var solution = 89510;
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        int[] testCase = { -28943, -29728, -24726, -15090, -2555, -9551, -11025, 36442, -23240, -46093, 48516, 44580, -21573, 39172, -38017, -19354, -13460, 38212, -35646, -22288, 36832, -33115, 39055, -15935, -19300, -10419, -18548, 21742, -32032, 27988, -45323, 27454, -5683, -14209, -4168, 51188, 45552, 9899, 49241, -25939, -8344, -25788, 6808, 6931, 6145, -30802, -518, -42362 };
        var solution = 2020705;
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        int[] testCase = { 9796, 1283, -2825, 3870, -6727, -8616, -10191, -7727, 7074, 1580, -4583, 162, 2980, -3861, 9452, 8145, 1222, -1125, 5142, -5657, -974, -986, -9627, 5244, 8866, 3336, -9946, -5271, 10582, 3013, 8030, 4471, -3420, 9496, -3533, -8030, 10007, 2549, -8195, 7119, 302, -5322, -3537, 209, -8134, -9176, 6336, -1771, 9851, 3644, 9629, -2603, 3988, 10579, 2221, 1101, 1465, 5002, -6203, -8864, 596, 6005, 4554, 8526, 2178, -5447, -232, -9734, 7402, -3984, -7161, -2139, -3181, 10445, 4535, 6926, 7156 };
        var solution = 737073;
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        int[] testCase = { -24875, -6401, 58256, 44456, 2244, -25333, -42389, -5975, 7650, -46343, -62011, -55366, 7802, -37699, 15461, 13309, -58664, 54557, 56324, -34397, -33024, -21934, -18861, -23196, 56542, -63986, 59833, -45610, -16948, 399, -7405, 54701, -57348, -32627, 65534, 615 };
        var solution = 2199614;
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        setTestCaseInfo("test-10.json");
        test(internedTestCase,internedSolution);
    }//public void test10() {

    @Test
    public void test11() {
        setTestCaseInfo("test-11.json");
        test(internedTestCase,internedSolution);
    }//public void test11() {

    @Test
    public void test12() {
        int[] testCase = { 20710, -4566, 28514, -27877, 10082, -22496, -22994, 5089, 11296, -24822, -16624, -17015, 12477, 29805, 31185, 16492, 564, -413, -28417, 1992, -28897, 31399, 19780, 9900, -17980 };
        var solution = 711669;
        test(testCase, solution);
    }//public void test12() {

    @Test
    public void test13() {
        setTestCaseInfo("test-13.json");
        test(internedTestCase,internedSolution);
    }//public void test13() {

    @Test
    public void test14() {
        setTestCaseInfo("test-14.json");
        test(internedTestCase,internedSolution);
    }//public void test14() {

    @Test
    public void test15() {
        setTestCaseInfo("test-15.json");
        test(internedTestCase,internedSolution);
    }//public void test15() {

    @Test
    public void test16() {
        setTestCaseInfo("test-16.json");
        test(internedTestCase,internedSolution);
    }//public void test16() {

    @Test
    public void test17() {
        int[] testCase = { 1976, 4676, 4653, 1782, 180, -4162, -5308, 968, -2405, 4100, 4435, 1326, 3731, -4483, 1419, 1311, 4747, 5211, -312, 5322, -5724, -994, 5914, -4059, -1169, -5361, -1519, -2298, 5118, -283, -2905 };
        var solution = 140735;
        test(testCase, solution);
    }//public void test17() {

    @Test
    public void test18() {
        setTestCaseInfo("test-18.json");
        test(internedTestCase,internedSolution);
    }//public void test18() {

    @Test
    public void test19() {
        setTestCaseInfo("test-19.json");
        test(internedTestCase,internedSolution);
    }//public void test19() {

    @Test
    public void test20() {
        setTestCaseInfo("test-20.json");
        test(internedTestCase,internedSolution);
    }//public void test20() {
    
    private void test(int[] testCase, int solution){
        assertTimeout(Duration.ofSeconds(3),()->new ArrayChange().arrayChange(testCase.clone()));
        assertEquals(new ArrayChange().arrayChange(testCase),solution);
    }//private void test(int[] testCase, int solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("inputArray");
            internedTestCase = new int[preInternedTestCase.size()];
            for(int i=0;i< internedTestCase.length;i++){
                internedTestCase[i] = ((Long) preInternedTestCase.get(i)).intValue();
            }//for(int i=0;i< internedTestCase.length;i++){
            internedSolution = ((Long) testInfo.get("output")).intValue();
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class ArrayChangeTest {