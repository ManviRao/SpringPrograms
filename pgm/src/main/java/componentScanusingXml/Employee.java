package componentScanusingXml;
import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Value;

@Component
public class Employee {
	@Value("#{4*3}")
	private int empid;
	@Value("${java.home}")
	private String firstname;
	@Value("Hello")
	private String lastName;
	
	public String toString() {
		return empid+" "+firstname+" "+lastName;
		
	}
	

}
