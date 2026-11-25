# Apoia+ — Plataforma de Assistência Social

**Conectando quem precisa de ajuda a quem pode ajudar.**

## 📌 Sobre o projeto

O **Apoia+** é uma plataforma de assistência social idealizada para conectar pessoas em situação de vulnerabilidade social a instituições, organizações e pessoas dispostas a ajudar por meio de doações.

A proposta surgiu da necessidade de facilitar o acesso a itens essenciais, como alimentos, roupas, produtos de higiene e outros recursos básicos, aproximando quem precisa de assistência de quem deseja contribuir.

Por meio da plataforma, será possível cadastrar pessoas que necessitam de ajuda, instituições sociais, campanhas de arrecadação e itens disponíveis para doação, tornando o processo de identificação, organização e solicitação de assistência mais acessível.

O Apoia+ busca utilizar a tecnologia como ferramenta de transformação social, incentivando a solidariedade e facilitando a conexão entre doadores e beneficiários.

## 🎯 Problema identificado

Muitas famílias em situação de vulnerabilidade social enfrentam dificuldades para conseguir alimentos, roupas, produtos de higiene e outros itens essenciais.

Ao mesmo tempo, pessoas, comércios e instituições frequentemente possuem recursos disponíveis para doação, mas nem sempre encontram uma maneira simples e organizada de chegar a quem realmente precisa.

Essa dificuldade de comunicação pode fazer com que doações disponíveis não alcancem as pessoas que necessitam de assistência.

## 💡 Solução proposta

O Apoia+ propõe uma plataforma digital para centralizar informações sobre necessidades sociais e oportunidades de doação.

A ideia é conectar três principais participantes:

- **Beneficiários:** pessoas que precisam de assistência.
- **Doadores:** pessoas e estabelecimentos que desejam realizar doações.
- **Instituições sociais:** organizações que auxiliam na distribuição e organização das doações.

Dessa forma, a plataforma pretende facilitar o encontro entre necessidades e recursos disponíveis.

## ⚙️ Funcionalidades da plataforma

A proposta contempla as seguintes funcionalidades:

### 👥 Cadastro de pessoas que precisam de ajuda
- Cadastro de beneficiários.
- Registro de informações necessárias para identificação das necessidades.
- Consulta e atualização dos cadastros.

### 🏢 Cadastro de instituições sociais
- Cadastro de instituições e organizações.
- Registro de informações institucionais.
- Consulta e atualização dos dados.

### 🎁 Gerenciamento de doações
- Cadastro de itens disponíveis para doação.
- Identificação do tipo de item, como alimentos, roupas e produtos de higiene.
- Registro da quantidade disponível.
- Consulta, atualização e exclusão de doações.

### ❤️ Campanhas de doação
- Cadastro de campanhas de arrecadação.
- Divulgação de campanhas disponíveis.
- Consulta das informações das campanhas.

### 📋 Solicitações de assistência
- Registro de solicitações de ajuda.
- Consulta das solicitações realizadas.
- Acompanhamento do processo de atendimento.

## 🔄 Exemplo de funcionamento

Imagine que um supermercado possua alimentos disponíveis para doação.

1. O supermercado cadastra os itens disponíveis na plataforma.
2. Uma instituição social consulta as doações cadastradas.
3. A instituição identifica os alimentos que podem atender às necessidades das famílias assistidas.
4. A instituição registra uma solicitação de doação.
5. O processo de atendimento pode ser acompanhado pela plataforma, conforme as funcionalidades forem implementadas.

Assim, o Apoia+ pretende facilitar a comunicação e a organização entre quem deseja doar e quem precisa de ajuda.

## 🛠️ Tecnologias utilizadas

O backend do projeto está sendo desenvolvido com as seguintes tecnologias:

- **Java 21:** linguagem de programação utilizada no desenvolvimento.
- **Spring Boot:** framework para construção da aplicação backend.
- **Apache Maven:** gerenciamento de dependências e construção do projeto.
- **Swagger / OpenAPI:** documentação e testes dos endpoints da API.
- **Git e GitHub:** versionamento e hospedagem do código-fonte.

