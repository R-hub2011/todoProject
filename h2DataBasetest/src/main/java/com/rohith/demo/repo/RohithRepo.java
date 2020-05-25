package com.rohith.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rohith.demo.model.RohithTable;

public interface RohithRepo extends JpaRepository<RohithTable, Integer>{

}
