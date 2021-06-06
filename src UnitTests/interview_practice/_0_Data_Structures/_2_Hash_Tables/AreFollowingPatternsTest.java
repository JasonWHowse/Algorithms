/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._2_Hash_Tables;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import static helper_functions.Helpers.getJsonObject;
import static org.junit.jupiter.api.Assertions.*;

class AreFollowingPatternsTest {
    private final static String path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_2_Hash_Tables\\AreFollowingPatterns\\";
    private String[] internedTestCase1 = new String[0];
    private String[] internedTestCase2 = new String[0];
    private boolean internedSolution = false;

    @Test
    public void test1() {
        String[] testCase1 = { "cat", "dog", "dog" };
        String[] testCase2 = { "a", "b", "b" };
        test(testCase1, testCase2, true);
    }//public void test1() {

    @Test
    public void test2() {
        String[] testCase1 = { "cat", "dog", "doggy" };
        String[] testCase2 = { "a", "b", "b" };
        test(testCase1, testCase2, false);
    }//public void test2() {

    @Test
    public void test3() {
        String[] testCase1 = { "cat", "dog", "dog" };
        String[] testCase2 = { "a", "b", "c" };
        test(testCase1, testCase2, false);
    }//public void test3() {

    @Test
    public void test4() {
        String[] testCase1 = { "aaa" };
        String[] testCase2 = { "aaa" };
        test(testCase1, testCase2, true);
    }//public void test4() {

    @Test
    public void test5() {
        String[] testCase1 = { "a", "b", "a" };
        String[] testCase2 = { "c", "d", "d" };
        test(testCase1, testCase2, false);
    }//public void test5() {

    @Test
    public void test6() {
        String[] testCase1 = { "aaa", "aaa", "aaa" };
        String[] testCase2 = { "aaa", "bbb", "aaa" };
        test(testCase1, testCase2, false);
    }//public void test6() {

    @Test
    public void test7() {
        String[] testCase1 = { "aaa", "aab", "aaa" };
        String[] testCase2 = { "aaa", "aaa", "aaa" };
        test(testCase1, testCase2, false);
    }//public void test7() {

    @Test
    public void test8() {
        String[] testCase1 = { "re", "jjinh", "rnz", "frok", "frok", "hxytef", "hxytef", "frok" };
        String[] testCase2 = { "kzfzmjwe", "fgbugiomo", "ocuijka", "gafdrts", "gafdrts", "ebdva", "ebdva", "gafdrts" };
        test(testCase1, testCase2, true);
    }//public void test8() {

    @Test
    public void test9() {
        String[] testCase1 = { "kwtfpzm", "kwtfpzm", "kwtfpzm", "kwtfpzm", "kwtfpzm", "wfktjrdhu", "anx", "kwtfpzm" };
        String[] testCase2 = { "z", "z", "z", "hhwdphhnc", "zejhegjlha", "xgxpvhprdd", "e", "u" };
        test(testCase1, testCase2, false);
    }//public void test9() {

    @Test
    public void test10() {
        String[] testCase1 = { "ato", "ato", "jflywws", "ato", "ato", "se", "se", "kiolm", "wizdkdqke" };
        String[] testCase2 = { "ofnmiqelt", "ofnmiqelt", "flqmwoje", "ofnmiqelt", "zdohw", "jyk", "ujddjtxt", "s", "kw" };
        test(testCase1, testCase2, false);
    }//public void test10() {

    @Test
    public void test11() {
        String[] testCase1 = { "a", "a", "a", "a", "x", "x", "b", "b", "b", "a", "y", "a", "a", "z", "a", "b", "b", "b", "b", "b", "a" };
        String[] testCase2 = { "c", "c", "c", "c", "x", "x", "d", "d", "d", "c", "y", "c", "c", "z", "c", "d", "d", "d", "d", "d", "d" };
        test(testCase1, testCase2, false);
    }//public void test11() {

