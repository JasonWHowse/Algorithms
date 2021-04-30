/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;

public class RemoveKFromList {

    /*
Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in the list, since this is what you'll be asked to do during an interview.

Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k
     */

    // Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }

    ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        ListNode<Integer> b = l;
        while (l != null) {
            if (l.value == k) {
                b = l.next;
            } else while (l.next != null && l.next.value == k) {//if (l.value == k) {
                l.next = l.next.next;
            }//else while (l.next != null && l.next.value == k) {
            l = l.next;
        }//while (l != null) {
        return b;
    }//ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] linkedlist.integer l

A singly linked list of integers.

Guaranteed constraints:
0 ≤ list size ≤ 105,
-1000 ≤ element value ≤ 1000.

[input] integer k

An integer.

Guaranteed constraints:
-1000 ≤ k ≤ 1000.

[output] linkedlist.integer

Return l with all the values equal to k removed.
     */

}//public class RemoveKFromList {
