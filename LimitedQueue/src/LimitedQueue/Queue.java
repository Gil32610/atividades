package LimitedQueue;
    public class Queue<T> {
        private LSENode<T> head;
        private LSENode<T> tail;
        private int nodes;
        private int quantity;
    
        public Queue(int nodes) {
            this.nodes = nodes;
        }
    
        public boolean isEmpty() {
            if (this.head == null && this.tail == null && this.nodes == 0) {
                return true;
            }
            return false;
        }
    
        public void enQueue(T content) {
            LSENode<T> node = new LSENode(content);
            if (this.isEmpty()) {
                this.head = node;
                this.tail = node;
                this.quantity++;
            } else {
                this.tail.setNext(node);
                this.tail = node;
                this.quantity++;
            }
        }
    
        public T deQueue() {
            T content;
            if (this.head.getNext() == null) {
                content = this.head.getContent();
                this.head = null;
                this.tail = null;
                this.quantity = 0;
                return content;
    
            }
            LSENode<T> current = this.head.getNext();
            content = this.head.getContent();
            this.head = current;
            this.quantity--;
            return content;
    
        }
    
        public T head() {
            T content = this.head.getContent();
            return content;
        }
    
        public boolean isFull() {
            if (this.quantity == nodes) {
                return true;
            }
            return false;
        }
    }
