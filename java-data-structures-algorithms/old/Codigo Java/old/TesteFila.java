package old;
import java.util.Scanner;

import Fila;

public class TesteFila {

    public static void main(String[] args) {
        Fila fila = new Fila();
        Scanner ler = new Scanner(System.in);
        
        // Entrada
        System.out.print("Quantos valores deseja colocar? ");
        int n = Integer.parseInt(ler.nextLine());
        
        for (int c = 0; c < n; c++) {
            System.out.print("Digite um valor: ");
            String valor = ler.nextLine();
            fila.Insere(valor);
        }

        // Saída
        String elemento;
        System.out.println(" Pegando os elementos:");
        while (true) {
            elemento = (String) fila.remover();
            if (elemento == null) {
                break;
            } else {
                System.out.println(elemento);
            }
        }
    }
}
