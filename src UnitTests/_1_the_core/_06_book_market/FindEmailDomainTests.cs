using Algorithms.src._1_the_core._06_book_market;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
    [TestClass()]
    public class FindEmailDomainTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "prettyandsimple@example.com";
            var solution = "example.com";
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "fully-qualified-domain@codesignal.com";
            var solution = "codesignal.com";
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "\" \"@space.com";
            var solution = "space.com";
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "someaddress@yandex.ru";
            var solution = "yandex.ru";
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "\" \"@xample.org";
            var solution = "xample.org";
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "\"much.more unusual\"@yahoo.com";
            var solution = "yahoo.com";
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "\"very.unusual.@.unusual.com\"@usual.com";
            var solution = "usual.com";
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "admin@mailserver2.ru";
            var solution = "mailserver2.ru";
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "example-indeed@strange-example.com";
            var solution = "strange-example.com";
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "very.common@gmail.com";
            var solution = "gmail.com";
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new FindEmailDomain().findEmailDomain(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class FindEmailDomainTests {
}//namespace Algorithms.src_UnitTests._1_the_core._06_book_market {
