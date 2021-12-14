package com.khagesh.multipledatabases.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khagesh.multipledatabases.entity.EmployeeEntitty;

public interface EmployeeRepoJPA extends JpaRepository<EmployeeEntitty, Integer>{

}
