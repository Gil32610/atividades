package Question2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        SoDinheiro banco = new SoDinheiro();
        int op;
        Scanner s = new Scanner(System.in);

        do {

            System.out.println("Escolha a opção: ");
            showMenu();
            op = Integer.parseInt(s.nextLine());
            switch (op) {
                case 0:
                    System.out.println("FIM!");
                    break;
                case 1:
                    banco.newTicket();
                    break;
                case 2:
                    banco.nextCustomer();
                    break;
                case 3:
                    System.out.println(banco.firstInLine()); 
                    break;
                case 4:
                   System.out.println( banco.lastInLine());
                    break;
                default:
                    System.out.println("Opção inálida");
                    break;
            }

        } while (op != 0);

    }

    public static void showMenu() {
        System.out.println("1 - solicitar senha");
        System.out.println("2 - Próximo cliente");
        System.out.println("3 - Primeiro da fila");
        System.out.println("4 - último da fila");
        System.out.println("0 - encerrar");
    }
}
