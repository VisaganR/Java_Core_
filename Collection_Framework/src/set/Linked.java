package set;
import java.util.*;

public class Linked{
	//Order...//Hetrogeneous(diff type)
	public static void main(String[] args) {
		LinkedHashSet st=new LinkedHashSet();
		System.out.println("size: "+st.size());
		st.add(10);
		st.add(20);
		st.add(10);
		st.add(10.5);
		st.add("John");
		System.out.println("size: "+st.size());
		System.out.println("Order");
		System.out.println(st);

	}

}
