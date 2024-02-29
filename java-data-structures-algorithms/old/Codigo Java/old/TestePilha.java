package old;
import java.util.Scanner;

import Pilha;

public class TestePilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Scanner ler = new Scanner(System.in);
        
        // Entrada
        System.out.print("Quantos valores deseja colocar? ");
        int n = Integer.parseInt(ler.nextLine());
        
        for (int c = 0; c < n; c++) {
            System.out.print("Digite um valor: ");
            String valor = ler.nextLine();
            pilha.push(valor);
        }

        // Saída
        String elemento;
        System.out.println("Desempilhando elementos:");
        while (true) {
            elemento = (String) pilha.pop();
            if (elemento == null) {
                break;
            } else {
                System.out.println(elemento);
            }
        }
    }
}
