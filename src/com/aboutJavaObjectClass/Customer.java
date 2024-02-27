package com.aboutJavaObjectClass;

//step-1: class should implements Cloneable interface
public class Customer implements Cloneable
{
	
	private String customerName;
	private String customerAddress;
	
	public Customer() 
	{
		
	}

	public Customer(String customerName, String customerAddress) 
	{
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	@Override
	public String toString() 
	{
		return "Customer [customerName=" + customerName + ", customerAddress=" + customerAddress + "]";
	}
	
	//step3: declare the CloneNotSupportedException class with 
	//       where we are calling clone method
	public static void main(String[] args) throws CloneNotSupportedException
	{		
		
		Customer customer1 = new Customer("Charan Kumar", "Nampally, Hyderbad");
		System.out.println(customer1.toString());	
		
		System.out.println("---------------------------------------------------------------------");
		
		//step2: call clone() method using existing object reference
		//step4: type cast to Your required class name
		Customer customer2 = (Customer)customer1.clone();
		System.out.println(customer2.toString());
				
	}
	
}
