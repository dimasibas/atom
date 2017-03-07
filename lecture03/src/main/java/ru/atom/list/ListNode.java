package ru.atom.list;

/**
 * Contains ref to next node, prev node and value
 */


public class ListNode<E> {

   private E value;
   private ListNode<E> prev;
   private ListNode<E> next;

   public (ListNode(E value, ListNode<E> prev, ListNode<E> next)) {
      this.value = value;
      this.next = next;
      this.prev = prev
   }

   public E getValue() {

      return value;
   }

   public ListNode<E> getNext() {

      return next;
   }

   public ListNode<E> getPrev() {

      return prev;
   }

   public void setValue(E value) {
      this.value = value;
   }
   public void setPrev(ListNode<E> prev) {  //сылка на переменную prev в листноде

      this.previous = previous;
   }

   public void setNext(ListNode<E> next)
   {
      this.next = next;
   }

}
