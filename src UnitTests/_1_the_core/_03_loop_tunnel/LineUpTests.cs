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

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = "LRALARRAALARLALRAALLLRAALRALAALR";
            var solution = 17;
            Test(testCase1, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = "LRLRLRRL";
            var solution = 4;
            Test(testCase1, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = "LLRR";
            var solution = 2;
            Test(testCase1, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = "R";
            var solution = 0;
            Test(testCase1, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = "RLARA";
            var solution = 2;
            Test(testCase1, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = "LALRRLRLRA";
            var solution = 5;
            Test(testCase1, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = "LALRLLRRRRRAALAAARLRAAALL";
            var solution = 13;
            Test(testCase1, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = "LAAARAAALARAAALAAALRAA";
            var solution = 9;
            Test(testCase1, solution);
        }//public void Test16() {

        private void Test(string testCase, int solution) {
            Assert.AreEqual(solution, new LineUp().lineUp(testCase));
        }//private void Test(string testCase,int solution) {
    }//public class LineUpTests {
}//namespace Algorithms.src_UnitTests._1_the_core._03_loop_tunnel {
