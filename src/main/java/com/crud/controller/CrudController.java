package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Entity.CRUD;
import com.crud.ServiceImplent.CrudImplement;

@RestController
@RequestMapping("/crud")
public class CrudController {
	
	@Autowired
	private CrudImplement implement;
	
	@PostMapping("/create")
	public ResponseEntity<CRUD> createentry(@RequestBody CRUD crud)
	{
		CRUD crud2 = implement.create(crud);
		
		return ResponseEntity.ok(crud2);
		}
	
	
	
	@GetMapping("/get")
	public ResponseEntity<List<CRUD>> getalldada()
	{
		List<CRUD> crud= implement.getall();
		
		return ResponseEntity.ok(crud);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletedata(@PathVariable("id")  int id)
	{
		
		implement.deleteData(id);
	}
	

}