    @Test
    public void test12() {
        String[] testCase1 = { "syf", "syf", "oxerkx", "oxerkx", "syf", "xgwatff", "pmnfaw", "t", "ajyvgwd", "xmhb", "ajg", "syf", "syf", "wjddgkopae", "fgrpstxd", "t", "i", "psw", "wjddgkopae", "wjddgkopae", "oxerkx", "zf", "jvdtdxbefr", "rbmphtrmo", "syf", "yssdddhyn", "syf", "jvdtdxbefr", "funnd", "syf", "syf", "wd", "syf", "vnntavj", "wjddgkopae", "yssdddhyn", "wcvk", "wjddgkopae", "fh", "zf", "gpkdcwf", "qkbw", "zf", "teppnr", "jvdtdxbefr", "fmn", "i", "hzmihfrmq", "wjddgkopae", "syf", "vnntavj", "dung", "kn", "qkxo", "ajyvgwd", "fs", "kanixyaepl", "syf", "tl", "yzhaa", "dung", "wa", "syf", "jtucivim", "tl", "kanixyaepl", "oxerkx", "wjddgkopae", "ey", "ai", "zf", "di", "oxerkx", "dung", "i", "oxerkx", "wmtqpwzgh", "t", "beascd", "me", "akklwhtpi", "nxl", "cnq", "bighexy", "ddhditvzdu", "funnd", "wmt", "dgx", "fs", "xmhb", "qtcxvdcl", "thbmn", "pkrisgmr", "mkcfscyb", "x", "oxerkx", "funnd", "iesr", "funnd", "t" };
        String[] testCase2 = { "enrylabgky", "enrylabgky", "dqlqaihd", "dqlqaihd", "enrylabgky", "ramsnzhyr", "tkibsntkbr", "l", "bgtws", "xwuaep", "o", "enrylabgky", "enrylabgky", "e", "auljuhtj", "l", "d", "jfzokgt", "e", "e", "dqlqaihd", "fgglhiedk", "nj", "quhv", "enrylabgky", "oadats", "enrylabgky", "nj", "zwupro", "enrylabgky", "enrylabgky", "pyw", "enrylabgky", "bedpuycdp", "e", "oadats", "i", "e", "fobyfznrxm", "fgglhiedk", "irxtd", "oyvf", "fgglhiedk", "ebpp", "nj", "p", "d", "cufxylz", "e", "enrylabgky", "bedpuycdp", "mitzb", "shsnw", "papmvh", "bgtws", "chtp", "pze", "enrylabgky", "klp", "wpx", "mitzb", "fo", "enrylabgky", "bvcigrirhe", "klp", "pze", "dqlqaihd", "e", "iufunacwjo", "bubgww", "fgglhiedk", "og", "dqlqaihd", "mitzb", "d", "dqlqaihd", "mysidv", "l", "naj", "clftmrwl", "fjb", "zjjnrffb", "sh", "gcn", "ouispza", "zwupro", "c", "rdank", "chtp", "xwuaep", "jufhm", "iyntbgm", "sufs", "mkivpe", "bxdd", "dqlqaihd", "zwupro", "vzxbbculgv", "zwupro", "l" };
        test(testCase1, testCase2, true);
    }//public void test12() {

    @Test
    public void test13() {
        String[] testCase1 = { "w", "eyxrp", "eyxrp", "eyxrp", "omhyd", "jjxw", "eyxrp", "w", "fof", "bpzchydfxq", "dbhfteni", "eyxrp", "zh", "fof", "b", "ujtyiqjxyz", "eyxrp", "ftbhejcshs", "ftbhejcshs", "obbiejvn", "ftbhejcshs", "eyxrp", "eyxrp", "w", "dn", "zh", "b", "ibg", "nqu", "rghmrnn", "bhvb", "wpwr", "qztnrogm", "h", "eyxrp", "khc", "w", "dbhfteni", "w", "w", "qwblsb", "bhvb", "ujtyiqjxyz", "omhyd", "eyxrp", "dn", "yvswdy", "sqn", "svmng", "eyxrp", "eyxrp", "omhyd", "iafv", "mq", "sr", "obbrricx", "irjgrj", "bclxbuziyq", "thctgmjd", "oj", "omhyd", "ffk", "eyxrp", "zlzpzqcxvc", "dn", "eyxrp", "zywsfbz", "fof", "eoikeq", "sr", "w", "zqyvs", "w", "ny", "ujtyiqjxyz", "pyt", "eyxrp", "obbrricx" };
        String[] testCase2 = { "gwidhod", "gwidhod", "rrcbtu", "rrcbtu", "pwo", "wawtosfsr", "dh", "lo", "ffzand", "lo", "wawtosfsr", "wajdfw", "kljuxzjra", "szxcnnxt", "lo", "lo", "k", "ctlocymikp", "mmjamirv", "ctlocymikp", "fovh", "eh", "rrcbtu", "kr", "tanraafmn", "ejcmlubf", "kr", "wajdfw", "pwo", "vbvtkopo", "eh", "ggrlvzhk", "cdkpaqj", "pwo", "rrcbtu", "j", "tefaqk", "wawtosfsr", "e", "kr", "osdmuganuk", "gdaootfzc", "lo", "pwo", "qxafilghtp", "hxabysgibi", "ctlocymikp", "ejcmlubf", "lo", "yfmaowi", "dh", "jrdtvx", "tjnao", "zsqkaeuz", "ffzand", "e", "wtzxuenw", "fzye", "dh", "kgssvx", "pwo", "pwo", "vxqaci", "vqed", "aexwo", "kwhsy", "jrdtvx", "szxcnnxt", "zsqkaeuz", "wftugdkchs", "e", "wawtosfsr", "grgzfpmvv", "k", "uekzxjpam", "tsnx", "yfmaowi", "e" };
        test(testCase1, testCase2, false);
    }//public void test13() {

