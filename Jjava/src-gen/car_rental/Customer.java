package car_rental;
import java.util.*;

public class Customer {
	public Customer(String name, int age, int drivers_licence, String address) {
		this.name = name;
		this.age = age;
		this.drivers_licence = drivers_licence;
		this.address = address;
		this.rents = rents;
	}
	
	//ad relations and atributes
	private String name;
	
	public String getName(){
		return name;
	}
		
	public void setName(String value){
		this.name = value;
	}
		
	private int age;
	
	public int getAge(){
		return age;
	}
		
	public void setAge(int value){
		this.age = value;
	}
		
	private int drivers_licence;
	
	public int getDrivers_licence(){
		return drivers_licence;
	}
		
	public void setDrivers_licence(int value){
		this.drivers_licence = value;
	}
		
	private String address;
	
	public String getAddress(){
		return address;
	}
		
	public void setAddress(String value){
		this.address = value;
	}
		
	private ArrayList<Vehicle> r.name = new ArrayList<>();
	
	public getRents(){
		return rents;
	}
		
	public addRents(Vehicle target){
		this.rents.add(target);
	}
		
	
}
