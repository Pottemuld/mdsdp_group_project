package carrental;
import java.util.*;
public class Customer {
	private External code;
	public Customer(External code, String name, int age, int drivers_licence, String address) throws Exception {
		this.code = code;
		this.name = name;
		this.age = age;
		this.drivers_licence = drivers_licence;
		this.address = address;
		checkRequirements();
	}
	
	//ad relations and atributes
	protected String name;
	
	public String getName(){
		return name;
	}
		
	public void setName(String value){
		this.name = value;
	}
		
	protected int age;
	
	public int getAge(){
		return age;
	}
		
	public void setAge(int value){
		this.age = value;
	}
		
	protected int drivers_licence;
	
	public int getDrivers_licence(){
		return drivers_licence;
	}
		
	public void setDrivers_licence(int value){
		this.drivers_licence = value;
	}
		
	protected String address;
	
	public String getAddress(){
		return address;
	}
		
	public void setAddress(String value){
		this.address = value;
	}
		
	protected ArrayList<Vehicle> rents = new ArrayList<>();
	
	public ArrayList<Vehicle> getRents(){
		return rents;
	}
		
	public void addRents(Vehicle target){
		this.rents.add(target);
	}
		
	private void checkRequirements() throws Exception {
			if(!(this.age>=18)) throw new Exception("Requirement this.age>=18 not satisfied");
			if(!(this.code.legalLicense(this.drivers_licence))) throw new Exception("Requirement this.code.legalLicense(this.drivers_licence) not satisfied");
	}
}
