package AutowiringByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppByType {

public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("carConfigurationByType.xml");
	System.out.println("Autowiring by type");
	CarByType c=(CarByType)context.getBean("mycar");
	System.out.println(c);
	
}
}
