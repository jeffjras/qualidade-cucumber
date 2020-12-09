#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@DepartamentoTeste
Feature: Testar a pesquisa de departamento por um nome informado
  O sistema deve retornar os dados da pesquisa 

  @tag1
  Scenario: Testar pesquisa de departamento pelo nome
    Given que eu estou no sistema e com acesso ao menu de opções
    When informar o nome do departamento <nome>    
    Then os dados de departamento é <nome>

  @tag2
  Scenario Outline: Nome da nossa saída de teste
    Given que eu insiro um passo com <nome>
    When Quando eu checo o <value> no passo
    Then eu verifico o <status> no passo

    Examples: 
      | nome  | id | status  |
      | Informática |     1 | success |
      | Teste |     2 | Fail    |
