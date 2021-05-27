using Algorithms.src.interview_practice._0_Data_Structures._2_Hash_Tables;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
    [TestClass()]
    public class ContainsCloseNumsTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase1 = { 0, 1, 2, 3, 5, 2 };
            var testCase2 = 3;
            Test(testCase1, testCase2, true);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase1 = { 0, 1, 2, 3, 5, 2 };
            var testCase2 = 2;
            Test(testCase1, testCase2, false);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase1 = { };
            var testCase2 = 0;
            Test(testCase1, testCase2, false);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase1 = { 99, 99 };
            var testCase2 = 2;
            Test(testCase1, testCase2, true);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase1 = { 2, 2 };
            var testCase2 = 3;
            Test(testCase1, testCase2, true);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase1 = { 1, 2 };
            var testCase2 = 2;
            Test(testCase1, testCase2, false);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase1 = { 1, 2, 1 };
            var testCase2 = 2;
            Test(testCase1, testCase2, true);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase1 = { 1, 0, 1, 1 };
            var testCase2 = 1;
            Test(testCase1, testCase2, true);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase1 = { 1, 2, 1 };
            var testCase2 = 0;
            Test(testCase1, testCase2, false);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase1 = { 1, 2, 1 };
            var testCase2 = 1;
            Test(testCase1, testCase2, false);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase1 = { 1 };
            var testCase2 = 1;
            Test(testCase1, testCase2, false);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase1 = { -1, -1 };
            var testCase2 = 1;
            Test(testCase1, testCase2, true);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            int[] testCase1 = { 1, 2, 3, 1 };
            var testCase2 = 3;
            Test(testCase1, testCase2, true);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            int[] testCase1 = { 2147483647, -2147483648, 2147483647, -2147483648 };
            var testCase2 = 2;
            Test(testCase1, testCase2, true);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            int[] testCase1 = { 13, 23, 1, 2, 3 };
            var testCase2 = 5;
            Test(testCase1, testCase2, false);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            int[] testCase1 = { 1, 2, 3, 1, 2, 3 };
            var testCase2 = 2;
            Test(testCase1, testCase2, false);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            int[] testCase1 = { 1, 2, 3, 1, 1, 2, 3 };
            var testCase2 = 0;
            Test(testCase1, testCase2, false);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            int[] testCase1 = { 0, 1, 2, 3, 4, 5, 0 };
            var testCase2 = 5;
            Test(testCase1, testCase2, false);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            int[] testCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            var testCase2 = 15;
            Test(testCase1, testCase2, false);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            int[] testCase1 = { 4, 1, 2, 3, 1, 5 };
            var testCase2 = 3;
            Test(testCase1, testCase2, true);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            int[] testCase1 = { 0, 1, 2, 3, 4, 5, 0 };
            var testCase2 = 6;
            Test(testCase1, testCase2, true);
        }//public void Test21() {

        [TestMethod(), Timeout(timeout)]
        public void Test22() {
            int[] testCase1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };
            var testCase2 = 3;
            Test(testCase1, testCase2, true);
        }//public void Test22() {

        [TestMethod(), Timeout(timeout)]
        public void Test23() {
            int[] testCase1 = { 0, 1, 2, 3, 4, 0, 0, 7, 8, 9, 10, 11, 12, 0 };
            var testCase2 = 1;
            Test(testCase1, testCase2, true);
        }//public void Test23() {

        private void Test(int[] testCase1, int testCase2, bool solution) {
            if (solution) {
                Assert.IsTrue(new ContainsCloseNums().containsCloseNums(testCase1, testCase2));
            } else {//if (solution) {
                Assert.IsFalse(new ContainsCloseNums().containsCloseNums(testCase1, testCase2));
            }//else {
        }//private void Test(int[] testCase1, int testCase2, bool solution) {
    }//public class ContainsCloseNumsTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures._2_Hash_Tables {
