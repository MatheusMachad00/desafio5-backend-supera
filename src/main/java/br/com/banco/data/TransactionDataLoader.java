/* package br.com.banco.data;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.banco.model.Transaction;
import br.com.banco.repository.TransactionRepository;

@Component
public class TransactionDataLoader implements CommandLineRunner {

  private final TransactionRepository transactionRepository;

  @Autowired
  public TransactionDataLoader(TransactionRepository transactionRepository) {
    this.transactionRepository = transactionRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    Transaction transaction1 = new Transaction();
    transaction1.setDate(new Date());
    transaction1.setValue(500f);
    transaction1.setOperationType("deposit");
    transaction1.setOperatorName("José");
    transaction1.setAccountID(1L);

    Transaction transaction2 = new Transaction();
    transaction2.setDate(new Date());
    transaction2.setValue(200f);
    transaction2.setOperationType("withdraw");
    transaction2.setOperatorName("");
    transaction2.setAccountID(1L);

    Transaction transaction3 = new Transaction();
    transaction3.setDate(new Date());
    transaction3.setValue(50f);
    transaction3.setOperationType("withdraw");
    transaction3.setOperatorName("");
    transaction3.setAccountID(1L);

    Transaction transaction4 = new Transaction();
    transaction4.setDate(new Date());
    transaction4.setValue(1500f);
    transaction4.setOperationType("deposit");
    transaction4.setOperatorName("Maria");
    transaction4.setAccountID(2L);

    Transaction transaction5 = new Transaction();
    transaction5.setDate(new Date());
    transaction5.setValue(2500f);
    transaction5.setOperationType("deposit");
    transaction5.setOperatorName("Ana");
    transaction5.setAccountID(2L);

    Transaction transaction6 = new Transaction();
    transaction6.setDate(new Date());
    transaction6.setValue(3000f);
    transaction6.setOperationType("withdraw");
    transaction6.setOperatorName("");
    transaction6.setAccountID(2L);
  }
}
 */