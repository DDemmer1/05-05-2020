# 05-05-2020 SoSe20 - Rekursion und Binäre-Suche

Übungsaufgabe vom 05.05.2020 für die Studierenden des Java II Seminars der Universität zu Köln

### 📝 Aufgabe:

- Erstellt eine ```class User``` mit:
  - einem Attribut ```int age```
  - anderen sinnvollen Attributen
  - Getter und Setter 
  - einem Konstruktor
  - einer ```toString()``` Methode
- Füllt eine ```List<User>``` mit 4 Objekten vom Typ ```User```
- Sortiert die ```List<User>``` mit einem ```Comparator<User>``` und der ```Collections.sort([...])``` Methode, aufsteigend nach dem ```int age``` Attribut
- Verwendet die ```Collections.binarySearch([...])``` Methode um nach dem Index eines ```User``` mit einem definierten ```int age``` in der Liste zu suchen

##### ⚠️ ADVANCED ⚠️:
  - Schreibt eine Methode ```public static void print(List<User> list, int startIndex)```:
    - die Methode soll ab dem angegebenen ```int startIndex``` über die ```List<User>``` laufen und jeden ```User``` in der Konsole ausgeben
    - die Methode soll rekursiv funktionieren und darf keine Schleife beinhalten
    
    
    
    
### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [🎥 Börges Seminar Video](https://uni-koeln.sciebo.de/s/CnL5Cg1opl8QceE)
- [🎥 Rekursion einfach erklärt](https://www.youtube.com/watch?v=weTpjhDnLnc)
- [🎥 Comparable vs Comparator in Java](https://www.youtube.com/watch?v=weTpjhDnLnc)

- [📃 Difference between Comparable and Comparator](https://www.javatpoint.com/difference-between-comparable-and-comparator)
- [📃 Comparable vs Comparator in Java](https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/)
- [📃 Iteration und Rekursion - Java](https://java-tutorial.org/iteration_und_rekursion.html)

- [🖊️ Stack Overflow - Are recursive methods always better than iterative methods in Java?](https://stackoverflow.com/questions/15346774/are-recursive-methods-always-better-than-iterative-methods-in-java)
- [🖊️ Stack Overflow - Benefits of recursion in Java?](https://stackoverflow.com/questions/8573116/what-is-the-benefit-of-using-or-creating-recursive-functions-in-java)
- [🖊️ Stack Overflow - When to use Comparable and Comparator?](https://stackoverflow.com/questions/2266827/when-to-use-comparable-and-comparator)





