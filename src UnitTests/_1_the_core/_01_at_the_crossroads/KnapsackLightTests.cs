using Algorithms.src._1_the_core._01_at_the_crossroads;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
    [TestClass()]
    public class KnapsackLightTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 10;
            var testCase2 = 6;
            var testCase3 = 5;
            var testCase4 = 4;
            var testCase5 = 8;
            var solution = 10;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 10;
            var testCase2 = 5;
            var testCase3 = 6;
            var testCase4 = 4;
            var testCase5 = 9;
            var solution = 16;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 5;
            var testCase2 = 3;
            var testCase3 = 7;
            var testCase4 = 4;
            var testCase5 = 6;
            var solution = 7;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 10;
            var testCase2 = 2;
            var testCase3 = 11;
            var testCase4 = 3;
            var testCase5 = 1;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 15;
            var testCase2 = 2;
            var testCase3 = 20;
            var testCase4 = 3;
            var testCase5 = 2;
            var solution = 15;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 2;
            var testCase2 = 5;
            var testCase3 = 3;
            var testCase4 = 4;
            var testCase5 = 5;
            var solution = 3;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 4;
            var testCase2 = 3;
            var testCase3 = 3;
            var testCase4 = 4;
            var testCase5 = 4;
            var solution = 4;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 3;
            var testCase2 = 5;
            var testCase3 = 3;
            var testCase4 = 8;
            var testCase5 = 10;
            var solution = 3;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test8() {

        private void Test(int testCase1, int testCase2, int testCase3, int testCase4, int testCase5, int solution) {
            Assert.AreEqual(solution, new KnapsackLight().knapsackLight(testCase1, testCase2, testCase3, testCase4, testCase5));
        }//private void Test(int testCase1,int testCase2,int testCase3,int testCase4,int testCase5,int solution) {
    }//public class KnapsackLightTests {
}//namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
