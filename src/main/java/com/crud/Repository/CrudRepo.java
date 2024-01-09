package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.Entity.CRUD;

@Repository
public interface CrudRepo extends JpaRepository<CRUD, Integer> {

}
