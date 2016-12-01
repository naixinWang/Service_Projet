package infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class OK2 {

	@Autowired
	private Ok test;

	public OK2(){
		
//	      ApplicationContext context = 
//        new ClassPathXmlApplicationContext("springtest.xml");
//	      
//		test = (Ok) context.getBean("Ok");
		this.test.testMethod();
	}
	
	public void ok(){
		this.test.testMethod();
	}
}
