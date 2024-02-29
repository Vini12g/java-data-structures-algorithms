import java.util.Scanner;

import old.Dados;
import old.Vetor_old;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetor_old listaDeDados = new Vetor_old();

        System.out.println("Insira os dados:");

        while (true) {
            System.out.print("x1: ");
            int x1 = Integer.parseInt(scanner.nextLine());

            System.out.print("x2: ");
            int x2 = Integer.parseInt(scanner.nextLine());

            System.out.print("y1: ");
            int y1 = Integer.parseInt(scanner.nextLine());

            System.out.print("y2: ");
            int y2 = Integer.parseInt(scanner.nextLine());

            Dados dados = new Dados(x1, y1, x2, y2);
            listaDeDados.adiciona(dados);

            System.out.print("Deseja inserir mais dados? (S/N): ");
            String continuar = scanner.nextLine().toUpperCase();
            if (!continuar.equals("S")) {
                break;
            }
        }

        System.out.println("Conteúdo da lista de dados:");
         // Cabeçalho da tabela
        System.out.println("Indice  x1      y1      x2      y2      Distância");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < listaDeDados.tamanho(); i++) {
            Dados dados = listaDeDados.pega(i);
            System.out.println(dados);
        }
        listaDeDados.toString();
        scanner.close();
    }
}






