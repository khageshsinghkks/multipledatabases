package com.khagesh.multipledatabases.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.khagesh.multipledatabases.documents.EmployeeDocument;

public interface EmployeeRepo extends MongoRepository<EmployeeDocument, Integer> {

	
	
}
