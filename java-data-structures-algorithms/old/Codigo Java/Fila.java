public class Fila {




    //
    VetorD lista = new VetorD();
    



    // Metodos
    public void  Insere(Object objeto) {
        lista.adiciona(objeto);
    }
    public Object remover(){
        if(!fEmpty()){
            Object objeto = lista.pega(0);
            lista.remove(0);
            return objeto;
            }
            return null;
    }
    private boolean fEmpty() {
        return lista.vazia();
    }
    public Object mostra(){

        return lista;

    }
}
