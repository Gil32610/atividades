package br.unicap.edi.gil;

public class Deque<T> {
    private LSENode<T> head;
    private LSENode<T> tail;
    private int capacity;
    private int quantity;

    public Deque(int capacity) {
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        if (this.head == null && this.quantity == 0 && this.tail == null) {
            return true;
        }
        return false;
    }

    public void push(T content) {
        LSENode current = new LSENode<T>(content);
        if (this.isEmpty()) {
            this.head = current;
            this.tail = current;
            this.quantity++;
        } else {
            current.setNext(this.head);
            this.head = current;
            this.quantity++;
        }

    }

    public T pop() {
        T content = this.head.getContent();
        this.head = this.head.getNext();
        this.quantity--;
        return content;
    }

    public void inject(T content) {
        LSENode current = new LSENode<T>(content);
        if (this.isEmpty()) {
            this.head = current;
            this.tail = current;
            this.quantity++;
        } else {
            this.tail.setNext(current);
            this.tail = current;
            quantity++;
        }
    }

    public T eject() {
        T content = this.tail.getContent();
        if(this.head.getNext()== null){
            return content;
        }
        LSENode current = this.head;
        while (current.getNext() != this.tail) {
            current = current.getNext();
        }
        current.setNext(null);
        this.tail = current;
        return content;
    }

    public boolean isFull() {
        if (this.quantity == this.capacity) {
            return true;
        }
        return false;
    }
}
