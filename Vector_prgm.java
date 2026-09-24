package CollectionPrgm;

import java.util.List;
import java.util.Vector;

public class Vector_prgm {
	public static void main(String[] args) {
		
		List<String> vector=new Vector<>();
		vector.add("sabari");
		vector.add("sathya");
		vector.add("sasi");
		vector.add("irfan");
		
		vector.set(3,"hari");
		vector.add(3,"rudresh");
		vector.remove(4);
		
		System.out.println(vector.size());
		
		System.out.println(vector.contains("rudrsh"));
		
		String element=vector.getLast();
		System.out.println(element);
		
		System.out.println(vector);

	}

}
