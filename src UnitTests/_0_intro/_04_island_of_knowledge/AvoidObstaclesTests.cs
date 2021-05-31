using Algorithms.src._0_intro._04_island_of_knowledge;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
    [TestClass()]
    public class AvoidObstaclesTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_04_island_of_knowledge\\AvoidObstacles\\";
        int[] internedTestCase = new int[0];
        int internedSolution = 0;


        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 5, 3, 6, 7, 9 };
            var solution = 4;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 2, 3 };
            var solution = 4;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 1, 4, 10, 6, 2};
            var solution = 7;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 1000, 999 };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 19, 32, 11, 23 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 5, 8, 9, 13, 14 };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 10, 12 };
            var solution = 7;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 460, 397, 91, 542, 326, 929, 592, 721, 547, 155, 975, 307, 426, 811, 303, 124, 270, 913, 899, 583, 67, 591, 925, 445, 916, 905, 585, 493, 606, 625, 443, 954, 309, 743, 75, 993, 683, 962, 92, 746, 733, 145, 845, 60, 560, 181, 934, 421, 964, 278 };
            var solution = 19;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 513, 15, 18, 20, 23, 539, 39, 42, 44, 53, 55, 575, 779, 68, 583, 584, 591, 598, 89, 90, 93, 607, 617, 106, 619, 109, 626, 627, 127, 642, 136, 139, 144, 366, 672, 674, 165, 679, 174, 176, 179, 694, 715, 802, 210, 724, 728, 744, 233, 722, 241, 639, 766, 767, 258, 774, 267, 268, 789, 289, 290, 805, 318, 323, 331, 338, 851, 342, 344, 863, 871, 878, 370, 884, 373, 889, 378, 390, 397, 913, 914, 921, 942, 946, 438, 440, 449, 450, 458, 504, 469, 472, 483, 485, 160, 509 };
            var solution = 47;
            Test(testCase, solution);
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

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new AvoidObstacles().avoidObstacles(testCase));
        }//private void Test(int[] testCase,int solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                internedSolution = (int)o["output"];
                JArray preTestCase = (JArray)o["input"]["inputArray"];
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
    }//public class AvoidObstaclesTests {
}//namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
