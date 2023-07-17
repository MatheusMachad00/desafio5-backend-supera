package br.com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.dto.TransactionDTO;
import br.com.banco.model.Transaction;
import br.com.banco.repository.TransactionRepository;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

  @Autowired
  private TransactionRepository repository;

  @GetMapping
  public List<Transaction> listAll(){
    return repository.findAll();
  }

  /* @PostMapping
  public void create(@RequestBody TransactionDTO req){
    repository.save(new Transaction(req));
  } */
}
