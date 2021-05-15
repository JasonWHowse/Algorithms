using Algorithms.src.helper_functions;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {
    public class IsListPalindrome {

        /*

Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in l, since this is what you'll be asked to do during an interview.

Given a singly linked list of integers, determine whether or not it's a palindrome.

Note: in examples below and tests preview linked lists are presented as arrays just for simplicity of visualization: in real data you will be given a head node l of the linked list

Example

For l = [0, 1, 0], the output should be
isListPalindrome(l) = true;

For l = [1, 2, 2, 3], the output should be
isListPalindrome(l) = false.

Input/Output

[execution time limit] 3 seconds (cs)

[input] linkedlist.integer l

A singly linked list of integers.

Guaranteed constraints:
0 ≤ list size ≤ 5 · 105,
-109 ≤ element value ≤ 109.

[output] boolean

Return true if l is a palindrome, otherwise return false.

        */

        public
        bool isListPalindrome(ListNode<int> l) {
            List<int> FrontHalf = new List<int>();
            ListNode<int> SpeedHead = l;
            while (SpeedHead != null && SpeedHead.next != null) {
                FrontHalf.Add(l.value);
                l = l.next;
                SpeedHead = SpeedHead.next.next;
                if (SpeedHead != null && SpeedHead.next == null) {
                    l = l.next;
                }//if (SpeedHead != null && SpeedHead.next == null) {
            }//while (SpeedHead != null && SpeedHead.next != null) {
            for (int i = 1; i <= FrontHalf.Count; i++) {
                if (FrontHalf[^i] != l.value) {
                    return false;
                }//if (FrontHalf[^i] != l.value) {
                l = l.next;
            }//for(int i = 1; i <= FrontHalf.Count; i++) {
            return true;
        }//bool isListPalindrome(ListNode<int> l) {
    }//public class IsListPalindrome {
}//namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {