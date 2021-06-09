package com.sehatmd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sehatmd.model.UserDTO;

@Repository
public interface UserRepository extends CrudRepository<UserDTO, Integer> {
	
	UserDTO findByUsername(String username);
	
}