    @Test
    public void test14() {
        String[] testCase1 = { "nzfts", "drymw", "jvguce", "drymw" };
        String[] testCase2 = { "yepv", "yepv", "wxt", "yepv" };
        test(testCase1, testCase2, false);
    }//public void test14() {

    @Test
    public void test15() {
        setTestCaseInfo("test-15.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test15() {

    @Test
    public void test16() {
        setTestCaseInfo("test-16.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test16() {

    @Test
    public void test17() {
        setTestCaseInfo("test-17.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test17() {

    @Test
    public void test18() {
        setTestCaseInfo("test-18.json");
        test(internedTestCase1, internedTestCase2, internedSolution);
    }//public void test18() {

    @Test
    public void test19() {
        String[] testCase1 = { "a", "b", "c" };
        String[] testCase2 = { "a", "b", "a" };
        test(testCase1, testCase2, false);
    }//public void test19() {

    @Test
    public void test20() {
        String[] testCase1 = { "a", "a", "a", "a", "b", "b", "c", "c", "c", "c", "a" };
        String[] testCase2 = { "d", "d", "d", "d", "e", "e", "f", "f", "f", "f", "f" };
        test(testCase1, testCase2, false);
    }//public void test20() {

    @Test
    public void test21() {
        String[] testCase1 = { "a", "a", "b" };
        String[] testCase2 = { "a", "b", "a" };
        test(testCase1, testCase2, false);
    }//public void test21() {

    @Test
    public void test22() {
        String[] testCase1 = { "a", "a", "b" };
        String[] testCase2 = { "a", "a", "a" };
        test(testCase1, testCase2, false);
    }//public void test22() {

    @Test
    public void test23() {
        String[] testCase1 = { "a", "b", "c" };
        String[] testCase2 = { "a", "b", "z" };
        test(testCase1, testCase2, true);
    }//public void test23() {

    private void test(String[] testCase1, String[] testCase2, boolean solution){
        if(solution){
            assertTrue(new AreFollowingPatterns().areFollowingPatterns(testCase1.clone(),testCase2.clone()));
        }else{//if(solution){
            assertFalse(new AreFollowingPatterns().areFollowingPatterns(testCase1.clone(),testCase2.clone()));
        }//}else
        assertTimeout(Duration.ofSeconds(3), ()-> new AreFollowingPatterns().areFollowingPatterns(testCase1,testCase2));
    }//void private test(String[] testCase1, String[] testCase2, boolean solution){

    private void setTestCaseInfo(String fileName){
        JSONObject testInfo = getJsonObject(fileName, path);
        if(testInfo==null){
            fail("JObject for " + fileName + " returns null");
        }else{//if(testInfo==null){
            var preInternedTestCase1 = (JSONArray) ((JSONObject) testInfo.get("input")).get("strings");
            internedTestCase1 = new String[preInternedTestCase1.size()];
            for(int i=0;i< internedTestCase1.length;i++){
                internedTestCase1[i] = (String) preInternedTestCase1.get(i);
            }//for(int i=0;i< internedTestCase1.length;i++){
            var preInternedTestCase2 = (JSONArray) ((JSONObject) testInfo.get("input")).get("patterns");
            internedTestCase2 = new String[preInternedTestCase2.size()];
            for(int i=0;i< internedTestCase2.length;i++){
                internedTestCase2[i] = (String) preInternedTestCase2.get(i);
            }//for(int i=0;i< internedTestCase2.length;i++){
            internedSolution = (boolean) testInfo.get("output");
        }//else{
    }//private void setTestCaseInfo(String filename){
}//class AreFollowingPatternsTest {