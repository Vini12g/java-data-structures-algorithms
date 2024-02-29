// Bibliotecas //




// Classe
public class Math {




    // Atributos // 




    // Metodos //
    public int fatorialRecursivo(int num1) {
        if (num1 == 0) {
            return 1;
        } else {
            return num1 * fatorialRecursivo(num1 - 1);
        }
    }




    // num 1 = x , num2 = y e x^y
    public static int potenciaRecursiva(int base, int expoente) {
        if (expoente == 0) {
            return 1; // Qualquer número elevado a 0 é 1.
        } else {
            return base * potenciaRecursiva(base, expoente - 1);
        }
    }
    
    


        public static int potenciaInterativa(int base, int expoente) {
            int baseOriginal = base;
            while(expoente != 1){
                base = base*baseOriginal;
                expoente = expoente-1;
            }

                

            
            return base; 
    }
    
    
}
