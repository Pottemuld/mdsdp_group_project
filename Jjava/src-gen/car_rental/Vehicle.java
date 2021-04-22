package car_rental;
import java.util.*;

public class Vehicle {
	public Vehicle(int price, int required_age, string registrations_nr) {
		this.price = price;
		this.required_age = required_age;
		this.registrations_nr = registrations_nr;
		this.rented_to = rented_to;
	}
	
	//ad relations and atributes
	private int price;
	
	public int getPrice(){
		return price;
	}
		
	public void setPrice(int value){
		this.price = value;
	}
		
	private int required_age;
	
	public int getRequired_age(){
		return required_age;
	}
		
	public void setRequired_age(int value){
		this.required_age = value;
	}
		
	private string registrations_nr;
	
	public string getRegistrations_nr(){
		return registrations_nr;
	}
		
	public void setRegistrations_nr(string value){
		this.registrations_nr = value;
	}
		
	private ArrayList<Customer> r.name = new ArrayList<>();
	
	public getRented_to(){
		return rented_to;
	}
		
	public addRented_to(Customer target){
		this.rented_to.add(target);
	}
		
	
}
