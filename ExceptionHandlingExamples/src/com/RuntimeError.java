package com;

public class RuntimeError {

	public static void main(String[]args) {
		System.out.println("Hii");
		int arr[]= {1,2,3,4,5};
		try {
		int res=2/0;//new ArithmeticException()-->Memory creation
		}
		catch(ArithmeticException e) {//catch(Exception exp){}-->Generic Excep
			//System.out.println("I take care!");
			//System.out.println(e.getMessage());
			System.err.println(e.toString());
		}
		try {
			int res=arr[5];//new Array_Index_out_of_bound_Exception()
			System.out.println(res);
		}
		catch(ArrayIndexOutOfBoundsException exp) {//catch(Excption exp){}-->Generic Excep
			//System.out.println(exp.getMessage());
			System.out.println(exp.toString());
		}
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}
}
