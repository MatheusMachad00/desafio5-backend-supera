package br.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
  
}
