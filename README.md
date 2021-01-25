# WORKSHOP TESTES DE API COM RESTASSURED

Repositório dedicado a um mini e básico _workshop_ mostrando como testar de forma automatizada nossas APIs.
 
O Framework escolhido para esse repositório é o: **Restassured**.

## Objetivo
Sermos capazes de testarmos o `serverest` de forma automatizada.
Com isso, aprendermos e evoluirmos no conhecimento sobre testes de API.

## Ferramentas utilizadas
> Ecossistema de configuração:
- JDK 8+
- Maven 3+
- Restassured
- Junit
- Json-simple
- IntelliJ

> Execução dos testes:
- Clicando no botão play da class de teste
- Utilizando o maven através do comando: `mvn clean test`

## Observação importante:
- Os testes são feitos após subirmos o servidor do **serverest**: `npx serverest -t 10000`

> Dica:
- o parâmetro `-t`, conforme documentação do serverest, significa `--timeout <duracao-do-token-em-segundos>`.

utilizamos esse número alto para não termos possíveis problemas de tokens sendo expirados.

## Ajuda e/ou maiores informações:
- lucas.g.fraga@noesis.com.br