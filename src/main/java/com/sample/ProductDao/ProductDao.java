package com.sample.ProductDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.ProductEntity;
import com.sample.ProductRepository.ProductRepository;

@Repository
public class ProductDao {
	
	@Autowired
	ProductRepository pr;
	
	public String postAllProduct(List<ProductEntity> pe) {
		pr.saveAll(pe);
		return "Posted";
	}
	
	public List<ProductEntity> getAllProduct(){
		return pr.findAll();
	}

}
