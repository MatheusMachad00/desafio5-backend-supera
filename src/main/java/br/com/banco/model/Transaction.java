package br.com.banco.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.banco.dto.TransactionDTO;

@Data
@Entity
@NoArgsConstructor
public class Transaction {

  public Transaction(TransactionDTO data){
    this.date = data.date();
    this.value = data.value();
    this.operationType = data.operationType();
    this.operatorName = data.operatorName();
    this.accountID = data.accountID();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 10, nullable = false)
  private Date date;

  @Column(length = 100, nullable = false)
  private float value;

  @Column(length = 50, nullable = false)
  private String operationType;

  @Column(length = 50, nullable = false)
  private String operatorName;

  @Column(length = 100, nullable = false)
  private Long accountID;
}
