using Algorithms.src._1_the_core._01_at_the_crossroads;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
    [TestClass()]
    public class ExtraNumberTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 2;
            var testCase2 = 7;
            var testCase3 = 2;
            var solution = 7;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 3;
            var testCase2 = 2;
            var testCase3 = 2;
            var solution = 3;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 5;
            var testCase2 = 5;
            var testCase3 = 1;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 500000000;
            var testCase2 = 3;
            var testCase3 = 500000000;
            var solution = 3;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 1;
            var testCase2 = 5;
            var testCase3 = 1;
            var solution = 5;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 5;
            var testCase2 = 5;
            var testCase3 = 3;
            var solution = 3;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 5;
            var testCase2 = 1;
            var testCase3 = 1;
            var solution = 5;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 4000000;
            var testCase2 = 3000000;
            var testCase3 = 4000000;
            var solution = 3000000;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 548442737;
            var testCase2 = 82231042;
            var testCase3 = 548442737;
            var solution = 82231042;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 469992838;
            var testCase2 = 66019520;
            var testCase3 = 66019520;
            var solution = 469992838;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test10() {

        private void Test(int testCase1, int testCase2, int testCase3, int solution) {
            Assert.AreEqual(solution, new ExtraNumber().extraNumber(testCase1, testCase2, testCase3));
        }//private void Test(int testCase1,int testCase2,int testCase3,int solution) {
    }//public class ExtraNumberTests {
}//namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
