package old;
import java.util.Scanner;

import Pilha;

public class Exercicio_03 {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        Pilha pilhaz = new Pilha();


        System.out.println("Quantos números deseja inserir na pilha? ");
        int contn = Integer.parseInt(entrada.nextLine());

        for(int c = 1; c<=contn ; c++){
            System.out.println("Digite algum número: ");
            int numero = Integer.parseInt(entrada.nextLine());
            pilhaz.push(numero);

        }

        System.out.println("Quantas palavras ou characteres deseja inserir na pilha? ");
        int conts = Integer.parseInt(entrada.nextLine());

        for(int c = 1; c<=conts ; c++){
            System.out.println("Digite alguma frase ou character: ");
            String character = entrada.nextLine();
            pilhaz.push(character);

        }


        
 
        System.out.println("-- Desempilhando -- ");
        // Desempilhando e exibindo os elementos
        while (true) {
            Object elemento = pilhaz.pop();
            if (elemento == null) {
                break;
            } else {
                System.out.println("Elemento desempilhado: " + elemento);
                
            }
        }
    }
}