package Cafeteria;

import java.util.Scanner;
import Queue.Queue;

public class JohnCafeteria {
    public static void main(String[] args) {
        Pedido p;
        String pedido, prato;
        Scanner s = new Scanner(System.in);
        Queue<Pedido> Maria = new Queue<>();
        int op;
        do {
            System.out.println("Escolha a opção:");
            showMenu();
            op = Integer.parseInt(s.nextLine());

            switch (op) {
                case 1:
                    System.out.println("Informe o número do boleto: ");
                    pedido = s.nextLine();
                    System.out.println("Informe o prato: ");
                    prato = s.nextLine();
                    p = new Pedido(pedido, prato);
                    Maria.enQueue(p);
                    break;
                case 2:
                System.out.println(Maria.head());
                break;
            }

        } while (op != 0);

    }

    public static void showMenu() {
        System.out.println("Opções");
        System.out.println("1 - Fazer pedido");
        System.out.println("2 - Pedido atual");
        System.out.println("3 - Solicitar pedido");
        System.out.println("0 - Sair");
    }
}