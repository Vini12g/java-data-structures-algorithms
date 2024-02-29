package old;
// Classe 

import Pilha;
import VetorD;

public class SimularMontagem{


    // Metodos 
    public String Verificar(VetorD cadeiras) {
        String retorno = "";

        int posicao = 0;
        for (int c4 = 0; c4 < cadeiras.tamanho(); c4++) {
            Pilha saida = (Pilha) cadeiras.pega(posicao);

            // Testar
            if (verificarCadeira(saida)) {
                retorno += "A " + (c4 + 1) + "° Cadeira foi montada corretamente.\n";
            } else {
                retorno += "A " + (c4 + 1) + "° Cadeira foi montada de forma incorreta.\n";
            }
            
            if (posicao < cadeiras.tamanho()) {
                posicao++;
            }
        }

        return retorno;
    }


    



    private boolean verificarCadeira(Pilha saida) {
        // Peças esperadas na cadeira
        String[] pecasEsperadas = {"Perna da Mesa", "Acentos", "Arruela", "Parafuso",
                                    "Perna da Mesa", "Acentos", "Arruela", "Parafuso",
                                    "Perna da Mesa", "Acentos", "Arruela", "Parafuso",
                                    "Perna da Mesa", "Acentos", "Arruela", "Parafuso",
                                    "Suporte para encosto", "Encosto"};
                                    

        // Testar
        for (int cont = 17; cont >= 0; cont--) {
            String pecaS = (String) saida.pop();
            if (!pecaS.equals(pecasEsperadas[cont])) {
                return false;
                
            }
        }

        return true;
    }





    public static void main(String[] args){



        Pilha cadeiraUsuario = new Pilha();
        cadeiraUsuario.push("Perna da Mesa");
        cadeiraUsuario.push("Acentos");
        cadeiraUsuario.push("Arruela");
        cadeiraUsuario.push("Parafuso");
        cadeiraUsuario.push("Perna da Mesa");
        cadeiraUsuario.push("Acentos");
        cadeiraUsuario.push("Arruela");
        cadeiraUsuario.push("Parafuso");
        cadeiraUsuario.push("Perna da Mesa");
        cadeiraUsuario.push("Acentos");
        cadeiraUsuario.push("Arruela");
        cadeiraUsuario.push("Parafuso");
        cadeiraUsuario.push("Perna da Mesa");
        cadeiraUsuario.push("Acentos");
        cadeiraUsuario.push("Arruela");
        cadeiraUsuario.push("Parafuso");
        cadeiraUsuario.push("Suporte para encosto");
        cadeiraUsuario.push("Encosto");

        Pilha cadeiraUsuario2 = new Pilha();
        cadeiraUsuario2.push("Teste 1");
        cadeiraUsuario2.push("Teste 2");
        cadeiraUsuario2.push("Teste 3");
        cadeiraUsuario2.push("Teste 4");
        cadeiraUsuario2.push("Teste 5");
        cadeiraUsuario2.push("Teste 6");
        cadeiraUsuario2.push("Teste 7");
        cadeiraUsuario2.push("Teste 8");
        cadeiraUsuario2.push("Teste 9");
        cadeiraUsuario2.push("Teste 10");
        cadeiraUsuario2.push("Teste 11");
        cadeiraUsuario2.push("Teste 12");
        cadeiraUsuario2.push("Teste 13");
        cadeiraUsuario2.push("Teste 14");
        cadeiraUsuario2.push("Teste 15");
        cadeiraUsuario2.push("Teste 16");
        cadeiraUsuario2.push("Teste 17");
        cadeiraUsuario2.push("Teste 18");

                Pilha cadeiraUsuario3 = new Pilha();
        cadeiraUsuario3.push("Teste 1");
        cadeiraUsuario3.push("Teste 2");
        cadeiraUsuario3.push("Teste 3");
        cadeiraUsuario3.push("Teste 4");
        cadeiraUsuario3.push("Teste 5");
        cadeiraUsuario3.push("Teste 6");
        cadeiraUsuario3.push("Teste 7");
        cadeiraUsuario3.push("Teste 8");
        cadeiraUsuario3.push("Teste 9");
        cadeiraUsuario3.push("Teste 10");
        cadeiraUsuario3.push("Teste 11");
        cadeiraUsuario3.push("Teste 12");
        cadeiraUsuario3.push("Teste 13");
        cadeiraUsuario3.push("Teste 14");
        cadeiraUsuario3.push("Teste 15");
        cadeiraUsuario3.push("Teste 16");
        cadeiraUsuario3.push("Teste 17");
        cadeiraUsuario3.push("Teste 18");

        // 
        VetorD cadeiras = new VetorD();
        cadeiras.adiciona(cadeiraUsuario);
        cadeiras.adiciona(cadeiraUsuario2);
        cadeiras.adiciona(cadeiraUsuario3);

        SimularMontagem s1 = new SimularMontagem();
        String exibir;
                
        exibir = (String)s1.Verificar(cadeiras);
        System.out.println(exibir);


        


    }


}