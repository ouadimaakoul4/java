import java.util.*;

public class ITERATOR {

	public static void main(String[] args) {

		TreeSet<String> tset = new TreeSet<String>();
		
		tset.add("salut");
		tset.add("mon");
		tset.add("ami");
		
		System.out.println("tree set :"+tset);
		
		Iterator it = tset.descendingIterator();
		
		System.out.println("tree set inverse :");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}
