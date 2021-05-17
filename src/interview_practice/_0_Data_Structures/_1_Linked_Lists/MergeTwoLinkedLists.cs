using Algorithms.src.helper_functions;

namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {
    public class MergeTwoLinkedLists {

        /*

Note: Your solution should have O(l1.length + l2.length) time complexity, since this is what you will be asked to accomplish in an interview.

Given two singly linked lists sorted in non-decreasing order, your task is to merge them. In other words, return a singly linked list, also sorted in non-decreasing order, that contains the elements from both original lists.

Example

For l1 = [1, 2, 3] and l2 = [4, 5, 6], the output should be
mergeTwoLinkedLists(l1, l2) = [1, 2, 3, 4, 5, 6];
For l1 = [1, 1, 2, 4] and l2 = [0, 3, 5], the output should be
mergeTwoLinkedLists(l1, l2) = [0, 1, 1, 2, 3, 4, 5].
Input/Output

[execution time limit] 3 seconds (cs)

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
        // Singly-linked lists are already defined with this interface:
        // class ListNode<T> {
        //   public T value { get; set; }
        //   public ListNode<T> next { get; set; }
        // }
        //
        public
        ListNode<int> mergeTwoLinkedLists(ListNode<int> a, ListNode<int> b) {
            if (a == null && b == null) {
                return null;
            }//if (a == null && b == null) {
            ListNode<int> output = new ListNode<int>();
            ListNode<int> outputHead = output;
            while (a != null && b != null) {
                if (a.value < b.value) {
                    outputHead.value = a.value;
                    a = a.next;
                } else {//if (a.value < b.value) {
                    outputHead.value = b.value;
                    b = b.next;
                }//else {
                outputHead.next = new ListNode<int>();
                outputHead = outputHead.next;
            }//while (a != null && b != null) {
            if (b == null) {
                outputHead.value = a.value;
                outputHead.next = a.next;
            }//if (b == null) {
            if (a == null) {
                outputHead.value = b.value;
                outputHead.next = b.next;
            }//if (a == null) {
            return output;
        }//ListNode<int> mergeTwoLinkedLists(ListNode<int> a, ListNode<int> b) {
    }//public class MergeTwoLinkedLists {
}//namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {
