# 05-05-2020 SoSe20 - Rekursion und Binäre-Suche

Übungsaufgabe vom 05.05.2020 für die Studierenden des Java II Seminars der Universität zu Köln

### 📝 Aufgabe:

- Erstellt eine ```class User``` mit:
  - einem in ```int age```
  - anderen sinnvollen Attributen
  - Getter und Setter 
  - einem Konstruktor
  - einer ```toString()``` Methode
- Füllt eine ```List<User>``` mit 4 Objekten vom Typ ```User```
- Sortiert die ```List<User>``` mit einem ```Comparator<User>``` und der ```Collections.sort([...])``` Methode, nach dem ```int age``` Attribut
- Verwendet die ```Collections.binarySearch([...])``` Methode um nach dem Index eines ```User``` mit einem definierten ```int age``` in der Liste zu suchen

##### ⚠️ ADVANCED ⚠️:
  - Schreibt eine Methode ```public static void print(List<User> list, int startIndex)```:
    - die Methode soll ab dem angegebenen ```int startIndex``` über die ```List<User>``` laufen und jeden ```User``` in der Konsole ausgeben
    - die Methode soll rekursiv funktionieren und darf keine Schleife beinhalten
    
    
    
    
### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [🎥 Börges Seminar Video](https://uni-koeln.sciebo.de/s/CnL5Cg1opl8QceE)

- [📃 Difference between Comparable and Comparator](https://www.javatpoint.com/difference-between-comparable-and-comparator)
- [📃 Comparable vs Comparator in Java]/https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/)


- [🖊️ Stack Overflow - Why Getter and Setter?](https://stackoverflow.com/questions/1568091/why-use-getters-and-setters-accessors)


