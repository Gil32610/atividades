package br.unicap.edi.ana;

public class Queue<T> {
    private LSENode<T> head;
    private LSENode<T> tail;
    private int nodes;

    public boolean isEmpty() {
        if (this.head == null && this.tail == null && this.nodes == 0) {
            return true;
        }
        return false;
    }

    public void insertLast(T content) {
        LSENode<T> node = new LSENode(content);
        if (this.isEmpty()) {
            this.head = node;
            this.tail = node;
            this.nodes++;
        } else {
            this.tail.setNext(node);
            this.tail = node;
            this.nodes++;
        }
    }

}
