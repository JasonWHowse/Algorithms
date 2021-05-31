using Algorithms.src._1_the_core._00_intro_gates;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
    [TestClass()]
    public class SeatsInTheaterTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 16;
            var testCase2 = 11;
            var testCase3 = 5;
            var testCase4 = 3;
            var solution = 96;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 1;
            var testCase2 = 1;
            var testCase3 = 1;
            var testCase4 = 1;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 13;
            var testCase2 = 6;
            var testCase3 = 8;
            var testCase4 = 3;
            var solution = 18;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 60;
            var testCase2 = 100;
            var testCase3 = 60;
            var testCase4 = 1;
            var solution = 99;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 1000;
            var testCase2 = 1000;
            var testCase3 = 1000;
            var testCase4 = 1000;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 100;
            var testCase2 = 100;
            var testCase3 = 1;
            var testCase4 = 100;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 429;
            var testCase2 = 718;
            var testCase3 = 213;
            var testCase4 = 534;
            var solution = 39928;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 985;
            var testCase2 = 299;
            var testCase3 = 478;
            var testCase4 = 299;
            var solution = 0;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 596;
            var testCase2 = 162;
            var testCase3 = 364;
            var testCase4 = 160;
            var solution = 466;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 1000;
            var testCase2 = 1000;
            var testCase3 = 567;
            var testCase4 = 983;
            var solution = 7378;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test10() {

        private void Test(int testCase1, int testCase2, int testCase3, int testCase4, int solution) {
            Assert.AreEqual(solution, new SeatsInTheater().seatsInTheater(testCase1, testCase2, testCase3, testCase4));
        }//private void Test(int testCase1,int testCase2,int testCase3,int testCase4,int solution) {
    }//public class SeatsInTheaterTests {
}//namespace Algorithms.src_UnitTests._1_the_core._00_intro_gates {
