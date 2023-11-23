package in.ineuron.restController;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ineuron.model.CustomerEvent;
import reactor.core.publisher.Mono;

@RestController
public class CustomerRestController {
	
	
	@GetMapping(value = "/getEvent")
	public ResponseEntity<Mono<CustomerEvent>> getCustomers(){
		
		
		//Creating POJO object with new data
		CustomerEvent event= new CustomerEvent("Sachin",new Date());
		
		//Mono Object which is used to send the response
		Mono<CustomerEvent> customerMono =  Mono.just(event);
		
		ResponseEntity<Mono<CustomerEvent>> responseEntity = 
				new ResponseEntity<Mono<CustomerEvent>>(customerMono,HttpStatus.OK);
		
		return responseEntity;
		
	}
	
	
	

}
