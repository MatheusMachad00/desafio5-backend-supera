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
import br.com.banco.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

  @Autowired
  private TransactionService service;

  @GetMapping
  public List<Transaction> listAll(){
    return service.findAll();
  }

  @PostMapping
  public void create(@RequestBody TransactionDTO req){
    service.create(req);
  }
}
