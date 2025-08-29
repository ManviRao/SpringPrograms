package AutowiringAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("45")
private int empid;
	@Value("ajay")
private String name;
//	@Override
//	public String toString() {
//		return "Employee [empid=" + empid + ", name=" + name + "]";
//	}
	
}
