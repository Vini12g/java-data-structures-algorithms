package old;
import java.util.Scanner;

import Pilha;




public class Exercicio_04 {

    public static void main(String[] args) {
        // Crie uma fila para representar a ordem inversa de chegada dos carros
        Pilha teste = new Pilha();

        
        

        Scanner entrada = new Scanner(System.in);



        System.out.println("Quantos carros deseja inserir? ");
        int contn = Integer.parseInt(entrada.nextLine());

        for(int c = 1; c<=contn; c++ ){
            Carro carroz = new Carro();

            // Primeira parte
            System.out.println("Responda com 's' ou 'n': ");
            System.out.println("O motor do " + c + "° esta com defeito? ");
            String resposta = entrada.nextLine();
            if(resposta.equals("s")){
                carroz.setMotor(true);
            }else{
                carroz.setMotor(false);

            }

            // Segunda 
            System.out.println("Responda com 's' ou 'n': ");
            System.out.println("A embreagem do " + c + "° esta com defeito? ");
            resposta = entrada.nextLine();
            if(resposta.equals("s")){
                carroz.setEmbreagem(true);
            }else{
                carroz.setEmbreagem(false);

            }

                        // Terceira 
            System.out.println("Responda com 's' ou 'n': ");
            System.out.println("A caixa de marchas do " + c + "° esta com defeito? ");
            resposta = entrada.nextLine();
            if(resposta.equals("s")){
                carroz.setCaixaMarchas(true);
                carroz.teveProblema = true;
            }else{
                carroz.setCaixaMarchas(false);

            }


                        // Segunda 
            System.out.println("Responda com 's' ou 'n': ");
            System.out.println("As rodas ou pneus do " + c + "° esta com defeito? ");
            resposta = entrada.nextLine();
            if(resposta.equals("s")){
                carroz.setRodasPneus(true);
                carroz.teveProblema = true;
            }else{
                carroz.setRodasPneus(false);

            }



                        // Segunda 
            System.out.println("Responda com 's' ou 'n': ");
            System.out.println("Os freios do " + c + "° estão com defeito? ");
            resposta = entrada.nextLine();
            if(resposta.equals("s")){
                carroz.setFreios(true);
                carroz.teveProblema = true;
            }else{
                carroz.setFreios(false);

            }



                        // Segunda 
            System.out.println("Responda com 's' ou 'n': ");
            System.out.println("A suspensão do " + c + "° esta com defeito? ");
            resposta = entrada.nextLine();
            if(resposta.equals("s")){
                carroz.setSuspensao(true);
                carroz.teveProblema = true;
            }else{
                carroz.setSuspensao(false);

            }



                        // Segunda 
            System.out.println("Responda com 's' ou 'n': ");
            System.out.println("Os fluidos do " + c + "° esta com problema? ");
            resposta = entrada.nextLine();
            if(resposta.equals("s")){
                carroz.setFluidos(true);
                carroz.teveProblema = true;
            }else{
                carroz.setFluidos(false);

            }


             teste.push(carroz);

        }



        // Inicialize contadores para os componentes
        int motorProblemas = 0;
        int embreagemProblemas = 0;
        int caixaMarchasProblemas = 0;
        int rodasPneusProblemas = 0;
        int freiosProblemas = 0;
        int suspensaoProblemas = 0;
        int fluidosProblemas = 0;
        int teveProblema = 0;

        int totalCarros = 0; // Total de carros com problemas

        // Processar os carros na ordem inversa de chegada
        for (Carro carro = (Carro) teste.pop(); carro != null; carro = (Carro) teste.pop()) {
            totalCarros++;

           
            totalCarros++;
            
            totalCarros++;

            if (carro.motor) {
                motorProblemas++;
            }
            if (carro.embreagem) {
                embreagemProblemas++;
            }
            if (carro.caixaMarchas) {
                caixaMarchasProblemas++;
            }
            if (carro.rodasPneus) {
                rodasPneusProblemas++;
            }
            if (carro.freios) {
                freiosProblemas++;
            }
            if (carro.suspensao) {
                suspensaoProblemas++;
            }
            if (carro.fluidos) {
                fluidosProblemas++;
            }
            if(carro.teveProblema){
                teveProblema++;
            }
        }

        // Calcular a média
        double totalproblemas = motorProblemas + embreagemProblemas + caixaMarchasProblemas + rodasPneusProblemas + freiosProblemas + suspensaoProblemas + fluidosProblemas;
        double media = (double) totalCarros / totalproblemas ;

         
        // Calcular a variância e o desvio padrão amostral


        double variancia = ((motorProblemas - media) * (motorProblemas - media)
        + (embreagemProblemas - media) * (embreagemProblemas - media)
        + (caixaMarchasProblemas - media) * (caixaMarchasProblemas - media)
        + (rodasPneusProblemas - media) * (rodasPneusProblemas - media)
        + (freiosProblemas - media) * (freiosProblemas - media)
        + (suspensaoProblemas - media) * (suspensaoProblemas - media)
        + (fluidosProblemas - media) * (fluidosProblemas - media)) / (totalCarros - 1);

        double desvioPadrao = Math.sqrt(variancia);

        // Exibir resultados
        System.out.println("Quantidade de problemas no motor: " + motorProblemas);
        System.out.println("Quantidade de problemas na embreagem: " + embreagemProblemas);
        System.out.println("Quantidade de problemas na caixa de marchas: " + caixaMarchasProblemas);
        System.out.println("Quantidade de problemas nas rodas e pneus: " + rodasPneusProblemas);
        System.out.println("Quantidade de problemas nos freios: " + freiosProblemas);
        System.out.println("Quantidade de problemas na suspensão: " + suspensaoProblemas);
        System.out.println("Quantidade de problemas nos fluidos: " + fluidosProblemas);
        System.out.println("Média de carros com problemas: " + media);
        System.out.println("Variância amostral: " + variancia);
        System.out.println("Desvio padrão amostral: " + desvioPadrao);
    }
}

