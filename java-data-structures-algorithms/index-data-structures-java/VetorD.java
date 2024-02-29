// Bibliotecas //




// Programa 
public class VetorD {




    // Variaveis 
    private Object[] objetos = new Object[1];
    private int total = 0; 
    private StringBuilder builder;
    



    // Metodos
    public void adiciona(Object objetos){
        //implementação 
        liberaEspaco();
        this.objetos[this.total] = objetos; 
        this.total++; 
        
    }




    //
    public void adiciona(int posicao, Object objetos) {
         liberaEspaco();
        if( !posicaoValida(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int indice = total - 1; indice >= posicao; indice--) {
            this.objetos[indice + 1] = this.objetos[indice];
       }
        this.objetos[posicao] = objetos;
        total++;
       
    }




    // 
    public void remove(int posicao) {
        if (!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for(int i = posicao; i < total - 1; i++) {
         this.objetos[i] = this.objetos[i + 1];
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
        builder.append(this.objetos[i]);
        builder.append(", ");
        }
        builder.append(this.objetos[this.total - 1]);
        builder.append("]"); 
        return builder.toString(); 
        }




    //
    public Object pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("***Posição inválida!***");
        }else{
            return objetos[posicao]; 
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

    public boolean contem(String objetos) {
        return builder.indexOf(objetos) >= 0 ? true : false ;
    }

    public boolean vazia(){

        return this.total >0 ? false : true; 
    }
    private void liberaEspaco(){
        if(this.total == objetos.length){
            Object[] novaArray =  new Object[this.objetos.length * 2];
            for(int i = 0; i <=objetos.length-1;i++){
                novaArray[i] = this.objetos[i];
            }
            objetos = novaArray;
        }
    }

    
        
        
}
