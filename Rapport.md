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


TACHE 2 :

M1 = ratio taille code / taille test = 91732 / 40283 = 2.28

M2 : NCLOC = 91732
- metric obtenue par l'outil statistic
M3 : TLOC = 40283
- metric obtenue par l'outil statistic
M4 : TASSERT = 
- metrique obtenue par nos fonctions du tp1
M5 : PMNT = 8150 - 3709 / 8150 *100
- metrique obtenu par l'outil coverage de intellij

M6 : NOM = 8150
- metrique obtenu par l'outil coverage
M7: MCT = 3709
- metrique obtenu par l'outil coverage
M8 : AGE = la valeur obtenue par cette métrique n'a pu etre utilisé, puisqu'elle considère la dernière date de modification celle de la derniere ouverture sur notre ordinateur. En effet, lorsqu'on la testé avec la version qu'on a télécharger de jfreechart
  on constate qu'ils ont tous la meme date de last modified qui est la date a laquelle on unzip le dossier télécharger
- metrique obtenu par notre propre implémentation

M9 : WMC = 2860
- metrique obtenue par l'outil metricsTree

M11 : DC = CLOC / TLOC = 24430 / 40283 = 0.61

M12 : CLOC = 24430
- metrique obtenue par l'outil statistic

TACHE 3:

Q1: Est-ce qu'il y a assez de tests?

Non, il n'y a pas assez de tests. Nous arrivons à cette conclusion en observant les métriques obtenues.
1. le ratio taille code / taille test obtenue est de 91732/40283 = 2,28. Ce ratio est désequilibré. En effet, cela nous indique que le code est plus de 2 fois plus grands que ses tests.
2. le pourcenatge des méthodes non testées est de 8150-3709/8150 *100 = 54.49 %. Cette métrique nous indique que plus de 50% des méthodes du projets ne sont pas testées.
D'après ces métriques nous pouvons conclure qu'il n'y a effectivement pas assez de tests.


Q2 : Est-ce que les tests sont a jour avec le reste du code?

Nous n'avons pu répondre a cette question pour les raisons suivantes:
1. Les dernieres dates de modifications des fichiers tests sont erronés puisqu'ils représentent la dates à laquelle nous avons unzip le fichier telecharger,comme mentionné avant
2. Le PMNT est de 54.49% comme mentionné précédemment, cela peut signifier que le manque de tests et potentiellement du à un manque de mise a jour.
Puisque nous pouvons seulement recourir a une métrique, il est difficile de venir à une conclusion définitive.
De plus, puisque la deuxième métrique indique un manque potentiel, une autre façon de determiner la réponse a cette question serait de mesurer son évolution
Notamment le NOM et MCT. Si ces 2 métriques font au sorte que le PMNT garde un pourcentage similaire au fil du temps. Nous pourrons conclure que les tests sont, en effet, à jour.
puisque nous n'avons pas ces données, nous ne pouvons pas répondre a cette question.


Q3 : Est-ce que les tests sont trops complexes?
1. Les fichiers test contiennent 3709 méthodes en tout... 



Q4 : Est-ce que les tests sont suffisamment documentés?

Oui, les tests sont suffisament documenté. Nous arrivons a cette conclusion d'après les metriques suivants:
1. La densité de commentaire des tests est de 0.61, un ratio respectable. Ce ration indique la présence de commentaires dans anviron 60% des fichiers tests.
2. Plus précisemment, on retrouve 24430 lignes de commentaires pour 40283 lignes de codes dans les fichiers tests. 
3. Un nombre plus élevé indiquerait un surplus de documentation, ce qui pourrait nuire a la lisibilité des tests
4. un nombre plus bas indiquerait, cependant, un manque de documentation qui nuira a la compréhension des tests du point de vue du lecteur.


