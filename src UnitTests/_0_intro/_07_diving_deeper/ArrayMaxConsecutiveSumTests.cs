using Algorithms.src._0_intro._07_diving_deeper;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._07_diving_deeper {
    [TestClass()]
    public class ArrayMaxConsecutiveSumTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_07_diving_deeper\\ArrayMaxConsecutiveSum\\";
        private int[] internedTestCase1 = new int[0];
        private int internedTestCase2 = 0;
        private int internedSolution = 0;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 2, 3, 5, 1, 6 };
            var testCase2 = 2;
            var solution = 8;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 2, 4, 10, 1 };
            var testCase2 = 2;
            var solution = 14;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 1, 3, 2, 4 };
            var testCase2 = 3;
            var solution = 9;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 3, 2, 1, 1 };
            var testCase2 = 1;
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 1, 3, 4, 2, 4, 2, 4 };
            var testCase2 = 4;
            var solution = 13;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod]
        public void Test6() {
            SetTestCaseInfo("test-6.json");
            DoTest();
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 963, 741, 22, 851, 399, 382, 190, 247, 494, 452, 891, 532, 795, 920, 465, 831, 344, 391, 582, 897, 763, 951, 735, 806, 320, 702, 200, 59, 870, 345, 695, 321, 817, 83, 416, 36, 914, 335, 117, 985, 690, 303, 875, 556, 292, 309, 496, 791, 509, 360, 235, 784, 607, 341 };
            var testCase2 = 23;
            var solution = 14232;
            Test(testCase1, testCase2, solution);
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

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[] testCase1 = { 711, 501, 190, 345, 295, 865, 601, 735, 968, 496, 447, 938, 986, 56, 644, 307, 338, 904, 295, 617, 694, 313, 90, 38, 506, 485 };
            var testCase2 = 13;
            var solution = 8285;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod]
        public void Test16() {
            SetTestCaseInfo("test-16.json");
            DoTest();
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int[] testCase1 = { 505, 340, 565, 301, 650, 110, 330, 46, 425, 525, 942, 840, 628, 174, 445, 316, 425, 155, 524, 470, 795, 781, 44, 84, 277, 301, 226, 504, 750, 23, 480, 565, 219, 977, 910, 550, 524, 658, 735, 73, 26, 659, 13 };
            var testCase2 = 3;
            var solution = 2437;
            Test(testCase1, testCase2, solution);
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

        private void Test(int[] testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new ArrayMaxConsecutiveSum().arrayMaxConsecutiveSum(testCase1, testCase2));
        }//private void Test(int[] testCase1, int testCase2, int solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (int)o["output"];
                internedTestCase2 = (int)o["input"]["k"];
                JArray preTestCase = (JArray)o["input"]["inputArray"];
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
    }//public class ArrayMaxConsecutiveSumTests {
}//namespace Algorithms.src_UnitTests._0_intro._07_diving_deeper {
