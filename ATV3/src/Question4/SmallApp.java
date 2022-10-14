package Question4;

import br.unicap.edi.gil.Deque;
import java.util.Scanner;

public class SmallApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int capacity;
        int op, aNumber;

        System.out.println("Informe a capacidade: ");
        capacity = Integer.parseInt(s.nextLine());
        Deque<Integer> aDeque = new Deque(capacity);

        do {
            menu();
            op = Integer.parseInt(s.nextLine());
            switch (op) {
                case 0:
                    System.out.println("FIM!");
                    break;
                case 1:
                    if (aDeque.isFull()) {
                        System.out.println("Deque cheio");
                    } else {
                        System.out.println("Informe o número: ");
                        aNumber = Integer.parseInt(s.nextLine());
                        aDeque.push(aNumber);
                        System.out.println("Numero inserido");
                    }
                    break;
                case 2:
                    System.out.println("Numero removido: " + aDeque.pop());
                    break;
                case 3:
                    if (aDeque.isFull()) {
                        System.out.println("Deque cheio");
                    } else {
                        System.out.println("Informe o numero: ");
                        aNumber = Integer.parseInt(s.nextLine());
                        aDeque.inject(aNumber);
                    }
                    break;
                case 4:
                    System.out.println("Numero removido: " + aDeque.eject());
                    break;
                default:
                    System.out.println("Opção inálida");
                    break;
            }

        } while (op != 0);

    }

    public static void menu() {
        System.out.println("1 - inserir número no começo");
        System.out.println("2 - remover primeiro número");
        System.out.println("3 - inserir número no final");
        System.out.println("4 - remover ultimo número");
        System.out.println("0 - encerrar");
    }
}
