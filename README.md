# Introduction
Ce dépôt a été créé dans le but de fournir des exemples concrets et facilement compréhensibles de divers design patterns. Chaque design pattern est implémenté dans un répertoire séparé avec des exemples de code et des instructions sur la façon de les utiliser. 😄 

# Utilisation
Chaque design pattern se trouve dans un répertoire séparé avec son propre fichier main ▶️ pour lancer l'exemple de code. 

## Observer
Le pattern Observer permet de définir une relation de dépendance entre objets de sorte que lorsqu'un objet change d'état, tous ses dépendants en sont informés et mis à jour automatiquement.

Répertoire : observer
Description : Implémentation d'un modèle de publication/abonnement où les observateurs peuvent s'abonner et se désabonner dynamiquement.

## Decorator
Le pattern Decorator permet d'attacher dynamiquement des responsabilités supplémentaires à un objet. Les décorateurs fournissent une alternative flexible à la sous-classe pour l'extension des fonctionnalités.

Répertoire : decorator
Description : Exemple montrant comment ajouter des fonctionnalités à un objet de manière flexible sans modifier la structure de base de l'objet.

## Factory
Le pattern Factory fournit une interface pour créer des objets dans une superclasse, mais permet aux sous-classes de modifier le type d'objets qui seront créés.

Répertoire : factory
Description : Implémentation d'une méthode de création d'objets qui permet de différer l'instanciation aux sous-classes.

## Strategy
Le pattern Strategy permet de définir une famille d'algorithmes, de les encapsuler chacun et de les rendre interchangeables. Le pattern Strategy permet de rendre l'algorithme indépendant du client qui l'utilise.

Répertoire : strategy
Description : Exemple démontrant comment des algorithmes interchangeables peuvent être sélectionnés et utilisés dynamiquement.
