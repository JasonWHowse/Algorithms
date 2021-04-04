using Algorithms.src._0_intro._02_smooth_sailing;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
    [TestClass()]
    public class SortByHeightTests {

        private const int timeout = 3000;

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

        private void Test(int[] testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new SortByHeight().sortByHeight(testCase));
        }//private void Test(var testCase,var solution) {
    }//public class SortByHeightTests {
}//namespace Algorithms.src_UnitTests._0_intro._02_smooth_sailing {
