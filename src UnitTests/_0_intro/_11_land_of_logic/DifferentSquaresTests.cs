using Algorithms.src._0_intro._11_land_of_logic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
    [TestClass()]
    public class DifferentSquaresTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[][] testCase = { new int[] { 1, 2, 1 }, new int[] { 2, 2, 2 }, new int[] { 2, 2, 2 }, new int[] { 1, 2, 3 }, new int[] { 2, 2, 1 } };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[][] testCase = { new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 }, new int[] { 9, 9, 9, 9, 9 } };
            var solution = 1;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[][] testCase = { new int[] { 3 } };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[][] testCase = { new int[] { 3, 4, 5, 6, 7, 8, 9 } };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[][] testCase = { new int[] { 3 }, new int[] { 4 }, new int[] { 5 }, new int[] { 6 }, new int[] { 7 } };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[][] testCase = { new int[] { 2, 5, 3, 4, 3, 1, 3, 2 }, new int[] { 4, 5, 4, 1, 2, 4, 1, 3 }, new int[] { 1, 1, 2, 1, 4, 1, 1, 5 }, new int[] { 1, 3, 4, 2, 3, 4, 2, 4 }, new int[] { 1, 5, 5, 2, 1, 3, 1, 1 }, new int[] { 1, 2, 3, 3, 5, 1, 2, 4 }, new int[] { 3, 1, 4, 4, 4, 1, 5, 5 }, new int[] { 5, 1, 3, 3, 1, 5, 3, 5 }, new int[] { 5, 4, 4, 3, 5, 4, 4, 4 } };
            var solution = 54;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[][] testCase = { new int[] { 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 9, 9, 9, 2, 3, 9 } };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test7() {

        private void Test(int[][] testCase, int solution) {
            Assert.AreEqual(solution, new DifferentSquares().differentSquares(testCase));
        }//private void Test(int[][] testCase, int solution) {
    }//public class DifferentSquaresTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
