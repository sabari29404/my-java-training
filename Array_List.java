package CollectionPrgm;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList();
		list.add("sabari");
		list.add("sathya");
		list.add("sasi");
		list.add("irfan");
		
		String getElement=list.get(0);
		//String getElement=(String)list.get(0);
		
		list.set(2, "sruthi");
		
		list.remove(2);
		
		System.out.println(list.size());
		
		System.out.println(list.contains("sabari"));
		
		System.out.println(list);
		System.out.println(getElement);

	}

}
