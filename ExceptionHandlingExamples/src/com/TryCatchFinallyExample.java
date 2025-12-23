package com;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		System.out.println("Hii");
		try{
			int res=2/0;
			System.out.println("Result is: "+res);
			System.out.println("No exception");//if no exception then it will print
			
		}
		catch(Exception e	) {
			System.err.println("catch Block");
		}
		finally{
			System.out.println("Finally Block");
		}

	}

}
