package br.com.banco.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.dto.TransactionDTO;
import br.com.banco.model.Transaction;
import br.com.banco.service.TransactionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/transaction")
public class TransactionController {

  @Autowired
  private TransactionService service;

  @GetMapping("/findAll")
  public List<Transaction> listAll() {
  return service.findAll();
  }
  
  @GetMapping("/{operatorName}")
  public List<Transaction> listByName(@PathVariable String operatorName) {
  return service.findByName(operatorName);
  }

  @GetMapping("/{date}")
  public List<Transaction> listByDate(@PathVariable Date date) {
    return service.findByDate(date);
  }

  @GetMapping("/{accountID}")
  public List<Transaction> listByDate(@PathVariable Long accountID) {
    return service.findByAccountId(accountID);
  }
  
  @PostMapping
  public void create(@RequestBody TransactionDTO req) {
  service.create(req);
  }
}
