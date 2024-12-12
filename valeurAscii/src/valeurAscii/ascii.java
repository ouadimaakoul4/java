package valeurAscii;

import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("entrer svp le nombre de cases de votre tableau");
		 int n = sc.nextInt();
		 
		 String tab[] = new String[n];
		 
		 for(int i =0 ; i<n; i++) {
			 System.out.println("remplisser la case numero "+i+" de votre tableau");
			 tab[i] = sc.next(); 
		 }
		 sc.close();
		 for(int i = 0 ; i<n; i++) {
			 int convert = tab[i].charAt(0);
			  
			 System.out.println("la valeur ASCII de :"+tab[i]+" "+" est :"+ convert );
		 }
	}

}
