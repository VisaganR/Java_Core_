package com;

public class ThrowsExceptionExample {
	static void disp1() throws Exception {
		int res=100/0;
		System.out.println("Displ method");
	}
	static void disp2() throws Exception{
		try {
		disp1();
		}catch(Exception e){}
		System.out.println("Disp2 method");
	}
	public static void main(String[] args) throws Exception {
		
		disp2();
		System.out.println("Main method");


	}

}
