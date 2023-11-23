package in.ineuron.Controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api/greet")
public class RestController {

	@GetMapping("/wish/{userName}")
	public ResponseEntity<String> generateWishMessage(String userName){
		
		LocalDateTime dt = LocalDateTime.now();
		int hour = dt.getHour();
		String msg=null;
		
		if(hour <12)
			msg = "Good morning "+userName;
		if(hour <16)
			msg = "Good Afternoon "+userName;
		if(hour <20)
			msg = "Good Evening "+userName;
		if(hour <12)
			msg = "Good Night "+userName;
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
