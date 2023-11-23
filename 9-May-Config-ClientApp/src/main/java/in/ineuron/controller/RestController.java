package in.ineuron.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/test")
public class RestController {
	
	@Value("${mag:Config Server not Working please check and try again.....}")
	public String msg;
	
	
	@GetMapping("/greet")
	public ResponseEntity<String> getMessage(){
		
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
