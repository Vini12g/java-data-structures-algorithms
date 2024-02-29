package old;
import java.util.Scanner;

import Fila;
import Pilha;

public class Exercicio_02 {




    // Metodos 

    public static boolean verificaPalindromo(String palavra) {

        // 
        Pilha palavraInvertida = new Pilha();
        Fila palavraV = new Fila();




        // Inserir os caracteres da palavra na pilha
        int c = 0;

        while (c < palavra.length()) {
            palavraInvertida.push(palavra.charAt(c));
            palavraV.Insere(palavra.charAt(c));
            c = c + 1;
        }


        // Testar
        while(true){
            char palavraInvertidaS = (char) palavraInvertida.pop();
            char palavraS = (char) palavraV.remover();

            if( palavraInvertidaS == palavraS ){
                c = c - 1; 
                if(c == 0){
                    return true;
                    
                }

            }else{
                return false; 
                
            }
        }

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.nextLine();
  

        if (verificaPalindromo(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}
