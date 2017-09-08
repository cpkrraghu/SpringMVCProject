package imcs.trng.raghu.mvc;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import imcs.trng.raghu.mvc.service.EmployeeService;
import imcs.trng.raghu.mvc.service.EmployeeServiceImpl;

@SpringBootApplication
public class Application  extends SpringBootServletInitializer{
	
	
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
	public static void main(String[] args) throws SQLException{
		ApplicationContext applicationContext =SpringApplication.run(Application.class);
	//	ApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		EmployeeService service=(EmployeeService)applicationContext.getBean(EmployeeServiceImpl.class);
		//System.out.println(service.getEmployees(1));
	}
}
