package carrental;
import java.util.*;
public class FirstClassCustomer extends Customer {
	private External code;
	public FirstClassCustomer(External code, String name, int age, int drivers_licence, String address) throws Exception {
		super(code, name, age, drivers_licence, address);
		this.code = code;
		checkRequirements();
	}
	
	//ad relations and atributes
	private void checkRequirements() throws Exception {
			if(!(this.age>=25)) throw new Exception("Requirement this.age>=25 not satisfied");
			if(!(this.code.legalLicense(this.drivers_licence))) throw new Exception("Requirement this.code.legalLicense(this.drivers_licence) not satisfied");
	}
}
