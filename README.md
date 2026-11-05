# API Biblioteca

API REST para gerenciamento de livros de uma biblioteca, desenvolvida com Spring Boot.

## Informações acadêmicas

| | |
|---|---|
| **Instituição** | IFPI – Campus Corrente |
| **Módulo** | IV |
| **Disciplina** | Programação para Internet II |
| **Professor** | Misael Costa |

### Alunos

- Mauro Gutemberg Magalhães Barros
- 
-
- 

## Tecnologias

- Java 25
- Spring Boot 4.1.2 (Web MVC e Data JPA)
- Banco de dados H2, salvo em arquivo
- Maven (via Maven Wrapper)

## Arquitetura

A aplicação Spring Boot fica na raiz do repositório e é organizada em camadas. Cada requisição passa pelo controller, depois pelo service e pelo repository até chegar ao banco:

```text
Cliente HTTP → Controller → Service → Repository → Banco H2
```

### Estrutura de pastas

```text
.
├── pom.xml                              # Dependências e configuração do build
├── mvnw / mvnw.cmd                      # Maven Wrapper (Linux/macOS e Windows)
└── src
    ├── main
    │   ├── java/br/edu/ifpi/api_biblioteca
    │   │   ├── ApiBibliotecaApplication.java   # Ponto de entrada da aplicação
    │   │   ├── controller
    │   │   │   └── LivroController.java        # Recebe as requisições HTTP
    │   │   ├── services
    │   │   │   └── Services.java               # Regras de negócio
    │   │   ├── repository
    │   │   │   └── LivroRepository.java        # Acesso ao banco de dados
    │   │   └── models
    │   │       └── Livro.java                  # Entidade persistida
    │   └── resources
    │       └── application.properties          # Configurações da aplicação e do banco
    └── test/java/br/edu/ifpi/api_biblioteca
        └── ApiBibliotecaApplicationTests.java  # Testes da aplicação
```

### Camadas

| Camada | Responsabilidade | Situação |
|---|---|---|
| `controller` | Expor os endpoints e tratar requisições e respostas HTTP | Em desenvolvimento (`LivroController.java` está vazio) |
| `services` | Concentrar as regras de negócio entre o controller e o repository | Em desenvolvimento (`Services.java` está vazio) |
| `repository` | Acessar o banco; `LivroRepository` estende `JpaRepository` e herda as operações de CRUD | Implementada |
| `models` | Representar os dados; `Livro` é mapeada para a tabela `livros` | Implementada |

### Modelo de dados

Entidade `Livro` (tabela `livros`):

| Campo | Tipo | Descrição |
|---|---|---|
| `id` | `Long` | Identificador gerado pelo banco |
| `titulo` | `String` | Título do livro |
| `autor` | `String` | Autor do livro |
| `anoPublicacao` | `Integer` | Ano de publicação |
| `disponivel` | `Boolean` | Indica se o livro está disponível |

## Como executar

É necessário ter o JDK 25 ou superior instalado. Na raiz do projeto, execute:

```bash
./mvnw spring-boot:run

# Windows
mvnw.cmd spring-boot:run
```

### Banco de dados

O H2 salva os dados na pasta `data/`, criada ao iniciar a aplicação, e as tabelas são criadas ou atualizadas automaticamente pelo Hibernate.

Para consultar o banco, acesse o console em `http://localhost:8080/h2-console` com os dados abaixo:

| Campo | Valor |
|---|---|
| **JDBC URL** | `jdbc:h2:file:./data/apiProdutos` |
| **Usuário** | `sa` |
| **Senha** | *(em branco)* |

## Endpoints

TODO

## Postman

TODO
