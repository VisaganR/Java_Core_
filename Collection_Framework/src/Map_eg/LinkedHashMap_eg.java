package Map_eg;

import java.util.*;

public class LinkedHashMap_eg {

	public static void main(String[]args) {
	//order of insertion
		LinkedHashMap map=new LinkedHashMap();
		map.put(2,"Raj");
		map.put(1, "John");
		map.put(5,"Raju");
		map.put(3, "Visa");
		map.put(4, "ragul");
		map.put(6, "Raju");
		map.put(3, "updated_name");
		System.out.println(map);
		System.out.println(map.containsKey(3));

		
	}
}
