# 📚 Biblioteca Inclusiva — API

API RESTful desenvolvida como trabalho individual para o curso **Serratec**, com o objetivo de gerenciar uma biblioteca inclusiva.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 4.0.6**
- **Spring Data JPA**
- **Spring Validation**
- **PostgreSQL**
- **Springdoc OpenAPI (Swagger) 3.0.2**
- **Maven**

---

## 📋 Pré-requisitos

Antes de rodar o projeto, certifique-se de ter instalado:

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/)
- [PostgreSQL](https://www.postgresql.org/)

---

## ⚙️ Configuração do Banco de Dados

Crie um banco de dados no PostgreSQL e configure as credenciais no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/biblioteca
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Como Rodar o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/marceloprmayrinck/trabalhoIndividualAPI.git
```

2. Acesse a pasta do projeto:
```bash
cd trabalhoIndividualAPI/biblioteca
```

3. Instale as dependências e compile:
```bash
mvn clean install
```

4. Rode a aplicação:
```bash
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 📖 Documentação da API (Swagger)

Após subir a aplicação, acesse a documentação interativa:

- **Swagger UI:** [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
- **OpenAPI JSON:** [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

---

## 👤 Autor

**Marcelo Pozzato Rabello Mayrinck**
- Email: marceloprmayrinck@gmail.com
- GitHub: [@marceloprmayrinck](https://github.com/marceloprmayrinck)

---

## 📄 Licença

Este projeto está sob a licença [Apache 2.0](https://www.apache.org/licenses/LICENSE-2.0).
