using Algorithms.src._1_the_core._07_mirror_lake;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
    [TestClass()]
    public class NumbersGroupingTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = new int[] { 20000, 239, 10001, 999999, 10000, 20566, 29999 };
            var solution = 11;
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = new int[] { 10000, 20000, 30000, 40000, 50000, 60000, 10000, 120000, 150000, 200000, 300000, 1000000, 10000000, 100000000, 10000000 };
            var solution = 28;
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = new int[] { 10000 };
            var solution = 2;
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = new int[] { 10000, 1 };
            var solution = 3;
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = new int[] { 685400881, 696804468, 696804942, 803902442, 976412678, 976414920, 47763597, 803900633, 233144924, 47764349, 233149077, 214990733, 214994039, 280528089, 280524347, 685401797 };
            var solution = 24;
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = new int[] { 598589004, 92986320, 520103781, 808743817, 635098665, 95244159, 808747008, 867017063, 635092226, 867013865, 92989995, 520100093, 95245838, 84897101, 598583113, 84893918 };
            var solution = 24;
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = new int[] { 1000000000, 999990000, 999980000, 999970000, 999960000, 999950000, 999940000, 999930000, 999920000, 999910000 };
            var solution = 20;
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = new int[] { 102382103, 21039898, 39823, 433, 30928398, 40283209, 23234, 342534, 98473483, 498398424, 9384984, 9839239 };
            var solution = 24;
            Test(testCase, solution);
        }//public void Test8() {

        private void Test(int[] testCase, int solution) {
            Assert.AreEqual(solution, new NumbersGrouping().numbersGrouping(testCase));
        }//private void Test(int[] testCase, int solution) {
    }//public class NumbersGroupingTests {
}//namespace Algorithms.src_UnitTests._1_the_core._07_mirror_lake {
