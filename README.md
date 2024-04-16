# CRUD Simples
Este repositório contém um projeto CRUD simples construído usando Java Spring. O objetivo deste repositório é praticar utilizando todos os métodos CRUD usando Java Spring.



## Instalar

1. Clone o repositório:

```bash
git@github.com:FabioLuizz/crud-java-spring.git
```

2. Instale dependências com Maven

## Uso

1. Inicie o aplicativo com Maven
2. A API estará acessível em http://localhost:8080


## API Endpoints
A API fornece os seguintes endpoints:

```markdown
GET / - Recuperar uma lista de todos os dados.

POST / - Registra um novo dado

PUT / - Altera o dado.

DELETE / - Deleta o dado.
```

## Database
O projeto utiliza PostgresSQL como banco de dados. As migrações de banco de dados necessárias são gerenciadas usando Flyway.

Para [instalar o PostgresQL](https://www.postgresql.org/download/) você pode instalar aqui.