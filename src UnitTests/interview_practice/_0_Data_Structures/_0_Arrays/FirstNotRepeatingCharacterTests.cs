using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._0_Arrays;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
    [TestClass()]
    public class FirstNotRepeatingCharacterTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_0_Arrays\\FirstNotRepeatingCharacter\\";
        private string internedTestCase = "";
        private char internedSolution = 'a';

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "abacabad";
            var solution = 'c';
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "abacabaabacaba";
            var solution = '_';
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "z";
            var solution = 'z';
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "bcb";
            var solution = 'c';
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "bcccccccb";
            var solution = '_';
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "abcdefghijklmnopqrstuvwxyziflskecznslkjfabe";
            var solution = 'd';
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "zzz";
            var solution = '_';
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "bcccccccccccccyb";
            var solution = 'y';
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc";
            var solution = 'd';
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
            var solution = 'g';
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "vbijvdpmxfztmlgiewuloeaudyokfjcoriqfwxuwdfxrllddihadvaeohgkjxiepvzmzhmpnuvgchqgabimpekppnewthrrbpvtfc";
            var solution = 'y';
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = "vbijvdpmxfztmlgieywuloeaudyokfjcoriqfwxuwdfxrllddihadvaeohgkjxiepvzmzhmpnuvgchqgabimpekppnewthrrbpvtfc";
            var solution = '_';
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod]
        public void Test13() {
            SetTestCaseInfo("test-13.json");
            DoTest();
        }//public void Test13() {

        [TestMethod]
        public void Test14() {
            SetTestCaseInfo("test-14.json");
            DoTest();
        }//public void Test14() {

        [TestMethod]
        public void Test15() {
            SetTestCaseInfo("test-15.json");
            DoTest();
        }//public void Test15() {

        private void Test(string testCase, char solution) {
            Assert.AreEqual(solution, new FirstNotRepeatingCharacter().firstNotRepeatingCharacter(testCase));
        }//private void Test(string testCase,char solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (char)o["output"];
                internedTestCase = (string)o["input"]["s"];
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class FirstNotRepeatingCharacterTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
