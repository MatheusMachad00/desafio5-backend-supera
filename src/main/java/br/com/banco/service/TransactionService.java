package br.com.banco.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.dto.TransactionDTO;
import br.com.banco.model.Transaction;
import br.com.banco.repository.TransactionRepository;

@Service
public class TransactionService {

  @Autowired
  private TransactionRepository repository;

  public List<Transaction> findAll() {
    return repository.findAll();
  }

  public List<Transaction> findByName(String operatorName) {
    return repository.findByOperatorName(operatorName);
  }

  public List<Transaction> findByAccountId(Long accountID) {
    return repository.findByAccountID(accountID);
  }

  public void create(TransactionDTO dto) {
    repository.save(new Transaction(dto));
  }

  public List<Transaction> findTransactionsByDateRange(Date startDate, Date endDate) {
    return repository.findByDateBetween(startDate, endDate);
  }

  /* public List<Transaction> findTransactionsByDateRangeAndOperatorName(Date startDate, Date endDate,
      String operatorName) {
    return repository.findByDateBetweenAndOperatorName(startDate, endDate, operatorName);
  } */

}
