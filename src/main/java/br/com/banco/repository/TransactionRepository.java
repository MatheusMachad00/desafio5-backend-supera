package br.com.banco.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
  
  List<Transaction> findByOperatorName(String operatorName);
  List<Transaction> findByDate(Date date);
  List<Transaction> findByAccountID(Long accountID);

}
