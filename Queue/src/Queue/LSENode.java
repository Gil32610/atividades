package Queue;

    public class LSENode<T> {
        private T content;
        private LSENode<T> next;   


        
        public LSENode (T content) {
            this.content = content;
        }
        public void setContent(T content) {
            this.content = content;
        }
        public T getContent() {
            return this.content;
        }
        public void setNext(LSENode<T> novoProx) {
            this.next = novoProx;
        }
        public LSENode<T> getNext () {
            return this.next;
        }    
     
}
