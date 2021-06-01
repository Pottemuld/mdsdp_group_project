package carrental;
import java.util.*;
public class WorkflowManager {
private External code;

Scanner scan = new Scanner(System.in);
String input; 

	ArrayList<Customer> customerList = new ArrayList<>();
	
	private Customer chooseCustomer () {
		int i = 0;
		for (Customer x : customerList) {
			System.out.println((i) + ": " + x.toString());	
			i++;
		}
			System.out.println("Please choose from list above, by index: ");
			input = scan.nextLine();
			return customerList.get(Integer.parseInt(input));
	} 
	ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	private Vehicle chooseVehicle () {
		int i = 0;
		for (Vehicle x : vehicleList) {
			System.out.println((i) + ": " + x.toString());	
			i++;
		}
			System.out.println("Please choose from list above, by index: ");
			input = scan.nextLine();
			return vehicleList.get(Integer.parseInt(input));
	} 
	ArrayList<FirstClassCustomer> firstClassCustomerList = new ArrayList<>();
	
	private FirstClassCustomer chooseFirstClassCustomer () {
		int i = 0;
		for (FirstClassCustomer x : firstClassCustomerList) {
			System.out.println((i) + ": " + x.toString());	
			i++;
		}
			System.out.println("Please choose from list above, by index: ");
			input = scan.nextLine();
			return firstClassCustomerList.get(Integer.parseInt(input));
	} 
	public void book_car () {
		Customer customer = chooseCustomer();
		Vehicle vehicle = chooseVehicle();
		customer.addRents(vehicle);
		System.out.println("Added vehicle to customer");
		vehicle.addRented_to(customer);
		System.out.println("Added customer to vehicle");
	}
	public void register_customer () {
		String regex = "\\d+";
		Customer customer;
		System.out.println("Please enter value for Customer name: ");
		input = scan.nextLine();
		String name = input;	
		System.out.println("Please enter value for Customer age: ");
		input = scan.nextLine();
		while(!input.matches(regex)){
			System.out.println("Entered value was not of type int, please try again: ");
			input = scan.nextLine();
		}
		int age = Integer.parseInt(input);	
		System.out.println("Please enter value for Customer drivers_licence: ");
		input = scan.nextLine();
		while(!input.matches(regex)){
			System.out.println("Entered value was not of type int, please try again: ");
			input = scan.nextLine();
		}
		int drivers_licence = Integer.parseInt(input);	
		System.out.println("Please enter value for Customer address: ");
		input = scan.nextLine();
		String address = input;	
		try {
		customer = new Customer(code, name, age, drivers_licence, address);
		} catch (Exception e) {
			System.out.println(e.toString());
			return;
		}
		customerList.add(customer);
	}
	public void register_car () {
		String regex = "\\d+";
		Vehicle car;
		System.out.println("Please enter value for Vehicle price: ");
		input = scan.nextLine();
		while(!input.matches(regex)){
			System.out.println("Entered value was not of type int, please try again: ");
			input = scan.nextLine();
		}
		int price = Integer.parseInt(input);	
		System.out.println("Please enter value for Vehicle required_age: ");
		input = scan.nextLine();
		while(!input.matches(regex)){
			System.out.println("Entered value was not of type int, please try again: ");
			input = scan.nextLine();
		}
		int required_age = Integer.parseInt(input);	
		System.out.println("Please enter value for Vehicle registrations_nr: ");
		input = scan.nextLine();
		String registrations_nr = input;	
		try {
		car = new Vehicle(code, price, required_age, registrations_nr);
		} catch (Exception e) {
			System.out.println(e.toString());
			return;
		}
		vehicleList.add(car);
	}
}
