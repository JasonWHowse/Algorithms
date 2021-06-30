﻿using System.Collections.Generic;

namespace Algorithms.src._0_intro._02_smooth_sailing {
    public class SortByHeight {

        /*

Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[execution time limit] 3 seconds (cs)

[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.

Guaranteed constraints:
1 ≤ a.length ≤ 1000,
-1 ≤ a[i] ≤ 1000.

[output] array.integer

Sorted array a with all the trees untouched.

        */
        public
        int[] sortByHeight(int[] a) {
            List<int> b = new List<int>();
            foreach (int c in a) {
                if (c != -1) {
                    b.Add(c);
                }//if (c != -1) {
            }//foreach(int c in a) {
            b.Sort();
            for (int i = 0; i < a.Length; i++) {
                if (a[i] != -1) {
                    a[i] = b[0];
                    b.RemoveAt(0);
                }//if (a[i] != -1) {
            }//for(int i = 0; i < a.Length; i++) {
            return a;
        }//int[] sortByHeight(int[] a) {
    }//public class SortByHeight {
}//namespace Algorithms.src._0_intro._02_smooth_sailing {
