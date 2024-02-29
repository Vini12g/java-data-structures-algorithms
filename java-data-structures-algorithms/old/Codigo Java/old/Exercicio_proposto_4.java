package old;
import java.util.Scanner;

import Fila;

public class Exercicio_proposto_4 {

    // Metodo
    public static void removeNegativos(Fila fila) {
        Fila filaTemp = new Fila();

        while (true) {
            Object elemento = fila.remover();
            if (elemento == null) {
                break;
            }

            if (elemento instanceof Integer) {
                Integer numero = (Integer) elemento;
                if (numero >= 0) {
                    filaTemp.Insere(numero);
                }
            }
        }

        while (true) {
            Object elemento = filaTemp.remover();
            if (elemento == null) {
                break;
            }

            fila.Insere(elemento);
        }
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Fila f1 = new Fila();

        System.out.println("Digite quantos valores deseja inserir na fila: ");
        int n =  Integer.parseInt(ler.nextLine());

        for(int c = 1;c<=n; c++ ){
            System.out.println("Digite um valor: ");
            f1.Insere(Integer.parseInt(ler.nextLine()));

        }

        System.out.println("Fila original: " + f1.mostra());

        removeNegativos(f1);

        System.out.println("Fila sem números negativos: " + f1.mostra());
    }
}






