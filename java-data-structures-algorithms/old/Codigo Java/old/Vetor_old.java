package old;
// Bibliotecas //




// Programa 

public class Vetor_old {




    // Variaveis 
    private Dados[] dados = new Dados[1];
    private int total = 0; 
    private StringBuilder builder;
    



    // Metodos
    public void adiciona(Dados elem){
        //implementação 
        liberaEspaco();
        this.dados[this.total] = elem; 
        this.total++; 
        
    }




    //
    public void adiciona(int posicao, Dados dados) {
         liberaEspaco();
        if( !posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int indice = total - 1; indice >= posicao; indice--) {
            this.dados[indice + 1] = this.dados[indice];
       }
        this.dados[posicao] = dados;
        total++;
       
    }




    // 
    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for(int i = posicao; i < total - 1; i++) {
         this.dados[i] = this.dados[i + 1];
        }
        total--;
        }




    //
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




    //
    public Dados pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("***Posição inválida!***");
        }else{
            return dados[posicao]; 
        }
    }

    private Boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < total;
    }

    private boolean posicaoValida(int posicao) {
        return posicao >= 0 && posicao <= total;
        }

    public int tamanho() {
        return this.total;
    }

    public boolean contem(String dados) {
        return builder.indexOf(dados) >= 0 ? true : false ;
    }

    private void liberaEspaco(){
        if(this.total == dados.length){
            Dados[] novaArray =  new Dados[this.dados.length * 2];
            for(int i = 0; i <=dados.length-1;i++){
                novaArray[i] = this.dados[i];
            }
            dados =novaArray;
        }
    }

    
        
        
}
