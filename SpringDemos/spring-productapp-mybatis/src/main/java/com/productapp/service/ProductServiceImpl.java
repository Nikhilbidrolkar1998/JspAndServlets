package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private IProductRepository iProductRepository;
	@Override
	public void addProduct(Product product) {
		iProductRepository.addProduct(product);
	}

	@Override
	public void updateProduct(int productId , double price) {
		iProductRepository.updateProduct(productId, price);;
		
	}

	@Override
	public void deleteProduct(int productId) {
		iProductRepository.deleteProduct(productId);
		
	}

	@Override
	public Product getById(int productId) throws ProductNotFoundException {
		Product product=iProductRepository.findById(productId);
		if(product==null)
			throw new ProductNotFoundException("Not Found");
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> productsList=iProductRepository.findAll();
		return productsList;
	}

	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
		List<Product> productsList=iProductRepository.findByBrand(brand);
		return productsList;
	}

	@Override
	public List<Product> getByLessPrice(double price) throws ProductNotFoundException {
		List<Product> productsList=iProductRepository.findByLessPrice(price);
		return productsList;
	}

	@Override
	public List<Product> getByCategoryAndPrice(String category, double price) throws ProductNotFoundException {
		List<Product> productsList=iProductRepository.findByCategoryAndPrice(category, price);
		return productsList;
	}

}
