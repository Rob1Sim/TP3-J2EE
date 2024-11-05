# TP3-J2EE 
## Simonneau Robin, Pottier Loann, Landry Simon

## **Exercice 1**

## **Exercice 2**
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
On obtient les résultats suivants :  
![image1](images/EX2_4.png)   
Avec ∆ < 0  
![image1](images/EX2_5.png)   
Avec ∆ > 0  

![image1](images/EX2_6.png)   
Avec ∆ = 0  

## **Exercice 3**

Code avec explication

![image2](images/EX3-MATRICE-JSP.jpg)

*matrice.jsp*

Un simple fichier jsp qui permet de faire les requetes au servlet

Resultat:

![image2](images/EX3-RESULT-JSP.png)



Ici le code pour le servlet:

![image2](images/EX3-SERVLET-INIT.jpg)

*MatriceServlet.java*


L'initialisation du servlet. La matrice est crée.

![image2](images/EX3-SERVLET-GET.jpg)

*MatriceServlet.java*

La methode 'get' avec les commentaires explicatifs.

![image2](images/EX3-SERVLET-POST.jpg)

*MatriceServlet.java*


La methode 'post' avec les commentaires explicatifs.

Resultats:

![image2](images/EX3-RESULT-UPDATE-CELL.png)

Mise a jour d'une cellule. 

![image2](images/EX3-RESULT-SHOW-ALL.png)

Affichage de la matrice.


