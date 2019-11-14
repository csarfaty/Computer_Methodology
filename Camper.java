import java.util.ArrayList;

public class Camper {
	private static ArrayList<Camper> camperList= new ArrayList<Camper>();
	private String firstName;
	private String lastName;
	private String streetAddress;
	private int age;
	private int half;
	private double billTotal;
	private double amountPaid;
	private int counter=0;
	private int id;


	// instead of set halves which I saw you wrote each half is $550, I just put in
	// billTotal but if you dont like we can gladly switch
	public Camper(String firstName, String lastName, String address, int age, int half, int amountPaid) {
		this.id=counter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = address;
		this.age = age;
		this.half = half;
		setBillTotal(half);
		this.amountPaid = amountPaid;
	

	}
	
	public Camper(String firstName, String lastName, int age) {
		this.id=counter++;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		
	}
	
	public void addCamper() {
		camperList.add(this);
		
	}
	public void removeCamper() {
		int id= this.getID();
		for (int j=0; j<camperList.size(); j++) {
			if (camperList.get(j).getID()==id) {
				camperList.remove(j);
				}
		}
	}
	public int getTotalCampers() {
		return camperList.size();
	}
	public void deposit(int a) {
		this.amountPaid+=a;
	}
	public int getID() {
		return this.id;
	}
	public void setAddress(String address) {
		this.streetAddress = address;
	}

	public void setBillTotal(int half) {
		int x = 0;
		
		switch (half) {
		case 1:
			x = 500;
			break;
		case 2:
			x = 450;
			break;
		case 3:
			x = 900;
			break;
		}
		this.billTotal=x;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getTotalPaid() {
		return amountPaid;
	}

	public double getTotalOwed() {
		return billTotal-amountPaid;

	}

	public String getHalf() {
		String x = null;
		
		switch (half) {
		case 1:
			x = "First Half";
			break;
		case 2:
			x = "Second Half";
			break;
		case 3:
			x = "Full Summer";
			break;
		}
		return x;
	}
	public String getAddress() {
		return this.streetAddress;
	}
	public void deposit(double amount) {
		this.amountPaid += amount;
		
	}
}
