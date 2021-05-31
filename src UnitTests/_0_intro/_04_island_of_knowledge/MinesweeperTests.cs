using Algorithms.src._0_intro._04_island_of_knowledge;
using Algorithms.src.helper_functions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Newtonsoft.Json.Linq;

namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
    [TestClass()]
    public class MinesweeperTests {

        private const int timeout = 3000;
        private const string path = "Test_Cases\\_0_intro\\_04_island_of_knowledge\\Minesweeper\\";
        private bool[][] internedTestCase = new bool[0][];
        private int[][] internedSolution = new int[0][];

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            bool[][] testCase = { new bool[] { true, false, false }, new bool[] { false, true, false }, new bool[] { false, false, false } };
            int[][] solution = { new int[] { 1, 2, 1 }, new int[] { 2, 1, 1 }, new int[] { 1, 1, 1 } };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            bool[][] testCase = { new bool[] { false, false, false }, new bool[] { false, false, false } };
            int[][] solution = { new int[] { 0, 0, 0 }, new int[] { 0, 0, 0 } };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            bool[][] testCase = { new bool[] { true, false, false, true }, new bool[] { false, false, true, false }, new bool[] { true, true, false, true } };
            int[][] solution = { new int[] { 0, 2, 2, 1 }, new int[] { 3, 4, 3, 3 }, new int[] { 1, 2, 3, 1 } };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            bool[][] testCase = { new bool[] { true, true, true }, new bool[] { true, true, true }, new bool[] { true, true, true } };
            int[][] solution = { new int[] { 3, 5, 3 }, new int[] { 5, 8, 5 }, new int[] { 3, 5, 3 } };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            bool[][] testCase = { new bool[] { false, true, true, false }, new bool[] { true, true, false, true }, new bool[] { false, false, true, false } };
            int[][] solution = { new int[] { 3, 3, 3, 2 }, new int[] { 2, 4, 5, 2 }, new int[] { 2, 3, 2, 2 } };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            bool[][] testCase = { new bool[] { true, false }, new bool[] { true, false }, new bool[] { false, true }, new bool[] { false, false }, new bool[] { false, false } };
            int[][] solution = { new int[] { 1, 2 }, new int[] { 2, 3 }, new int[] { 2, 1 }, new int[] { 1, 1 }, new int[] { 0, 0 } };
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

        [TestMethod]
        public void Test11() {
            SetTestCaseInfo("test-11.json");
            DoTest();
        }//public void Test11() {

        private void Test(bool[][] testCase, int[][] solution) {
            int[][] actual = new Minesweeper().minesweeper(testCase);
            for (int i = 0; i < actual.Length; i++) {
                CollectionAssert.AreEqual(solution[i], actual[i]);
            }//for (int i = 0; i < actual.Length; i++) {
        }//private void Test(bool[][] testCase,int[][] solution) {

        private void SetTestCaseInfo(string fileName) {
            JObject o = Helpers.GetJsonObject(fileName, path);
            if (o == null) {
                Assert.Fail("JObject for " + fileName + " returns null");
            } else {//if (o == null) {
                JArray preSolution = (JArray)o["output"];
                internedSolution = new int[preSolution.Count][];
                for(int x = 0; x < internedSolution.Length; x++) {
                    internedSolution[x] = new int[((JArray)preSolution[x]).Count];
                    for(int y = 0; y < internedSolution[x].Length; y++) {
                        internedSolution[x][y] = (int)((JArray)preSolution[x])[y];
                    }//for(int y = 0; y < internedSolution[x].Length; y++) {
                }//for(int i = 0; i < internedSolution.Length; i++) {
                JArray preTestCase = (JArray)o["input"]["matrix"];
                internedTestCase = new bool[preTestCase.Count][];
                for (int x = 0; x < internedTestCase.Length; x++) {
                    internedTestCase[x] = new bool[((JArray)preTestCase[x]).Count];
                    for(int y = 0; y < internedTestCase[x].Length; y++) {
                        internedTestCase[x][y] = (bool)((JArray)preTestCase[x])[y];
                    }//for(int y = 0; y < internedTestCase[x].Length; y++) {
                }//for (int i = 0; i < internedTestCase.Length; i++) {
            }//else {
        }//public void SetTestCaseInfo(string fileName) {

        [Timeout(timeout)]
        private void DoTest() {
            Test(internedTestCase, internedSolution);
        }//private void DoTest() {
    }//public class MinesweeperTests {
}//namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
