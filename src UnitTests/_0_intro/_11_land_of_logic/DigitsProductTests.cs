using Algorithms.src._0_intro._11_land_of_logic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
    [TestClass()]
    public class DigitsProductTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = 12;
            var solution = 26;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = 19;
            var solution = -1;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = 450;
            var solution = 2559;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = 0;
            var solution = 10;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = 13;
            var solution = -1;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = 1;
            var solution = 1;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = 243;
            var solution = 399;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = 576;
            var solution = 889;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = 360;
            var solution = 589;
            Test(testCase, solution);
        }//public void Test9() {

        private void Test(int testCase, int solution) {
            Assert.AreEqual(solution, new DigitsProduct().digitsProduct(testCase));
        }//private void Test(int testCase,int solution) {
    }//public class DigitsProductTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
