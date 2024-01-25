
@regressivo
Feature: Adicionar itens ao carrinho e validar

 Como um cliente cadastrado no www.automationexercise.com
 Quero fazer a compra de ao menos três produtos  
 Para que eu possa estar bem vestida  
 
 
 @positivo
 Scenario: Adicionar item ao carrinho
 
  And acesse a area de produtos
  When adicionar a quantidade e os itens desejados ao carrinho
  Then valide os itens dentro do carrinho
  
 @positivo
 Scenario: Realizar um cadastro de usuário
  
  And acesse o campo de cadastro
  When forneça os dados obrigatorios validos para um cadastro
  Then valide a mensagem de cadastro
  