using Algorithms.src._1_the_core._03_loop_tunnel;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
    [TestClass()]
    public class MagicalWellTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 1;
            var testCase2 = 2;
            var testCase3 = 2;
            var solution = 8;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 1;
            var testCase2 = 1;
            var testCase3 = 1;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 6;
            var testCase2 = 5;
            var testCase3 = 3;
            var solution = 128;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 1601;
            var testCase2 = 337;
            var testCase3 = 0;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 1891;
            var testCase2 = 352;
            var testCase3 = 0;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 1936;
            var testCase2 = 1835;
            var testCase3 = 5;
            var solution = 17800540;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 957;
            var testCase2 = 57;
            var testCase3 = 2;
            var solution = 110113;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 687;
            var testCase2 = 1337;
            var testCase3 = 0;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 491;
            var testCase2 = 1552;
            var testCase3 = 4;
            var solution = 3060400;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 1275;
            var testCase2 = 362;
            var testCase3 = 2;
            var solution = 924738;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test10() {

        private void Test(int testCase1, int testCase2, int testCase3, int solution) {
            Assert.AreEqual(solution, new MagicalWell().magicalWell(testCase1, testCase2, testCase3));
        }//private void Test(int testCase1,int testCase2, int testCase3,int solution) {
    }//public class MagicalWellTests {
}//namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
