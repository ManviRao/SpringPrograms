package AutowiringByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("carConfiguration.xml");
	System.out.println("Autowire by Name");
	Car c=(Car)context.getBean("mycar");
	System.out.println(c);
	
}
}
