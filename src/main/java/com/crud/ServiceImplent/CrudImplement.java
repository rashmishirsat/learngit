package com.crud.ServiceImplent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Entity.CRUD;
import com.crud.Repository.CrudRepo;
import com.crud.Service.CrudService;

@Service
public class CrudImplement implements CrudService {

	@Autowired
	private CrudRepo repo;
	
	
	
	@Override
	public CRUD create(CRUD crud) {
		// TODO Auto-generated method stub
		return repo.save(crud);
	}

	@Override
	public List<CRUD> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);
		
	}

}
