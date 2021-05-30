package org.bike;

public class Ktm implements Bike{
	
	public void cost()
	{
		System.out.println("cost of bike is 80000");
	}

	 public void speed()
	 {
		 System.out.println("Avg speedi in the city is 80 km/hr");
	 }
	 private void m1()
	 {
		 System.out.println("m1 method");
	 }
	 
	 public static void main(String[] args) {
		Ktm k = new Ktm();
		k.speed();
		k.cost();
		k.m1();
	}
}
