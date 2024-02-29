// Importações
import java.util.Scanner;



// Programa
public class VerificadorPalindromo{


    

    // Atributos
    




    // Metodos 
    public static boolean VerificarPalindromo(String Entrada) {
        Pilha pilha = new Pilha();

        for (int i = 0; i < Entrada.length(); i++) {
            pilha.push((int) Entrada.charAt(i));
        }

        for (int i = 0; i < Entrada.length(); i++) {
            if (pilha.pop() != (int) Entrada.charAt(i)) {
                return false;
            }
        }

        return true;
    }




    // Metodo Main
    public static void main(String[] args) {
        //
        String entrada; 
        //
        Scanner scanner = new Scanner(System.in);




        System.out.println("Digite uma palavra ou frase:");
        entrada = scanner.nextLine();

        if (VerificarPalindromo(entrada)) {
            System.out.println("A frase ou palavra inserida é um palíndromo.");
        } else {
            System.out.println("A frase ou palavra inserida não é um palíndromo.");
        }
        scanner.close();
    }

    
}