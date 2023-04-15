package List;

public class Node <E extends Comparable<E>>{
    private E item;
    private Node next;

    public Node(E newItem, Node<E> p){
        item = newItem;
        next = p;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
