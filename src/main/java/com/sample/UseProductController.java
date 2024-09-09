package com.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;   
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class UseProductController {
	
	@Autowired
	RestTemplate rt;
	
	@GetMapping(value="/getAllProductWithGst")
	public List<ProductPojo> getThis() {
		
		String url1 = "http://localhost:8081/Product/getAllProduct";
		String url2 = "http://localhost:8082/Gst/getByhsnCode/";
		
		ResponseEntity<List<ProductPojo>> re1 = rt.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<ProductPojo>>() {});
		List<ProductPojo> pp = re1.getBody();

		pp.forEach(x->{  
			int hsn=x.getHsnCode();            
			
			ResponseEntity<Integer>re2=rt.exchange(url2+hsn, HttpMethod.GET,null, Integer.class);
			Integer percent= re2.getBody();
			 
			int netprice= x.getPrice()+(x.getPrice()*percent/100);
			x.setPrice(netprice); 
		});
		return pp;  
		 
	}

}
