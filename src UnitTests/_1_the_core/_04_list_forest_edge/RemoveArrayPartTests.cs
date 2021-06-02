using Algorithms.src._1_the_core._04_list_forest_edge;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class RemoveArrayPartTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_1_the_core\\_04_list_forest_edge\\RemoveArrayPart\\";
        private int[] internedTestCase1 = new int[0];
        private int internedTestCase2 = 0;
        private int internedTestCase3 = 0;
        private int[] internedSolution = new int[0];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 2, 3, 2, 3, 4, 5 };
            var testCase2 = 2;
            var testCase3 = 4;
            int[] solution = { 2, 3, 5 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 2, 4, 10, 1 };
            var testCase2 = 0;
            var testCase3 = 2;
            int[] solution = { 1 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 5, 3, 2, 3, 4 };
            var testCase2 = 1;
            var testCase3 = 1;
            int[] solution = { 5, 2, 3, 4 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 1, 1 };
            var testCase2 = 0;
            var testCase3 = 1;
            int[] solution = { };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 0, -2, 5, 6 };
            var testCase2 = 3;
            var testCase3 = 3;
            int[] solution = { 0, -2, 5 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { 4, 3, 2, 1, 3, 4, 5 };
            var testCase2 = 1;
            var testCase3 = 3;
            int[] solution = { 4, 3, 4, 5 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 24, -40, -30, 30, 80, -94, 18, -56, -31, -68, -94, 67, -28, -2, -10, -83, -41, 43, -27, 0, -39, -83, -76, -59, -32, 87, -31, -55, -35, 20, 67, -78, -32, -90, 72, 15, -59, 4, 69, -82, 2, 96, -99, -78, 93, -68, -39, 68, 49, -9, -49, 77, 81, -55, -16, -9, -11, 80, 29, -6, 90, 83, 16, 68, -62, -73, -5, -86, 0, -48, 88, -35, 87, 12, 92, 12, 46, 57, 71, 91, -55, -62, -24, -78, -40, 30, -97, 64, -9, 40, 93, -67, -26, 53, -81, -7, -16, 14, -70, 88 };
            var testCase2 = 19;
            var testCase3 = 98;
            int[] solution = { 24, -40, -30, 30, 80, -94, 18, -56, -31, -68, -94, 67, -28, -2, -10, -83, -41, 43, -27, 88 };
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase1 = { 66, -94, -83, -39, -27, 50, 58, 58, -68, -85, 55, -21, 83, -89, 52, -80, 17, -89, -56, 90, 75, 23, -74, -91, 93, -36, 90, 97, 52, 8, 0, -88, -5, -34, 55, 88, 96, -29, 30, -51, -69, 57, 85, -86, -47, 85, 77, 62, 55, 11, -4, 85, 32, 96, 69, 80, 78, -79, 70, 79, 77, 98, 85, 94, -34, 21, 5, 19, 85, 54, 50, 6, 31, -100, 74, -32, 35, 38, 59, 43, 89, 89, -60, 36, 46, 78, 43, 53, 84, -76, -24, -53, -5, 91, 100, 65, 23, 87, 20, 5 };
            var testCase2 = 0;
            var testCase3 = 99;
            int[] solution = { };
            Test(testCase1, testCase2, testCase3, solution);
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

        [TestMethod]
        public void Test15() {
            SetTestCaseInfo("test-15.json");
            DoTest();
        }//public void Test15() {

        private void Test(int[] testCase1, int testCase2, int testCase3, int[] solution) {
            CollectionAssert.AreEqual(solution, new RemoveArrayPart().removeArrayPart(testCase1, testCase2, testCase3));
        }//private void Test(int[] testCase1,int testCase2,int testCase3,int[] solution) {

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
                JArray preTestCase1 = (JArray)o["input"]["inputArray"];
                internedTestCase1 = new int[preTestCase1.Count];
                for (int i = 0; i < internedTestCase1.Length; i++) {
                    internedTestCase1[i] = (int)preTestCase1[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
                internedTestCase2 = (int)o["input"]["l"];
                internedTestCase3 = (int)o["input"]["r"];
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase1, internedTestCase2, internedTestCase3, internedSolution);
        }//private void DoTest() {
    }//public class RemoveArrayPartTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
