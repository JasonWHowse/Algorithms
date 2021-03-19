using Algorithms.src._0_intro._00_the_journey_begins;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms._0_intro._00_the_journey_begins {
    [TestClass()]
    public class CenturyFromYearTests {


        [TestMethod(), Timeout(3000)]
        public void test1() {
            int testCase = 1905;
            int solution = 20;
            test(testCase, solution);
        }//public void test1() {


        [TestMethod(), Timeout(3000)]
        public void test2() {
            int testCase = 1700;
            int solution = 17;
            test(testCase, solution);
        }//public void test2() {


        [TestMethod(), Timeout(3000)]
        public void test3() {
            int testCase = 1988;
            int solution = 20;
            test(testCase, solution);
        }//public void test3() {


        [TestMethod(), Timeout(3000)]
        public void test4() {
            int testCase = 2000;
            int solution = 20;
            test(testCase, solution);
        }//public void test4() {


        [TestMethod(), Timeout(3000)]
        public void test5() {
            int testCase = 2001;
            int solution = 21;
            test(testCase, solution);
        }//public void test5() {


        [TestMethod(), Timeout(3000)]
        public void test6() {
            int testCase = 200;
            int solution = 2;
            test(testCase, solution);
        }//public void test6() {


        [TestMethod(), Timeout(3000)]
        public void test7() {
            int testCase = 374;
            int solution = 4;
            test(testCase, solution);
        }//public void test7() {


        [TestMethod(), Timeout(3000)]
        public void test8() {
            int testCase = 45;
            int solution = 1;
            test(testCase, solution);
        }//public void test8() {


        [TestMethod(), Timeout(3000)]
        public void test9() {
            int testCase = 8;
            int solution = 1;
            test(testCase, solution);
        }//public void test9() {

        private void test(int testCase, int solution) {
            Assert.AreEqual(solution, new CenturyFromYear().centuryFromYear(testCase));
        }//private void test(int testCase, int solution) {
    }//public class CenturyFromYearTests {
}//namespace Algorithms._0_intro._00_the_journey_begins {