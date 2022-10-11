
package MurkoffCorp;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JoseAlt {
    public static void main(String[] args) {

        Projeto p, grant;
        String titulo, ideia;
        Scanner s = new Scanner(System.in);
        Queue<Projeto> projetos = new LinkedList<>();
        int op;

        do {
            System.out.println("Fila de projetos");
            System.out.println("Escolha a opção:");
            showMenu();
            op = Integer.parseInt(s.nextLine());

            switch (op) {
                case 1:
                    System.out.println("Informe o titulo do projeto: ");
                    titulo = s.nextLine();
                    System.out.println("Informe a ideia do projeto: ");
                    ideia = s.nextLine();
                    p = new Projeto(ideia, titulo);
                    projetos.add(p);
                    break;
                case 2:
                    System.out.println(projetos.element());
                    break;
                case 3:
                    System.out.println("Informe o número do titulo: ");
                    titulo = s.nextLine();
                    p = new Projeto(titulo);
                    if (p.equals(projetos.element())) {
                        projetos.remove();
                        System.out.println("Projeto avaliado!");

                    } else {
                        System.out.println("Um Projeto ainda está sendo avaliado");
                    }
                    break;
                case 0:
                    System.out.println("fim!");
                    break;
            }

        } while (op != 0);

    }

    public static void showMenu() {
        System.out.println("Opções");
        System.out.println("1 - Adicionar projeto");
        System.out.println("2 - Próximo projeto para avaliação");
        System.out.println("3 - Concluir avaliação");
        System.out.println("0 - Sair");
    }

}