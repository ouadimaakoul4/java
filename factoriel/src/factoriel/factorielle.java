package factoriel;

import java.util.Scanner;

public class factorielle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("entrer svp votre nombre :");
		int n = sc.nextInt();
		sc.close();
		
		long fact =1;

		for(int i =1; i<=n ; i++) {
			fact = fact * i;
		}
		
      System.out.printf("factoriel de %d est %d", n , Math.abs(fact));
	}

}
