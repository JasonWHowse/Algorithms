using Algorithms.src._1_the_core._01_at_the_crossroads;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
    [TestClass()]
    public class WillYouTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = true;
            var testCase2 = true;
            var testCase3 = true;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = true;
            var testCase2 = false;
            var testCase3 = true;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = false;
            var testCase2 = false;
            var testCase3 = false;
            var solution = false;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = false;
            var testCase2 = false;
            var testCase3 = true;
            var solution = true;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        private void Test(bool testCase1, bool testCase2, bool testCase3, bool solution) {
            if (solution) {
                Assert.IsTrue(new WillYou().willYou(testCase1, testCase2, testCase3));
            } else {//if (solution) {
                Assert.IsFalse(new WillYou().willYou(testCase1, testCase2, testCase3));
            }//else {
        }//private void Test(bool testCase1, bool testCase2, bool testCase3, bool solution) {
    }//public class WillYouTests {
}//namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
