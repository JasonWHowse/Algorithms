/*
 * Authored by: Jason Wesley Howse
 */

package helper_functions;

public class ListNodeBuilder {
    public static <T> ListNode<T> CollectionToListNode(T[] values) {
        if (values.length == 0) {
            return null;
        }//if (values.length == 0) {
        ListNode<T> Head = new ListNode<T>(null);
        ListNode<T> Output = Head;
        for(int i=0;i<values.length;){
            Head.value = values[i];
            if (++i < values.length) {
                Head.next = new ListNode<T>(null);
                Head = Head.next;
            }//if (++i < values.length) {
        }//for(int i=0;i<values.length;){
        return Output;
    }//public static <T> ListNode<T> CollectionToListNode(T[] values) {

    public static <T> ListNode<T> ListNodeClone(ListNode<T> Original){
        if(Original==null){
            return null;
        }//if(Original==null){
        ListNode<T> CopyOutput = new ListNode<>(Original.value);
        ListNode<T> Copy = CopyOutput;
        while(Original!=null){
            if(Original.next!=null){
                Copy.next=new ListNode<>(Original.next.value);
                Copy=Copy.next;
            }//if(Original.next!=null){
            Original=Original.next;
        }//while(Original!=null){
        return CopyOutput;
    }//private ListNode<Integer> ListNodeClone(ListNode<Integer> Original){
}//public class ListNodeBuilder<T> {