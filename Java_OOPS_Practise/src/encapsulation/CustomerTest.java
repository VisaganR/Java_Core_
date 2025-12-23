package encapsulation;

public class CustomerTest {

	public static void main(String[] args) {
		//Java Bean==>100% Encapsulation
		Customer c1=new Customer();//Empty Constructor
		c1.setCid(100);
		c1.setCname("Visagan");
		c1.setAge(-21);
		System.out.println("id is "+c1.getCid());
		System.out.println("Name is "+c1.getCname());
		System.out.println("Age is "+c1.getAge());
		System.out.println("-----------------------------------------------\n");
		
		Customer c2=new Customer(1,"Visa",20);//Paramterized Constructor
		System.out.println("id is "+c2.getCid());
		System.out.println("Name is "+c2.getCname());
		System.out.println("Age is "+c2.getAge());

	}

}
