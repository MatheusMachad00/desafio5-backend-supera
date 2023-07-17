package br.com.banco.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.banco.dto.AccountUserDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class AccountUser {

  public AccountUser(AccountUserDTO data) {
    this.username = data.username();
    this.balance = data.balance();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 50, nullable = false)
  private String username;

  @Column(length = 1000, nullable = false)
  private Float balance;

}
