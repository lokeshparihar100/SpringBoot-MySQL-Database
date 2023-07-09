package com.mysql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mysql.model.Products;

import jakarta.transaction.Transactional;

public interface ProductsRepository extends JpaRepository<Products, Integer>{

	@Transactional
	@Modifying
	@Query("update Products p set p.unitPrice = ?1 where p.name = ?2") 
	void updatePrice(double price, String name);

}
