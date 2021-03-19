using Microsoft.VisualStudio.TestTools.UnitTesting;
using Algorithms.src._0_intro._00_the_journey_begins;
using System;
using System.Collections.Generic;
using System.Text;

namespace Algorithms.src._0_intro._00_the_journey_begins.Tests {
    [TestClass()]
    public class AddTests {


        [TestMethod(), Timeout(3000)]
        public void test1() {
            int testCase1 = 1;
            int testCase2 = 2;
            int solution = 3;
            test(testCase1, testCase2, solution);
        }//public void test1() {


        [TestMethod(), Timeout(3000)]
        public void test2() {
            int testCase1 = 0;
            int testCase2 = 1000;
            int solution = 1000;
            test(testCase1, testCase2, solution);
        }//public void test2() {


        [TestMethod(), Timeout(3000)]
        public void test3() {
            int testCase1 = 2;
            int testCase2 = -39;
            int solution = -37;
            test(testCase1, testCase2, solution);
        }//public void test3() {


        [TestMethod(), Timeout(3000)]
        public void test4() {
            int testCase1 = 99;
            int testCase2 = 100;
            int solution = 199;
            test(testCase1, testCase2, solution);
        }//public void test4() {


        [TestMethod(), Timeout(3000)]
        public void test5() {
            int testCase1 = -100;
            int testCase2 = 100;
            int solution = 0;
            test(testCase1, testCase2, solution);
        }//public void test5() {


        [TestMethod(), Timeout(3000)]
        public void test6() {
            int testCase1 = -1000;
            int testCase2 = -1000;
            int solution = -2000;
            test(testCase1, testCase2, solution);
        }//public void test6() {

        private void test(int testCase1,int testCase2,int solution) {
            Assert.AreEqual(solution,new Add().add(testCase1,testCase2));
        }//private void test(int testCase1,int testCase2,int solution) {
    }//public class AddTests {
}//namespace Algorithms.src._0_intro._00_the_journey_begins.Tests {