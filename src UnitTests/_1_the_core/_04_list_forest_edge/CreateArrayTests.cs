using Algorithms.src._1_the_core._04_list_forest_edge;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class CreateArrayTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_1_the_core\\_04_list_forest_edge\\CreateArray\\";
        private int internedTestCase = 0;
        private int[] internedSolution = new int[0];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 4;
            int[] solution = { 1, 1, 1, 1 };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 2;
            int[] solution = { 1, 1 };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 1;
            int[] solution = { 1 };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 5;
            int[] solution = { 1, 1, 1, 1, 1 };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 49;
            int[] solution = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 91;
            int[] solution = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod]
        public void Test7() {
            SetTestCaseInfo("test-7.json");
            DoTest();
        }//public void Test7() {

        [TestMethod]
        public void Test8() {
            SetTestCaseInfo("test-8.json");
            DoTest();
        }//public void Test8() {

        [TestMethod]
        public void Test9() {
            SetTestCaseInfo("test-9.json");
            DoTest();
        }//public void Test9() {

        [TestMethod]
        public void Test10() {
            SetTestCaseInfo("test-10.json");
            DoTest();
        }//public void Test10() {

        private void Test(int testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new CreateArray().createArray(testCase));
        }//private void Test(int testCase,int[] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                internedSolution = new int[preSolution.Count];
                for (int i = 0; i < internedSolution.Length; i++) {
                    internedSolution[i] = (int)preSolution[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
                internedTestCase = (int)o["input"]["size"];
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class CreateArrayTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
