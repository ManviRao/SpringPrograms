package componentScanusingXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("componentscanwithxml.xml");
		Employee e=context.getBean("employee",Employee.class);
		System.out.println(e.toString());
		
	}

}
