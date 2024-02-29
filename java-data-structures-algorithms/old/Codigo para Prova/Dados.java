// Bibliotecas //
import java.util.Scanner;




// Classe 
public class Dados {
    



    // Processo 
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("\nDigite o número do que deseja fazer: ");
            System.out.println("1 - Fatorial de um valor ");
            System.out.println("0 - Sair");
            int menu_Principal = Integer.parseInt(entrada.nextLine());

            switch (menu_Principal) {
                case 0:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Digite o valor para calcular o fatorial: ");
                    int valorFatorial = Integer.parseInt(entrada.nextLine());
                    Math obj_math1 = new Math();
                    int resultado = obj_math1.fatorialRecursivo(valorFatorial);
                    System.out.println("O resultado é: " + resultado);
                    break;
                case 2:
                    System.out.println("Digite o numerador: ");
                    int numerador = Integer.parseInt(entrada.nextLine());
                    System.out.println("Digite o expoente: ");
                    int expoente = Integer.parseInt(entrada.nextLine());
                    Math obj_math2 = new Math();
                    int resultado2 = obj_math2.potenciaRecursiva(numerador, expoente);
                    System.out.println("Seu resultado é: " + resultado2 );
                    break;
                 case 3:
                    System.out.println("Digite o numerador: ");
                    int numerador2 = Integer.parseInt(entrada.nextLine());
                    System.out.println("Digite o expoente: ");
                    int expoente2 = Integer.parseInt(entrada.nextLine());
                    Math obj_math3 = new Math();
                    int resultado3 = obj_math3.potenciaInterativa(numerador2, expoente2);
                    System.out.println("Seu resultado é: " + resultado3 );
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
