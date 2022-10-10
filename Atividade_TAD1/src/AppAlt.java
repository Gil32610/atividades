import java.util.Scanner;
import java.util.Stack;

public class AppAlt {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Stack<Integer> pilha = new Stack();
        Scanner s = new Scanner(System.in);
        int num, quot, rest;
        System.out.println("Informe o número decimal para converter em binário: ");
        num = Integer.parseInt(s.nextLine());

        do {
            quot = num / 2;
            rest = num % 2;
            pilha.push(rest);
            num = quot;
        } while (quot != 0);

        while(!pilha.isEmpty()){
            rest = pilha.pop();
            System.out.print(rest);
        }

    }
    
}
