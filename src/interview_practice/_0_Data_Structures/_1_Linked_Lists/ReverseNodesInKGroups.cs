using Algorithms.src.helper_functions;
using System.Collections.Generic;

namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {
    public class ReverseNodesInKGroups {

        /*

Note: Your solution should have O(n) time complexity, where n is the number of elements in l, and O(1) additional space complexity, since this is what you would be asked to accomplish in an interview.

Given a linked list l, reverse its nodes k at a time and return the modified list. k is a positive integer that is less than or equal to the length of l. If the number of nodes in the linked list is not a multiple of k, then the nodes that are left out at the end should remain as-is.

You may not alter the values in the nodes - only the nodes themselves can be changed.

Example

For l = [1, 2, 3, 4, 5] and k = 2, the output should be
reverseNodesInKGroups(l, k) = [2, 1, 4, 3, 5];
For l = [1, 2, 3, 4, 5] and k = 1, the output should be
reverseNodesInKGroups(l, k) = [1, 2, 3, 4, 5];
For l = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11] and k = 3, the output should be
reverseNodesInKGroups(l, k) = [3, 2, 1, 6, 5, 4, 9, 8, 7, 10, 11].
Input/Output

[execution time limit] 3 seconds (cs)

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
        // Singly-linked lists are already defined with this interface:
        // class ListNode<T> {
        //   public T value { get; set; }
        //   public ListNode<T> next { get; set; }
        // }
        public
        ListNode<int> reverseNodesInKGroups(ListNode<int> l, int k) {
            if (l == null) {
                return null;
            }//if (l == null) {
            var output = new ListNode<int>();
            var outputHead = output;
            while (l!=null) {
                List<int> reversable = new List<int>();
                for(int i=0;i<k && l != null; i++) {
                    reversable.Add(l.value);
                    l = l.next;
                }//for(int i=0;i<k && l != null; i++) {
                int test = reversable.Count;
                for(int i = k==test?1:0  ; k==test?i <= test:i<test; i++) {
                    outputHead.value = reversable[k==test?^i:i];
                    if (l != null || (k==test?(i != test):(i!=test-1))) {
                        outputHead.next = new ListNode<int>();
                        outputHead = outputHead.next;
                    }//if (l != null || (k==test?(i != test):(i!=test-1))) {
                }//for(int i = k==test?1:0  ; k==test?i <= test:i<test; i++) {
            }//while (l!=null) {
            return output;
        }//ListNode<int> reverseNodesInKGroups(ListNode<int> l, int k) {
    }//public class ReverseNodesInKGroups {
}//namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {
