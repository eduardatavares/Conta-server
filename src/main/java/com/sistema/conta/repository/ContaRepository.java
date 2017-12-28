package com.sistema.conta.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sistema.conta.model.Conta;

public interface ContaRepository extends CrudRepository<Conta, Integer> {
	
		List<Conta> findByStatus(Boolean status);
}
