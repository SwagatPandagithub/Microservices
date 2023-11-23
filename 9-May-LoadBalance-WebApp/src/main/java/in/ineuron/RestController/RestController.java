package in.ineuron.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/api/greet")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/")
	public ResponseEntity<String> getMessage(){
		
		String portInfo =  "The port number is " + environment.getProperty("local.server.port");
		String msg = "Welcome to the World - You know that much, "
				+ "you have ever heard or imagined there is more than that"+portInfo;
		
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
