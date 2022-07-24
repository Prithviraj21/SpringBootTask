package com.jspider.productproject.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jspider.productproject.dao.ProductDAO;
import com.jspider.productproject.dao.UserDAO;
import com.jspider.productproject.dto.ProductDTO;
import com.jspider.productproject.dto.User;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface {
	@Autowired
	private ProductDAO dao;
	
	@Autowired
	private UserDAO user;

	@Override
	public ProductDTO addProduct(ProductDTO dto) {
		return dao.save(dto);
		
	}

	@Override
	public ProductDTO findByProductName(String pname) {
		
		ProductDTO opt=dao.findByPname(pname);
		return opt;
	}

	@Override
	public ProductDTO updateProduct(ProductDTO dto) {
		
		return dao.save(dto);
	}

	@Override
	public void deleteProduct(ProductDTO dto) {
		dao.delete(dto);
		
	}

	@Override
	public User addUser(User use) {
		return user.save(use);
	}

	


	

	

	

}
