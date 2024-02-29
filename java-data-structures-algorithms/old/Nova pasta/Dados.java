// Bibliotecas // 
import java.util.Scanner;


public class Dados{




    // Atributos // 
    private String elem; 




    // Metodos Get // 
    public String getElemento() {
        return elem;
    }




    // Metodos set //
    public void setElemento(String elemento) {
        this.elem = elemento;
    }



    // Cosntrutores // 




    // Metodos // 




    public String toString() {
        return this.elem;
        } 




    public void setAdiciona(String elem){
        this.elem = elem;
        }




    public String getPegaElem() {
        return this.elem;
        } 

        




        // Processo //
        public static void main(String args[]){




            //  // 
            Vetor vetor = new Vetor();
            Scanner entrada = new Scanner(System.in);
            

            System.out.println("Digite o número de nomes que deseja armazenar: ");
            int numeroNomes = Integer.parseInt(entrada.nextLine());
            int contador = 0; 
            


            // 
            while(contador < numeroNomes){



                System.out.println("Digite um nome: ");
                Dados dados = new Dados();
                dados.setAdiciona(entrada.nextLine());
                vetor.adiciona(dados);
                contador = contador + 1;
                
            }
            System.out.println("Digite o nome que deseja buscar: ");
            String nomeBuscarString = entrada.nextLine();

            
            
            
            // System.out.println(obj.getPegaElem());
            
            int contador2 = 0;
            boolean achou = false;

            while(contador2 < numeroNomes){
            Dados nomeArmazenado = (Dados) vetor.pega(contador2);
            Dados nomeBuscar = new Dados();
            nomeBuscar.setAdiciona(nomeBuscarString);



            if( nomeArmazenado.getElemento().equals(nomeBuscar.getElemento())){
                System.out.println("O nome " + nomeBuscar + " esta na posição: " + contador2 + " do vetor");
                achou = true;
                break;

            }else{}

            contador2 = contador2 + 1;
            }
            

            if( achou == false ){
                System.out.println("Nome não encontrado");
            }else{}

            // Teste //
            Dados teste = new Dados();
            teste.setAdiciona("André");
            System.out.println("ListaOriginal: ");
            System.out.println(vetor);

            vetor.adicionaValor(1, teste);
            System.out.println("Lista adicionada: ");
            System.out.println(vetor);

            vetor.removendoValor(0);
            System.out.println("Lista Removido: ");
            System.out.println(vetor);
            entrada.close();

            

        }
    }

