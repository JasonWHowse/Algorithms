using Algorithms.src.interview_practice._3_Special_Topics._0_Common_Techniques_Basic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
    [TestClass()]
    public class SumOfTwoTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = new int[] { 1, 2, 3 };
            int[] testCase2 = new int[] { 10, 20, 30, 40 };
            var testCase3 = 42;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = new int[] { 1, 2, 3 };
            int[] testCase2 = new int[] { 10, 20, 30, 40 };
            var testCase3 = 50;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = new int[] { };
            int[] testCase2 = new int[] { 1, 2, 3, 4 };
            var testCase3 = 4;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = new int[] { 10, 1, 5, 3, 8 };
            int[] testCase2 = new int[] { 100, 6, 3, 1, 5 };
            var testCase3 = 4;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = new int[] { 1, 4, 3, 6, 10, 1, 0, 1, 6, 5 };
            int[] testCase2 = new int[] { 9, 5, 6, 9, 0, 1, 2, 1, 6, 10 };
            var testCase3 = 8;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = new int[] { 3, 2, 3, 7, 5, 0, 3, 0, 4, 2 };
            int[] testCase2 = new int[] { 6, 8, 2, 9, 7, 10, 3, 8, 6, 0 };
            var testCase3 = 2;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = new int[] { 4, 6, 4, 2, 9, 6, 6, 2, 9, 2 };
            int[] testCase2 = new int[] { 3, 4, 5, 1, 4, 10, 9, 9, 6, 4 };
            var testCase3 = 5;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase1 = new int[] { 6, 10, 25, 13, 20, 21, 11, 10, 18, 21 };
            int[] testCase2 = new int[] { 21, 10, 6, 0, 29, 25, 1, 17, 19, 25 };
            var testCase3 = 37;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase1 = new int[] { 22, 26, 6, 22, 17, 11, 9, 22, 7, 12 };
            int[] testCase2 = new int[] { 14, 25, 22, 27, 22, 30, 6, 26, 30, 27 };
            var testCase3 = 56;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase1 = new int[] { 17, 72, 18, 72, 73, 15, 83, 90, 8, 18 };
            int[] testCase2 = new int[] { 100, 27, 33, 51, 2, 71, 76, 19, 16, 43 };
            var testCase3 = 37;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase1 = new int[] { 75, 38, 10, 57, 67, 39, 26, 14, 53, 80 };
            int[] testCase2 = new int[] { 3, 19, 28, 92, 92, 47, 98, 30, 71, 21 };
            var testCase3 = 61;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase1 = new int[] { 1, 2, 3 };
            int[] testCase2 = new int[] { };
            var testCase3 = 1;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test12() {

        private void Test(int[] testCase1, int[] testCase2, int testCase3, bool solution) {
            if (solution) {
                Assert.IsTrue(new SumOfTwo().sumOfTwo(testCase1, testCase2, testCase3));
            } else {//if (solution) {
                Assert.IsFalse(new SumOfTwo().sumOfTwo(testCase1, testCase2, testCase3));
            }//else {
        }//private void Test(int[] testCase1, int[] testCase2, int testCase3, bool solution) {
    }//public class SumOfTwoTests {
}//namespace Algorithms.src_UnitTests.interview_practice._3_Special_Topics._0_Common_Techniques_Basic {
