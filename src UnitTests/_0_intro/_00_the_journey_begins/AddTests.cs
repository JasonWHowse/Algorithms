using Algorithms.src._0_intro._00_the_journey_begins;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._00_the_journey_begins {
    [TestClass()]
    public class AddTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int testCase1 = 1;
            int testCase2 = 2;
            int solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {


        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int testCase1 = 0;
            int testCase2 = 1000;
            int solution = 1000;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {


        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int testCase1 = 2;
            int testCase2 = -39;
            int solution = -37;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {


        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int testCase1 = 99;
            int testCase2 = 100;
            int solution = 199;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {


        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int testCase1 = -100;
            int testCase2 = 100;
            int solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {


        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int testCase1 = -1000;
            int testCase2 = -1000;
            int solution = -2000;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {


        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int testCase1 = -1000;
            int testCase2 = 999;
            int solution = -1;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {


        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int testCase1 = 100;
            int testCase2 = 100;
            int solution = 200;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {


        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int testCase1 = -100;
            int testCase2 = -100;
            int solution = -200;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {


        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int testCase1 = -98;
            int testCase2 = 1;
            int solution = -97;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {


        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int testCase1 = 1000;
            int testCase2 = 1000;
            int solution = 2000;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {


        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int testCase1 = -1000;
            int testCase2 = 1000;
            int solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        private void Test(int testCase1, int testCase2, int solution) {
            Assert.AreEqual(solution, new Add().add(testCase1, testCase2));
        }//private void Test(int testCase1,int testCase2,int solution) {
    }//public class AddTests {
}//namespace Algorithms.src_UnitTests._0_intro._00_the_journey_begins {