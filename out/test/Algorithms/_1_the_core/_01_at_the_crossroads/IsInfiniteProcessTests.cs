using Algorithms.src._1_the_core._01_at_the_crossroads;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
    [TestClass()]
    public class IsInfiniteProcessTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 2;
            var testCase2 = 6;
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 2;
            var testCase2 = 3;
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 2;
            var testCase2 = 10;
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 0;
            var testCase2 = 1;
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 3;
            var testCase2 = 1;
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 10;
            var testCase2 = 10;
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 5;
            var testCase2 = 10;
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 6;
            var testCase2 = 10;
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 10;
            var testCase2 = 0;
            var solution = true;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 5;
            var testCase2 = 5;
            var solution = false;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        private void Test(int testCase1, int testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsInfiniteProcess().isInfiniteProcess(testCase1, testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new IsInfiniteProcess().isInfiniteProcess(testCase1, testCase2));
            }//else {
        }//private void Test(int testCase1,int testCase2,bool solution) {
    }//public class IsInfiniteProcessTests {
}//namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
