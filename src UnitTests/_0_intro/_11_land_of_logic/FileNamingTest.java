/*
 * Authored by: Jason Wesley Howse
 */

package _0_intro._11_land_of_logic;

import org.hamcrest.MatcherAssert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;

class FileNamingTest {
    private final static String path = "Test_Cases\\_0_intro\\_11_land_of_logic\\FileNaming\\";
    private String[] internedTestCase = new String[0];
    private String[] internedSolution = new String[0];

    @Test
    public void test1() {
        String[] testCase = { "doc", "doc", "image", "doc(1)", "doc" };
        String[] solution = { "doc", "doc(1)", "image", "doc(1)(1)", "doc(2)" };
        test(testCase, solution);
    }//public void test1() {

    @Test
    public void test2() {
        String[] testCase = { "a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a" };
        String[] solution = { "a(1)", "a(6)", "a", "a(2)", "a(3)", "a(4)", "a(5)", "a(7)", "a(8)", "a(9)", "a(10)", "a(11)" };
        test(testCase, solution);
    }//public void test2() {

    @Test
    public void test3() {
        String[] testCase = { "dd", "dd(1)", "dd(2)", "dd", "dd(1)", "dd(1)(2)", "dd(1)(1)", "dd", "dd(1)" };
        String[] solution = { "dd", "dd(1)", "dd(2)", "dd(3)", "dd(1)(1)", "dd(1)(2)", "dd(1)(1)(1)", "dd(4)", "dd(1)(3)" };
        test(testCase, solution);
    }//public void test3() {

    @Test
    public void test4() {
        String[] testCase = { "a", "b", "cd", "b ", "a(3)" };
        String[] solution = { "a", "b", "cd", "b ", "a(3)" };
        test(testCase, solution);
    }//public void test4() {

    @Test
    public void test5() {
        String[] testCase = { "name", "name", "name(1)", "name(3)", "name(2)", "name(2)" };
        String[] solution = { "name", "name(1)", "name(1)(1)", "name(3)", "name(2)", "name(2)(1)" };
        test(testCase, solution);
    }//public void test5() {

    @Test
    public void test6() {
        String[] testCase = { };
        String[] solution = { };
        test(testCase, solution);
    }//public void test6() {

    @Test
    public void test7() {
        String[] testCase = { "name", "name(1)", "name(2)", "name(3)", "name(1)", "name", "name(1)", "name(1)(1)", "name2", "name", "name(1)(1)(1)" };
        String[] solution = { "name", "name(1)", "name(2)", "name(3)", "name(1)(1)", "name(4)", "name(1)(2)", "name(1)(1)(1)", "name2", "name(5)", "name(1)(1)(1)(1)" };
        test(testCase, solution);
    }//public void test7() {

    @Test
    public void test8() {
        String[] testCase = { "z" };
        String[] solution = { "z" };
        test(testCase, solution);
    }//public void test8() {

    @Test
    public void test9() {
        String[] testCase = { "zsyrhi", "xwzt", "hvyvrqzwej", "ih", "posnokiu", "yudgxcdjc", "psifzbhleolhwgx", "zsyrhi", "bxmi", "rltsewugdmijdf", "hvyvrqzwej", "ih", "ih", "vaasngiaag", "vaasngiaag", "yn", "bxmi", "yn", "dmxfsttgxr", "rxr", "rxr", "uazud", "uazud", "rxr", "hvyvrqzwej", "yn", "posnokiu", "hvyvrqzwej", "dmxfsttgxr", "uazud", "vpuubto", "zsyrhi", "ih", "yudgxcdjc", "ih", "hvyvrqzwej", "rltsewugdmijdf", "uazud", "yudgxcdjc", "yn", "yn", "ih", "psifzbhleolhwgx", "posnokiu", "psifzbhleolhwgx", "yudgxcdjc", "bxmi", "vaasngiaag", "ih", "vaasngiaag", "hvyvrqzwej", "posnokiu", "vaasngiaag", "rltsewugdmijdf", "vaasngiaag", "dmxfsttgxr", "yn", "yn", "psifzbhleolhwgx", "xwzt", "xwzt", "vpuubto", "xwzt", "rltsewugdmijdf", "vpuubto", "uazud", "xwzt", "rxr", "vpuubto", "psifzbhleolhwgx", "posnokiu", "uazud", "hvyvrqzwej", "ih", "yn", "rxr", "posnokiu", "bxmi", "xwzt", "rxr", "yudgxcdjc", "psifzbhleolhwgx", "posnokiu", "vaasngiaag", "dmxfsttgxr", "vaasngiaag", "rltsewugdmijdf", "uazud", "vpuubto", "rxr", "hvyvrqzwej", "bxmi", "rltsewugdmijdf", "zsyrhi", "rxr", "zsyrhi", "psifzbhleolhwgx", "yn", "rltsewugdmijdf", "ih" };
        String[] solution = { "zsyrhi", "xwzt", "hvyvrqzwej", "ih", "posnokiu", "yudgxcdjc", "psifzbhleolhwgx", "zsyrhi(1)", "bxmi", "rltsewugdmijdf", "hvyvrqzwej(1)", "ih(1)", "ih(2)", "vaasngiaag", "vaasngiaag(1)", "yn", "bxmi(1)", "yn(1)", "dmxfsttgxr", "rxr", "rxr(1)", "uazud", "uazud(1)", "rxr(2)", "hvyvrqzwej(2)", "yn(2)", "posnokiu(1)", "hvyvrqzwej(3)", "dmxfsttgxr(1)", "uazud(2)", "vpuubto", "zsyrhi(2)", "ih(3)", "yudgxcdjc(1)", "ih(4)", "hvyvrqzwej(4)", "rltsewugdmijdf(1)", "uazud(3)", "yudgxcdjc(2)", "yn(3)", "yn(4)", "ih(5)", "psifzbhleolhwgx(1)", "posnokiu(2)", "psifzbhleolhwgx(2)", "yudgxcdjc(3)", "bxmi(2)", "vaasngiaag(2)", "ih(6)", "vaasngiaag(3)", "hvyvrqzwej(5)", "posnokiu(3)", "vaasngiaag(4)", "rltsewugdmijdf(2)", "vaasngiaag(5)", "dmxfsttgxr(2)", "yn(5)", "yn(6)", "psifzbhleolhwgx(3)", "xwzt(1)", "xwzt(2)", "vpuubto(1)", "xwzt(3)", "rltsewugdmijdf(3)", "vpuubto(2)", "uazud(4)", "xwzt(4)", "rxr(3)", "vpuubto(3)", "psifzbhleolhwgx(4)", "posnokiu(4)", "uazud(5)", "hvyvrqzwej(6)", "ih(7)", "yn(7)", "rxr(4)", "posnokiu(5)", "bxmi(3)", "xwzt(5)", "rxr(5)", "yudgxcdjc(4)", "psifzbhleolhwgx(5)", "posnokiu(6)", "vaasngiaag(6)", "dmxfsttgxr(3)", "vaasngiaag(7)", "rltsewugdmijdf(4)", "uazud(6)", "vpuubto(4)", "rxr(6)", "hvyvrqzwej(7)", "bxmi(4)", "rltsewugdmijdf(5)", "zsyrhi(3)", "rxr(7)", "zsyrhi(4)", "psifzbhleolhwgx(6)", "yn(8)", "rltsewugdmijdf(6)", "ih(8)" };
        test(testCase, solution);
    }//public void test9() {

    @Test
    public void test10() {
        setTestCaseInfo("test-10.json");
        test(internedTestCase, internedSolution);
    }//public void test10() {

    @Test
    public void test11() {
        setTestCaseInfo("test-11.json");
        test(internedTestCase, internedSolution);
    }//public void test11() {

    @Test
    public void test12() {
        setTestCaseInfo("test-12.json");
        test(internedTestCase, internedSolution);
    }//public void test12() {
    
    private void test(String[] testCase, String[] solution){
        assertTimeout(Duration.ofSeconds(3),()-> new FileNaming().fileNaming(testCase.clone()));
        MatcherAssert.assertThat(new FileNaming().fileNaming(testCase),is(solution));
    }//private void test(String[] testCase, String[] solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase = (JSONArray) ((JSONObject) testInfo.get("input")).get("names");
            internedTestCase = new String[preInternedTestCase.size()];
            for(int i=0;i< internedTestCase.length;i++){
                internedTestCase[i] = (String) preInternedTestCase.get(i);
            }//for(int i=0;i< internedTestCase.length;i++){
            var preInternedSolution = (JSONArray) testInfo.get("output");
            internedSolution = new String[preInternedSolution.size()];
            for(int i=0;i<internedSolution.length;i++){
                internedSolution[i]=(String) preInternedSolution.get(i);
            }//for(int i=0;i<internedSolution.length;i++){
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class FileNamingTest {