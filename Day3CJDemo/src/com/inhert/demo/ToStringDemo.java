package com.inhert.demo;

class Toy{
	private int id;
	private String name;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Toy ID : " + id + "\nToy Name : " + name + "\nToy Price : " + price;
	}
	
	
}

public class ToStringDemo {
	public static void main(String[] args) {
		Toy toy = new Toy();
		toy.setId(11);
		toy.setName("Car");
		toy.setPrice(233.00);
		
		Toy toy1 = new Toy();
		toy1.setId(11);
		toy1.setName("Car");
		toy1.setPrice(233.00);
		
		//System.out.println(toy.getId() + "\t" + toy.getName() + "\t" +toy.getPrice());		
		//System.out.println(toy1.getId() + "\t" + toy1.getName() + "\t" +toy1.getPrice());		
		
		System.out.println(toy);  // 
		
		//String toyStr = toy.toString();
		
		System.out.println(toy1);
			
		
		
		

	}

}
