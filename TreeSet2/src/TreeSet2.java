import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tset = new TreeSet<String>();
	    
	    tset.add("ouadi");
	    tset.add("said");
	    tset.add("toto");
	    tset.add("ouadi2");
	    tset.add("said2");
	    tset.add("toto2");
	    
	    for(String e:tset) {
	    		System.out.println(e);
	    }
	}

}
