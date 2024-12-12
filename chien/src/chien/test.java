package chien;

public class test {

	public static void main(String[] args) {
		
		 chien c1 = new chien("boubi","danois");
		 chien c2 = new chien("rocky","Husky");
 
		 System.out.println(c1.getNom()+" est un "+c1.getRace());
		 System.out.println(c2.getNom()+" est un "+c2.getRace());

		 
		 c1.setNom("Beagle");
		 c2.setNom("simba");
		 
		 c1.setRace("berger allmand");
		 c2.setRace("chien police");
		 
		 System.out.println("*********************************");
		 System.out.println("****** apres modification  ******");
		 System.out.println("*********************************");

		 
		 System.out.println(c1.getNom()+" est un "+c1.getRace());
		 System.out.println(c2.getNom()+" est un "+c2.getRace());
	}

}
