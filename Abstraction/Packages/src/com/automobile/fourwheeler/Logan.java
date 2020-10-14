/*Add the following ideas to the previous hands on: 
Create FourWheeler subpackage under automobile package
Logan class extends com.automobile.Vehicle class
public int speed()
– Returns the current speed of the vehicle.
public int gps() 
– provides facility to control the gps device 

*/

package com.automobile.fourwheeler;
import java.util.Scanner;

public class Logan extends com.automobile.Vehicle {
	
	private String ModelName = "Logan 789";
	private String RegistrationNumber = "LOG123";
	private String OwnerName = "Raman";
	private int speed = 120;
	
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
	
	public void gps() throws Exception{	
		System.out.print("Press 1 to turn on GPS, Press 2 to turn OFF GPS: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1) {
			//gps_ON();	//method can be created to turn ON GPS
			System.out.println("GPS is ON");
		}
		else if(choice == 2) {
			System.out.println("GPS is OFF");
		}
		//sc.close();
	}
}
