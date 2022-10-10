import java.util.Scanner;
import pilha.Stack;

public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String phrase;
        
        phrase = s.nextLine();
        if(phrase.isBlank()){
            System.out.println("info");
        }
        if (isPalindrome(phrase)) {
            System.out.println("É um palindromo!");
        } else {
            System.out.println("Não é um palindromo");
        }
    }

    public static boolean isPalindrome(String phrase) {
        Stack<Character> palindrome = new Stack();

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            if (c == ' ') {
                continue;
            }
            
            palindrome.push(phrase.charAt(i));
        }
        for (int j = 0; palindrome.isEmpty(); j++) {
            char a = phrase.charAt(j);
            if(a == ' '){
                continue;
            }
            if(palindrome.pop()!= phrase.charAt(j)){
                return false;
            }

        }
        return true;
    }
}
