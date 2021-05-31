using Algorithms.src._0_intro._09_eruption_of_light;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
    [TestClass()]
    public class IsMAC48AddressTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "00-1B-63-84-45-E6";
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "Z1-1B-63-84-45-E6";
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "not a MAC-48 address";
            var solution = false;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "FF-FF-FF-FF-FF-FF";
            var solution = true;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "00-00-00-00-00-00";
            var solution = true;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "G0-00-00-00-00-00";
            var solution = false;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "02-03-04-05-06-07-";
            var solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "12-34-56-78-9A-BC";
            var solution = true;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "FF-FF-AB-CD-EA-BC";
            var solution = true;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "12-34-56-78-9A-BG";
            var solution = false;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "1234-56-78-9A-BC";
            var solution = false;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = "12-34-56-78-9A-";
            var solution = false;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = "12.34.56.78.9A.BC";
            var solution = false;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = "-----------------";
            var solution = false;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase = "AB-CD-EF-12-34-56";
            var solution = true;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase = "0-12-34-56-78-9A";
            var solution = false;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase = "02-03-04-05-06-070";
            var solution = false;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase = "00--00-00-00-00-00";
            var solution = false;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase = "23-25-E4-39-40-11-";
            var solution = false;
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase = "AB-CD-EF-12-34_56";
            var solution = false;
            Test(testCase, solution);
        }//public void Test20() {

        private void Test(string testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsMAC48Address().isMAC48Address(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsMAC48Address().isMAC48Address(testCase));
            }//else {
        }//private void Test(string testCase,bool solution) {
    }//public class IsMAC48AddressTests {
}//namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
