package br.com.banco.dto;

import java.util.Date;

public record TransactionDTO(Date date, Float value, String operationType, String operatorName, Long accountID) {
  
}
