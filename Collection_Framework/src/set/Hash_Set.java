package set;
import java.util.*;
public class Hash_Set {
		//Unorder....//Hetrogeneous
	public static void main(String[] args) {
		HashSet st=new HashSet();
		System.out.println("size"+st.size());
		st.add(10);
		st.add(20);
		st.add(10);
		st.add(10.5);
		st.add("John");
		System.out.println("size: "+st.size());
		System.out.println("Unorder");
		System.out.println(st);

	}

}
