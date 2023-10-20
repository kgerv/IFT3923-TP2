Plan GQM:

G : Analyser la dernière version stable du code de la branche master du JFreeChart pour évaluer sa facilité d'analyse du point de vue du chef du projet.

Q1: Est-ce qu'il y a assez de tests?

1. M1 : Ratio taille code / taille test  
- Cette métrique mesure la proportion de code par rapport à la base de tests. Un ratio déséquilibré peut indiquer un manque de couverture des tests.
* On mesure cette métrique en calculant le nombre de lignes de code(LOC) par rapport au nombre de lignes de code de tests(TLOC).
2. M2 : TPC(tests par classes)  
- Cette métrique mesure le nombre de tests par classe, qui indique la couverture des tests à l'échelle de la classe.
* On mesure cette métrique en comptant le nombre de tests unitaires par classe.
3. M3 : PMNT(pourcentage des méthodes non testées)  
- Cette métrique mesure la pourcentage de méthodes non testées. Un pourcentage élevé indique un manque de tests.
* On mesure cette métrique en calculant NOM(nombre de méthodes du code) - NOMT(NOM du fichier test) / 100

Q2 : Est-ce que les tests sont a jour avec le reste du code?

4. M4 : NCH(nombre de commit dans l'historique d'une classe) ?
5. M5 : AGE (age d'un fichier) ?

Q3 : Est-ce que les tests sont trops complexes?

6. M6 : CC(complexité cyclomatique de McCabe)
- Cette metrique mesure le nombre de chemins linéairement indépendants, une valeur elevé est  proportionnel au niveau de complexité
* On mesure cette métrique en calculant le nombre de If,While, etc... de la méthode
7. M7 : WMC(weighted methods per class)
- Calcule la somme pondérée des complexités des méthodes d'une classe. Si toutes les méthodes d'une classe sont de complexité 1, elle est égale au nombre de méthodes.
- On mesure la CC des méthodes de la classes et on la compare au NOM de la class

Q4 : Est-ce que les tests sont suffisamment documentés?

8. M8 : DC (densité de commentaires)
- Une bonne documentation des tests facilite leur compréhension. Cette métrique nous permet de mesurer la quantité de commentaires dans les tests.
* On mesure la DC = CLOC / LOC
9. M9 : PMNT(pourcentage de méthodes non testées) ?



