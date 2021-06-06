using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
    [TestClass()]
    public class AreFollowingPatternsTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_2_Hash_Tables\\AreFollowingPatterns\\";
        private string[] internedTestCase1 = new string[0];
        private string[] internedTestCase2 = new string[0];
        private bool internedSolution = false;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            string[] testCase1 = { "cat", "dog", "dog" };
            string[] testCase2 = { "a", "b", "b" };
            bool solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            string[] testCase1 = { "cat", "dog", "doggy" };
            string[] testCase2 = { "a", "b", "b" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            string[] testCase1 = { "cat", "dog", "dog" };
            string[] testCase2 = { "a", "b", "c" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            string[] testCase1 = { "aaa" };
            string[] testCase2 = { "aaa" };
            bool solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            string[] testCase1 = { "a", "b", "a" };
            string[] testCase2 = { "c", "d", "d" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            string[] testCase1 = { "aaa", "aaa", "aaa" };
            string[] testCase2 = { "aaa", "bbb", "aaa" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            string[] testCase1 = { "aaa", "aab", "aaa" };
            string[] testCase2 = { "aaa", "aaa", "aaa" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            string[] testCase1 = { "re", "jjinh", "rnz", "frok", "frok", "hxytef", "hxytef", "frok" };
            string[] testCase2 = { "kzfzmjwe", "fgbugiomo", "ocuijka", "gafdrts", "gafdrts", "ebdva", "ebdva", "gafdrts" };
            bool solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            string[] testCase1 = { "kwtfpzm", "kwtfpzm", "kwtfpzm", "kwtfpzm", "kwtfpzm", "wfktjrdhu", "anx", "kwtfpzm" };
            string[] testCase2 = { "z", "z", "z", "hhwdphhnc", "zejhegjlha", "xgxpvhprdd", "e", "u" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            string[] testCase1 = { "ato", "ato", "jflywws", "ato", "ato", "se", "se", "kiolm", "wizdkdqke" };
            string[] testCase2 = { "ofnmiqelt", "ofnmiqelt", "flqmwoje", "ofnmiqelt", "zdohw", "jyk", "ujddjtxt", "s", "kw" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            string[] testCase1 = { "a", "a", "a", "a", "x", "x", "b", "b", "b", "a", "y", "a", "a", "z", "a", "b", "b", "b", "b", "b", "a" };
            string[] testCase2 = { "c", "c", "c", "c", "x", "x", "d", "d", "d", "c", "y", "c", "c", "z", "c", "d", "d", "d", "d", "d", "d" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            string[] testCase1 = { "syf", "syf", "oxerkx", "oxerkx", "syf", "xgwatff", "pmnfaw", "t", "ajyvgwd", "xmhb", "ajg", "syf", "syf", "wjddgkopae", "fgrpstxd", "t", "i", "psw", "wjddgkopae", "wjddgkopae", "oxerkx", "zf", "jvdtdxbefr", "rbmphtrmo", "syf", "yssdddhyn", "syf", "jvdtdxbefr", "funnd", "syf", "syf", "wd", "syf", "vnntavj", "wjddgkopae", "yssdddhyn", "wcvk", "wjddgkopae", "fh", "zf", "gpkdcwf", "qkbw", "zf", "teppnr", "jvdtdxbefr", "fmn", "i", "hzmihfrmq", "wjddgkopae", "syf", "vnntavj", "dung", "kn", "qkxo", "ajyvgwd", "fs", "kanixyaepl", "syf", "tl", "yzhaa", "dung", "wa", "syf", "jtucivim", "tl", "kanixyaepl", "oxerkx", "wjddgkopae", "ey", "ai", "zf", "di", "oxerkx", "dung", "i", "oxerkx", "wmtqpwzgh", "t", "beascd", "me", "akklwhtpi", "nxl", "cnq", "bighexy", "ddhditvzdu", "funnd", "wmt", "dgx", "fs", "xmhb", "qtcxvdcl", "thbmn", "pkrisgmr", "mkcfscyb", "x", "oxerkx", "funnd", "iesr", "funnd", "t" };
            string[] testCase2 = { "enrylabgky", "enrylabgky", "dqlqaihd", "dqlqaihd", "enrylabgky", "ramsnzhyr", "tkibsntkbr", "l", "bgtws", "xwuaep", "o", "enrylabgky", "enrylabgky", "e", "auljuhtj", "l", "d", "jfzokgt", "e", "e", "dqlqaihd", "fgglhiedk", "nj", "quhv", "enrylabgky", "oadats", "enrylabgky", "nj", "zwupro", "enrylabgky", "enrylabgky", "pyw", "enrylabgky", "bedpuycdp", "e", "oadats", "i", "e", "fobyfznrxm", "fgglhiedk", "irxtd", "oyvf", "fgglhiedk", "ebpp", "nj", "p", "d", "cufxylz", "e", "enrylabgky", "bedpuycdp", "mitzb", "shsnw", "papmvh", "bgtws", "chtp", "pze", "enrylabgky", "klp", "wpx", "mitzb", "fo", "enrylabgky", "bvcigrirhe", "klp", "pze", "dqlqaihd", "e", "iufunacwjo", "bubgww", "fgglhiedk", "og", "dqlqaihd", "mitzb", "d", "dqlqaihd", "mysidv", "l", "naj", "clftmrwl", "fjb", "zjjnrffb", "sh", "gcn", "ouispza", "zwupro", "c", "rdank", "chtp", "xwuaep", "jufhm", "iyntbgm", "sufs", "mkivpe", "bxdd", "dqlqaihd", "zwupro", "vzxbbculgv", "zwupro", "l" };
            bool solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            string[] testCase1 = { "w", "eyxrp", "eyxrp", "eyxrp", "omhyd", "jjxw", "eyxrp", "w", "fof", "bpzchydfxq", "dbhfteni", "eyxrp", "zh", "fof", "b", "ujtyiqjxyz", "eyxrp", "ftbhejcshs", "ftbhejcshs", "obbiejvn", "ftbhejcshs", "eyxrp", "eyxrp", "w", "dn", "zh", "b", "ibg", "nqu", "rghmrnn", "bhvb", "wpwr", "qztnrogm", "h", "eyxrp", "khc", "w", "dbhfteni", "w", "w", "qwblsb", "bhvb", "ujtyiqjxyz", "omhyd", "eyxrp", "dn", "yvswdy", "sqn", "svmng", "eyxrp", "eyxrp", "omhyd", "iafv", "mq", "sr", "obbrricx", "irjgrj", "bclxbuziyq", "thctgmjd", "oj", "omhyd", "ffk", "eyxrp", "zlzpzqcxvc", "dn", "eyxrp", "zywsfbz", "fof", "eoikeq", "sr", "w", "zqyvs", "w", "ny", "ujtyiqjxyz", "pyt", "eyxrp", "obbrricx" };
            string[] testCase2 = { "gwidhod", "gwidhod", "rrcbtu", "rrcbtu", "pwo", "wawtosfsr", "dh", "lo", "ffzand", "lo", "wawtosfsr", "wajdfw", "kljuxzjra", "szxcnnxt", "lo", "lo", "k", "ctlocymikp", "mmjamirv", "ctlocymikp", "fovh", "eh", "rrcbtu", "kr", "tanraafmn", "ejcmlubf", "kr", "wajdfw", "pwo", "vbvtkopo", "eh", "ggrlvzhk", "cdkpaqj", "pwo", "rrcbtu", "j", "tefaqk", "wawtosfsr", "e", "kr", "osdmuganuk", "gdaootfzc", "lo", "pwo", "qxafilghtp", "hxabysgibi", "ctlocymikp", "ejcmlubf", "lo", "yfmaowi", "dh", "jrdtvx", "tjnao", "zsqkaeuz", "ffzand", "e", "wtzxuenw", "fzye", "dh", "kgssvx", "pwo", "pwo", "vxqaci", "vqed", "aexwo", "kwhsy", "jrdtvx", "szxcnnxt", "zsqkaeuz", "wftugdkchs", "e", "wawtosfsr", "grgzfpmvv", "k", "uekzxjpam", "tsnx", "yfmaowi", "e" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            string[] testCase1 = { "nzfts", "drymw", "jvguce", "drymw" };
            string[] testCase2 = { "yepv", "yepv", "wxt", "yepv" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod]
        public void Test15() {
            SetTestCaseInfo("test-15.json");
            DoTest();
        }//public void Test15() {

        [TestMethod]
        public void Test16() {
            SetTestCaseInfo("test-16.json");
            DoTest();
        }//public void Test16() {

        [TestMethod]
        public void Test17() {
            SetTestCaseInfo("test-17.json");
            DoTest();
        }//public void Test17() {

        [TestMethod]
        public void Test18() {
            SetTestCaseInfo("test-18.json");
            DoTest();
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            string[] testCase1 = { "a", "b", "c" };
            string[] testCase2 = { "a", "b", "a" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            string[] testCase1 = { "a", "a", "a", "a", "b", "b", "c", "c", "c", "c", "a" };
            string[] testCase2 = { "d", "d", "d", "d", "e", "e", "f", "f", "f", "f", "f" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            string[] testCase1 = { "a", "a", "b" };
            string[] testCase2 = { "a", "b", "a" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test21() {

        [TestMethod(), Timeout(timeout)]
        public void Test22() {
            string[] testCase1 = { "a", "a", "b" };
            string[] testCase2 = { "a", "a", "a" };
            bool solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test22() {

        [TestMethod(), Timeout(timeout)]
        public void Test23() {
            string[] testCase1 = { "a", "b", "c" };
            string[] testCase2 = { "a", "b", "z" };
            bool solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test23() {

        private void Test(string[] testCase1, string[] testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new AreFollowingPatterns().areFollowingPatterns(testCase1, testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new AreFollowingPatterns().areFollowingPatterns(testCase1, testCase2));
            }//else {
        }//private void Test(string[] testCase1,string[] testCase2,bool solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (bool)o["output"];
                JArray preTestCase1 = (JArray)o["input"]["strings"];
                internedTestCase1 = new string[preTestCase1.Count];
                for (int i = 0; i < internedTestCase1.Length; i++) {
                    internedTestCase1[i] = (string)preTestCase1[i];
                }//for (int i = 0; i < internedTestCase.Length1; i++) {
                JArray preTestCase2 = (JArray)o["input"]["patterns"];
                internedTestCase2 = new string[preTestCase2.Count];
                for(int i = 0; i < internedTestCase2.Length; i++) {
                    internedTestCase2[i] = (string)preTestCase2[i];
                }//for(int i = 0; i < internedTestCase2.Length; i++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase1, internedTestCase2, internedSolution);
        }//private void DoTest() {
    }//public class AreFollowingPatternsTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
