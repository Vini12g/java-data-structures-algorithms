// Bibliotecas //




// Classe //




public class Vetor {





    // Atributos //
      private Dados[] dados = new Dados[100];
      private int total = 0;
      



        // Construtor // 




        // Metodos Get // 




        // Metodos Set // 




        // Metodos //
        public String toString() {
          if (this.total == 0) {
          return "[]";
          }
          StringBuilder builder = new StringBuilder();
          builder.append("[");
          for (int i = 0; i < this.total - 1; i++) {
          builder.append(this.dados[i]);
          builder.append(", ");
          }
          builder.append(this.dados[this.total - 1]);
          builder.append("]");
          return builder.toString();
          } 




        public int tamanho(){
          return this.total;
        }

        private boolean valida(int posicao){
          if(posicao >= 0 && posicao < this.total){
            return false;
          } else{
            return true;
          }

        }

        private boolean posicaoOculpada(int posicao){
          if(posicao >= 0 && posicao < this.total){
            return false; 
          } 
          else{
            return true; 
          }
           
        }



        
            // Metodo pega dado // 
            public Dados pega(int posicao){
              if(posicaoOculpada(posicao) ){
                throw new IllegalArgumentException("***** Posição Invalida *****");
              }else{
                return dados[posicao];
              }
            }
        




            // Adicionar um elemento em uma posição // 
            public void removendoValor(int posicao)
            {
              if(posicaoOculpada(posicao)){
                throw new IllegalArgumentException("***** Posição Invalida *****");
              }
              for(int i = posicao; i < this.total -1 ; i++ ){
                this.dados[i] = this.dados[i + 1];
              }
                this.total --;
                
              
              

            }




            // 
            // Adicionar um elemento em uma posição // 
            public void adicionaValor(int posicao, Dados dadoslocal)
            {
              if(valida(posicao) ){
              throw new IllegalArgumentException("Posicao inválida");}

              // Programa //
              for(int indice = this.total - 1; indice >= posicao; indice-- ){
                this.dados[indice + 1] = this.dados[indice];
                dados[indice + 1 ] = dados[indice];
              }
              dados[posicao] = dadoslocal;
              this.total = this.total +1;
              
              
            

            }



        












                public class EnviaElemFim {
                    public static void main(String args[]){
                    Vetor lista = new Vetor();
                    Dados elem1 = new Dados();
                    Dados elem2 = new Dados();
                    elem1.setAdiciona("Rafael");
                    elem2.setAdiciona("Ana da Silva");
                    lista.adiciona(elem1);
                    lista.adiciona(elem2);
                    System.out.println(lista);
                    }



                    }



        
        public void adiciona(Dados elem) {
            this.dados[this.total] = elem;
            this.total++;
            }














                    //
                    
                    



                    


}
