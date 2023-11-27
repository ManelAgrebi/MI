#Author: Rahma

Feature: Maison connecte

  Scenario: Trier et selectionner un produit
  Given Utilisateur est sur la page de la maison connecte
  When Utilisateur fait le tri par "" et selectionne un produit ""
  Then Utilisateur est dirige vers la page du produit ""
