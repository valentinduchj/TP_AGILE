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
@tag
Feature: 001 G�rer les charbonniers


	En tant qu administrateur de mines, je souhaite gerer mes employes.
	Chaque employe de la mine peut y travailler seulement s'ils sont affect�s dans la mine.
		
  @tag1
  Scenario: Affectation de mine 
    Given Creation d un charbonnier avec un nom, une Qte de Charbon, son nombre d heures de travail ainsi que son etat d humeur
    And la creation d une mine avec son nom.
    When le charbonnier est content et a encore des heures de travail 
    Then Le charbonnier est affecte a la mine et peut y travailler.

  @tag2
  Scenario Outline: Travail dans la mine
    Given Un charbonnier nomme par son <name> et a un <Etat> travaille dans une mine
		Then son <NombreHeuredispo> diminuera de 14 et son nombre de <Charbon> augmentera de 10
		
    Examples: 
      |name   |Etat           |NombreHeuredispo |Charbon |
      |Mouloud|Affecte a mine1|58               |10      |
      |Chen   |content        |72               |0       |
      
  @tag3
  Scenario Outline: Achat de nourriture
    Given Un charbonnier a travaille dans une mine et son <Etat> est content
		Then le charbonnier <name> poura echanger son <Charbon> contre de la <Nouriture> 
		
 Examples: 
      |name    |Etat           |Charbon          |Nouriture  |
      |Fran�ois|Affecte a mine1|10               |Non        |
      |Eric    |content        |20               |Oui        |		