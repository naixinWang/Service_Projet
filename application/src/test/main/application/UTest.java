package application;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.boutique.application.service.App;

public class UTest {
	
	private App app;
	
	@Test
	public void test1(){
		
	      ApplicationContext context = 
    new ClassPathXmlApplicationContext("app-context.xml");
		 app = (App)context.getBean(App.class);
		 
		 System.out.println(app.getProduits().get(0).getLibelleProduit());
		
	}

}
