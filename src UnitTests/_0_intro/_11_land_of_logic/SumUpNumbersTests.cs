using Algorithms.src._0_intro._11_land_of_logic;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
    [TestClass()]
    public class SumUpNumbersTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "2 apples, 12 oranges";
            var solution = 14;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "123450";
            var solution = 123450;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "Your payment method is invalid";
            var solution = 0;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "no digits at all";
            var solution = 0;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "there are some (12) digits 5566 in this 770 string 239";
            var solution = 6587;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "42+781";
            var solution = 823;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "abc abc 4 abc 0 abc";
            var solution = 4;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "abcdefghijklmnopqrstuvwxyz1AbCdEfGhIjKlMnOpqrstuvwxyz23,74 -";
            var solution = 98;
            Test(testCase, solution);
        }//public void Test8() {

        private void Test(string testCase, int solution) {
            Assert.AreEqual(solution, new SumUpNumbers().sumUpNumbers(testCase));
        }//private void Test(string testCase,int solution) {
    }//public class SumUpNumbersTests {
}//namespace Algorithms.src_UnitTests._0_intro._11_land_of_logic {
