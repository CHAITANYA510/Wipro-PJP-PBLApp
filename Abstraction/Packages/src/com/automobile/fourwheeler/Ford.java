/*
Ford class extends  com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int tempControl() 
– provides facility to control the air conditioning device which is available in the car
*/

package com.automobile.fourwheeler;
import java.util.Scanner;

public class Ford extends com.automobile.Vehicle{
	private String ModelName = "Ford Ultimate";
	private String RegistrationNumber = "FORD1345";
	private String OwnerName = "Dhruv";
	private int speed = 150;
	
	public String getModelName() {
		return this.ModelName;
	}
	public String getRegistrationNumber(){
		return this.RegistrationNumber;
	}
	public String getOwnerName() {
		return this.OwnerName;
	}	
	public int getSpeed() {
		return this.speed;
	}
	
	public void tempControl() throws Exception{	
		System.out.print("Press 1 to turn on AIR CONDITIONER: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.print("Press + to increase temperature, Press - to decrease temperature: ");
		String temp_choice = sc.next();
		char temp = temp_choice.charAt(0);
		if(temp == '+') {
			//inc_temp();	//method can be created to control AC
			System.out.println("Temperature increased");
		}
		else if(temp == '-') {
			//dec_temp();	//method can be created to control AC
			System.out.println("Temperature decreased");
		}
		//sc.close();
	}
}
