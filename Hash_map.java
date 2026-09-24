package CollectionPrgm;

import java.util.HashMap;
import java.util.Map;

public class Hash_map {
	public static void main(String[] args) {
		
		Map hm=new HashMap();
		
		hm.put(3, 1);
		hm.put(1, "sabari");
		hm.put(5, 9.6);
		hm.put(2, "sathya");
		
		System.out.println(hm.get(2));
		
		hm.remove(3);
		
		System.out.println(hm.containsKey(3)); 
		System.out.println(hm.containsValue("sathya"));
		
		hm.put(3, "sathya");
		
		System.out.println(hm);

	}

}
