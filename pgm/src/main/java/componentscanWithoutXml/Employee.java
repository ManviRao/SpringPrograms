package componentscanWithoutXml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("89")
	private int  empid;
	@Value("86")
	private String name;
	@Override
	
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
	

}
