using Algorithms.src._0_intro._11_land_of_logic;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
    [TestClass()]
    public class FileNamingTests {
        
        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_11_land_of_logic\\FileNaming\\";
        private string[] internedTestCase = new string[0];
        private string[] internedSolution = new string[0];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            string[] testCase = { "doc", "doc", "image", "doc(1)", "doc" };
            string[] solution = { "doc", "doc(1)", "image", "doc(1)(1)", "doc(2)" };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            string[] testCase = { "a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a" };
            string[] solution = { "a(1)", "a(6)", "a", "a(2)", "a(3)", "a(4)", "a(5)", "a(7)", "a(8)", "a(9)", "a(10)", "a(11)" };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            string[] testCase = { "dd", "dd(1)", "dd(2)", "dd", "dd(1)", "dd(1)(2)", "dd(1)(1)", "dd", "dd(1)" };
            string[] solution = { "dd", "dd(1)", "dd(2)", "dd(3)", "dd(1)(1)", "dd(1)(2)", "dd(1)(1)(1)", "dd(4)", "dd(1)(3)" };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            string[] testCase = { "a", "b", "cd", "b ", "a(3)" };
            string[] solution = { "a", "b", "cd", "b ", "a(3)" };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            string[] testCase = { "name", "name", "name(1)", "name(3)", "name(2)", "name(2)" };
            string[] solution = { "name", "name(1)", "name(1)(1)", "name(3)", "name(2)", "name(2)(1)" };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            string[] testCase = { };
            string[] solution = { };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            string[] testCase = { "name", "name(1)", "name(2)", "name(3)", "name(1)", "name", "name(1)", "name(1)(1)", "name2", "name", "name(1)(1)(1)" };
            string[] solution = { "name", "name(1)", "name(2)", "name(3)", "name(1)(1)", "name(4)", "name(1)(2)", "name(1)(1)(1)", "name2", "name(5)", "name(1)(1)(1)(1)" };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            string[] testCase = { "z" };
            string[] solution = { "z" };
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            string[] testCase = { "zsyrhi", "xwzt", "hvyvrqzwej", "ih", "posnokiu", "yudgxcdjc", "psifzbhleolhwgx", "zsyrhi", "bxmi", "rltsewugdmijdf", "hvyvrqzwej", "ih", "ih", "vaasngiaag", "vaasngiaag", "yn", "bxmi", "yn", "dmxfsttgxr", "rxr", "rxr", "uazud", "uazud", "rxr", "hvyvrqzwej", "yn", "posnokiu", "hvyvrqzwej", "dmxfsttgxr", "uazud", "vpuubto", "zsyrhi", "ih", "yudgxcdjc", "ih", "hvyvrqzwej", "rltsewugdmijdf", "uazud", "yudgxcdjc", "yn", "yn", "ih", "psifzbhleolhwgx", "posnokiu", "psifzbhleolhwgx", "yudgxcdjc", "bxmi", "vaasngiaag", "ih", "vaasngiaag", "hvyvrqzwej", "posnokiu", "vaasngiaag", "rltsewugdmijdf", "vaasngiaag", "dmxfsttgxr", "yn", "yn", "psifzbhleolhwgx", "xwzt", "xwzt", "vpuubto", "xwzt", "rltsewugdmijdf", "vpuubto", "uazud", "xwzt", "rxr", "vpuubto", "psifzbhleolhwgx", "posnokiu", "uazud", "hvyvrqzwej", "ih", "yn", "rxr", "posnokiu", "bxmi", "xwzt", "rxr", "yudgxcdjc", "psifzbhleolhwgx", "posnokiu", "vaasngiaag", "dmxfsttgxr", "vaasngiaag", "rltsewugdmijdf", "uazud", "vpuubto", "rxr", "hvyvrqzwej", "bxmi", "rltsewugdmijdf", "zsyrhi", "rxr", "zsyrhi", "psifzbhleolhwgx", "yn", "rltsewugdmijdf", "ih" };
            string[] solution = { "zsyrhi", "xwzt", "hvyvrqzwej", "ih", "posnokiu", "yudgxcdjc", "psifzbhleolhwgx", "zsyrhi(1)", "bxmi", "rltsewugdmijdf", "hvyvrqzwej(1)", "ih(1)", "ih(2)", "vaasngiaag", "vaasngiaag(1)", "yn", "bxmi(1)", "yn(1)", "dmxfsttgxr", "rxr", "rxr(1)", "uazud", "uazud(1)", "rxr(2)", "hvyvrqzwej(2)", "yn(2)", "posnokiu(1)", "hvyvrqzwej(3)", "dmxfsttgxr(1)", "uazud(2)", "vpuubto", "zsyrhi(2)", "ih(3)", "yudgxcdjc(1)", "ih(4)", "hvyvrqzwej(4)", "rltsewugdmijdf(1)", "uazud(3)", "yudgxcdjc(2)", "yn(3)", "yn(4)", "ih(5)", "psifzbhleolhwgx(1)", "posnokiu(2)", "psifzbhleolhwgx(2)", "yudgxcdjc(3)", "bxmi(2)", "vaasngiaag(2)", "ih(6)", "vaasngiaag(3)", "hvyvrqzwej(5)", "posnokiu(3)", "vaasngiaag(4)", "rltsewugdmijdf(2)", "vaasngiaag(5)", "dmxfsttgxr(2)", "yn(5)", "yn(6)", "psifzbhleolhwgx(3)", "xwzt(1)", "xwzt(2)", "vpuubto(1)", "xwzt(3)", "rltsewugdmijdf(3)", "vpuubto(2)", "uazud(4)", "xwzt(4)", "rxr(3)", "vpuubto(3)", "psifzbhleolhwgx(4)", "posnokiu(4)", "uazud(5)", "hvyvrqzwej(6)", "ih(7)", "yn(7)", "rxr(4)", "posnokiu(5)", "bxmi(3)", "xwzt(5)", "rxr(5)", "yudgxcdjc(4)", "psifzbhleolhwgx(5)", "posnokiu(6)", "vaasngiaag(6)", "dmxfsttgxr(3)", "vaasngiaag(7)", "rltsewugdmijdf(4)", "uazud(6)", "vpuubto(4)", "rxr(6)", "hvyvrqzwej(7)", "bxmi(4)", "rltsewugdmijdf(5)", "zsyrhi(3)", "rxr(7)", "zsyrhi(4)", "psifzbhleolhwgx(6)", "yn(8)", "rltsewugdmijdf(6)", "ih(8)" };
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            SetTestCaseInfo("test-10.json");
            DoTest();
        }//public void Test10() {

        [TestMethod]
        public void Test11() {
            SetTestCaseInfo("test-11.json");
            DoTest();
        }//public void Test11() {

        [TestMethod]
        public void Test12() {
            SetTestCaseInfo("test-12.json");
            DoTest();
        }//public void Test12() {

        private void Test(string[] testCase, string[] solution) {
            CollectionAssert.AreEqual(solution, new FileNaming().fileNaming(testCase));
        }//private void Test(string[] testCase, string[] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                internedSolution = new string[preSolution.Count];
                for(int i = 0; i < internedSolution.Length; i++) {
                    internedSolution[i] = (string)preSolution[i];
                }//for(int i = 0; i < internedSolution.Length; i++) {
                JArray preTestCase = (JArray)o["input"]["names"];
                internedTestCase = new string[preTestCase.Count];
                for (int i = 0; i < internedTestCase.Length; i++) {
                    internedTestCase[i] = (string)preTestCase[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class FileNamingTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
