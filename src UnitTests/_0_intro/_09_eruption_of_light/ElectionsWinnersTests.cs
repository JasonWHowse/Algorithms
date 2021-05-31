using Algorithms.src._0_intro._09_eruption_of_light;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
    [TestClass()]
    public class ElectionsWinnersTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_09_eruption_of_light\\ElectionsWinners\\";
        private int[] internedTestCase1 = new int[0];
        private int internedTestCase2 = 0;
        private int internedSolution = 0;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 2, 3, 5, 2 };
            var testCase2 = 3;
            var solution = 2;
            Test(testCase1,testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 1, 3, 3, 1, 1 };
            var testCase2 = 0;
            var solution = 0;
            Test(testCase1,testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 5, 1, 3, 4, 1 };
            var testCase2 = 0;
            var solution = 1;
            Test(testCase1,testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 1, 1, 1, 1 };
            var testCase2 = 1;
            var solution = 4;
            Test(testCase1,testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 1, 1, 1, 1 };
            var testCase2 = 0;
            var solution = 0;
            Test(testCase1,testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { 3, 1, 1, 3, 1 };
            var testCase2 = 2;
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 1, 2, 3, 4, 5 };
            var testCase2 = 4;
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase1 = { 5, 1, 2, 3, 3 };
            var testCase2 = 0;
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase1 = { 5, 7, 7, 5, 5 };
            var testCase2 = 0;
            var solution = 0;
            Test(testCase1, testCase2, solution);
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

        private void Test(int[] testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new ElectionsWinners().electionsWinners(testCase1, testCase2));
        }//private void Test(int[] testCase1,int testCase2,int solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (int)o["output"];
                internedTestCase2 = (int)o["input"]["k"];
                JArray preTestCase = (JArray)o["input"]["votes"];
                internedTestCase1 = new int[preTestCase.Count];
                for (int i = 0; i < internedTestCase1.Length; i++) {
                    internedTestCase1[i] = (int)preTestCase[i];
                }//for (int i = 0; i < internedTestCase1.Length; i++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase1, internedTestCase2, internedSolution);
        }//private void DoTest() {
    }//public class ElectionsWinnersTests {
}//namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
