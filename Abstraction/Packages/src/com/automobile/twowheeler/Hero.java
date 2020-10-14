/*
Create twowheeler subpackage under automobile package
Hero  class extends  automobile.vehicle class with the following methods
public int getSpeed() 
– returns the current speed of the vehicle.
public void radio() 
– provides facility to control the radio device
*/

package com.automobile.twowheeler;
import java.util.Scanner;

public class Hero extends com.automobile.Vehicle {
	
	private String ModelName = "Hero 200";
	private String RegistrationNumber = "HERO23xyz";
	private String OwnerName = "Aman";
	private int speed = 80;
	
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
	
	public void radio() throws Exception {	
		System.out.print("Press 1 to turn ON radio, Press 2 to turn OFF radio: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Radio is ON");
		}
		else if(choice == 2) {
			System.out.println("Radio is OFF");
		}
		//sc.close();
	}
			
}
