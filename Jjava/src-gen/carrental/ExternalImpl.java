package carrental;

import java.util.regex.*;

public class ExternalImpl implements External {

	@Override
	public boolean legalLicense(int p0) {
		
		return (p0 > 0 && p0 < Integer.MAX_VALUE); //Dummy implementation
	}

	@Override
	public boolean legalRegNumber(String p1) {
		
		return (Pattern.matches("^[A-Z]{2}\\d{5}", p1));
	}

}
