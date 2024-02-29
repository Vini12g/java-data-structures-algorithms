public class Pilha {
    



    //
    VetorD lista = new VetorD();




    // Metodos 
    public void push(Object objeto){
        lista.adiciona(objeto);
    }


    private boolean pEmpty(){
        return lista.vazia();
    }
    

    public Object pop(){
        if(!pEmpty()) {
            Object Ob = lista.pega(lista.tamanho()-1);
            lista.remove(lista.tamanho()-1);
            return Ob;
            } else{
            return null;
        }
    }

    

}
