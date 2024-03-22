package com.productapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}
	
//	
//	@Autowired
//	IProductService iProductService;
//	@Override
//	public void run(String... args) throws Exception {
//		Product product=new Product(2,"poco","mi",19000.0,"mobile");
//		iProductService.addProduct(product);
		
//		List<Product> productList=iProductService.getAll();
//		for(Product productItem : productList) {
//			System.out.println(productItem);
//		}
//	}

}