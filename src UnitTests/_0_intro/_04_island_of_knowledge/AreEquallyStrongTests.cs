using Algorithms.src._0_intro._04_island_of_knowledge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
    [TestClass()]
    public class AreEquallyStrongTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = 10;
            var testCase2 = 15;
            var testCase3 = 15;
            var testCase4 = 10;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = 15;
            var testCase2 = 10;
            var testCase3 = 15;
            var testCase4 = 10;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = 15;
            var testCase2 = 10;
            var testCase3 = 15;
            var testCase4 = 9;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = 10;
            var testCase2 = 5;
            var testCase3 = 5;
            var testCase4 = 10;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = 10;
            var testCase2 = 15;
            var testCase3 = 5;
            var testCase4 = 20;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = 10;
            var testCase2 = 20;
            var testCase3 = 10;
            var testCase4 = 20;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = 5;
            var testCase2 = 20;
            var testCase3 = 20;
            var testCase4 = 5;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = 20;
            var testCase2 = 15;
            var testCase3 = 5;
            var testCase4 = 20;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = 5;
            var testCase2 = 10;
            var testCase3 = 5;
            var testCase4 = 10;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = 1;
            var testCase2 = 10;
            var testCase3 = 10;
            var testCase4 = 0;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = 5;
            var testCase2 = 5;
            var testCase3 = 10;
            var testCase4 = 10;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = 10;
            var testCase2 = 5;
            var testCase3 = 10;
            var testCase4 = 6;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = 1;
            var testCase2 = 1;
            var testCase3 = 1;
            var testCase4 = 1;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = 0;
            var testCase2 = 10;
            var testCase3 = 10;
            var testCase4 = 0;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = 0;
            var testCase2 = 11;
            var testCase3 = 10;
            var testCase4 = 0;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = 0;
            var testCase2 = 15;
            var testCase3 = 15;
            var testCase4 = 0;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = 10;
            var testCase2 = 10;
            var testCase3 = 8;
            var testCase4 = 12;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = 7;
            var testCase2 = 8;
            var testCase3 = 5;
            var testCase4 = 10;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = 15;
            var testCase2 = 15;
            var testCase3 = 15;
            var testCase4 = 15;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase1 = 15;
            var testCase2 = 1;
            var testCase3 = 1;
            var testCase4 = 15;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            var testCase1 = 15;
            var testCase2 = 15;
            var testCase3 = 1;
            var testCase4 = 1;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test21() {

        [TestMethod(), Timeout(timeout)]
        public void Test22() {
            var testCase1 = 14;
            var testCase2 = 2;
            var testCase3 = 3;
            var testCase4 = 13;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test22() {

        [TestMethod(), Timeout(timeout)]
        public void Test23() {
            var testCase1 = 14;
            var testCase2 = 2;
            var testCase3 = 3;
            var testCase4 = 12;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test23() {

        [TestMethod(), Timeout(timeout)]
        public void Test24() {
            var testCase1 = 20;
            var testCase2 = 6;
            var testCase3 = 5;
            var testCase4 = 19;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test24() {

        [TestMethod(), Timeout(timeout)]
        public void Test25() {
            var testCase1 = 20;
            var testCase2 = 20;
            var testCase3 = 20;
            var testCase4 = 20;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test25() {

        [TestMethod(), Timeout(timeout)]
        public void Test26() {
            var testCase1 = 20;
            var testCase2 = 20;
            var testCase3 = 10;
            var testCase4 = 10;
            var solution = false;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test26() {

        [TestMethod(), Timeout(timeout)]
        public void Test27() {
            var testCase1 = 0;
            var testCase2 = 0;
            var testCase3 = 0;
            var testCase4 = 0;
            var solution = true;
            Test(testCase1, testCase2, testCase3, testCase4, solution);
        }//public void Test27() {

        private void Test(int testCase1, int testCase2, int testCase3, int testCase4, bool solution) {
            if (solution) {
                Assert.IsTrue(new AreEquallyStrong().areEquallyStrong(testCase1, testCase2, testCase3, testCase4));
            } else {//if (solution) {
                Assert.IsFalse(new AreEquallyStrong().areEquallyStrong(testCase1, testCase2, testCase3, testCase4));
            }//else {
        }//private void Test(int testCase1,int testCase2,int testCase3,int testCase4,bool solution) {
    }//public class AreEquallyStrongTests {
}//namespace Algorithms.src_UnitTests._0_intro._04_island_of_knowledge {
