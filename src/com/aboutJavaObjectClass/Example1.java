package com.aboutJavaObjectClass;



public class Example1 {

	public static void main(String[] args) {
		
		
		Customer customer1 = new Customer("Charan Kumar", "Nampally, Hyderbad");
		Customer customer2 = new Customer("Harish Reddy", "Nampally, Hyderbad");
		
		System.out.println(customer1.toString());
		
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println(customer1.getClass().getSimpleName());
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println(customer1.hashCode());
		
		System.out.println("-----------------------------------------------------");
		
		

	}

}
