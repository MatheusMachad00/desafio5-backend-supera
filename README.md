# Processo Seletivo Java

## Como executar a aplicação 

- Você pode executar a aplicação da maneira que quiser e utilizando a IDE de sua preferência. 
- Caso queira executar a aplicação via linha de comando, execute primeiramente o comando:

                   ./mvnw clean package  para linux.

                   .\mvnw clean package  para windows.
- Após isso execute o comando: 

                             java -jar <...caminhoParaSeuJar>

## Como popular a tabela de transações:

- Você deve subir a aplicação e enviar uma requisição do tipo *POST* para o endpoint */transaction* um objeto no seguinte formato:

```
{
  "date": "2023-08-20",
  "value": 1000,
  "operationType": "deposit",
  "operatorName": "Zoro",
  "accountID": 1
}
```

- *Observação 1: No campo operationType você deve colocar as seguintes opções: **deposit**, **incomingTransfer**, **withdraw** ou **outgoingTransfer**.*
- *Observação 2: O campo accountID você deve indicar em qual conta de usuário você deseja fazer a operação.*
- *Observação 3: O campo operatorName pode ser uma string vazia.*

## Como popular a tabela usuários:
- Você deve subir a aplicação e enviar uma requisição do tipo *POST* para o endpoint */user* um objeto no seguinte formato:
```
{
  "username": "Big Mom",
  "balance": 20000
}
```

## Realizando operações nos endpoints da aplicação:
### Transações:
- Para encontrar todas as transações do banco você deve enviar um **GET** para o endpoint ```/transaction/findAll``` que a aplicação irá retornar um array de objetos com todas as transações.
  
- Para encontrar transações pelo nome do operador basta enviar um **GET** para o endpoint ```/transaction/findByName/{nome desejado}``` que a aplicação irá retornar todas as transações que o nome pesquisado aparece.
  
- Para encontrar transações de uma conta específica de usuário você deve enviar um **GET** para o endpoint ```/transaction/{id da conta}``` que a aplicação irá retornar todas as transações relaciondadas a esse ID.
  
- Para encontrar transações através de uma data de início e término você deve enviar um **GET** para o endpoint ```/transaction/findByDate/{data de início}/{data de término}``` que a aplicação irá retornar todas as transações ocorridas entre essas datas.

### Usuários:
- Para encontrar todos os usuários basta enviar um **GET** para  o endpoint ```/user``` que a aplicação irá retornar todos os usuários.
