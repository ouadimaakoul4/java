import java.util.ArrayList;

public class Livre {
		private String titre;
		private String auteur;
		private String ISBN ;
		private static ArrayList<Livre> livres = new ArrayList<Livre>();
		
		public Livre(String titre, String auteur, String ISBN) {
			this.titre = titre;
			this.auteur = auteur;
			this.ISBN = ISBN;
		}
		
		public String getTitre() {
			return titre;
		}
		public String getAuteur() {
			return auteur;
		}
		public String getISBN() {
			return ISBN;
		}
		
		public void setTitre(String titre) {
			this.titre = titre;
		}
		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}
		public void setISBN(String ISBN) {
			this.ISBN = ISBN;
		}
		
		public static void addLivre(Livre livre) {
			livres.add(livre);
		}
		
		public static void removeLivre(Livre livre) {
			livres.remove(livre);
		}
		
		public static ArrayList<Livre> getLivres(){
			return livres;
		}
		
}
