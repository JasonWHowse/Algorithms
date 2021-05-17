/*
 * Authored by: Jason Wesley Howse
 */

package interview_practice._0_Data_Structures._1_Linked_Lists;

import helper_functions.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseNodesInKGroups {

    /*

Note: Your solution should have O(n) time complexity, where n is the number of elements in l, and O(1) additional space complexity, since this is what you would be asked to accomplish in an interview.

Given a linked list l, reverse its nodes k at a time and return the modified list. k is a positive integer that is less than or equal to the length of l. If the number of nodes in the linked list is not a multiple of k, then the nodes that are left out at the end should remain as-is.

You may not alter the values in the nodes - only the nodes themselves can be changed.

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
    ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
        if (l == null) {
            return null;
        }//if (l == null) {
        var output = new ListNode<>(0);
        var outputHead = output;
        while (l!=null) {
            List<Integer> reversable = new ArrayList<>();
            for(int i=0;i<k && l != null; i++) {
                reversable.add(l.value);
                l = l.next;
            }//for(int i=0;i<k && l != null; i++) {
            if(reversable.size()==k){
                Collections.reverse(reversable);
            }//if(reversable.size()==k){
            for(int i = 0  ; i<reversable.size(); i++) {
                outputHead.value = reversable.get(i);
                if (l != null || i!=reversable.size()-1) {
                    outputHead.next = new ListNode<>(0);
                    outputHead = outputHead.next;
                }//if (l != null || i!=reversable.size()-1) {
            }//for(int i = 0  ; i<reversable.size(); i++) {
        }//while (l!=null) {
        return output;
    }//ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {

    /*

Input/Output

[execution time limit] 3 seconds (java)

[input] linkedlist.integer l

A singly linked list of integers.

Guaranteed constraints:
1 ≤ list size ≤ 104,
-109 ≤ element value ≤ 109.

[input] integer k

The size of the groups of nodes that need to be reversed.

Guaranteed constraints:
1 ≤ k ≤ l size.

[output] linkedlist.integer

The initial list, with reversed groups of k elements.

     */

}//public class ReverseNodesInKGroups {
