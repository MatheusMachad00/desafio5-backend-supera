package br.com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.banco.dto.AccountUserDTO;
import br.com.banco.model.AccountUser;
import br.com.banco.repository.AccountUserRepository;
import br.com.banco.service.AccountUserService;

@RestController
@RequestMapping("/user")
public class AccountUserController {
  

  @Autowired
  private AccountUserService service;

  @GetMapping
  public List<AccountUser> listAll(){
    return service.findAll();
  }

  @PostMapping
  public void create(@RequestBody AccountUserDTO req){
    service.create(req);
  }
}
