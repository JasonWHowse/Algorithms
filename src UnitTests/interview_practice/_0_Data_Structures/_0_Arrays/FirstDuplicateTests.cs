using Algorithms.src.helper_functions;
using Algorithms.src.interview_practice._0_Data_Structures._0_Arrays;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
    [TestClass()]
    public class FirstDuplicateTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\interview_practice\\_0_Data_Structures\\_0_Arrays\\FirstDuplicate\\";
        private int[] internedTestCase = new int[0];
        private int internedSolution = 0;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 2, 1, 3, 5, 3, 2 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 2, 2 };
            var solution = 2;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 2, 4, 3, 5, 1 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 1 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 5, 5, 5, 5, 5 };
            var solution = 5;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 2, 1 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 2, 1, 3 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 2, 3, 3 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 3, 3, 3 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 8, 4, 6, 2, 6, 4, 7, 9, 5, 8 };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { 10, 6, 8, 4, 9, 1, 7, 2, 5, 3 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { 1, 1, 2, 2, 1 };
            var solution = 1;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase = { 8, 1, 4, 8, 10, 1, 5, 7, 8, 7 };
            var solution = 8;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[] testCase = { 28, 19, 13, 6, 34, 48, 50, 3, 47, 18, 15, 34, 16, 11, 13, 3, 2, 4, 46, 6, 7, 3, 18, 9, 32, 21, 3, 21, 50, 10, 45, 13, 22, 1, 27, 18, 3, 27, 30, 44, 12, 30, 40, 1, 1, 31, 6, 18, 33, 5 };
            var solution = 34;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[] testCase = { 41, 39, 11, 50, 6, 16, 40, 8, 30, 21, 31, 46, 38, 22, 37, 18, 23, 9, 1, 4, 24, 49, 45, 48, 44, 13, 32, 43, 2, 15, 42, 12, 25, 47, 34, 27, 20, 28, 29, 7, 36, 14, 5, 19, 35, 10, 26, 3, 33, 17 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[] testCase = { 16, 25, 69, 4, 99, 29, 16, 54, 75, 34, 7, 63, 11, 44, 9, 31, 70, 21, 70, 64, 64, 53, 24, 45, 61, 34, 33, 52, 13, 55, 68, 80, 89, 10, 10, 92, 60, 55, 22, 75, 23, 22, 16, 62, 84, 45, 86, 4, 85, 58, 69, 33, 39, 72, 23, 79, 19, 62, 32, 5, 53, 70, 51, 11, 84, 88, 18, 65, 99, 29, 56, 96, 76, 93, 16, 28, 31, 89, 1, 3, 4, 5, 88, 99, 28, 39, 52, 13, 6, 94, 86, 65, 57, 94, 55, 40, 98, 39, 19, 8 };
            var solution = 16;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int[] testCase = { 55, 2, 58, 25, 21, 28, 89, 4, 71, 56, 14, 93, 97, 80, 39, 30, 8, 66, 90, 91, 50, 72, 100, 87, 9, 23, 20, 85, 1, 62, 46, 60, 74, 54, 84, 3, 88, 11, 67, 75, 69, 29, 13, 95, 70, 48, 64, 78, 73, 59, 83, 99, 18, 17, 63, 82, 92, 49, 26, 86, 24, 6, 61, 22, 15, 41, 16, 27, 32, 34, 5, 35, 33, 53, 81, 42, 31, 68, 38, 40, 98, 79, 43, 96, 57, 77, 10, 52, 76, 65, 45, 51, 44, 19, 47, 37, 94, 36, 7, 12 };
            var solution = -1;
            Test(testCase, solution);
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

        [TestMethod]
        public void Test21() {
            SetTestCaseInfo("test-21.json");
            DoTest();
        }//public void Test21() {

        [TestMethod]
        public void Test22() {
            SetTestCaseInfo("test-22.json");
            DoTest();
        }//public void Test22() {

        [TestMethod]
        public void Test23() {
            SetTestCaseInfo("test-23.json");
            DoTest();
        }//public void Test23() {

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new FirstDuplicate().firstDuplicate(testCase));
        }//private void Test(int[] testCase,int solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (int)o["output"];
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
    }//public class FirstDuplicateTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {