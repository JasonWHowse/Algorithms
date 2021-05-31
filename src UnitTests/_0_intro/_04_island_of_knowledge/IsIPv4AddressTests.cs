using Algorithms.src._0_intro._04_island_of_knowledge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
    [TestClass()]
    public class IsIPv4AddressTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "172.16.254.1";
            var solution = true;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "172.316.254.1";
            var solution = false;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = ".254.255.0";
            var solution = false;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "1.1.1.1a";
            var solution = false;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "1";
            var solution = false;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "0.254.255.0";
            var solution = true;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "1.23.256.255";
            var solution = false;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "1.23.256..";
            var solution = false;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "0..1.0";
            var solution = false;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "64.233.161.00";
            var solution = false;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "64.00.161.131";
            var solution = false;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = "01.233.161.131";
            var solution = false;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = "35..36.9.9.0";
            var solution = false;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = "1.1.1.1.1";
            var solution = false;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase = "1.256.1.1";
            var solution = false;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase = "a0.1.1.1";
            var solution = false;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase = "0.1.1.256";
            var solution = false;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase = "129380129831213981.255.255.255";
            var solution = false;
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase = "255.255.255.255abcdekjhf";
            var solution = false;
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase = "7283728";
            var solution = false;
            Test(testCase, solution);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            var testCase = "0..1.0.0";
            var solution = false;
            Test(testCase, solution);
        }//public void Test21() {

        [TestMethod(), Timeout(timeout)]
        public void Test22() {
            var testCase = "256.255.255.0";
            var solution = false;
            Test(testCase, solution);
        }//public void Test22() {

        [TestMethod(), Timeout(timeout)]
        public void Test23() {
            var testCase = "255.255.255.255";
            var solution = true;
            Test(testCase, solution);
        }//public void Test23() {

        [TestMethod(), Timeout(timeout)]
        public void Test24() {
            var testCase = "255.255.256.255";
            var solution = false;
            Test(testCase, solution);
        }//public void Test24() {

        [TestMethod(), Timeout(timeout)]
        public void Test25() {
            var testCase = "255..255.255";
            var solution = false;
            Test(testCase, solution);
        }//public void Test25() {

        [TestMethod(), Timeout(timeout)]
        public void Test26() {
            var testCase = "0.0.0.0";
            var solution = true;
            Test(testCase, solution);
        }//public void Test26() {

        [TestMethod(), Timeout(timeout)]
        public void Test27() {
            var testCase = ".0.0.0";
            var solution = false;
            Test(testCase, solution);
        }//public void Test27() {

        [TestMethod(), Timeout(timeout)]
        public void Test28() {
            var testCase = "0.0.0z.0";
            var solution = false;
            Test(testCase, solution);
        }//public void Test28() {

        [TestMethod(), Timeout(timeout)]
        public void Test29() {
            var testCase = "0.0.0.0.0";
            var solution = false;
            Test(testCase, solution);
        }//public void Test29() {

        [TestMethod(), Timeout(timeout)]
        public void Test30() {
            var testCase = "12345";
            var solution = false;
            Test(testCase, solution);
        }//public void Test30() {

        [TestMethod(), Timeout(timeout)]
        public void Test31() {
            var testCase = "12.14.24";
            var solution = false;
            Test(testCase, solution);
        }//public void Test31() {

        [TestMethod(), Timeout(timeout)]
        public void Test32() {
            var testCase = "1.23.256.1.";
            var solution = false;
            Test(testCase, solution);
        }//public void Test32() {

        [TestMethod(), Timeout(timeout)]
        public void Test33() {
            var testCase = "255255255255";
            var solution = false;
            Test(testCase, solution);
        }//public void Test33() {

        [TestMethod(), Timeout(timeout)]
        public void Test34() {
            var testCase = "250";
            var solution = false;
            Test(testCase, solution);
        }//public void Test34() {

        [TestMethod(), Timeout(timeout)]
        public void Test35() {
            var testCase = "255255.255.255";
            var solution = false;
            Test(testCase, solution);
        }//public void Test35() {

        [TestMethod(), Timeout(timeout)]
        public void Test36() {
            var testCase = "9";
            var solution = false;
            Test(testCase, solution);
        }//public void Test36() {

        [TestMethod(), Timeout(timeout)]
        public void Test37() {
            var testCase = "0.0.0.249";
            var solution = true;
            Test(testCase, solution);
        }//public void Test37() {

        [TestMethod(), Timeout(timeout)]
        public void Test38() {
            var testCase = "25..26.8.8.1";
            var solution = false;
            Test(testCase, solution);
        }//public void Test38() {

        [TestMethod(), Timeout(timeout)]
        public void Test39() {
            var testCase = "64.233.161.01";
            var solution = false;
            Test(testCase, solution);
        }//public void Test39() {

        [TestMethod(), Timeout(timeout)]
        public void Test40() {
            var testCase = "64.01.161.131";
            var solution = false;
            Test(testCase, solution);
        }//public void Test40() {

        [TestMethod(), Timeout(timeout)]
        public void Test41() {
            var testCase = "00.233.161.131";
            var solution = false;
            Test(testCase, solution);
        }//public void Test41() {

        private void Test(string testCase, bool solution) {
            if (solution) {
                Assert.IsTrue(new IsIPv4Address().isIPv4Address(testCase));
            } else {//if (solution) {
                Assert.IsFalse(new IsIPv4Address().isIPv4Address(testCase));
            }//else {
        }//private void Test(string testCase,bool solution) {
    }//public class IsIPv4AddressTests {
}//namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
