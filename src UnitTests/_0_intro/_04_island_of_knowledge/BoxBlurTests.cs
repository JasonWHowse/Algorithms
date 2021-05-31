using Algorithms.src._0_intro._04_island_of_knowledge;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
    [TestClass()]
    public class BoxBlurTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_04_island_of_knowledge\\BoxBlur\\";
        private int[][] internedTestCase = new int[0][];
        private int[][] internedSolution = new int[0][];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[][] testCase = { new int[]{ 1, 1, 1 }, new int[]{ 1, 7, 1 }, new int[]{ 1, 1, 1 } };
            int[][] solution = { new int[]{ 1 } };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[][] testCase = { new int[]{ 0, 18, 9 }, new int[]{ 27, 9, 0 }, new int[]{ 81, 63, 45 } };
            int[][] solution = { new int[]{ 28 } };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[][] testCase = { new int[]{ 36, 0, 18, 9 }, new int[]{ 27, 54, 9, 0 }, new int[]{ 81, 63, 72, 45 } };
            int[][] solution = { new int[]{ 40, 30 } };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[][] testCase = { new int[]{ 7, 4, 0, 1 }, new int[]{ 5, 6, 2, 2 }, new int[]{ 6, 10, 7, 8 }, new int[]{ 1, 4, 2, 0 } };
            int[][] solution = { new int[]{ 5, 4 }, new int[]{ 4, 4 } };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[][] testCase = { new int[]{ 36, 0, 18, 9, 9, 45, 27 }, new int[]{ 27, 0, 54, 9, 0, 63, 90 }, new int[]{ 81, 63, 72, 45, 18, 27, 0 }, new int[]{ 0, 0, 9, 81, 27, 18, 45 }, new int[]{ 45, 45, 27, 27, 90, 81, 72 }, new int[]{ 45, 18, 9, 0, 9, 18, 45 }, new int[]{ 27, 81, 36, 63, 63, 72, 81 } };
            int[][] solution = { new int[]{ 39, 30, 26, 25, 31 }, new int[]{ 34, 37, 35, 32, 32 }, new int[]{ 38, 41, 44, 46, 42 }, new int[]{ 22, 24, 31, 39, 45 }, new int[]{ 37, 34, 36, 47, 59 } };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[][] testCase = { new int[] { 36, 0, 18, 9, 9, 45, 27 }, new int[] { 27, 0, 254, 9, 0, 63, 90 }, new int[] { 81, 255, 72, 45, 18, 27, 0 }, new int[] { 0, 0, 9, 81, 27, 18, 45 }, new int[] { 45, 45, 227, 227, 90, 81, 72 }, new int[] { 45, 18, 9, 255, 9, 18, 45 }, new int[] { 27, 81, 36, 127, 255, 72, 81 } };
            int[][] solution = { new int[] { 82, 73, 48, 25, 31 }, new int[] { 77, 80, 57, 32, 32 }, new int[] { 81, 106, 88, 68, 42 }, new int[] { 44, 96, 103, 89, 45 }, new int[] { 59, 113, 137, 126, 80 } };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[][] testCase = { new int[] { 8, 157, 172 }, new int[] { 17, 186, 189 }, new int[] { 73, 114, 197 }, new int[] { 132, 142, 76 } };
            int[][] solution = { new int[] { 123 }, new int[] { 125 } };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[][] testCase = { new int[] { 208, 99, 59, 136, 161, 6, 219, 192, 85, 49 }, new int[] { 194, 105, 43, 254, 153, 225, 171, 197, 1, 154 }, new int[] { 221, 178, 119, 169, 134, 7, 76, 61, 99, 22 }, new int[] { 161, 254, 172, 12, 174, 200, 216, 107, 109, 109 } };
            int[][] solution = { new int[] { 136, 129, 136, 138, 128, 128, 122, 95 }, new int[] { 160, 145, 136, 147, 150, 140, 115, 95 } };
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[][] testCase = { new int[] { 172, 14, 85, 186, 28, 155, 122, 39, 44 }, new int[] { 71, 215, 117, 16, 56, 107, 126, 114, 214 }, new int[] { 83, 173, 135, 218, 151, 200, 133, 58, 8 }, new int[] { 249, 119, 57, 134, 255, 70, 82, 238, 37 }, new int[] { 199, 76, 110, 36, 121, 185, 187, 82, 92 }, new int[] { 106, 231, 120, 126, 41, 205, 203, 57, 185 }, new int[] { 246, 241, 81, 146, 148, 46, 16, 128, 233 } };
            int[][] solution = { new int[] { 118, 128, 110, 124, 119, 117, 95 }, new int[] { 135, 131, 126, 134, 131, 125, 112 }, new int[] { 133, 117, 135, 152, 153, 137, 101 }, new int[] { 140, 112, 111, 130, 149, 145, 129 }, new int[] { 156, 129, 103, 117, 128, 123, 131 } };
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

        private void Test(int[][] testCase, int[][] solution) {
            int[][] actual= new BoxBlur().boxBlur(testCase);
            for (int i = 0; i < actual.Length; i++) {
                CollectionAssert.AreEqual(solution[i], actual[i]);
            }//for (int i = 0; i < actual.Length; i++) {
        }//private void Test(int[][] testCase,int[][] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                internedSolution = new int[preSolution.Count][];
                for (int x = 0; x < internedSolution.Length; x++) {
                    internedSolution[x] = new int[((JArray)preSolution[x]).Count];
                    for (int y = 0; y < internedSolution[x].Length; y++) {
                        internedSolution[x][y] = (int)((JArray)preSolution[x])[y];
                    }//for(int y = 0; y < internedSolution[x].Length; y++) {
                }//for(int i = 0; i < internedSolution.Length; i++) {
                JArray preTestCase = (JArray)o["input"]["image"];
                internedTestCase = new int[preTestCase.Count][];
                for (int x = 0; x < internedTestCase.Length; x++) {
                    internedTestCase[x] = new int[((JArray)preTestCase[x]).Count];
                    for (int y = 0; y < internedTestCase[x].Length; y++) {
                        internedTestCase[x][y] = (int)((JArray)preTestCase[x])[y];
                    }//for(int y = 0; y < internedTestCase[x].Length; y++) {
                }//for (int i = 0; i < internedTestCase.Length; i++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class BoxBlurTests {
}//namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
