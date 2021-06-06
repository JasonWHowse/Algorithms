using Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
    [TestClass()]
    public class ArrayMaxConsecutiveSum2Tests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { -2, 2, 5, -11, 6 };
            var solution = 7;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { -3, -2, -1, -4 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { -3, 2, 1, -4 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 1, -2, 3, -4, 5, -3, 2, 2, 2 };
            var solution = 8;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 11, -2, 1, -4, 5, -3, 2, 2, 2 };
            var solution = 14;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 89, 96, 60, 10, 24, 30, 72, 40, 74, 49, 38, 87, 55, 46, 44, 14, 49, 88, 93, 11 };
            var solution = 1069;
            Test(testCase, solution);
        }//public void Test6() {

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new ArrayMaxConsecutiveSum2().arrayMaxConsecutiveSum2(testCase));
        }//private void Test(int[] testCase, int solution) {
    }//public class ArrayMaxConsecutiveSum2Tests {
}//namespace Algorithms.src_UnitTests.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
