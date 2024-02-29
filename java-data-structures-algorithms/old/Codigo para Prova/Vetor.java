// Bibliotecas //




// Classe //




public class Vetor {




    // Atributos //
      private Dados[] dados = new Dados[100];
      private int total = 0;
      private StringBuilder builder; 
      



        // Construtor // 




        // Metodos Get // 




        // Metodos Set // 




        // Metodos //
        public String toString() {
          if (this.total == 0) {
          return "[]";
          }
          builder = new StringBuilder();
          builder.append("[");
          for (int i = 0; i < this.total - 1; i++) {
          builder.append(this.dados[i]);
          builder.append(", ");
          }
          builder.append(this.dados[this.total - 1]);
          builder.append("]");
          return builder.toString();
          } 



          // Metodo Adicionar elemento // ********** Fazer




          // Contem //
          public boolean contem(String dados){
            return builder.indexOf(dados) >= 0 ? true : false; 
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




        //
        private boolean posicaoOculpada(int posicao){
          if(posicao >= 0 && posicao < this.total){
            return false; 
          } 
          else{
            return true; 
          }
           
        }




        // 
        private void liberaEspaco(){
          if(total == dados.length){
            Dados[] novaArray = new Dados[this.dados.length*2];
            for(int i = 0; i<= dados.length-1; i++){
              novaArray[i] = this.dados[i];
            }
            dados = novaArray;
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
              this.liberaEspaco();
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



        
















        
        public void adiciona(Dados elem) {
            this.dados[this.total] = elem;
            this.total++;
            }














                    //
                    
                    



                    


}
// posição valida
// posição ocupada
// Principais estruturas de Dados
// Verificar o toString de dados
