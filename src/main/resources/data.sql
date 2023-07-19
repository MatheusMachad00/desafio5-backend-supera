CREATE TABLE account_user (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    balance DECIMAL(10, 2) NOT NULL
);

/* CREATE TABLE transaction (
    id SERIAL PRIMARY KEY,
    date DATE NOT NULL,
    value FLOAT NOT NULL,
    operationType VARCHAR(100) NOT NULL,
    operatorName VARCHAR(50),
    accountID BIGINT NOT NULL,
    FOREIGN KEY (accountID) REFERENCES account_user(id)
); */


INSERT INTO account_user (username, balance) VALUES
('Ichigo Kurosaki', 1000.00),
('Naruto Uzumaki', 500.50),
('Sakura Haruno', 3000.75);


/* INSERT INTO transaction (date, value, operationType, operatorName, accountID)
VALUES 
    ('2019-01-01', 100.00, 'Deposit', 'Ichigo Kurosaki', 1),
    ('2019-01-02', 50.00, 'Withdrawal', 'Ichigo Kurosaki', 1),
    ('2019-01-03', 200.00, 'Deposit', 'Naruto Uzumaki', 2),
    ('2019-01-04', 75.50, 'Withdrawal', 'Naruto Uzumaki', 2),
    ('2019-01-05', 500.00, 'Deposit', 'Sakura Haruno', 3),
    ('2019-01-06', 250.75, 'Withdrawal', 'Sakura Haruno', 3); */


