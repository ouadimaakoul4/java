import java.util.*;
public class clone {

	public static void main(String[] args) {

		TreeSet <String> tset = new TreeSet<String>();
		
		tset.add("alex");
		tset.add("bob");
		tset.add("jean");
		tset.add("denis");
		
		System.out.println("tree set :"+tset);
		System.out.println("sa taille est "+tset.size());
		
		TreeSet<String> clonne = (TreeSet<String>)tset.clone();
		
		System.out.println("tree set clonnee :"+clonne);
		System.out.println("sa taille est "+clonne.size());

		for(String e:tset) {
			System.out.println(clonne.contains(e) ? "oui":"non");
		}
	}

}
