package car_rental
import java.util.*;
public class WorkflowManager {

Scanner scan = new Scanner(System.in); 

	ArrayList<Customer> customerList = new ArrayList<>();
	
	public Customer chooseCustomer () {
		for (Customer x : customerList) {
			System.out.println(indexOf(x) + ": " + x.toString());	
		}
			System.out.println("Please choose from list above, by index: ");
			String input = scan.nextLine();
			return customerList.get(input);
	} 
	ArrayList<Vehicle> vehicleList = new ArrayList<>();
	
	public Vehicle chooseVehicle () {
		for (Vehicle x : vehicleList) {
			System.out.println(indexOf(x) + ": " + x.toString());	
		}
			System.out.println("Please choose from list above, by index: ");
			String input = scan.nextLine();
			return vehicleList.get(input);
	} 
	public void book_car () {
		Customer customer = chooseCustomer();
		Vehicle vehicle = chooseVehicle();
		customer.setRents(vehicle)
		vehicle.setRented_to(customer)
	}
	
	
	
	
