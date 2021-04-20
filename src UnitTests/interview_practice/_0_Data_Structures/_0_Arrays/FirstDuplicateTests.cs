using Algorithms.src.interview_practice._0_Data_Structures._0_Arrays;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {
    [TestClass()]
    public class FirstDuplicateTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 2, 1, 3, 5, 3, 2 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { 2, 2 };
            var solution = 2;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 2, 4, 3, 5, 1 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 1 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 5, 5, 5, 5, 5 };
            var solution = 5;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 2, 1 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 2, 1, 3 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { 2, 3, 3 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 3, 3, 3 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 8, 4, 6, 2, 6, 4, 7, 9, 5, 8 };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { 10, 6, 8, 4, 9, 1, 7, 2, 5, 3 };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { 1, 1, 2, 2, 1 };
            var solution = 1;
            Test(testCase, solution);
        }//public void Test12() {

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new FirstDuplicate().firstDuplicate(testCase));
        }//private void Test(int[] testCase,int solution) {
    }//public class FirstDuplicateTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._0_Arrays {