package com.example.BankingSystem.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankingSystem.entities.Account;

public interface InterRepo extends JpaRepository<Account, Integer> {
	
	List<Account> findByAccountHolderName(String name);
	
	List<Account> deleteByAccountHolderName(String name);
}
