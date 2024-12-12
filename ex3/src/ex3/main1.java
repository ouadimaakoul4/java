/**
 * 
 */
package ex3;
import java.util.Scanner;

public class main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int res = 56/2;
     System.out.println("la division de 56 par 2 est : " + res);
     
     
     System.out.println("lire et ecrire en java" );

     // lire les donnes
     Scanner sc = new Scanner(System.in);
     
     System.out.println("entrer le premier nombre " );
     int nbr1 = sc.nextInt();
     
     System.out.println("entrer le deuxieme nombre " );
     int nbr2 = sc.nextInt();
     
     System.out.println(nbr1 + "x" + nbr2 +"="+nbr1*nbr2);

	}

}
