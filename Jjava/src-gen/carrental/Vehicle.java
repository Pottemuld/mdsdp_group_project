package carrental;
import java.util.*;
public class Vehicle {
	private External code;
	public Vehicle(External code, int price, int required_age, String registrations_nr) throws Exception {
		this.code = code;
		this.price = price;
		this.required_age = required_age;
		this.registrations_nr = registrations_nr;
		checkRequirements();
	}
	
	//ad relations and atributes
	protected int price;
	
	public int getPrice(){
		return price;
	}
		
	public void setPrice(int value){
		this.price = value;
	}
		
	protected int required_age;
	
	public int getRequired_age(){
		return required_age;
	}
		
	public void setRequired_age(int value){
		this.required_age = value;
	}
		
	protected String registrations_nr;
	
	public String getRegistrations_nr(){
		return registrations_nr;
	}
		
	public void setRegistrations_nr(String value){
		this.registrations_nr = value;
	}
		
	protected ArrayList<Customer> rented_to = new ArrayList<>();
	
	public ArrayList<Customer> getRented_to(){
		return rented_to;
	}
		
	public void addRented_to(Customer target){
		this.rented_to.add(target);
	}
		
	private void checkRequirements() throws Exception {
			if(!(this.required_age>=18)) throw new Exception("Requirement this.required_age>=18 not satisfied");
			if(!(this.code.legalRegNumber(this.registrations_nr))) throw new Exception("Requirement this.code.legalRegNumber(this.registrations_nr) not satisfied");
	}
}
