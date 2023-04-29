import java.util.Scanner;

class Vetores {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);   
             
        int[] numeros  = new int[10];
        Double[] notas = new Double[10];
        String[] nomes = new String[10];
        
        for(int i = 0; i <= 9; i++){
          System.out.printf("%d", numeros[i]);
        }
        
        for(int i = 0; i <= 9; i++){
          System.out.printf("%f", notas[i]);
        }
        
        for(int i = 0; i <= 9; i++){
          System.out.printf("%s", nomes[i]);
        }

    		System.exit(0);
		
	}

}
