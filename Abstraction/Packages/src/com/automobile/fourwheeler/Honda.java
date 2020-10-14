/*Honda class extends com.automobile.vehicle class with the following methods
public int getSpeed()
– Returns the current speed of the vehicle.
public void cdplayer() 
– provides facility to control the cd player device which is available in the car.
*/

package com.automobile.fourwheeler;
import java.util.Scanner;

public class Honda extends com.automobile.Vehicle{
	
	private String ModelName = "Honda city";
	private String RegistrationNumber = "HON90345";
	private String OwnerName = "Raj";
	private int speed = 110;
	
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
	
	public void cdplayer() throws Exception{	
		System.out.print("Press 1 to turn ON CD player, Press 2 to turn OFF CD player: ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("CD player is ON");
		}
		else if(choice == 2) {
			System.out.println("CD player is OFF");
		}
		//sc.close();
	}
}
