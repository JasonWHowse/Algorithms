/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;

public class RearrangeLastN {

    /*
Note: Try to solve this task in O(list size) time using O(1) additional space, since this is what you'll be asked during an interview.

Given a singly linked list of integers l and a non-negative integer n, move the last n list nodes to the beginning of the linked list.
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
    ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
        ListNode<Integer> Beginning = l;
        ListNode<Integer> Output = l;
        for(int i = 0; i < n; i++) {
            l = l.next;
        }//for(int i = 0; i < n; i++) {
        if (l == null || n==0) {
            return Beginning;
        }//if (l == null || n==0) {
        while (l.next != null) {
            Output = Output.next;
            l = l.next;
        }//while (l.next != null) {
        ListNode<Integer> temp = Output;
        Output = Output.next;
        temp.next = null;
        l.next = Beginning;
        return Output;
    }//ListNode<int> rearrangeLastN(ListNode<int> l, int n) {

    /*
Input/Output

[execution time limit] 3 seconds (java)

[input] linkedlist.integer l

A singly linked list of integers.

Guaranteed constraints:
0 ≤ list size ≤ 105,
-1000 ≤ element value ≤ 1000.

[input] integer n

A non-negative integer.

Guaranteed constraints:
0 ≤ n ≤ list size.

[output] linkedlist.integer

Return l with the n last elements moved to the beginning.
     */

}//public class RearrangeLastN {
