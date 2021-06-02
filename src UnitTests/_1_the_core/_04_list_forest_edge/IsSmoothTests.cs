using Algorithms.src._1_the_core._04_list_forest_edge;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class IsSmoothTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_1_the_core\\_04_list_forest_edge\\IsSmooth\\";
        private int[] internedTestCase = new int[0];
        private bool internedSolution = false;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 7, 2, 2, 5, 10, 7 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { -5, -5, 10 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 4, 2 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 45, 23, 12, 33, 12, 453, -234, -45 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { -12, 34, 40, -5, -12, 4, 0, 0, -12 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 9, 0, 15, 9 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { -6, 6, -6 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 26, 26, -17 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { -7, 5, 5, 10 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 3, 4, 5 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { -5, 3, -1, 9 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { 5, 5, 10 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase = { 222, 23, 12, 210, 12, 453, -234, -222 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[] testCase = { 0, 0, 1, 0 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[] testCase = { -200, 50, 200, 50, -200 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[] testCase = { 55, 55, 54 };
            var solution = false;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int[] testCase = { 435, 23, 12, 435, -23, 0, 435 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            int[] testCase = { 17, -6, 23, 17 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod]
        public void Test19() {
            SetTestCaseInfo("test-19.json");
            DoTest();
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            int[] testCase = { 0, 0 };
            var solution = true;
            Test(testCase, solution);
        }//public void Test20() {

        private void Test(int[] testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsSmooth().isSmooth(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsSmooth().isSmooth(testCase));
            }//else {
        }//private void Test(int[] testCase,bool solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (bool)o["output"];
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
    }//public class IsSmoothTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
