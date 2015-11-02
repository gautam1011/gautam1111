import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Runapp {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		
		Employee e =(Employee)context.getBean("e");
		System.out.println(e.toString());
		
		
	
	}

}
