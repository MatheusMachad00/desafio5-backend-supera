package br.com.banco.dto;

public record TransactionDTO(String date, Float value, String operationType, String operatorName, Long accountID) {
  
}
