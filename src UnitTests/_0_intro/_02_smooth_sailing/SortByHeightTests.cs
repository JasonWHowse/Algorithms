using Algorithms.src._0_intro._02_smooth_sailing;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
    [TestClass()]
    public class SortByHeightTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_02_smooth_sailing\\SortByHeight\\";
        private int[] internedTestCase = new int[0];
        private int[] internedSolution = new int[0];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { -1, 150, 190, 170, -1, -1, 160, 180 };
            int[] solution = { -1, 150, 160, 170, -1, -1, 180, 190 };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { -1, -1, -1, -1, -1 };
            int[] solution = { -1, -1, -1, -1, -1 };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { -1 };
            int[] solution = { -1 };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 4, 2, 9, 11, 2, 16 };
            int[] solution = { 2, 2, 4, 9, 11, 16 };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1 };
            int[] solution = { 1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2 };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3 };
            int[] solution = { 1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77 };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 1000 };
            int[] solution = { 1000 };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
            int[] solution = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 964, 735, 365, 864, 764, 689, 163, 886, 63, 263, 333, 299, 451, 62, 983, 3, 340, 115, 626, 576, 598, 407, 189, 975, 874, 78, 650, 598, 198, 522, 857, 501, 48, 982, 758, 630, 313, 647, 358, 351, 288, 29, 386, 377, 736, 743, 899, 596, 263, 374 };
            int[] solution = { 3, 29, 48, 62, 63, 78, 115, 163, 189, 198, 263, 263, 288, 299, 313, 333, 340, 351, 358, 365, 374, 377, 386, 407, 451, 501, 522, 576, 596, 598, 598, 626, 630, 647, 650, 689, 735, 736, 743, 758, 764, 857, 864, 874, 886, 899, 964, 975, 982, 983 };
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 44, 36, 35, 78, 70, 92, 60, 17, 67, -1, 91, -1, 69, 54, 88, 58, 9, 90, 9, 12, 66, 21, 79, 99, -1, 18, 46, 78, 38, 15, 26, 82, -1, 65, -1, 44, 51, 3, 37, 60, -1, 59, -1, -1, 78, 97, 9, 90, 24, 75, 45, 65, 24, 87, 44, 100, 94, 98, -1, 97, 72, 50, -1, 50, 39, 70, 91, 25, 66, 79, 69, 46, 20, 99, 57, 34, 42, 84, 8, -1, 95, 5, 59, 98, 97, 36, 89, 4, -1, 29, 9, 97, 55, 30, 16, -1, -1, -1, 10, -1 };
            int[] solution = { 3, 4, 5, 8, 9, 9, 9, 9, 10, -1, 12, -1, 15, 16, 17, 18, 20, 21, 24, 24, 25, 26, 29, 30, -1, 34, 35, 36, 36, 37, 38, 39, -1, 42, -1, 44, 44, 44, 45, 46, -1, 46, -1, -1, 50, 50, 51, 54, 55, 57, 58, 59, 59, 60, 60, 65, 65, 66, -1, 66, 67, 69, -1, 69, 70, 70, 72, 75, 78, 78, 78, 79, 79, 82, 84, 87, 88, 89, 90, -1, 90, 91, 91, 92, 94, 95, 97, 97, -1, 97, 97, 98, 98, 99, 99, -1, -1, -1, 100, -1 };
            Test(testCase, solution);
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

        private void Test(int[] testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new SortByHeight().sortByHeight(testCase));
        }//private void Test(var testCase,var solution) {

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
                JArray preTestCase = (JArray)o["input"]["a"];
                internedTestCase = new int[preTestCase.Count];
                for (int i = 0; i < internedTestCase.Length; i++) {
                    internedTestCase[i] = (int)preTestCase[i];
                }//for (int i = 0; i < internedTestCase.Length; i++) {
            }//else {
        }//private void SetTestCaseInfo(string filename) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class SortByHeightTests {
}//namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
