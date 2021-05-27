package carrental;
import java.util.*;

public class FirstClassCustomer extends Customer {
	public FirstClassCustomer(String name, int age, int drivers_licence, String address) throws Exception {
		super(name, age, drivers_licence, address);
		checkRequirements();
	}
	
	//ad relations and atributes
	private void checkRequirements() throws Exception {
			if(!(this.age>25)) throw new Exception("Requirement this.age>25 not satisfied");
	}
}
