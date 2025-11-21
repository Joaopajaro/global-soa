# MentIA – Plataforma de Autodesenvolvimento

## Integrantes
- Joao Arthur  RM:5511272
- Geovanna RM:97736
- Victor RM:98384

## Objetivo
Desenvolver uma aplicação web que utilize inteligência artificial e dados de mercado para sugerir trilhas de desenvolvimento profissional e mentorias personalizadas. A plataforma cruza dados de tendências do mercado, perfis comportamentais/cognitivos e objetivos pessoais para gerar recomendações individualizadas.

## Tecnologias e Arquitetura
- **Linguagem**: Java 17
- **Framework**: Spring Boot 3 (Spring Web, Spring Security, Spring Data JPA)
- **Banco de dados**: MySQL
- **JWT**: jjwt (autenticação stateless)
- **ModelMapper**: conversão entre entidades e DTOs
- **Projeto modularizado** em pacotes (`model`, `repository`, `service`, `controller`, `security`, `config`)

## Funcionamento
- Usuários podem se cadastrar e fazer login; o login retorna um token JWT.
- Perfis de usuário (roles) definem o acesso a recursos da API.
- Endpoints `/api/mentorias` permitem listar, criar e gerenciar mentorias.
- A camada de serviço encapsula as regras de negócio.
- O tratamento global de exceções garante respostas padronizadas.
- As respostas são encapsuladas em objetos `ResponseEntity`.

## Informações adicionais
- Para executar localmente, configure o `application.properties` com os dados do MySQL e rode `mvn spring-boot:run`.
- O token JWT deve ser enviado no cabeçalho `Authorization: Bearer <token>` nas requisições protegidas.
- Mais endpoints e funcionalidades podem ser adicionados conforme a evolução da plataforma.
