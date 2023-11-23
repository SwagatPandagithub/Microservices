 package in.ineuron.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.net.server.Client;
import in.ineuron.client.StockClient;

@RestController
@RequestMapping("/calc")
public class StockCalculationRestController {
	
	 

	@Autowired
	private StockClient client;

	@GetMapping("/calculate/{companyName}/{quantity}")
	public ResponseEntity<?> calculate(@PathVariable String companyName, @PathVariable Integer quantity) {

		ResponseEntity<?> responseEntity = null;
		System.out.println(companyName);
		System.out.println(quantity);

		Double totalPrice = null;
		try {
			responseEntity = client.getStockPrice(companyName);
			System.out.println(responseEntity);

			int statuscode = responseEntity.getStatusCode().value();
			if (statuscode == 200) {
				double companyStockPrice = (double) responseEntity.getBody();
				totalPrice = companyStockPrice * quantity;
				String response = "The Total Cost = Rs. " + totalPrice ;
				responseEntity = new ResponseEntity<String>(response, HttpStatus.OK);
			}
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>("company not found", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;
	}

}
