// Bibliotecas // 
import java.util.Scanner;


public class Dados{




    // Atributos //
    private String titulo; 
    private String autor;
    private float preco;
    public static Vetor listaValores = new Vetor();
    public static Scanner entrada = new Scanner(System.in);
    private int valor;





    // Metodos Get // 
    public String getAutor() {
        return autor;
    }
    public float getPreco() {
        return preco;
    }
    public String getTitulo() {
        return titulo;
    }




    // Metodos set //
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



    // Cosntrutores // 





    // Alocar valores em uma Lista //
    public void alocarValores(int valores){

    }




    public static void adicionaValorLista(){

            

            
            //
            System.out.println("Digite o número de valores que deseja registrar: ");
            int numeroValores = Integer.parseInt(entrada.nextLine());
            
            for(int c = 0; c < numeroValores; c++){




                // Variaveis locais //
                int valor;




                //
                
                System.out.println("Digite um valor: ");
                valor = Integer.parseInt(entrada.nextLine());
                Integer.parseInt(entrada.nextLine());

                Dados objvalor = new Dados();
                objvalor.setAdiciona(valor);
                listaValores.adicionaValor(c, objvalor);

                
            }
            System.out.println(listaValores);
        }






    // Metodos // 




    public String toString() {
        return this.titulo + this.autor + this.preco;
        } 





    public void setAdiciona(int valor){
        this.valor = valor;
        }




    public String getPegaElem() {
        return this.titulo ;

        } 








    

        


        // 



        




        // Processo //
        public static void main(String args[]){


            adicionaValorLista();

           
            
            /* 
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

            */

        }
    }

