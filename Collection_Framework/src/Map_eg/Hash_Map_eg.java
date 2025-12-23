package Map_eg;
import java.util.*;
public class Hash_Map_eg {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(2,"Raj");
		map.put(1, "John");
		map.put(5,"Raju");
		map.put(3, "Visa");
		map.put(4, "ragul");
		map.put(6, "Raju");//Same value -->both values are diplay but key diff
		map.put(3, "updated_name");//Same key means updated
		System.out.println(map);
		System.out.println(map.containsKey(3));
		

	}

}
