package br.com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.banco.model.AccountUser;

public interface AccountUserRepository extends JpaRepository<AccountUser, Long>{
  
}
