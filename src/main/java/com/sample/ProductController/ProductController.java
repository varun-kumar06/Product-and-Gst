package com.sample.ProductController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.ProductEntity;
import com.sample.ProductService.ProductService;

@RestController
@RequestMapping(value="/Product") 
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@PostMapping(value="/postAllProduct")
	public String postAllProduct(@RequestBody List<ProductEntity> pe) {
		return ps.postAllProduct(pe);
	}
	
	@GetMapping(value="/getAllProduct")
	public List<ProductEntity> getAllProduct(){
		return ps.getAllProduct();
	}

}
