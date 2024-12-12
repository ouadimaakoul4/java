import java.util.ArrayList;
import java.util.List;

public class insertion {

	public static void main(String[] args) {

		List<String> languages = new ArrayList<String>();
	    
	    
	    languages.add("PHP");
	    languages.add("Java");
	    languages.add("C++");
	    languages.add("c");
	    
	    System.out.println("avant insertion");
	    System.out.println(languages);
	    System.out.println(" ");
	    
	    languages.add(2,"python");
	    System.out.println("apres insertion de PYTHN dans la position 2 ");
	    System.out.println(languages);
	    System.out.println(" ");
	    
	    languages.set(1,"Javascript");
	    System.out.println("apres mise a jour de java par javascript ");
	    System.out.println(languages);
	    System.out.println(" ");
	    
	    String lang1 = languages.get(1);
	    System.out.println("recuperation du deuxieme element de la liste : "+lang1);

	}

}
