package max_tableau;
import java.util.Scanner;
public class maxTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("entrer svp le nombre de cases de votre tableau");
		 int n = sc.nextInt();
		 
		 int tab[] = new int[n];
		 
		 for(int i =0 ; i<n; i++) {
			 System.out.println("remplisser la case numero "+i+" de votre tableau");
			 tab[i] = sc.nextInt(); 
		 }
		 sc.close();
		 for(int i =0 ; i<n; i++) {
			 System.out.println("la case numero "+i+"contient la valeur :"+tab[i]);
		 }
		 int max = tab[0];
		 for(int i =0 ; i<tab.length ; i++) {
			 if(tab[i] > max)
				 	max = tab[i];
		 }
		 System.out.println("le MAX EST :"+ max);

	}

}
