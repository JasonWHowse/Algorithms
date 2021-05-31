using Algorithms.src._0_intro._01_edge_of_the_ocean;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
    [TestClass()]
    public class AdjacentElementsProductTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 3, 6, -2, -5, 7, 3 };
            var solution = 21;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { -1, -2 };
            var solution = 2;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 5, 1, 2, 3, 1, 4 };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 1, 2, 3, 0 };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { 9, 5, 10, 2, 24, -1, -48 };
            var solution = 50;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 5, 6, -4, 2, 3, 2, -23 };
            var solution = 30;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 4, 1, 2, 3, 1, 5 };
            var solution = 6;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { -23, 4, -3, 8, -12 };
            var solution = -12;
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 1, 0, 1, 0, 1000 };
            var solution = 0;
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { 2, 1, 3, 1, 2, 5  };
            var solution = 10;
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { 1, 1, -1, 10, -10, 1  };
            var solution = 1;
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { -1, 1, -1  };
            var solution = -1;
            Test(testCase, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase = { -1, 100  };
            var solution = -100;
            Test(testCase, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[] testCase = { 7, 5, 8, 2, 17, -1, -34  };
            var solution = 40;
            Test(testCase, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[] testCase = { 34, -23, -100, 23, 44  };
            var solution = 2300;
            Test(testCase, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[] testCase = { 3, 4 };
            var solution = 12;
            Test(testCase, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int[] testCase = { -1000, 4, 5, 8, 100, 50, 500  };
            var solution = 25000;
            Test(testCase, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            int[] testCase = { -1000, -1000, 1, 1, 1, 5, 8, 100, 50, 500  };
            var solution = 1000000;
            Test(testCase, solution);
        }//public void Test18() {

        private void Test(int[] testCase ,int solution) {
            Assert.AreEqual(solution,new AdjacentElementsProduct().adjacentElementsProduct(testCase));
        }//private void Test(int[] testCase ,int solution) {
    }//public class AdjacentElementsProductTests {
}//namespace Algorithms.src_UnitTests._0_intro._01_edge_of_the_ocean {
