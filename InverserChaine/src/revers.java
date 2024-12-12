import java.util.Scanner;

public class revers {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("une chaine de lettres");
		String  str = sc.next();
		String revers = "";
		
		for(int i = str.length()-1; i>=0 ; i--) {
			revers =revers + str.charAt(i);
		}
		System.out.println("chaine originale :"+str);
		System.out.println("chaine reversee :"+revers);

		sc.close();
	}

}
