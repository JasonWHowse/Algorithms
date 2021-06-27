using Algorithms.src._1_the_core._06_book_market;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
    [TestClass()]
    public class IsMAC48AddressTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "00-1B-63-84-45-E6";
            Test(testCase, true);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "Z1-1B-63-84-45-E6";
            Test(testCase, false);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "not a MAC-48 address";
            Test(testCase, false);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "FF-FF-FF-FF-FF-FF";
            Test(testCase, true);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "00-00-00-00-00-00";
            Test(testCase, true);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "G0-00-00-00-00-00";
            Test(testCase, false);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "02-03-04-05-06-07-";
            Test(testCase, false);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "12-34-56-78-9A-BC";
            Test(testCase, true);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "FF-FF-AB-CD-EA-BC";
            Test(testCase, true);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "12-34-56-78-9A-BG";
            Test(testCase, false);
        }//public void Test10() {

        private void Test(string testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsMAC48Address().isMAC48Address(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsMAC48Address().isMAC48Address(testCase));
            }//else {
        }//private void Test(string testCase, bool solution) {
    }//public class IsMAC48AddressTests {
}//namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
