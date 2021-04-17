using Algorithms.src.interview_practice._0_Data_Structures;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures {
    [TestClass()]
    public class FirstNotRepeatingCharacterTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            var testCase = "abacabad";
            var solution = 'c';
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            var testCase = "abacabaabacaba";
            var solution = '_';
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            var testCase = "z";
            var solution = 'z';
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            var testCase = "bcb";
            var solution = 'c';
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            var testCase = "bcccccccb";
            var solution = '_';
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            var testCase = "abcdefghijklmnopqrstuvwxyziflskecznslkjfabe";
            var solution = 'd';
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            var testCase = "zzz";
            var solution = '_';
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            var testCase = "bcccccccccccccyb";
            var solution = 'y';
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            var testCase = "xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc";
            var solution = 'd';
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            var testCase = "ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof";
            var solution = 'g';
            Test(testCase, solution);
        }//public void Test10() {

        private void Test(string testCase, char solution) {
            Assert.AreEqual(solution, new FirstNotRepeatingCharacter().firstNotRepeatingCharacter(testCase));
        }//private void Test(string testCase,char solution) {
    }//public class FirstNotRepeatingCharacterTests {
}//namespace Algorithms.src_UnitTests.interview_practice._0_Data_Structures {
