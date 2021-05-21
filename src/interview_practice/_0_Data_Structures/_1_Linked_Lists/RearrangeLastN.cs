using Algorithms.src.helper_functions;

namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {
    public class RearrangeLastN {

        /*

Note: Try to solve this task in O(list size) time using O(1) additional space, since this is what you'll be asked during an interview.

Given a singly linked list of integers l and a non-negative integer n, move the last n list nodes to the beginning of the linked list.

Example

For l = [1, 2, 3, 4, 5] and n = 3, the output should be
rearrangeLastN(l, n) = [3, 4, 5, 1, 2];
For l = [1, 2, 3, 4, 5, 6, 7] and n = 1, the output should be
rearrangeLastN(l, n) = [7, 1, 2, 3, 4, 5, 6].
Input/Output

[execution time limit] 3 seconds (cs)

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

        // Singly-linked lists are already defined with this interface:
        // class ListNode<T> {
        //   public T value { get; set; }
        //   public ListNode<T> next { get; set; }
        // }
        //
        public
        ListNode<int> rearrangeLastN(ListNode<int> l, int n) {
            ListNode<int> Beginning = l;
            ListNode<int> Output = l;
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
            ListNode<int> temp = Output;
            Output = Output.next;
            temp.next = null;
            l.next = Beginning;
            return Output;
        }//ListNode<int> rearrangeLastN(ListNode<int> l, int n) {
    }//public class RearrangeLastN {
}//namespace Algorithms.src.interview_practice._0_Data_Structures._1_Linked_Lists {
