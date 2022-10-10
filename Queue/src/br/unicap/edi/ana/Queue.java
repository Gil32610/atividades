package br.unicap.edi.ana;

public class Queue<T> {
    private LSENode<T> first;
    private LSENode<T> last;
    private int nodes;
    
    public boolean isEmpty() {
        if (this.first == null && this.last == null && this.nodes == 0) {
            return true;
        }
        return false;
    }
    
    public void insertLast(T content){
        LSENode<T> node = new LSENode(content);
    } 

    
    
}
