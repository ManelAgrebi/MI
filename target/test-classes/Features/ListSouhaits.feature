#Author:Rahma
Feature: Liste des souhaits

  Scenario: Ajouter un produit dans la liste des souhaits
  Given Utilisateur est sur la page du produit
  When Utilisateur clique sur  ""
  Then Utilisateur est sur la page de la liste de souhaits
    