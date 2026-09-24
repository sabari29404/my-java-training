package CollectionPrgm;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
	public static void main(String[] args) {
		
		Set hs=new HashSet();
		
		hs.add("apple");
		hs.add("banana");
		hs.add("cauliflower");
		hs.add("dragonfruit");
		hs.add(null);
		
		hs.clear();
		
		System.out.println(hs);

	}

}
