using Algorithms.src._1_the_core._04_list_forest_edge;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class ReplaceMiddleTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_1_the_core\\_04_list_forest_edge\\ReplaceMiddle\\";
        private int[] internedTestCase = new int[0];
        private int[] internedSolution = new int[0];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 7, 2, 2, 5, 10, 7 };
            int[] solution = { 7, 2, 7, 10, 7 };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { -5, -5, 10 };
            int[] solution = { -5, -5, 10 };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 45, 23, 12, 33, 12, 453, -234, -45 };
            int[] solution = { 45, 23, 12, 45, 453, -234, -45 };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 2, 8 };
            int[] solution = { 10 };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { -12, 34, 40, -5, -12, 4, 0, 0, -12 };
            int[] solution = { -12, 34, 40, -5, -12, 4, 0, 0, -12 };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 9, 0, 15, 9 };
            int[] solution = { 9, 15, 9 };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { -6, 6, -6 };
            int[] solution = { -6, 6, -6 };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 26, 26, -17 };
            int[] solution = { 26, 26, -17 };
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { -7, 5, 5, 10 };
            int[] solution = { -7, 10, 10 };
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 5, 5, 10 };
            int[] solution = { 5, 5, 10 };
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { 222, 23, 12, 210, 12, 453, -234, -222 };
            int[] solution = { 222, 23, 12, 222, 453, -234, -222 };
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { 0, 0, 1, 0 };
            int[] solution = { 0, 1, 0 };
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase = { -200, 50, 200, 50, -200 };
            int[] solution = { -200, 50, 200, 50, -200 };
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[] testCase = { 55, 55, 54 };
            int[] solution = { 55, 55, 54 };
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[] testCase = { 435, 23, 12, 435, -23, 0, 435 };
            int[] solution = { 435, 23, 12, 435, -23, 0, 435 };
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[] testCase = { 17, -6, 23, 17 };
            int[] solution = { 17, 17, 17 };
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod]
        public void Test17() {
            SetTestCaseInfo("test-17.json");
            DoTest();
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            int[] testCase = { 39, -23 };
            int[] solution = { 16 };
            Test(testCase, solution);
        }//public void Test18() {

        private void Test(int[] testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new ReplaceMiddle().replaceMiddle(testCase));
        }//private void Test(int[] testCase,int[] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                internedSolution = new int[preSolution.Count];
                for(int i = 0; i < internedSolution.Length; i++) {
                    internedSolution[i] = (int)preSolution[i];
                }//for(int i = 0; i < internedSolution.Length; i++) {
                JArray preTestCase = (JArray)o["input"]["arr"];
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
    }//public class ReplaceMiddleTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
