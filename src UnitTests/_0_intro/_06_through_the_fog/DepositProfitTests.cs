using Algorithms.src._0_intro._06_through_the_fog;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._06_through_the_fog {
    [TestClass()]
    public class DepositProfitTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 100;
            var testCase2 = 20;
            var testCase3 = 170;
            var solution = 3;
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 100;
            var testCase2 = 1;
            var testCase3 = 101;
            var solution = 1;
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 1;
            var testCase2 = 100;
            var testCase3 = 64;
            var solution = 6;
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 20;
            var testCase2 = 20;
            var testCase3 = 50;
            var solution = 6;
            Test(testCase1,testCase2,testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 50;
            var testCase2 = 25;
            var testCase3 = 100;
            var solution = 4;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 70;
            var testCase2 = 10;
            var testCase3 = 77;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 1;
            var testCase2 = 1;
            var testCase3 = 200;
            var solution = 533;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 1;
            var testCase2 = 1;
            var testCase3 = 100;
            var solution = 463;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 60;
            var testCase2 = 5;
            var testCase3 = 80;
            var solution = 6;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 1;
            var testCase2 = 100;
            var testCase3 = 128;
            var solution = 7;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test10() {

        private void Test(int testCase1, int testCase2, int testCase3, int solution) {
            Assert.AreEqual(solution, new DepositProfit().depositProfit(testCase1, testCase2, testCase3));
        }//private void Test(int testCase1,int testCase2,int testCase3,int solution) {
    }//public class DepositProfitTests {
}//namespace Algorithms.src_UnitTests._0_intro._06_through_the_fog {
