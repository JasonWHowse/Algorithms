using Algorithms.src._1_the_core._02_corner_of_0s_and_1s;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
    [TestClass()]
    public class KillKthBitTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 37;
            var testCase2 = 3;
            var solution = 33;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 37;
            var testCase2 = 4;
            var solution = 37;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 37;
            var testCase2 = 2;
            var solution = 37;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 0;
            var testCase2 = 4;
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 2147483647;
            var testCase2 = 16;
            var solution = 2147450879;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 374823748;
            var testCase2 = 13;
            var solution = 374819652;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 2734827;
            var testCase2 = 4;
            var solution = 2734819;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 1084197039;
            var testCase2 = 15;
            var solution = 1084197039;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 1160825071;
            var testCase2 = 3;
            var solution = 1160825067;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 2039063284;
            var testCase2 = 4;
            var solution = 2039063284;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 1981123330;
            var testCase2 = 7;
            var solution = 1981123330;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 427439517;
            var testCase2 = 24;
            var solution = 427439517;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 870677799;
            var testCase2 = 11;
            var solution = 870676775;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 1435387516;
            var testCase2 = 16;
            var solution = 1435387516;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = 319033977;
            var testCase2 = 3;
            var solution = 319033977;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = 773454791;
            var testCase2 = 13;
            var solution = 773450695;
            Test(testCase1, testCase2, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = 2003132370;
            var testCase2 = 25;
            var solution = 1986355154;
            Test(testCase1, testCase2, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = 2738;
            var testCase2 = 30;
            var solution = 2738;
            Test(testCase1, testCase2, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = 2147483647;
            var testCase2 = 31;
            var solution = 1073741823;
            Test(testCase1, testCase2, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase1 = 5;
            var testCase2 = 2;
            var solution = 5;
            Test(testCase1, testCase2, solution);
        }//public void Test20() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new KillKthBit().killKthBit(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class KillKthBitTests {
}//namespace Algorithms.src_UnitTests._1_the_core._02_corner_of_0s_and_1s {
