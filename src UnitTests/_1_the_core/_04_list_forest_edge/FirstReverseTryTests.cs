using Algorithms.src._1_the_core._04_list_forest_edge;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {
    [TestClass()]
    public class FirstReverseTryTests {

        private const int timeout = 3000;

        [TestMethod(), Timeout(timeout)]
        public void Test1() {
            int[] testCase = { 1, 2, 3, 4, 5 };
            int[] solution = { 5, 2, 3, 4, 1 };
            Test(testCase, solution);
        }//public void Test1() {

        [TestMethod(), Timeout(timeout)]
        public void Test2() {
            int[] testCase = { };
            int[] solution = { };
            Test(testCase, solution);
        }//public void Test2() {

        [TestMethod(), Timeout(timeout)]
        public void Test3() {
            int[] testCase = { 239 };
            int[] solution = { 239 };
            Test(testCase, solution);
        }//public void Test3() {

        [TestMethod(), Timeout(timeout)]
        public void Test4() {
            int[] testCase = { 23, 54, 12, 3, 4, 56, 23, 12, 5, 324 };
            int[] solution = { 324, 54, 12, 3, 4, 56, 23, 12, 5, 23 };
            Test(testCase, solution);
        }//public void Test4() {

        [TestMethod(), Timeout(timeout)]
        public void Test5() {
            int[] testCase = { -1, 1 };
            int[] solution = { 1, -1 };
            Test(testCase, solution);
        }//public void Test5() {

        [TestMethod(), Timeout(timeout)]
        public void Test6() {
            int[] testCase = { 88, -101, -310, 818, 747, -888, -183, -687, -723, 188, -611, 677, -597, 293, -295, -162, -265, 368, 346, 81, -831, 198, -94, 685, -434, -241, -566, -397, 501, -183, 366, -669, 96, -592, 358, 598, 444, -929, 769, -361, -754, 218, -464, 332, 893, 422, -192, -287, -850, 543 };
            int[] solution = { 543, -101, -310, 818, 747, -888, -183, -687, -723, 188, -611, 677, -597, 293, -295, -162, -265, 368, 346, 81, -831, 198, -94, 685, -434, -241, -566, -397, 501, -183, 366, -669, 96, -592, 358, 598, 444, -929, 769, -361, -754, 218, -464, 332, 893, 422, -192, -287, -850, 88 };
            Test(testCase, solution);
        }//public void Test6() {

        [TestMethod(), Timeout(timeout)]
        public void Test7() {
            int[] testCase = { 737 };
            int[] solution = { 737 };
            Test(testCase, solution);
        }//public void Test7() {

        [TestMethod(), Timeout(timeout)]
        public void Test8() {
            int[] testCase = { -99, 47, -457, 575, -144, -186, -886, 806, 62, 583, 482, 651, -980, -684, 139, -847, -425, -641, 478, -964, 858, 48, -912, -419, 31, -365, -556, 297, -559, 305, -403, -637, 933, 105, -250, -927, -147, -207, -807, 833, -2, -868, -653, -208, -897, -368, -318, 386, -709, -370 };
            int[] solution = { -370, 47, -457, 575, -144, -186, -886, 806, 62, 583, 482, 651, -980, -684, 139, -847, -425, -641, 478, -964, 858, 48, -912, -419, 31, -365, -556, 297, -559, 305, -403, -637, 933, 105, -250, -927, -147, -207, -807, 833, -2, -868, -653, -208, -897, -368, -318, 386, -709, -99 };
            Test(testCase, solution);
        }//public void Test8() {

        [TestMethod(), Timeout(timeout)]
        public void Test9() {
            int[] testCase = { 763, 201, 139, 343, 504, 755, 511, -530, 206, -96, 813, 325, 971, 528, -848, -265, -656, 209, -389, -704, -958, -481, 589, 381, -863, -631, -432, -941, 933, 296, -478, 517, -253, 181, -350, 769, 620, -216, 182, 608, -134, 791, -318, -279, -669, -508, -383, 160, 943, -74 };
            int[] solution = { -74, 201, 139, 343, 504, 755, 511, -530, 206, -96, 813, 325, 971, 528, -848, -265, -656, 209, -389, -704, -958, -481, 589, 381, -863, -631, -432, -941, 933, 296, -478, 517, -253, 181, -350, 769, 620, -216, 182, 608, -134, 791, -318, -279, -669, -508, -383, 160, 943, 763 };
            Test(testCase, solution);
        }//public void Test9() {

        [TestMethod(), Timeout(timeout)]
        public void Test10() {
            int[] testCase = { -730, -956, 27, 301, -283, 925, 542, 107, -539, 711, -633, -456, 88, 903, -943, 268, -954, 667, 540, 336, 658, -976, -356, -394, -957, 663, -470, 127, 289, 834, 811, -114, -55, -886, 590, -94, 79, 404, -823, -94, -542, -414, -936, -835, 216, 471, 895, 244, 362, -64 };
            int[] solution = { -64, -956, 27, 301, -283, 925, 542, 107, -539, 711, -633, -456, 88, 903, -943, 268, -954, 667, 540, 336, 658, -976, -356, -394, -957, 663, -470, 127, 289, 834, 811, -114, -55, -886, 590, -94, 79, 404, -823, -94, -542, -414, -936, -835, 216, 471, 895, 244, 362, -730 };
            Test(testCase, solution);
        }//public void Test10() {

        [TestMethod(), Timeout(timeout)]
        public void Test11() {
            int[] testCase = { -511, 310, -241, -111, -30, 495, -325, 532, -136, -89, -885, 112, -677, 758, 406, -740, -941, -259, 783, -465, 337, -894, -374, 137, 33, 430, 916, 695, 612, -771, -601, 822, 917, 928, 783, 683, -959, -270, 852, 82, 76, -375, -630, -24, 133, -474, -476, 484, 34, -912 };
            int[] solution = { -912, 310, -241, -111, -30, 495, -325, 532, -136, -89, -885, 112, -677, 758, 406, -740, -941, -259, 783, -465, 337, -894, -374, 137, 33, 430, 916, 695, 612, -771, -601, 822, 917, 928, 783, 683, -959, -270, 852, 82, 76, -375, -630, -24, 133, -474, -476, 484, 34, -511 };
            Test(testCase, solution);
        }//public void Test11() {

        [TestMethod(), Timeout(timeout)]
        public void Test12() {
            int[] testCase = { -10000, 10000 };
            int[] solution = { 10000, -10000 };
            Test(testCase, solution);
        }//public void Test12() {

        private void Test(int[] testCase, int[] solution) {
            CollectionAssert.AreEqual(solution, new FirstReverseTry().firstReverseTry(testCase));
        }//private void Test(int[] testCase,int[] solution) {
    }//public class FirstReverseTryTests {
}//namespace Algorithms.src_UnitTests._1_the_core._04_list_forest_edge {