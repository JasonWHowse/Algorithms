using Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Algorithms.src.helper_functions;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
    [TestClass()]
    public class ContainsDuplicatesTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_3_Special_Topics\\_0_Common_Techniques_Basic\\ContainsDuplicates\\";
        private int[] internedTestCase = new int[0];
        private bool internedSolution = false;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 1, 2, 3, 1 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 3, 1 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { };
            var solution = false;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 1 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { -1200000005, -1200000005 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 0, 4, 5, 0, 3, 6 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 1, 2, 3, 4 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 0, 1, 0, -1 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 2 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { 0 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { 1, 5, -2, -4, 0 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase = { 2, 14, 18, 22, 22 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[] testCase = { 3, 3 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod]
        public void Test15() {
            SetTestCaseInfo("test-15.json");
            DoTest();
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[] testCase = { 7, 10, 5, 5, 6, 6, 4, 10, 5, 4, 9, 4, 9, 6, 5, 9, 6, 3, 6, 5, 6, 7, 7, 4, 9, 9, 10, 5, 8, 1, 8, 3, 2, 7, 5, 10, 1, 8, 5, 8, 4, 3, 6, 4, 9, 4, 2, 8, 3, 2, 2, 1, 5, 6, 3, 2, 6, 1, 8, 6, 2, 9, 1, 4, 5, 10, 8, 5, 10, 5, 10, 1, 4, 8, 3, 6, 4, 10, 9, 1, 1, 1, 2, 2, 9, 6, 6, 8, 1, 9, 2, 5, 5, 2, 1, 8, 5, 2, 3, 10 };
            var solution = true;
            Test(testCase, solution);
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

        [TestMethod]
        public void Test19() {
            SetTestCaseInfo("test-19.json");
            DoTest();
        }//public void Test19() {

        [TestMethod]
        public void Test20() {
            SetTestCaseInfo("test-20.json");
            DoTest();
        }//public void Test20() {

        private void Test(int[] testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new ContainsDuplicates().containsDuplicates(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new ContainsDuplicates().containsDuplicates(testCase));
            }//else {
        }//private void Test(int[] testCase,bool solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (bool)o["output"];
                JArray preTestCase = (JArray)o["input"]["a"];
                internedTestCase = new int[preTestCase.Count];
                for (int i = 0; i < internedTestCase.Length; i++) {
                    internedTestCase[i] = (int)preTestCase[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class ContainsDuplicatesTests {
}//namespace Algorithms.src_UnitTests.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {