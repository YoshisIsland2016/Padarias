CREATE DATABASE padaria;

USE padaria;

CREATE TABLE contatos(

    id_contato INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(70) NOT NULL,
	nome VARCHAR(30) NOT NULL,
	mensagem VARCHAR(20000) NOT NULL
	);

CREATE TABLE administrador(

	id_administrador INT PRIMARY KEY AUTO_INCREMENT,    	
	login VARCHAR(30) NOT NULL,
	senha VARCHAR(40) NOT NULL
	);

CREATE TABLE categorias(
	
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
	nome_categoria VARCHAR(50) NOT NULL,
	descricao VARCHAR(50) NOT NULL
	);

CREATE TABLE produtos( 
	
    id_produto INT PRIMARY KEY AUTO_INCREMENT, 
	nome_produto VARCHAR(100) NOT NULL,
	categoriafk INT NOT NULL,
	preco REAL NOT NULL,
	promocao BOOLEAN NOT NULL,
	imagem VARCHAR(255) NOT NULL,
	descricao VARCHAR(2000) NOT NULL,
	FOREIGN KEY(categoriafk) REFERENCES categorias(id_categoria)
	);

CREATE TABLE avaliacao(
	id_avaliacao INT PRIMARY KEY AUTO_INCREMENT,
	produtoid INT NOT NULL,
	nome VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL,
	nota INT NOT NULL,
	permissao BOOLEAN NOT NULL,
	mensagem VARCHAR(2000) NOT NULL,
	FOREIGN KEY(produtoid) REFERENCES produtos(id_produto)
	);

INSERT INTO administrador(login,senha) VALUES('admin',sha1('xxx'));