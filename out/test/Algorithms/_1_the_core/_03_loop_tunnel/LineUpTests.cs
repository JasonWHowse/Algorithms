using Algorithms.src._1_the_core._03_loop_tunnel;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
    [TestClass()]
    public class LineUpTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = "LLARL";
            var solution = 3;
            Test(testCase1, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = "RLR";
            var solution = 1;
            Test(testCase1, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = "";
            var solution = 0;
            Test(testCase1, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = "L";
            var solution = 0;
            Test(testCase1, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = "A";
            var solution = 1;
            Test(testCase1, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = "AAAAAAAAAAAAAAA";
            var solution = 15;
            Test(testCase1, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = "RRRRRRRRRRLLLLLLLLLRRRRLLLLLLLLLL";
            var solution = 16;
            Test(testCase1, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = "AALAAALARAR";
            var solution = 5;
            Test(testCase1, solution);
        }//public void Test8() {

        private void Test(string testCase, int solution) {
            Assert.AreEqual(solution, new LineUp().lineUp(testCase));
        }//private void Test(string testCase,int solution) {
    }//public class LineUpTests {
}//namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
