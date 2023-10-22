**J'ai commencé a type le rapport sur overleaf etant donne qu'on doit remettre un pdf. Le lien de celui-ci:
https://www.overleaf.com/read/jfzscsjtsjxz**

Plan GQM:

G : Analyser la dernière version stable du code de la branche master du JFreeChart pour évaluer sa facilité d'analyse du point de vue du chef du projet.

Q1: Est-ce qu'il y a assez de tests?

 1. M1 : Ratio taille code / taille test  
- Cette métrique mesure la proportion de code par rapport à la base de tests. Un ratio déséquilibré peut indiquer un manque de couverture des tests.
* On mesure cette métrique en calculant le nombre de lignes de code (LOC) par rapport au nombre de lignes de code de tests(TLOC).

3. M2 : TPC (tests par classes)  
- Cette métrique mesure le nombre de tests par classe, qui indique la couverture des tests à l'échelle de la classe.
* On mesure cette métrique en comptant le nombre de tests unitaires par classe.
3. M3 : PMNT (pourcentage des méthodes non testées)  
- Cette métrique mesure la pourcentage de méthodes non testées. Un pourcentage élevé indique un manque de tests.
* On mesure cette métrique en calculant NOM(nombre de méthodes du code) - NOMT(NOM du fichier test) / 100

Q2 : Est-ce que les tests sont a jour avec le reste du code?

4. M4 : NCH(nombre de commit dans l'historique d'une classe) ?
5. M5 : AGE (age d'un fichier)
   - On va utiliser cette métrique pour comparer l'age d'une classe à l'age de son fichier de test s'il existe.
   * On mesure cette métrique en allant chercher la date de la dernière modification d'un fichier. Si la dernière modification du fichier test est plus vieille que la dernière modification du fichier de la classe associée, les tests ne sont pas à jour pour celle-ci.
6. M3 : PMNT (pourcentage des méthodes non testées)
   * Si une classe a un pourcentage trop élevé, les tests ne sont probablement pas à jour.

Q3 : Est-ce que les tests sont trops complexes?

7. M6 : NOM (nombre de méthodes)
- Compte le nombre de méthodes présentent dans une classe
* Elle va nous permettre de calculer WMC, mais nous donne aussi une indication de la compléx
9. M7 : CC (complexité cyclomatique de McCabe)
- Cette metrique mesure le nombre de chemins linéairement indépendants, une valeur elevé est  proportionnel au niveau de complexité
* On mesure cette métrique en calculant le nombre de If,While, etc... de la méthode
8. M8 : WMC(weighted methods per class)
- Calcule la somme pondérée des complexités des méthodes d'une classe. Si toutes les méthodes d'une classe sont de complexité 1, elle est égale au nombre de méthodes.
- On mesure la CC des méthodes de la classes et on la compare au NOM de la class

Q4 : Est-ce que les tests sont suffisamment documentés?

8. M8 : DC (densité de commentaires)
- Une bonne documentation des tests facilite leur compréhension. Cette métrique nous permet de mesurer la quantité de commentaires dans les tests.
* On mesure la DC = CLOC / LOC


