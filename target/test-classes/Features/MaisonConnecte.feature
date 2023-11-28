#Author: Rahma

Feature: Maison connecte

  Scenario: Trier et selectionner un produit
  Given Utilisateur est sur la page de la maison connecte
  When Utilisateur fait le tri par "Tri du plus récent au plus ancien" et selectionne un produit "Xiaomi Smart Camera C300"
  Then Utilisateur est dirige vers la page du produit "Xiaomi Smart Camera C300"
