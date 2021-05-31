using Algorithms.src._0_intro._08_dark_wilderness;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._08_dark_wilderness {
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

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 3;
            var testCase2 = 4;
            var testCase3 = 5;
            var testCase4 = 3;
            var testCase5 = 3;
            var solution = 5;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 5;
            var testCase2 = 2;
            var testCase3 = 4;
            var testCase4 = 2;
            var testCase5 = 20;
            var solution = 9;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 2;
            var testCase2 = 2;
            var testCase3 = 2;
            var testCase4 = 2;
            var testCase5 = 2;
            var solution = 2;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 10;
            var testCase2 = 4;
            var testCase3 = 11;
            var testCase4 = 5;
            var testCase5 = 3;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 10;
            var testCase2 = 4;
            var testCase3 = 11;
            var testCase4 = 5;
            var testCase5 = 6;
            var solution = 11;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 12;
            var testCase2 = 4;
            var testCase3 = 11;
            var testCase4 = 5;
            var testCase5 = 6;
            var solution = 12;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = 4;
            var testCase2 = 5;
            var testCase3 = 6;
            var testCase4 = 5;
            var testCase5 = 4;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, testCase4, testCase5, solution);
        }//public void Test15() {

        private void Test(int testCase1, int testCase2, int testCase3, int testCase4, int testCase5, int solution) {
            Assert.AreEqual(solution, new KnapsackLight().knapsackLight(testCase1, testCase2, testCase3, testCase4, testCase5));
        }//private void Test(int testCase1,int testCase2,int testCase3,int testCase4,int testCase5,int solution) {
    }//public class KnapsackLightTests {
}//namespace Algorithms.src_UnitTests._0_intro._08_dark_wilderness {
