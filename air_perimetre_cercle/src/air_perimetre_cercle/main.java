package air_perimetre_cercle;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer svp le rayon de votre cercle en cm");
		float rayon = sc.nextFloat();
		sc.close();
		double perimetre = 2*rayon*Math.PI;
		double aire = rayon*rayon*Math.PI;
		
		System.out.println("le perimetre est :"+perimetre+"cm");
		System.out.println("L air est :"+ aire+"cm");

	}

}
