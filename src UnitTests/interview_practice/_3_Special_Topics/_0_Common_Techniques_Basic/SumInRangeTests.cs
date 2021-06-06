using Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
    [TestClass()]
    public class SumInRangeTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 3, 0, -2, 6, -3, 2 };
            int[][] testCase2 = { new int[] { 0, 2 }, new int[] { 2, 5 }, new int[] { 0, 5 } };
            var solution = 10;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { -1000 };
            int[][] testCase2 = { new int[] { 0, 0 } };
            var solution = 999999007;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 34, 19, 21, 5, 1, 10, 26, 46, 33, 10 };
            int[][] testCase2 = { new int[] { 3, 7 }, new int[] { 3, 4 }, new int[] { 3, 7 }, new int[] { 4, 5 }, new int[] { 0, 5 } };
            var solution = 283;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { -4, -18, -22, -14, -33, -47, -29, -35, -50, -19 };
            int[][] testCase2 = { new int[] { 2, 9 }, new int[] { 5, 6 }, new int[] { 1, 2 }, new int[] { 2, 2 }, new int[] { 4, 5 } };
            var solution = 999999540;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { -23, -8, -52, -58, 93, -16, -26, 75, -77, 25, 90, -50, -31, 70, 53, -68, 96, 100, 69, 13 };
            int[][] testCase2 = { new int[] { 0, 4 }, new int[] { 0, 8 }, new int[] { 7, 7 }, new int[] { 3, 4 }, new int[] { 2, 3 }, new int[] { 0, 3 }, new int[] { 8, 8 }, new int[] { 2, 2 }, new int[] { 5, 7 }, new int[] { 2, 2 } };
            var solution = 999999578;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { -77, 54, -59, -94, -13, -78, -81, -38, -26, 17, -73, -88, 90, -42, -63, -36, 37, 25, -22, 4, 25, -86, -44, 88, 2, -47, -29, 71, 54, -42 };
            int[][] testCase2 = { new int[] { 2, 2 }, new int[] { 4, 7 }, new int[] { 2, 4 }, new int[] { 0, 2 }, new int[] { 3, 6 }, new int[] { 6, 6 }, new int[] { 3, 3 }, new int[] { 2, 7 }, new int[] { 3, 4 }, new int[] { 3, 3 }, new int[] { 2, 9 }, new int[] { 0, 1 }, new int[] { 4, 4 }, new int[] { 2, 3 }, new int[] { 0, 6 }, new int[] { 4, 4 }, new int[] { 2, 3 }, new int[] { 0, 5 }, new int[] { 2, 5 }, new int[] { 4, 5 } };
            var solution = 999996808;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 1000 };
            int[][] testCase2 = { new int[] { 0, 0 } };
            var solution = 1000;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        private void Test(int[] testCase1, int[][] testCase2, int solution) {
            Assert.AreEqual(solution, new SumInRange().sumInRange(testCase1, testCase2));
        }//private void Test(int[] testCase1, int[][] testCase2, int solution) {
    }//public class SumInRangeTests {
}//namespace Algorithms.src_UnitTests.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
