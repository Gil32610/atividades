package Question2;
import LimitedQueue.Queue;
public class SoDinheiro {
    private Queue<Integer> senhas;
    private int ticket;

    public SoDinheiro(int limit){
        this.senhas = new Queue<>(limit);
    }

    public void newTicket(){
        if(this.senhas.isFull()){
            System.out.println("Aguarde o atendimento ficar disponível.");
        }
        else if(this.senhas.isEmpty()){
            this.ticket++;
            senhas.enQueue(this.ticket);
            System.out.println("Dirija-se ao guichê. Ticket: " + this.ticket);
        }
        else{
            this.ticket++;
            senhas.enQueue(this.ticket);
            System.out.println("Aguarde o atendimento. Ticket: " + this.ticket);
        }
    }
}
