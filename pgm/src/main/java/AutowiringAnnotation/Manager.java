package AutowiringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Manager {
	@Autowired
	Employee e;
	
//	Manager(Employee e){
//		this.e=e;
//	}
	@Override
	public String toString() {
		return "Manager [e=" + e + "]";
	}
	
		
}
