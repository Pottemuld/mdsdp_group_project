package carrental;
import java.util.*;

public class FirstClassCustomer extends Customer {
	private ExternalCode code;
	public FirstClassCustomer(ExternalCode code,String name, int age, int drivers_licence, String address) throws Exception {
		super(code, name, age, drivers_licence, address);
		this.code = code;
		checkRequirements();
	}
	
	//ad relations and atributes
	private void checkRequirements() throws Exception {
			if(!(this.age>25)) throw new Exception("Requirement this.age>25 not satisfied");
	}
}
