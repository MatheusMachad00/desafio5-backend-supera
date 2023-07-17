package br.com.banco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.banco.dto.AccountUserDTO;
import br.com.banco.model.AccountUser;
import br.com.banco.repository.AccountUserRepository;

@Service
public class AccountUserService {
  @Autowired
  private AccountUserRepository repository;

  public List<AccountUser> findAll(){
    return repository.findAll();
  }

  public AccountUser create(AccountUserDTO dto){
    return repository.save(new AccountUser(dto));
  }
}
