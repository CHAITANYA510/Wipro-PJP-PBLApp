/*Create a package called com.automobile.
Define an abstract class called Vehicle. 
Vehicle class has the following abstract methods: 
public String getModelName() 
public String getRegistrationNumber() 
public String getOwnerName() 
*/
/*
Create twowheeler subpackage under automobile package
Hero  class extends  automobile.vehicle class with the following methods
public int getSpeed() 
– returns the current speed of the vehicle.
public void radio() 
– provides facility to control the radio device
*/
/*Honda class extends com.automobile.vehicle class with the following methods
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer() 
– provides facility to control the cd player device which is available in the car.
*/
//Create a test class to test the methods available in all these child class.

package com.automobile;
import com.automobile.fourwheeler.*;
import com.automobile.twowheeler.*;

public class testAutomobile {

	public static void main(String[] args) throws Exception {
		///all method available after making all the classes public i.e abstract classs vehicle
		// both Hero and Honda
		Hero hero1 = new Hero();
		Honda honda1 = new Honda();
		Logan logan1 = new Logan();
		Ford ford1 = new Ford();
		
		System.out.println("Bike details\n");
		System.out.println("Model number is: "+hero1.getModelName());
		System.out.println("Owner name is: "+hero1.getOwnerName());
		System.out.println("Registration number is: "+hero1.getRegistrationNumber());
		System.out.println("Speed is: "+hero1.getSpeed());
		hero1.radio();
		System.out.println("\n");
		System.out.println("Car details\n");
		System.out.println("Model number is: "+honda1.getModelName());
		System.out.println("Owner name is: "+honda1.getOwnerName());
		System.out.println("Registration number is: "+honda1.getRegistrationNumber());
		System.out.println("Speed is: "+honda1.getSpeed());
		honda1.cdplayer();
		System.out.println("\n");
		System.out.println("Model number is: "+logan1.getModelName());
		System.out.println("Owner name is: "+logan1.getOwnerName());
		System.out.println("Registration number is: "+logan1.getRegistrationNumber());
		System.out.println("Speed is: "+logan1.getSpeed());
		logan1.gps();
		System.out.println("\n");
		System.out.println("Model number is: "+ford1.getModelName());
		System.out.println("Owner name is: "+ford1.getOwnerName());
		System.out.println("Registration number is: "+ford1.getRegistrationNumber());
		System.out.println("Speed is: "+ford1.getSpeed());
		ford1.tempControl();
	}

}
