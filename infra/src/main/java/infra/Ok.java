package infra;

import org.springframework.stereotype.Component;

@Component
public class Ok implements Itest{
	
	public String testMethod(){
		return "0k";
	}

}
