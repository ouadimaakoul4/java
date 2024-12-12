import java.util.*;

public class First_Last {

	public static void main(String[] args) {
		
		TreeSet<String> tset = new TreeSet<String>();
		
		tset.add("alex");
		tset.add("bob");
		tset.add("ahmed");
		tset.add("mohammed");
		tset.add("john");
		tset.add("bob");
		tset.add("Ali");
		
		System.out.println("treeSet :"+ tset);
		
		Object first = tset.first();
		Object last  = tset.last();
		
		System.out.println("le premier :"+ first);
		System.out.println("le dernier :"+ last);
	}

}
