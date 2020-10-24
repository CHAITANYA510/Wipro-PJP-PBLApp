package bean;

public class BidderBean {
	
	private int ID;
	private String itemname;
	private String name;
	private String email;
	private double amount;
	boolean autobidders;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isAutobidders() {
		return autobidders;
	}
	public void setAutobidders(boolean autobidders) {
		this.autobidders = autobidders;
	}
	
	
}
