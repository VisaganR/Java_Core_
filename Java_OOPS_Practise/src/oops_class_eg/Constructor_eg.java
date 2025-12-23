package oops_class_eg;

public class Constructor_eg {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.display();
		new Employee();//memory created but no reference that memory we can't use further
		new Employee().display();
	}

}
