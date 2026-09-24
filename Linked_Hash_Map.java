package CollectionPrgm;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hash_Map {
	public static void main(String[] args) {
		
		Map lhm=new LinkedHashMap();
		
		lhm.put(1, 1);
		lhm.put("sabari", "sabari");
		lhm.put(2, "priya");
		lhm.put("0", 0);
		
		System.out.println(lhm.getOrDefault("sabari", 0));
		
		lhm.remove("0");
		
		System.out.println(lhm.entrySet()); 
				
		System.out.println(lhm);

	}

}
