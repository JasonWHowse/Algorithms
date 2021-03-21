using Algorithms.src._0_intro._07_diving_deeper;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._07_diving_deeper {
    [TestClass()]
    public class ExtractEachKthTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            var testCase2 = 3;
            int[] solution = { 1, 2, 4, 5, 7, 8, 10 };
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 1, 1, 1, 1, 1 };
            var testCase2 = 1;
            int[] solution = { };
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { 1, 2, 1, 2, 1, 2, 1, 2 };
            var testCase2 = 2;
            int[] solution = { 1, 1, 1, 1 };
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 1, 2, 1, 2, 1, 2, 1, 2 };
            var testCase2 = 10;
            int[] solution = { 1, 2, 1, 2, 1, 2, 1, 2 };
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 2, 4, 6, 8, 10 };
            var testCase2 = 2;
            int[] solution = { 2, 6, 10 };
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        private void Test(int[] testCase1, int testCase2, int[] solution) {
            CollectionAssert.AreEqual(solution, new ExtractEachKth().extractEachKth(testCase1,testCase2));
        }//private void Test(int[] testCase1, int testCase2,int[] solution) {
    }//public class ExtractEachKthTests {
}//namespace Algorithms.src_UnitTests._0_intro._07_diving_deeper {
