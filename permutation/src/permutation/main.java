package permutation;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrer svp le nombre A");
		float a = sc.nextFloat();
		
		System.out.println("entrer svp le nombre B");
		float b = sc.nextFloat();
		
		sc.close();
		
		System.out.println("la valeur de A = "+a+"est B = "+b+" avant permutation");
        float aux = a;
        a=b;
        b=aux;
        
		System.out.println("la valeur de A = "+a+"est B = "+b+" apres  permutation");

	}

}
