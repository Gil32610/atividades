package Question2;

import LimitedQueue.Queue;

public class SoDinheiro {
    private Queue<Integer> senhas;
    private int ticket;

    public SoDinheiro() {
        this.senhas = new Queue<>(20);
    }

    public Integer lastInLine() {
        return this.ticket;
    }

    public Integer firstInLine() {
        return this.senhas.head();
    }

    public void newTicket() {
        if (this.senhas.isFull()) {
            System.out.println("Aguarde o atendimento ficar disponível.");
        } else if (this.senhas.isEmpty()) {
            this.ticket++;
            senhas.enQueue(this.ticket);
            System.out.println("Dirija-se ao guichê. Ticket: " + this.ticket);
        } else {
            this.ticket++;
            senhas.enQueue(this.ticket);
            System.out.println("Aguarde o atendimento. Ticket: " + this.ticket);
        }
    }

    public void nextCustomer() {
        if (this.senhas.isEmpty()) {
            System.out.println("Não há ninguém na fila de espera");
        } else {
            this.senhas.deQueue();
            System.out.println("Volte sempre!");
        }
    }
}
