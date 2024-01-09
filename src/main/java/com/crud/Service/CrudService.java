package com.crud.Service;

import java.util.List;

import com.crud.Entity.CRUD;

public interface CrudService {
	
	
	public CRUD create(CRUD crud);
	
	public List<CRUD> getall();

	public void deleteData(int id);
	
}