## 🔌 API REST — Backend

O backend do Apoia+ disponibiliza endpoints REST para gerenciamento de informações.

### Funcionalidades atualmente implementadas

A versão atual do backend possui operações CRUD para gerenciamento de doações e um endpoint para consulta do status da aplicação.

| Método | Endpoint | Descrição |
|---|---|---|
| POST | `/api/doacoes` | Cadastrar uma doação |
| GET | `/api/doacoes` | Listar todas as doações |
| GET | `/api/doacoes/{id}` | Consultar doação por ID |
| PUT | `/api/doacoes/{id}` | Atualizar uma doação |
| DELETE | `/api/doacoes/{id}` | Excluir uma doação |
| GET | `/api/status` | Consultar o status da aplicação |

### Estrutura dos dados de doação

| Campo | Tipo | Descrição |
|---|---|---|
| id | Long | Identificador da doação |
| item | String | Nome do item doado |
| descricao | String | Descrição do item |
| doador | String | Nome do doador |
| quantidade | Integer | Quantidade de itens disponíveis |

## 📝 Exemplo de requisição

Cadastro de uma doação utilizando o método POST:

**Endpoint:** `/api/doacoes`

```json
{
  "item": "Arroz",
  "descricao": "Pacote de arroz de 5kg",
  "doador": "Supermercado Exemplo",
  "quantidade": 20
}
```

## 📖 Documentação da API

A documentação dos endpoints é disponibilizada por meio do Swagger UI, permitindo visualizar e testar as operações implementadas.

Após executar a aplicação localmente, acesse:

http://localhost:8080/swagger-ui/index.html

## 🚀 Como executar o projeto

### Pré-requisitos

- Java JDK 21 ou superior.
- Git instalado.

### 1. Clone o repositório

```bash
git clone https://github.com/samuel-franco/Apoia-Backend.git
```

### 2. Acesse a pasta do projeto

```bash
cd Apoia-Backend
```

### 3. Execute a aplicação

No Windows:

```cmd
mvnw.cmd spring-boot:run
```

### 4. Acesse a documentação

Com a aplicação em execução, abra:

http://localhost:8080/swagger-ui/index.html

## 📁 Estrutura do projeto

```text
Apoia-Backend/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── apoia_plus/
│   │   │       ├── ApoiaPlusApplication.java
│   │   │       ├── Doacao.java
│   │   │       ├── DoacaoController.java
│   │   │       └── StatusController.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│       └── java/
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── .gitignore
```

## 🔭 Próximas etapas de desenvolvimento

A evolução do Apoia+ prevê a ampliação da API para contemplar:

- Cadastro e gerenciamento de beneficiários.
- Cadastro e gerenciamento de instituições sociais.
- Gerenciamento de campanhas de arrecadação.
- Registro e acompanhamento de solicitações de assistência.
- Integração entre doadores, instituições e beneficiários.
- Expansão das funcionalidades de gerenciamento de doações.

Essas funcionalidades representam a evolução planejada da plataforma e não devem ser confundidas com os recursos já implementados na versão atual.

## 🌍 Impacto social

Mais do que uma aplicação tecnológica, o Apoia+ tem como propósito contribuir para uma sociedade mais solidária e colaborativa.

Ao facilitar a conexão entre pessoas que precisam de ajuda e pessoas dispostas a contribuir, a plataforma busca tornar a distribuição de recursos mais organizada e ampliar as possibilidades de apoio a famílias em situação de vulnerabilidade.

**Acreditamos que a tecnologia pode aproximar pessoas, fortalecer iniciativas sociais e transformar solidariedade em ação.**

---

## 👨‍💻 Autor

**Samuel Franco**

GitHub: [@samuel-franco](https://github.com/samuel-franco)

Repositório: [Apoia+ Backend](https://github.com/samuel-franco/Apoia-Backend)

---

*Projeto desenvolvido com Java e Spring Boot, com foco em desenvolvimento backend e tecnologia aplicada ao impacto social.*
