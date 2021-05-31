using Algorithms.src._0_intro._09_eruption_of_light;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
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

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase = "x@oneletter.am";
            var solution = "oneletter.am";
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase = "appugyl__un91n-3062@yopmail.com";
            var solution = "yopmail.com";
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase = "hr06122x@a4zerwak0d.gq";
            var solution = "a4zerwak0d.gq";
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase = "ralamosm@aol.com";
            var solution = "aol.com";
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase = "really@thuglife.de";
            var solution = "thuglife.de";
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase = "vyoucef.koko@axuwv6wnveqhwilbzer.gq";
            var solution = "axuwv6wnveqhwilbzer.gq";
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase = "m@qazwsxedcrfvtgbyhnujmiklopolksuiwnshdyuijlpo.com";
            var solution = "qazwsxedcrfvtgbyhnujmiklopolksuiwnshdyuijlpo.com";
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase = "boom@bo.co";
            var solution = "bo.co";
            Test(testCase, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase = "Hamojan@thebest.am";
            var solution = "thebest.am";
            Test(testCase, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase = "LemurTheWorst@ysu.am";
            var solution = "ysu.am";
            Test(testCase, solution);
        }//public void Test20() {

        private void Test(string testCase, string solution) {
            Assert.AreEqual(solution, new FindEmailDomain().findEmailDomain(testCase));
        }//private void Test(string testCase,string solution) {
    }//public class FindEmailDomainTests {
}//namespace Algorithms.src_UnitTests._0_intro._09_eruption_of_light {
