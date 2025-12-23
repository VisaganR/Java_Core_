package set;

import java.util.*;
public class Tree_Set {
	//Sorted....//Homegeneous(Same data type)
	public static void main(String[] args) {

		TreeSet st=new TreeSet ();
		System.out.println("size: "+st.size());
		st.add(10);
		st.add(20);
		st.add(10);
		st.add(30);
//		st.add(10.5);
//		st.add("John");
		System.out.println("size: "+st.size());
		System.out.println("Sorted in Ascending Order...Only for Same Data_type");
		System.out.println(st);

	}

}
