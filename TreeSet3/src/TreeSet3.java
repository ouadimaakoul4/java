import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {


		TreeSet<String> tset = new TreeSet<String>();
	    
	    tset.add("ouadi");
	    tset.add("said");
	    tset.add("toto");
	    
	    System.out.println("**************");
	    System.out.println("tree set n 1 :");
	    System.out.println("**************");
	    
	    for(String e:tset) {
	    		System.out.println(e);
	    }

	    TreeSet<String> tset1 = new TreeSet<String>();
	    
	    tset1.add("hakima");
	    tset1.add("brahim");
	    tset1.add("laila");
	    
	    System.out.println("**************");
		System.out.println("tree set n 2 :");
		System.out.println("**************");

	    for(String e:tset1) {
	    		System.out.println(e);
	    }
	    
	    System.out.println("**************");
		System.out.println("treeSet 1 + 2 :");
		System.out.println("**************");
		
	    tset.addAll(tset1);
	    for(String e:tset) {
    		System.out.println(e);
	    }
	    
	}

}
