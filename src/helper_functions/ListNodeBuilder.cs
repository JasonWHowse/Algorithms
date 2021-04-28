namespace Algorithms.src.helper_functions {
    public static class ListNodeBuilder {
        public static ListNode<T> CollectionToListNode<T>(T[] values) {
            if (values.Length == 0) {
                return null;
            }//if (values.Length == 0) {
            ListNode<T> Head = new ListNode<T>();
            ListNode<T> Output = Head;
            for(int i=0;i<values.Length;){
                Head.value = values[i];
                if (++i < values.Length) {
                    Head.next = new ListNode<T>();
                    Head = Head.next;
                }//if (++i < values.Length) {
            }//for(int i=0;i<values.Length;){
            return Output;
        }//public static ListNode<T> CollectionToListNode<T>(T[] values) {
    }//public static class ListNodeBuilder {
}//namespace Algorithms.src.helper_functions {