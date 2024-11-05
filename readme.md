# TP3-J2EE 
## Simonneau Robin, Pottier Loann, Landry Simon

## **Exercice 1**

### ***Code***
![image1](images/img_2.png)  

Dans un premier temps nous avons Login.jsp qui contient un formulaire en méthode “post” qui récupère un login et un mot de passe une fois submit cela va être envoyé et traité par Servlet_Login.java

![image2](images/img_1.png)

Une fois le login et mot de passe récupérer nous allons identifier la correspondance si celle-ci est connu et correct alors on renvoie un message sinon on envoie un autre message  qui sont envoyé a une autre page
jsp avec la méthode doGet

![image3](images/img.png)

Cette dernière page écrit le message envoyé via la méthode doGet en fonction du résultat du traitement 

### *** Resultat *** 

![image4](images/img_3.png)

![image5](images/img_4.png)
![image6](images/img_4.png)

## **Exercice 2**
### ***Code***

Dans cette exercice, on doit faire une page formulaire qui prend 3 entrée pour a, b et c.  
![image1](images/EX2_2.png)  
*Formulaire.jsp*  
Cette page fait appel au Servlet suivant :
![image1](images/EX2_1.png)  
*Equation.java*

Dans ce servlet, on récupère les 3 paramètre passé via un formulaire POST, on calcul le discriminant, et on renvoie vers une autre page les résultats et variables nécéssaire pour afficher le résultat.
![image1](images/EX2_3.png)  
*result.jsp*

Dans cette JSP, on récupère le résultat de la requête, et celon si il est : supérieur, inférieur ou égale à 0, on effectue le calcul de la racine puis un affichage conditionnel à l'aide de if.
### *** Resultat *** 

On obtient les résultats suivants :  
![image1](images/EX2_4.png)   
Avec ∆ < 0  
![image1](images/EX2_5.png)   
Avec ∆ > 0  

![image1](images/EX2_6.png)   
Avec ∆ = 0  

## **Exercice 3**

### ***Code***

![image2](images/EX3-MATRICE-JSP.jpg)

*matrice.jsp*

Un simple fichier jsp qui permet de faire les requetes au servlet

Resultat:

![image2](images/EX3-RESULT-JSP.png)



Ici le code pour le servlet:

![image2](images/EX3-SERVLET-INIT.jpg)

*MatriceServlet.java*

La méthode `init` initialise une matrice 10x10 (`matrice`) remplie de zéros lorsque le servlet démarre, la préparant pour des modifications et des consultations ultérieures.

![image2](images/EX3-SERVLET-GET.png)

*MatriceServlet.java*

La méthode `doGet` gère les requêtes GET en transmettant la matrice entière ou une valeur de cellule spécifique à une page JSP (`affichageMatrice.jsp`). Si les paramètres `x` et `y` sont fournis, elle affiche la valeur à la position demandée avec une gestion des erreurs pour les coordonnées hors limites et les paramètres non valides.


![image2](images/EX3-SERVLET-POST.png)

*MatriceServlet.java*


La méthode `doPost` gère les requêtes POST pour modifier les valeurs de la matrice. Si aucun paramètre n'est fourni, elle réinitialise toute la matrice à zéro. Sinon, elle met à jour la cellule spécifiée si les coordonnées et la valeur sont valides. Un message de confirmation ou d'erreur est transmis à la page JSP pour affichage.

![image2](images/EX3-JSP.png)

*affichageMatrice.jsp*

La page JSP `affichageMatrice.jsp` affiche la matrice entière sous forme de tableau si elle est fournie, ou bien la valeur d'une cellule spécifique et des messages d'information ou d'erreur provenant des opérations effectuées dans `doGet` et `doPost` de `MatriceServlet`.




### *** Resultat ***

![image2](images/EX3-RESULT-UPDATE-CELL.png)

Mise a jour d'une cellule. 

![image2](images/EX3-RESULT-SHOW-ALL.png)

Affichage de la matrice.

![image2](images/EX3-RESULT-ERROR.png)

Affichage d'une erreur.



