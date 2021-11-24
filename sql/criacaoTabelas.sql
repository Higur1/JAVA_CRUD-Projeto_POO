 CREATE DATABASE dbClinicaMedica

USE dbClinicaMedica

create table Codigo (
    codGerado int not null primary key
)

CREATE TABLE Atendente (
    codFunc INT NOT NULL,
    nome VARCHAR(100) NOT null,
    username  VARCHAR(30) NOT NULL primary key,
    senha VARCHAR(20) NOT NULL,
    foreign key (codFunc) references Codigo(codGerado)
    )


CREATE TABLE Paciente (
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(11) NOT NULL PRIMARY KEY,
    sexo CHAR(1) NOT NULL,
    nascimento DATE NOT NULL,
    telefone VARCHAR(16) NOT NULL,
    rua VARCHAR(50) NOT NULL,
    num VARCHAR(3) NOT NULL,
    cidade VARCHAR(40) NOT NULL,
    complemento VARCHAR(100)
)

CREATE TABLE Especialidade (
    nome VARCHAR(100) NOT NULL,
    cbo VARCHAR(50) NOt NULL PRIMARY KEY
    )


CREATE TABLE Atendimento (
    data Date NOT NULL,
    cpf VARCHAR(15) NOT NULL,
    codFunc INT NOT NULL,
    FOREIGN KEY (cpf) REFERENCES Paciente (cpf),
    FOREIGN KEY (codFunc) REFERENCES Atendente (codFunc)
    )

CREATE TABLE Medico (
    nome VARCHAR(100) NOT NULL,
    especialidade VARCHAR(50) NOT NULL,
    telefone VARCHAR(16) NOT NULL,
    crm VARCHAR(20) NOT NULL PRIMARY KEY,
    rua VARCHAR(50) NOT NULL,
    num VARCHAR(3) NOT NULL,
    cidade VARCHAR(40) NOT NULL,
    complemento VARCHAR(100),
    nascimento DATE NOT NULL,
    FOREIGN KEY (especialidade) REFERENCES Especialidade (cbo)
    )


CREATE TABLE Consulta (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    descricao VARCHAR(200),
    cpf VARCHAR(11) NOT NULL,
    crm VARCHAR(20) NOT NULL,
    dataConsulta Date NOT NULL,
    FOREIGN KEY (cpf) REFERENCES Paciente (cpf),
    FOREIGN KEY (crm) REFERENCES Medico (crm)
    )

INSERT INTO Codigo VALUES (1)

atendenteINSERT INTO Atendente VALUES (1,'adm','root','1234')