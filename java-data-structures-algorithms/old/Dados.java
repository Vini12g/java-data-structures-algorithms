// Bibliotecas // 
import java.util.Scanner;


public class Dados{




    // Atributos //
    private String titulo; 
    private String autor;
    private float preco;
    public static Vetor listaLivros = new Vetor();
    public static Scanner entrada = new Scanner(System.in);





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




    // Metodos // 




    public String toString() {
        return this.titulo + this.autor + this.preco;
        } 





    public void setAdiciona(String titulo, String autor, float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        }




    public String getPegaElem() {
        return this.titulo ;

        } 





        // Metodo que adiciona um livro a lista //
        public static void adicionarlivrolista(){

            

            
            //
            System.out.println("Digite o número de livros que deseja registrar: ");
            int numeroLivros = Integer.parseInt(entrada.nextLine());
            
            for(int c = 0; c < numeroLivros; c++){




                // Variaveis locais //
                String localtitulo;
                String localautor;
                float localpreco;
                int posicao;



                //
                System.out.println("Digite o titulo do livro: ");
                localtitulo = entrada.nextLine(); 

                //
                System.out.println("Digite o autor do livro: ");
                localautor = entrada.nextLine();

                //
                System.out.println("Digite o preço do livro: ");
                localpreco = Float.parseFloat(entrada.nextLine());
                Integer.parseInt(entrada.nextLine());

                System.out.println("Digite o preço do livro: ");
                posicao = Integer.parseInt(entrada.nextLine());
                Integer.parseInt(entrada.nextLine());

                Dados livro = new Dados();
                livro.setAdiciona(localtitulo,localautor, localpreco);
                listaLivros.adicionaValor(posicao, livro);
                
            }
        }


        public static void removerlivrolista(String titulo){




            //





            // Variaveis //
            // Scanner entrada = new Scanner(System.in);




            // Estrutura //
            for(int i = 0; i <= listaLivros.tamanho(); i++ ){
                Dados d8 = new Dados();
                d8 = listaLivros.pega(i);

                if(titulo.equals(d8.titulo) ){
                    listaLivros.removendoValor(i);
                }else{};


            }
            // listaLivros
            System.out.println(listaLivros.toString());
            



        }


        // 



        




        // Processo //
        public static void main(String args[]){




            //
            adicionarlivrolista();
            System.out.println("Digite o titulo do livro que deseja remover da lista: ");
            String tituloexcluir = entrada.nextLine();
            removerlivrolista(tituloexcluir);




            // Item 1 //
            adicionarlivrolista();

           


            // Item 2 //
            removerlivrolista("teste");




            //listaLivros.adicionaValor(posicao, livro);
            
            










            /* 
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

            */

        }
    }

