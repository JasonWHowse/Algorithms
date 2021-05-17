/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;

public class MergeTwoLinkedLists {

    /*
Note: Your solution should have O(l1.length + l2.length) time complexity, since this is what you will be asked to accomplish in an interview.

Given two singly linked lists sorted in non-decreasing order, your task is to merge them. In other words, return a singly linked list, also sorted in non-decreasing order, that contains the elements from both original lists.
     */

    // Singly-linked lists are already defined with this interface:
    // class ListNode<T> {
    //   ListNode(T x) {
    //     value = x;
    //   }
    //   T value;
    //   ListNode<T> next;
    // }
    //
    ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        if (l1 == null && l2 == null) {
            return null;
        }//if (l1 == null && l2 == null) {
        ListNode<Integer> output = new ListNode<>(0);
        ListNode<Integer> outputHead = output;
        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                outputHead.value = l1.value;
                l1 = l1.next;
            } else {//if (a.value < l2.value) {
                outputHead.value = l2.value;
                l2 = l2.next;
            }//else {
            outputHead.next = new ListNode<>(0);
            outputHead = outputHead.next;
        }//while (l1 != null && l2 != null) {
        if (l2 == null) {
            outputHead.value = l1.value;
            outputHead.next = l1.next;
        }//if (l2 == null) {
        if (l1 == null) {
            outputHead.value = l2.value;
            outputHead.next = l2.next;
        }//if (l1 == null) {
        return output;
    }//ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] linkedlist.integer l1

A singly linked list of integers.

Guaranteed constraints:
0 ≤ list size ≤ 104,
-109 ≤ element value ≤ 109.

[input] linkedlist.integer l2

A singly linked list of integers.

Guaranteed constraints:
0 ≤ list size ≤ 104,
-109 ≤ element value ≤ 109.

[output] linkedlist.integer

A list that contains elements from both l1 and l2, sorted in non-decreasing order.
     */

}//public class MergeTwoLinkedLists {
