package AutowiringByConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppByConstructor {

public static void main(String[] args) {
	ApplicationContext context =new ClassPathXmlApplicationContext("carConfigurationByConstructor.xml");
	System.out.println("Autowiring by Constructor");
	CarByConstructor c=(CarByConstructor)context.getBean("mycar");
	System.out.println(c);
}
}
