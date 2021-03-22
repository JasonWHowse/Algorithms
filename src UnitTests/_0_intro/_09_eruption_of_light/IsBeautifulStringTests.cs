using Algorithms.src._0_intro._09_eruption_of_light;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
    [TestClass()]
    public class IsBeautifulStringTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "bbbaacdafe";
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "aabbb";
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "bbc";
            var solution = false;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "bbbaa";
            var solution = false;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "abcdefghijklmnopqrstuvwxyzz";
            var solution = false;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "abcdefghijklmnopqrstuvwxyz";
            var solution = true;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "abcdefghijklmnopqrstuvwxyzqwertuiopasdfghjklxcvbnm";
            var solution = true;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "fyudhrygiuhdfeis";
            var solution = false;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "zaa";
            var solution = false;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "zyy";
            var solution = false;
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(string testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsBeautifulString().isBeautifulString(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsBeautifulString().isBeautifulString(testCase));
            }//else {
        }//private void Test(string testCase,bool solution) {
    }//public class IsBeautifulStringTests {
}//namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
