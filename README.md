# course-springboot-2-java11

# Sobre o projeto

Esta é uma aplicação back-end construída durante o curso do @acenelio na Udemy, o qual gerencia pedidos, pagamentos, produtos e usuários, além de manter um histórico dos pedidos contendo o momento em que cada pedido foi feito, bem como o status e qual usuário o solicitou.
Os pedidos contém produtos e os mesmos estão contidos em cada ordem de compra efetuada no sistema.
O armazenamento desses dados é integrado ao banco de dados PostgreSQL que está armazenado em nuvem, o que viabiliza sua consulta e alterações.


# Tecnologias utilizadas
![image](https://user-images.githubusercontent.com/75039505/165208337-1483a580-ef9a-4851-a973-1591f5df9851.png)

## Back end
- Java
- Spring Boot
- Maven
- Postman

## Implantação em produção
- Back end: Heroku
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/RicardoBrunoB/course-springboot-2-java11

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```
