using Algorithms.src._0_intro._05_rains_of_reason;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._05_rains_of_reason {
    [TestClass()]
    public class ArrayReplaceTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_05_rains_of_reason\\ArrayReplace\\";
        private int[] internedTestCase1 = new int[0];
        private int internedTestCase2 = 0;
        private int internedTestCase3 = 0;
        private int[] internedSolution = new int[0];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 1, 2, 1 };
            var testCase2 = 1;
            var testCase3 = 3;
            int[] solution = { 3, 2, 3 };
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 1, 2, 3, 4, 5 };
            var testCase2 = 3;
            var testCase3 = 0;
            int[] solution = { 1, 2, 0, 4, 5 };
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 1, 1, 1 };
            var testCase2 = 1;
            var testCase3 = 10;
            int[] solution = { 10, 10, 10 };
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 1, 2, 1, 2, 1 };
            var testCase2 = 2;
            var testCase3 = 1;
            int[] solution = { 1, 1, 1, 1, 1 };
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 1, 2, 1, 2, 1 };
            var testCase2 = 2;
            var testCase3 = 2;
            int[] solution = { 1, 2, 1, 2, 1 };
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { 3, 1 };
            var testCase2 = 3;
            var testCase3 = 9;
            int[] solution = { 9, 1 };
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 10, 10 };
            var testCase2 = 0;
            var testCase3 = 9;
            int[] solution = { 10, 10 };
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase1 = { 2, 1 };
            var testCase2 = 3;
            var testCase3 = 9;
            int[] solution = { 2, 1 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase1 = { 5, 4, 7, 2, 2, 4, 4, 7, 0, 10 };
            var testCase2 = 4;
            var testCase3 = 7;
            int[] solution = { 5, 7, 7, 2, 2, 7, 7, 7, 0, 10 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase1 = { 4, 5, 4 };
            var testCase2 = 4;
            var testCase3 = 10;
            int[] solution = { 10, 5, 10 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase1 = { 0, 0 };
            var testCase2 = 0;
            var testCase3 = 4;
            int[] solution = { 4, 4 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase1 = { 5, 1, 3, 10, 3 };
            var testCase2 = 3;
            var testCase3 = 9;
            int[] solution = { 5, 1, 9, 10, 9 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase1 = {  };
            var testCase2 = 1000000000;
            var testCase3 = 1000000000;
            int[] solution = {  };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test13() {

        [TestMethod]
        public void test14() {//TODO: finish test
            SetTestCaseInfo("test-14.json");
            DoTest();
        }//public void test14() {

        [TestMethod]
        public void test15() {
            SetTestCaseInfo("test-15.json");
            DoTest();
        }//public void test5() {

        [TestMethod]
        public void test16() {
            SetTestCaseInfo("test-16.json");
            DoTest();
        }//public void test16() {

        private void Test(int[] testCase1, int testCase2, int testCase3, int[] solution) {
            CollectionAssert.AreEqual(solution, new ArrayReplace().arrayReplace(testCase1, testCase2, testCase3));
        }//private void Test(int[] testCase1,int testCase2,int testCase3,int[] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                internedSolution = new int[preSolution.Count];
                for(int i = 0; i< internedSolution.Length; i++) {
                    internedSolution[i] = (int)preSolution[i];
                }//for(int i = 0; i< internedSolution.Length; i++) {
                JArray preTestCase = (JArray)o["input"]["inputArray"];
                internedTestCase1 = new int[preTestCase.Count];
                for (int i = 0; i < internedTestCase1.Length; i++) {
                    internedTestCase1[i] = (int)preTestCase[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
                internedTestCase2 = (int)o["input"]["elemToReplace"];
                internedTestCase3 = (int)o["input"]["substitutionElem"];
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
        }//private void DoTest() {
    }//public class ArrayReplaceTests {
}//namespace Algorithms.src_UnitTests._0_intro._05_rains_of_reason {
