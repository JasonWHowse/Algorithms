using Algorithms.src._0_intro._04_island_of_knowledge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
    [TestClass()]
    public class MinesweeperTests {

        private const int timeout = 3000;

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

        private void Test(bool[][] testCase, int[][] solution) {
            int[][] actual = new Minesweeper().minesweeper(testCase);
            for (int i = 0; i < actual.Length; i++) {
                CollectionAssert.AreEqual(solution[i], actual[i]);
            }
        }//private void Test(bool[][] testCase,int[][] solution) {
    }//public class MinesweeperTests {
}//namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
