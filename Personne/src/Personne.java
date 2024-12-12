
public class Personne {
	private String nom;
	private int age;
	
	public Personne(String nom,int age ) {
		this.nom = nom;
		this.age =age;
	}
	public String getName() {
		return nom;
	}
	public int getAge() {
		return age;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setage(int age) {
		this.age = age;
	}
}


