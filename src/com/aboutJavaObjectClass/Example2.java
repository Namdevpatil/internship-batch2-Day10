package com.aboutJavaObjectClass;



public class Example2 {

	public static void main(String[] args) {


		Customer customer1 = new Customer("Charan Kumar", "Nampally, Hyderbad");
		Customer customer2 = new Customer("Harish Reddy", "Nampally, Hyderbad");

		System.out.println(customer1.toString());		

		System.out.println("----------------------------------------------------------------------------");

		System.out.println(customer2.toString());

		System.out.println("----------------------------------------------------------------------------");

		System.out.println(customer1.getCustomerAddress().equals(customer2.getCustomerAddress()));

		System.out.println("----------------------------------------------------------------------------");

		System.out.println(customer1.getCustomerName().equals(customer2.getCustomerName()));

	}

}
