package polymorphism;
class A{
	void disp() {
		System.out.println("A");
		System.out.println("color");
	}
}
 class B extends A{
	void disp() {
		System.out.println("B");
	}
}
public class practise {

	//MethodOverring need to tharough...
	public static void main(String[] args) {
		A a=new A();
		A b=new B();
		a.disp();
		b.disp();
	}

}
