using Algorithms.src._1_the_core._07_mirror_lake;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
    [TestClass()]
    public class StringsConstructionTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase1 = "abc";
            var testCase2 = "abccba";
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase1 = "ab";
            var testCase2 = "abcbcb";
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase1 = "ab";
            var testCase2 = "abccba";
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase1 = "b";
            var testCase2 = "abccba";
            var solution = 2;
            Test(testCase1, testCase2, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase1 = "c";
            var testCase2 = "abccbac";
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase1 = "z";
            var testCase2 = "z";
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase1 = "z";
            var testCase2 = "y";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase1 = "za";
            var testCase2 = "bzc";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase1 = "hnccv";
            var testCase2 = "hncvohcjhdfnhonxddcocjncchnvohchnjohcvnhjdhihsn";
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase1 = "abc";
            var testCase2 = "def";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            var testCase1 = "zzz";
            var testCase2 = "zzzzzzzzzzz";
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            var testCase1 = "abcabcabc";
            var testCase2 = "aaaaaaaaaaabbbbbbbbbbcccccccccc";
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test12() {

        [TestMethod(), Timeout(timeout)]
        public void Test13() {
            var testCase1 = "abc";
            var testCase2 = "xyz";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test13() {

        [TestMethod(), Timeout(timeout)]
        public void Test14() {
            var testCase1 = "zbc";
            var testCase2 = "ydlblksdjccdddb";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test14() {

        [TestMethod(), Timeout(timeout)]
        public void Test15() {
            var testCase1 = "abdd";
            var testCase2 = "adadapqrtsmnckgljj";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test15() {

        [TestMethod(), Timeout(timeout)]
        public void Test16() {
            var testCase1 = "abcde";
            var testCase2 = "edbcaacbdebcedaadbecadbceecabddbaecabecdcdabeabcde";
            var solution = 10;
            Test(testCase1, testCase2, solution);
        }//public void Test16() {

        [TestMethod(), Timeout(timeout)]
        public void Test17() {
            var testCase1 = "abcde";
            var testCase2 = "edbcaaclpebcekbadbecadbcefcabddbaecaaaaacdakrabcde";
            var solution = 7;
            Test(testCase1, testCase2, solution);
        }//public void Test17() {

        [TestMethod(), Timeout(timeout)]
        public void Test18() {
            var testCase1 = "zkz";
            var testCase2 = "zpaskazgazkazggaaksiokkzzzzaaazzpkuazzzgzkzabrgzzq";
            var solution = 7;
            Test(testCase1, testCase2, solution);
        }//public void Test18() {

        [TestMethod(), Timeout(timeout)]
        public void Test19() {
            var testCase1 = "ggagagagga";
            var testCase2 = "gga";
            var solution = 0;
            Test(testCase1, testCase2, solution);
        }//public void Test19() {

        [TestMethod(), Timeout(timeout)]
        public void Test20() {
            var testCase1 = "pqrsttt";
            var testCase2 = "parfkajfraqrakjssattertjeqsqaptatdptdstasreraqprtt";
            var solution = 3;
            Test(testCase1, testCase2, solution);
        }//public void Test20() {

        [TestMethod(), Timeout(timeout)]
        public void Test21() {
            var testCase1 = "azgtpzzgab";
            var testCase2 = "taagzajfrqrakjzztgzgzazstppatdptdblgaasreraqprtt";
            var solution = 1;
            Test(testCase1, testCase2, solution);
        }//public void Test21() {

        private void Test(string testCase1, string testCase2, int solution) {
            Assert.AreEqual(solution, new StringsConstruction().stringsConstruction(testCase1, testCase2));
        }//private void Test(string testCase1, string testCase2, int solution) {
    }//public class StringsConstructionTests {
}//namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
