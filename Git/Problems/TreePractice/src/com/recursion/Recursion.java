package com.recursion;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reduceByOne(3);

	}

	private static void reduceByOne(int i) {
	
		if(i != 0) {
			reduceByOne(i-1);
		}
		System.out.println("Recursion process is Completed..."+i);
		
	}

}
