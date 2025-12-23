package List;
import java.util.*;
public class Array_List_Eg {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		//ArrayList<Object>al=new ArrayList<>();
		System.out.println(al.size());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println(al.get(0));//al.get(index_pos)
		al.add(1,200);// adding_in_between
		System.out.println("After adding 200 at 1 after that...\n");
		System.out.println(al);
		System.out.println(al.size());
		al.set(2,300);//replace
		System.out.println("Replacing the 20(index 2) as 300\n");
		System.out.println(al);
		al.remove(3);//al.remove(index_pos)
		System.out.println("After removing 30(3rd index)\n");
		System.out.println(al);

	}

}
