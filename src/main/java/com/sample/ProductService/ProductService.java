package com.sample.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.ProductEntity;
import com.sample.ProductDao.ProductDao;

@Service
public class ProductService {
	
	@Autowired
	ProductDao pd;
	public String postAllProduct(List<ProductEntity> pe) {
		return pd.postAllProduct(pe);
			
	}
	
	public List<ProductEntity> getAllProduct(){
		return pd.getAllProduct();
	}

}
