package com.mysql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.dao.ProductsRepository;
import com.mysql.model.Products;



@RestController
public class WebController {

		@Autowired
		private ProductsRepository eRepository;
		
		@PostMapping("/addProduct")
		public String addProduct(@RequestBody Products product) {
			eRepository.save(product);
			return "New Product Added...";
		}
		
		@GetMapping("/getAllProducts")
		public List<Products> getAll() {
			return eRepository.findAll();
		}
		
		@GetMapping("/getProducts/{id}")
		public Optional<Products> getProductsById(@PathVariable int id) {
			return eRepository.findById(id);
		}
		
		
		@DeleteMapping("/deleteAll")
		public String deleteAll() {
			eRepository.deleteAll();
			return "Data Deleted...";
		}
		
		
		@PostMapping("/updateProduct")
		public String updateByName(@RequestParam double price, @RequestParam String name) {
			eRepository.updatePrice(price, name);
			return "Data Updated...";
		}
		
		
		

	}
