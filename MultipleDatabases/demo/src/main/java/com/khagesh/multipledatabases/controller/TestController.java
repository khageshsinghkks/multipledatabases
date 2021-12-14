package com.khagesh.multipledatabases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khagesh.multipledatabases.documents.EmployeeDocument;
import com.khagesh.multipledatabases.entity.EmployeeEntitty;
import com.khagesh.multipledatabases.repositories.EmployeeRepo;
import com.khagesh.multipledatabases.repositories.EmployeeRepoJPA;

@RestController
@RequestMapping(value="/user/")
public class TestController {
	
	@Autowired
	private EmployeeRepo repo;
	
	@Autowired
	private EmployeeRepoJPA repoJPA;

	@PostMapping("test")
	public ResponseEntity<?> saveNewDataToMongoDB(@RequestBody EmployeeDocument emp){
		EmployeeDocument doc = repo.save(emp);
		System.out.println(doc.toString());
		return ResponseEntity.ok(doc);
	}
	
	@PostMapping("testJPA")
	public ResponseEntity<?> saveNewDataToMySQL(@RequestBody EmployeeEntitty emp){
		EmployeeEntitty ent = repoJPA.save(emp);
		return ResponseEntity.ok(ent);
	}
	
	
}
