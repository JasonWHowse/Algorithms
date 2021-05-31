using Algorithms.src._0_intro._05_rains_of_reason;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._05_rains_of_reason {
    [TestClass()]
    public class EvenDigitsOnlyTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 248622;
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 642386;
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 248842;
            var solution = true;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 1;
            var solution = false;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 8;
            var solution = true;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 2462487;
            var solution = false;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = 468402800;
            var solution = true;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = 2468428;
            var solution = true;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = 5468428;
            var solution = false;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = 7468428;
            var solution = false;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = 137777;
            var solution = false;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = 2408440;
            var solution = true;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = 84209044;
            var solution = false;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = 1000000000;
            var solution = false;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase = 800000000;
            var solution = true;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase = 3468428;
            var solution = false;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase = 2468429;
            var solution = false;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase = 2468425;
            var solution = false;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase = 444444444;
            var solution = true;
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase = 888888888;
            var solution = true;
            Test(testCase, solution);
        }//public void Test20() {

        private void Test(int testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new EvenDigitsOnly().evenDigitsOnly(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new EvenDigitsOnly().evenDigitsOnly(testCase));
            }//else {
        }//private void Test(int testCase,bool solution) {
    }//public class EvenDigitsOnlyTests {
}//namespace Algorithms.src_UnitTests._0_intro._05_rains_of_reason {
