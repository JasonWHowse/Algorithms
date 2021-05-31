using Algorithms.src._0_intro._00_the_journey_begins;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._00_the_journey_begins {
    [TestClass()]
    public class CenturyFromYearTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int testCase = 1905;
            int solution = 20;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int testCase = 1700;
            int solution = 17;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int testCase = 1988;
            int solution = 20;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int testCase = 2000;
            int solution = 20;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int testCase = 2001;
            int solution = 21;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int testCase = 200;
            int solution = 2;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int testCase = 374;
            int solution = 4;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int testCase = 45;
            int solution = 1;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int testCase = 8;
            int solution = 1;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int testCase = 300;
            int solution = 3;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int testCase = 1588;
            int solution = 16;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int testCase = 1;
            int solution = 1;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int testCase = 50;
            int solution = 1;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int testCase = 101;
            int solution = 2;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int testCase = 34;
            int solution = 1;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int testCase = 827;
            int solution = 9;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int testCase = 2005;
            int solution = 21;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            int testCase = 1200;
            int solution = 12;
            Test(testCase, solution);
        }//public void Test18() {

        private void Test(int testCase, int solution) {
            Assert.AreEqual(solution, new CenturyFromYear().centuryFromYear(testCase));
        }//private void Test(int testCase, int solution) {
    }//public class CenturyFromYearTests {
}//namespace Algorithms.src_UnitTests._0_intro._00_the_journey_begins {