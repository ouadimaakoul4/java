
public class test {

	public static void main(String[] args) {

		Personne p1 = new Personne("ouadi",35);
		Personne p2 = new Personne("maakoul",40);
		
		System.out.println("votre nom est :" +p1.getName()+"  votre age :"+p1.getAge()+"ans");
		System.out.println("votre nom est :" +p2.getName()+"  votre age :"+p2.getAge()+"ans");
		
		p2.setNom("ahmed");
		p2.setage(20);
		System.out.println("votre nom est :" +p2.getName()+"  votre age :"+p2.getAge()+"ans");

	}

}
