package main;

import java.util.Scanner;

abstract class Vehicle{ // abstract class
		int wheel; // declare an integer variable wheel
		abstract int size();  // declare a abstract method. this method can't have body.
		public abstract String status(); // abstract class can have the constructor.		
		public  Vehicle(int wheel) {
			this.wheel = wheel;
		}	
		public int getWheel() { // getter method for variable wheel.
			return wheel;
		}		
	}
	class Bus extends Vehicle { // Bus class inherited by abstract vehicle class.
		int length;
		int width;
		public Bus(int wheel, int length, int width)
		{ 					   // calling Vehicle constructor.
			super(wheel);
			this.length = length;
			this.width = width;
		}		
		@Override int size()	 // override the methods.
		{
			return length * width; 
		}

		@Override public String status()
		{
			return "The total number of wheel is: " + super.getWheel() + "\t"
				+ "The Bus square feet is : " + size();
		}	
	}
	class Car extends Vehicle { // Inherits the Car from vehicle.

		int length_sqft;
		int width_sqft;
		public Car(int wheel, int length_sqft,int width_sqft)						
		{
			super(wheel);
			this.length_sqft = length_sqft;
			this.width_sqft = width_sqft;
		}
		@Override int size() {		
			return length_sqft * width_sqft;
		}
		@Override public String status() {
			return "The total number of wheel is: " + super.getWheel() + "\t"
				+ "The Car square feet is : " + size();
		}
	}
	public class DetailsOfSpcifiedVehicle { // main class
		public static void main(String[] args) { // main method
			Scanner scannerObjectBus = new Scanner(System.in);  // Use scanner for get input from user.
			System.out.print("Enter the count of Bus wheels: ");
			int busWheel = scannerObjectBus.nextInt();			// Get next integer variable from user.
			System.out.print("Enter the Bus length if ft:  ");
			int busLength = scannerObjectBus.nextInt();
			System.out.print("Enter the Bus width in ft:  ");
			int busWidth = scannerObjectBus.nextInt();
			Scanner scannerObjectCar = new Scanner(System.in);
			System.out.print("Enter the count of Car wheels: ");
			int carWheel = scannerObjectCar.nextInt();
			System.out.print("Enter the Car length in ft:  ");
			int carLength = scannerObjectCar.nextInt();
			System.out.print("Enter the car width in ft: ");
			int carWidth = scannerObjectCar.nextInt();
			Vehicle objectVehicleBus = new Bus(busWheel, busLength, busWidth); // Create object for bus.
			Vehicle objectVehicleCar = new Car(carWheel, carLength, carWidth); // Create object for car.
			System.out.println(objectVehicleBus.status()); 					   // call the status method.
			System.out.println(objectVehicleCar.status()); 
		} 
	} // End of class  


