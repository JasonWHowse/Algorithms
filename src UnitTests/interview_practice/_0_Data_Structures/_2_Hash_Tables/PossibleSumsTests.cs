using Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
    [TestClass()]
    public class PossibleSumsTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 10, 50, 100 };
            int[] testCase2 = { 1, 2, 1 };
            var solution = 9;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 10, 50, 100, 500 };
            int[] testCase2 = { 5, 3, 2, 2 };
            var solution = 122;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 1 };
            int[] testCase2 = { 5 };
            var solution = 5;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 1, 1 };
            int[] testCase2 = { 2, 3 };
            var solution = 5;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 1, 2 };
            int[] testCase2 = { 50000, 2 };
            var solution = 50004;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { 1, 2, 3 };
            int[] testCase2 = { 2, 3, 10000 };
            var solution = 30008;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 3, 1, 1 };
            int[] testCase2 = { 111, 84, 104 };
            var solution = 521;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase1 = { 1, 1, 1, 1, 1 };
            int[] testCase2 = { 9, 19, 18, 12, 19 };
            var solution = 77;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase1 = { 3, 2, 5, 2, 3, 5, 4 };
            int[] testCase2 = { 4, 6, 4, 9, 6, 8, 8 };
            var solution = 150;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase1 = { 6, 12, 7, 16, 8, 5, 17, 18, 6 };
            int[] testCase2 = { 3, 4, 4, 2, 6, 4, 4, 2, 5 };
            var solution = 318;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase1 = { 13, 8, 31, 7, 10, 36, 28, 11, 11, 11 };
            int[] testCase2 = { 6, 3, 2, 2, 2, 2, 6, 1, 5, 4 };
            var solution = 532;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase1 = { 34, 39, 20, 47, 33, 49, 53, 8, 48, 44, 51, 47 };
            int[] testCase2 = { 2, 3, 2, 2, 2, 4, 1, 2, 3, 3, 2, 1 };
            var solution = 1005;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase1 = { 50, 48, 44, 46, 34, 53, 29, 27, 38, 30, 54, 56, 6, 55, 31 };
            int[] testCase2 = { 3, 1, 1, 2, 3, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2 };
            var solution = 902;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[] testCase1 = { 50, 48, 44, 46, 34, 53, 29, 27, 38, 30, 54, 56, 6, 55, 31 };
            int[] testCase2 = { 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1 };
            var solution = 862;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[] testCase1 = { 5, 46, 27, 17, 54, 10, 14, 54, 40, 44, 22, 61, 19, 20, 68, 40, 2, 31 };
            int[] testCase2 = { 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2 };
            var solution = 651;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[] testCase1 = { 17, 27, 22, 18, 9, 58, 50, 85, 67, 50, 42, 11, 60, 39, 23, 37, 28, 91, 81 };
            int[] testCase2 = { 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
            var solution = 862;
            Test(testCase1, testCase2, solution);
        }//public void Test16() {

        private void Test(int[] testCase1, int[] testCase2, int solution) {
            Assert.AreEqual(solution, new PossibleSums().possibleSums(testCase1, testCase2));
        }//private void Test(int[] testCase1, int[] testCase2, int solution) {
    }//public class PossibleSumsTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
