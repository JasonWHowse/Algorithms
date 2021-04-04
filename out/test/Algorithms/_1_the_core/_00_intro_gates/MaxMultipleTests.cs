using Algorithms.src._1_the_core._00_intro_gates;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
    [TestClass()]
    public class MaxMultipleTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 3;
            var testCase2 = 10;
            var solution = 9;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 2;
            var testCase2 = 7;
            var solution = 6;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 10;
            var testCase2 = 50;
            var solution = 50;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 7;
            var testCase2 = 100;
            var solution = 98;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 7;
            var testCase2 = 20;
            var solution = 14;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 5;
            var testCase2 = 13;
            var solution = 10;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 8;
            var testCase2 = 88;
            var solution = 88;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 10;
            var testCase2 = 100;
            var solution = 100;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 2;
            var testCase2 = 5;
            var solution = 4;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 3;
            var testCase2 = 5;
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 9;
            var testCase2 = 11;
            var solution = 9;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 8;
            var testCase2 = 15;
            var solution = 8;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 9;
            var testCase2 = 60;
            var solution = 54;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new MaxMultiple().maxMultiple(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class MaxMultipleTests {
}//namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {