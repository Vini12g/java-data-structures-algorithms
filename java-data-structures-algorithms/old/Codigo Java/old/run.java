package old;
import VetorD;

public class run {
    public static void main(String[] args){

        // Vetor
        VetorD v1 = new VetorD();

        // Dados
        String teste = "André";
        Dados d1 = new Dados(8, 6, 0, 12);

        // Adicionando
        v1.adiciona(teste);
        v1.adiciona(d1);
        v1.adiciona("Wagner");


        System.out.println("Vetor: " + v1 ); 


        v1.remove(1);
        System.out.println("Vetor apos remover dado da posição 1: " + v1 ); 

        v1.adiciona(88.5);
        v1.adiciona("Lucas");

        System.out.println("Vetor apos adicionar 2 novos dados: " + v1 ); 

        System.out.println("Pegando a posição 3 do Vetor: " + v1.pega(3));

        System.out.println("Tamanho do Vetor: " + v1.tamanho() );

        v1.adiciona(1, "Posição 1 ");
        System.out.println("Vetor apos adicionar um dado na posição 1 : " + v1 );


        System.out.println("Teste Contem");
        System.out.println("Deve retornar True = "+ v1.contem("Lucas"));
        System.out.println("Deve retornar False = "+ v1.contem("Darius"));
        
    
       





    }
    
}
