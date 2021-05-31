using Algorithms.src._1_the_core._01_at_the_crossroads;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
    [TestClass()]
    public class ExtraNumberTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 2;
            var testCase2 = 7;
            var testCase3 = 2;
            var solution = 7;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 3;
            var testCase2 = 2;
            var testCase3 = 2;
            var solution = 3;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 5;
            var testCase2 = 5;
            var testCase3 = 1;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 500000000;
            var testCase2 = 3;
            var testCase3 = 500000000;
            var solution = 3;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 1;
            var testCase2 = 5;
            var testCase3 = 1;
            var solution = 5;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 5;
            var testCase2 = 5;
            var testCase3 = 3;
            var solution = 3;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 5;
            var testCase2 = 1;
            var testCase3 = 1;
            var solution = 5;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 4000000;
            var testCase2 = 3000000;
            var testCase3 = 4000000;
            var solution = 3000000;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 548442737;
            var testCase2 = 82231042;
            var testCase3 = 548442737;
            var solution = 82231042;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 469992838;
            var testCase2 = 66019520;
            var testCase3 = 66019520;
            var solution = 469992838;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 488477175;
            var testCase2 = 282544737;
            var testCase3 = 282544737;
            var solution = 488477175;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 472753449;
            var testCase2 = 11275999;
            var testCase3 = 11275999;
            var solution = 472753449;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 628064928;
            var testCase2 = 997087;
            var testCase3 = 628064928;
            var solution = 997087;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 342266500;
            var testCase2 = 11980963;
            var testCase3 = 11980963;
            var solution = 342266500;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = 809848561;
            var testCase2 = 56902274;
            var testCase3 = 809848561;
            var solution = 56902274;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = 729722321;
            var testCase2 = 33389720;
            var testCase3 = 33389720;
            var solution = 729722321;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = 1000000000;
            var testCase2 = 1;
            var testCase3 = 1000000000;
            var solution = 1;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = 1000000000;
            var testCase2 = 1000000000;
            var testCase3 = 999999999;
            var solution = 999999999;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = 299285277;
            var testCase2 = 367976496;
            var testCase3 = 367976496;
            var solution = 299285277;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase1 = 687508152;
            var testCase2 = 10679698;
            var testCase3 = 687508152;
            var solution = 10679698;
            Test(testCase1, testCase2, testCase3, solution);
        }//public void Test20() {

        private void Test(int testCase1, int testCase2, int testCase3, int solution) {
            Assert.AreEqual(solution, new ExtraNumber().extraNumber(testCase1, testCase2, testCase3));
        }//private void Test(int testCase1,int testCase2,int testCase3,int solution) {
    }//public class ExtraNumberTests {
}//namespace Algorithms.src_UnitTests._1_the_core._01_at_the_crossroads {
