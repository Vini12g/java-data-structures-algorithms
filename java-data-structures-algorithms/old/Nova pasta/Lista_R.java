import java.util.Scanner;
public class Lista_R{
        public static void main(String args[]){
                Scanner entrada = new Scanner(System.in);
                int n = Integer.parseInt(entrada.nextLine());
                String lista[] = new String[n];
                if(n > 0){
                     for(int k=0;k < n;k++) {
                        String elem =entrada.nextLine();
                        lista[k] = elem;
                      }
                } else
                   System.out.println("Lista Vazia");
                   
                 for(int i=0;i<n;i++)
                   System.out.println(lista[i]); 
              entrada.close();     
        }
        
}