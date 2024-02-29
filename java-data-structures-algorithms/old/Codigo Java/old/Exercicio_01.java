package old;
import java.util.Scanner;

import Pilha;

public class Exercicio_01 {


public static void main(String[] args) {
    // Atividade 1 

        Pilha pilha = new Pilha();
        Scanner ler = new Scanner(System.in);
        
        // Entrada
        System.out.print("Quantos valores deseja inserir? ");
        int n = Integer.parseInt(ler.nextLine());
        
        for (int c = 0; c < n; c++) {
            System.out.print("Digite um valor: ");
            String valor = ler.nextLine();
            pilha.push(valor);
        }

        // Saída
        String elemento;
        System.out.println("Valores pares da pilha:");
        while (true) {
            elemento =  (String) pilha.pop();
            if (elemento == null) {
                break;
            } else {
                int elementoint = Integer.parseInt(elemento);
                if( elementoint % 2 == 0){
                    System.out.println(elementoint);
                }
                
            }
        }
    }
    


}


