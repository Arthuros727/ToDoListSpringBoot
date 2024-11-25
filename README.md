# TodoList - Application Spring Boot

## Description
Ce projet est une application de gestion de liste de tâches (Todo List) développée en Java à l'aide de Spring Boot et Hibernate. Elle permet de créer, modifier, et consulter des éléments de la liste de tâches, ainsi que de filtrer les tâches complétées.

## Fonctionnalités
- **Ajouter un élément** : Vous pouvez ajouter une nouvelle tâche à la liste en spécifiant un titre et un état (fait ou non).
- **Modifier un élément** : Vous pouvez modifier les détails d'une tâche existante via son identifiant.
- **Afficher les éléments complétés** : Vous pouvez filtrer pour voir uniquement les tâches marquées comme faites.
- **Afficher tous les éléments** : Vous pouvez obtenir la liste complète des tâches.

## Prérequis
- **Java 17** : Assurez-vous d'avoir installé Java Development Kit (JDK) 17.
- **Maven** : L'outil de build Maven est utilisé pour gérer les dépendances et compiler l'application.
- **MySQL** : Cette application utilise une base de données MySQL. Vous pouvez utiliser MAMP sur Mac pour la gestion de MySQL.

## Installation
1. Clonez le projet :
   ```bash
   git clone 
   ```
2. Accédez au répertoire du projet :
   ```bash
   cd todolist2
   ```
3. Configurez la base de données MySQL.
   - Créez une base de données nommée `TodoList`.
   - Mettez à jour le fichier `application.properties` avec vos identifiants MySQL.
4. Compilez et exécutez le projet avec Maven :
   ```bash
   mvn spring-boot:run
   ```

## Utilisation
### Endpoints disponibles
- **GET /todo** : Récupérer tous les éléments de la liste.
- **GET /todo/done** : Récupérer les éléments complétés (`done = true`).
- **POST /todo** : Créer un nouvel élément de la liste de tâches. Vous devez fournir le corps de la requête avec les détails de la tâche (exemple : titre, done).
- **PUT /todo/{id}** : Modifier un élément existant en utilisant son `id`.

## Exemple de Requête
Pour créer un élément, envoyez une requête POST à `/todo` avec le JSON suivant :
```json
{
  "title": "Apprendre Spring Boot",
  "done": false
}
```


## Auteur
Arthur Guérin - Master à Epitech, ancien de la WebAcademie by Epitech.

