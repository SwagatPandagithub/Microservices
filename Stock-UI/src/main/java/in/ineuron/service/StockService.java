package in.ineuron.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StockService {
	
	
	public String getTotalStockPrice(String companyName, Integer Quantity) {
		
		String response = null;
		//String REST_ENDPOINT= "http://localhost:5555/api/calc/calc/calculate/{companyName}/{quantity}";
		String REST_ENDPOINT= "http://localhost:1111/calc//calculate/{companyName}/{quantity}";
		
		System.out.println("StockService.getTotalStockPrice()");
		System.out.println(REST_ENDPOINT);
		WebClient weblicnt = WebClient.create();
		
		try {
			response = weblicnt.get()
					.uri(REST_ENDPOINT,companyName,Quantity)
					.retrieve()
					.bodyToMono(String.class)
					.block();
			
		}catch (Exception e) {
			
			response = "Company Name NOT found";
		}
		
		return	response;
	}

}
