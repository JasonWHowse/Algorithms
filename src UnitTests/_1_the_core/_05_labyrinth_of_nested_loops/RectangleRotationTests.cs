using Algorithms.src._1_the_core._05_labyrinth_of_nested_loops;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
    [TestClass()]
    public class RectangleRotationTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 6;
            var testCase2 = 4;
            var solution = 23;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 30;
            var testCase2 = 2;
            var solution = 65;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 8;
            var testCase2 = 6;
            var solution = 49;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 16;
            var testCase2 = 20;
            var solution = 333;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 20;
            var testCase2 = 32;
            var solution = 653;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 30;
            var testCase2 = 26;
            var solution = 795;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 50;
            var testCase2 = 4;
            var solution = 177;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 2;
            var testCase2 = 2;
            var solution = 5;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 50;
            var testCase2 = 50;
            var solution = 2521;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 38;
            var testCase2 = 42;
            var solution = 1563;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 18;
            var testCase2 = 42;
            var solution = 737;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 2;
            var testCase2 = 46;
            var solution = 97;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 16;
            var testCase2 = 38;
            var solution = 609;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 40;
            var testCase2 = 18;
            var solution = 713;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = 50;
            var testCase2 = 2;
            var solution = 107;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = 2;
            var testCase2 = 4;
            var solution = 7;
            Test(testCase1, testCase2, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = 26;
            var testCase2 = 26;
            var solution = 685;
            Test(testCase1, testCase2, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = 48;
            var testCase2 = 8;
            var solution = 369;
            Test(testCase1, testCase2, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = 12;
            var testCase2 = 36;
            var solution = 433;
            Test(testCase1, testCase2, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase1 = 30;
            var testCase2 = 46;
            var solution = 1397;
            Test(testCase1, testCase2, solution);
        }//public void Test20() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new RectangleRotation().rectangleRotation(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2se,int solution) {
    }//public class RectangleRotationTests {
}//namespace Algorithms.src_UnitTests._1_the_core._05_labyrinth_of_nested_loops {
