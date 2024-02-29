package old;
import java.util.Scanner;

import Fila;

public class Exercicio_proposto_5 {


    private static int temMaisElementos(Fila filaF1, Fila filaF2) {
        int tamanhoF1 = 0;
        int tamanhoF2 = 0;
        Fila copiaFila = new Fila();

        while (true) {
            Object elemento = filaF1.remover();
            if(elemento == null){
                break;
            }
            copiaFila.Insere(elemento);
            tamanhoF1++;

        }

        while (true) {
            Object elemento = copiaFila.remover();
            if(elemento == null){
                break;
            }
            filaF1.Insere(elemento);

        }

        while (true) {
            Object elemento = filaF2.remover();
            if(elemento == null){
                break;
            }
            copiaFila.Insere(elemento);
            tamanhoF2++;

        }

        while (true) {
            Object elemento = copiaFila.remover();
            if(elemento == null){
                break;
            }
            filaF2.Insere(elemento);

        }



        if (tamanhoF1 > tamanhoF2) {
            System.out.println("F1 tem mais elementos do que F2.");
        } else if (tamanhoF1 < tamanhoF2) {
            System.out.println("F2 tem mais elementos do que F1.");
        } else {
            System.out.println("F1 e F2 têm o mesmo número de elementos.");
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Fila filaF1 = new Fila();
        Fila filaF2 = new Fila();

        System.out.print("Quantos elementos você quer inserir na fila 1? ");
        int quantidadeF1 = Integer.parseInt(ler.nextLine());

        System.out.println("Insira os elementos na fila:");
        for (int i = 0; i < quantidadeF1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            Object elemento = ler.nextLine();
            filaF1.Insere(elemento);
        }

   

        System.out.print("Quantos elementos você quer inserir na fila 2? ");
        int quantidadeF2 = Integer.parseInt(ler.nextLine());

        System.out.println("Insira os elementos na fila:");
        for (int i = 0; i < quantidadeF2; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            Object elemento = ler.nextLine();
            filaF2.Insere(elemento);
        }



        temMaisElementos(filaF1, filaF2);
    }
}