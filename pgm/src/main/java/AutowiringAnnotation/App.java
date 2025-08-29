package AutowiringAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e=(Employee)context.getBean("employee");
		Manager m=(Manager)context.getBean("manager");
		System.out.println(m);
		System.out.println(e);
	}

}
