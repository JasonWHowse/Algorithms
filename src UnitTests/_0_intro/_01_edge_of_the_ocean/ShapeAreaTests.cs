using Algorithms.src._0_intro._01_edge_of_the_ocean;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
    [TestClass()]
    public class ShapeAreaTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void test1() {
            var testCase = 2;
            var solution = 5;
            test(testCase, solution);
        }//public void test1() {

        [TestMethod(), Timeout(timeout)]
        public void test2() {
            var testCase = 3;
            var solution = 13;
            test(testCase, solution);
        }//public void test2() {

        [TestMethod(), Timeout(timeout)]
        public void test3() {
            var testCase = 1;
            var solution = 1;
            test(testCase, solution);
        }//public void test3() {

        [TestMethod(), Timeout(timeout)]
        public void test4() {
            var testCase = 5;
            var solution = 41;
            test(testCase, solution);
        }//public void test4() {

        [TestMethod(), Timeout(timeout)]
        public void test5() {
            var testCase = 7000;
            var solution = 97986001;
            test(testCase, solution);
        }//public void test5() {

        [TestMethod(), Timeout(timeout)]
        public void test6() {
            var testCase = 8000;
            var solution = 127984001;
            test(testCase, solution);
        }//public void test6() {

        [TestMethod(), Timeout(timeout)]
        public void test7() {
            var testCase = 9999;
            var solution = 199940005;
            test(testCase, solution);
        }//public void test7() {

        [TestMethod(), Timeout(timeout)]
        public void test8() {
            var testCase = 9998;
            var solution = 199900013;
            test(testCase, solution);
        }//public void test8() {

        [TestMethod(), Timeout(timeout)]
        public void test9() {
            var testCase = 8999;
            var solution = 161946005;
            test(testCase, solution);
        }//public void test9() {

        [TestMethod(), Timeout(timeout)]
        public void test10() {
            var testCase = 100;
            var solution = 19801;
            test(testCase, solution);
        }//public void test10() {

        private void test(int testCase,int solution) {
            Assert.AreEqual(solution,new ShapeArea().shapeArea(testCase));
        }//private void test(var testCase,var testCase2,var testCase3,var testCase4,var testCase5,var solution) {
    }//public class ShapeAreaTests {
}//namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
