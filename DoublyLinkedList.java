/**
 * Created by Arabic on 02/03/22.
 */
public class DoublyLinkedList<E> {
    Node<E>header;
    Node<E>trailar;
    int size=0;

    public DoublyLinkedList() {
        header=new Node<>(null,null,null);
        trailar=new Node<>(null,header,null);
        header.setNext(trailar);
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size (){
        return size;
    }
    public E first(){
        if (isEmpty())return null;
        return header.getNext().getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return trailar.getPrev().getElement();
    }
    public void addBetween(E el,Node<E>p,Node<E>n){
        Node<E>newst=new Node<E>(el,p,n);
        p.setNext(newst);
        n.setNext(newst);
        size++;
    }
    public void addFirst(E el){
        addBetween(el,header,header.getNext());
    }
    public void addLast(E el){
        addBetween(el,trailar.getPrev(),trailar);
    }
    public E remove(Node<E>x){
        Node<E>n=x.getNext();
        Node<E>p=x.getPrev();
        n.setPrev(p);
        p.setNext(n);
        size--;
        return x.getElement();
    }
    public E removeFirst(){
        if (isEmpty())return null;
        return remove(header.getNext());
    }
    public E removeLast(){
        if (isEmpty())return null;
        return remove(trailar.getPrev());
    }

   private static class Node<E>{
      E element;
        Node<E>prev;
        Node<E>next;


        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
