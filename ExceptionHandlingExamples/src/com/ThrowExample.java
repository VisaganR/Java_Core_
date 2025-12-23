package com;
import java.util.*;
public class ThrowExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age=s.nextInt();
		try {
		if(age<18) {
			//throw new Exception();
			throw new Exception("Age must above 18");
		}
		else {
			System.out.println("You can vote");
		}
		}
		catch(Exception e) {
			System.err.println(e.toString());
		}
	
        
	}

}
