package CollectionPrgm;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
	public static void main(String[] args) {
		
		List<String> ll=new LinkedList<>();
		ll.add("sabari");
		ll.add("sathya");
		ll.add("sasi");
		ll.add("irfan");
		
		ll.addFirst("Ganesan");
		
		ll.addLast("sruthi");
		
		ll.remove(ll.getLast());    
		
		System.out.println(ll.getFirst());
		
		System.out.println(ll.size());
		
		
		System.out.println(ll);
		
		

	}

}
