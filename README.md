# API Rest de Usuário - Attornatus

## Tecnologias utilizadas:
- Spring-Boot
- Maven
- Java
- H2
- Lombok
- Jpa
- Postman

## Desafio: 
Usando Spring boot, crie uma API simples para gerenciar Pessoas. Esta API deve permitir:
- [x] Criar uma pessoa
- [x] Editar uma pessoa
- [x] Consultar uma pessoa
- [x] Listar pessoas
- [ ] ~Endereço:
      Logradouro
      CEP
      Número
      Cidade~
### Instruções para utilização no Postman
#### Get (listar todos)
> https://localhost:8080/usuario/
#### Put, Delete, Get(por Id)
> https://localhost:8080/usuario/id
#### Put      
      }
      "nome" : "Erika",
      "dataAniversario" : "2019-09-22T00:00:00Z"      
      }
## Requisitos  
- [x] Todas as respostas da API devem ser JSON  
- [x] Banco de dados H2

## acesso h2
- url=jdbc:h2:mem:banco
- login: admin
- senha: 123

## Qualidade de código
*Durante a implementação de uma nova funcionalidade de software solicitada, quais critérios você avalia e implementa para garantia de qualidade de software?*
1. Abstrair dos requisitos as expectativas dos stakeholders, usando tecnicas de Design thinking isso agiliza o processo de desenvolvimento evitando o máximo reconstrução de códigos;
2. Escolha das tecnologias utilizadas, para evitar quebra de sistema incompatibilidades, etc.
3. Testes de código.
4. Atualização de sistema.

*Em qual etapa da implementação você considera a qualidade de software?*
> A qualidade do código deve ser pensada em todo o ciclo de vida do Sotware, ou seja, da Fase de diagnóstico antes mesmo da fase de análise de requisitos até a fase de manutenção do software.

