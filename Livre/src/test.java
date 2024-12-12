import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		
		Livre livre1 = new Livre("l etranger","albert camus","0223014");
		Livre livre2 = new Livre("le pere goriot","Honore de balzac","693002154");
		Livre livre3 = new Livre("le langage java","Alfred hitchi","900000009");
		
		Livre.addLivre(livre1);
		Livre.addLivre(livre2);
		Livre.addLivre(livre3);
		
		ArrayList<Livre> livres = Livre.getLivres();
		System.out.println("liste des livres");
		
		for(Livre l:livres) {
			System.out.println("--Le roman : "+ l.getTitre() + " -- ecrit par :"+l.getAuteur()+" -- le numero est :"+ l.getISBN());
		}
		
		Livre.removeLivre(livre1);
		System.out.println("**************************************************************");
		System.out.println("suppression du livre concernant albert camus du nom l etranger");
		System.out.println("**************************************************************");
		
		for(Livre l:livres) {
			System.out.println("--Le roman : "+ l.getTitre() + " --ecrit par :"+l.getAuteur()+" --le numero est :"+ l.getISBN());
		}
		
	}

}
