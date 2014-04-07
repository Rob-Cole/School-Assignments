// Part of Question 3.10

import java.util.Scanner;


public class ProductPrinter {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of a product: "); //user enters the name of a product
		String nameA = sc.next();
		System.out.println("Enter the price of the product: ");//user enters the price of the product
		double priceA = sc.nextDouble();
		Product a = new Product(nameA,priceA);//defines the users input into a product type
		
		System.out.println("Enter the name of another product: "); //user does this again to define another product
		String nameB = sc.next();
		System.out.println("Enter the price of the product: ");
		double priceB = sc.nextDouble();
		Product b = new Product(nameB,priceB);
		
		System.out.println("Product a's name: " + a.getName() + " Product b's name: " + b.getName()); // testing the get name functions
		System.out.println("Product b's price: " + a.getPrice() + " Prodct b's price: " + b.getPrice());
		
		a.reducePrice(5.00); //testing the reduce price functions
		b.reducePrice(5.00);
		
		System.out.println ("Product b's reduced price: " + a.getPrice() + " Prodct b's reduced price: " + b.getPrice());
		
	}

}
