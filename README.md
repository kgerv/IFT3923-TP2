# Killian Gervais & Gabriel Hazan - IFT3923-TP2

Obtention des métriques :

La métrique que nous avons implémenté est celle de l'AGE, qui retourne l'age d'un fichier. Les données collectées se retrouvent dans le fichier "outdated.csv".
Nous avons aussi utilisé la métrique TASSERT mais via un appel de tropcomp.jar, les résulats sont dans le fichier tassert.csv.
Les autres métriques ont été obtenues à l'aide de divers outils (plugins) que l'on retrouve dans l'IDE Intellij.
Ces outils sont instalables en allant dans "settings" > "plugins" > "marketplace".
Les outils en questions sont metricsTree, statistic et coverage(deja inclu dans l'IDE).
Toutes les données collectés ont été mis dans un fichier excel "jfreeClasses.xlsx".

Guide d'utilisation metricsTree :
après instalation, clicker sur "View" > "Tool Windows" > "MetricsTree". Ensuite clicker sur project metrics.

Guide d'utilisation coverage :
Clicker sur "Run" > "Run 'all in jfreeCharts' with coverage ". 

Guide d'utilisation Statistic :
Clicker sur "View" > "Tool Windows" > "Statistic". Clicker sur le dossier sur lequel vous voulez les metriques, dans notre cas, nous avons sélectionner le dosser "java" du dossier "test". Ensuite, clicker sur "Refresh on selection" dans la fenetre de Statistic.

