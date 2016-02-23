CREATE DATABASE padaria;

USE padaria;

CREATE TABLE contatos(

    id_contato INT PRIMARY KEY AUTO_INCREMENT,
    email VARCHAR(70) NOT NULL UNIQUE,
	nome VARCHAR(30) NOT NULL
	);

CREATE TABLE administrador(

	id_administrador INT PRIMARY KEY AUTO_INCREMENT,    	
	login VARCHAR(30) NOT NULL,
	senha VARCHAR(40) NOT NULL
	);

CREATE TABLE categorias(
	
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
	nome_categoria VARCHAR(50) NOT NULL UNIQUE,
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

INSERT INTO administrador(login,senha) VALUES('admin',sha1('admin'));
