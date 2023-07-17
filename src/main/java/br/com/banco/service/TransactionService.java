package br.com.banco.service;

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

  public List<Transaction> findAll(){
    return repository.findAll();
  }

  public Transaction create(TransactionDTO dto){
    return repository.save(new Transaction(dto));
  }

}