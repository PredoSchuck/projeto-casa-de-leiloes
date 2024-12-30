CREATE DATABASE projetoCasaDeLeiloes;
USE projetoCasaDeLeiloes;

CREATE TABLE produtos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) DEFAULT NULL,
    valor INT DEFAULT NULL,
    status_vendido VARCHAR(50) NOT NULL
);

INSERT INTO produtos (id, nome, valor, status_vendido) VALUES
(1, 'PS4', 1500, 'Vendido'),
(2, 'Xbox 360', 800, 'Vendido'),
(3, 'Iphone 12', 4800, 'Vendido'),
(4, 'PS2', 400, 'A Venda');