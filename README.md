# Design Patterns Tutorial

## SOLID
Prinzipien guter Programmierung.

### Single Responsibility Principle (lesson_1)
- Jede Klasse darf nur eine Verantwortung haben!
- Eine Klasse Einkaufsliste darf demnach zum Beispiel nur methoden besitzen die diese modifizieren k�nnen.
- Die Klasse Einkaufsliste darf keine Files schreiben! Daf�r muss eine neue klasse WriteFileService erstellt werden.
- Was ist eigentlich Verantwortung?
	- Was ist der Grund Warum eine Klasse erstellt wurde?

### Open-Closed Principle (lesson_2)
- Softwaresysteme sollten offen für Erweiterungen sein, aber geschlossen für Modifikationen!
	- Das bedeutet es muss bei der Implementierung von Lösungen bereits an neue Einsatzmöglichkeiten gedacht werden die durch neue Anforderungen eventuell nötig werden.
	- Es muss so allgemein programmiert werden, dass die Klassen Erweiterbar bleiben ohne alles abreißen und neubauen zu müssen.
	
### Liskov Substitution Pinciple (lesson_3)
- Ein Unterklasse sollte stehts alle Eigenschaften der Oberklasse erfüllen und immer auch als Objekt eben dieser verwendbar sein!
- Unterklassen dürfen die Funktionen der Oberklasse erweitern aber nicht verändern!

### Interface Segregation Principle (lesson_4)
- Zu große Schnittstellen sollten in mehrere kleinere Schnittstellen aufgeteilt werden.
- Ein Interface darf nicht zu viele Zuständigkeiten festlegen.
	- Klassen sollten nicht unnötig viele Methoden Implementieren die sie evtl. gar nicht brauchen.
	
### Dependency Inversion Principle (lesson_5)
- Klassen höherer Ebene sollten nicht von Klassen niedriger Ebene abhängen beide sollten mittels Schnittstellen abstrahiert werden.
- Schnittstellen sollten nicht von Details, sondern die Details von den Schnittstellen abhängen.
- Immer gegen Interfaces programmieren!
- Obere ebenen sollen so wenig wie möglich von unterklassen wissen, nur das sie die Schnittstellen erfüllen.

## Erzeugungsmuster (Creation-Patterns)
- Nach den Erzeugungsmustern sollen Objekte nicht im Code erzeugt werden, sondern bei Bedarf eine Erzeugerklasse für der Erzeugung des Objekts genutzt werden.
	- Dadurch muss der Client keine Informationen darüber haben wie ein Objekt wirklich erzeugt wird, dies muss nur die Erzeugerklasse wissen.

### Builder Pattern
- Ermöglicht es ein Objekt nach und nach aufzubauen.
- Wann sollte das Builder Pattern genutzt werden?
	- Erzeugung eines Objektes ist sehr Komplex und benötigt beispielsweise viele andere Objekte die auch ersteinmal erzeugt werden müssen.
	- Wenn Objekte, die aus verschiedenen Objekten zusammengesetzt werden, in mehreren Variationen vorkommen. Indikator--> Überlagerte Konstruktoren.
	- Wenn die Applikation etwas von einem Format in ein anderes Format convertieren muss.
- Vorteile Builder Pattern:
	- Isolation der Implementation von Konstruktion und Repräsentation des Objektes.
	- Einfaches Ergänzen neuer Repräsentation möglich. -> neue Concrete Builder definieren.
	- Verringert Parameter im Konstruktor von objekten. (Es muss nicht mehr `null` bei optionalen Parametern mitgegeben werden)
	- Objekte aus mehreren Teilen werden immer ganzheitlich initialisiert.
	
### Factory Method Pattern
- Immer dann Anwendbar wenn Objekte von Klassen erst zu Laufzeit erzeugt werden sollen.
	- Bei der Programmierung ist noch __nicht__ bekannt welches Objekt zur Laufzeit benötigt wird.
- Hilft dem Programmierer das __Open-Closed Principle__ einzuhalten, also den Code erweiterbar zu halten!
	- Es können immer neue Implementationen der abstrakten Factory hinzugefügt werden.
- Vorteile Factory Method Pattern
	- Erweiterbarkeit
	- Wiederverwendbarkeit, es wird nur gegen Schnittstelle Programmiert.
- Nachteile Factory Method Pattern
	- Komplexität durch mehr Vererbungsebenen.
	
### Abstract Factory Pattern
- Wie bei Factory Pattern jedoch wird eine ganze Produktfamilie erzeugt und kein einzeles Objekt.
- Zwei Klassen die geimeinsam verwendet werden müssen werden von der gleichen Factory erzeugt.
- Client ist komplett von fachlicher Logik entkoppelt.
- Nachteil--> Erweiterbarkeit, sollte eine Produktfamilie erweitert werden müssen entsteht hoher Änderungsaufwand.
	
	
