package old;
// Classe

import Pilha;

public class Exercicio_Proposto {


    // Programa principal
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        Pilha pilha2 = new Pilha();


        // Empilhando elementos para qua a pilha fique na ordem inicial
        pilha.push(4);
        pilha.push(3);
        pilha.push(2);
        pilha.push(1);
        // 1 2 3 4 
        

        


        // Exercicio - Aplicando metodos para obter a sequencia 2, 4, 3, 1
        pilha2.push(pilha.pop()); // 2 3 4 / 1


        pilha.pop(); // Remover 2  
        pilha.pop(); // Remover 3 
        pilha.pop(); // Remover 4
        pilha.push(2); // Adiciona 2   
        pilha.push(4); // Adiciona 4
        pilha.push(3); // Inserir 3
        pilha.push(1); // Adiciona 1

        // Imprimir a pilha para validar se a sequência está correta
        Object elemento;
        while ((elemento = pilha.pop()) != null) {
            System.out.print(elemento + " ");
        }
    }
}