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

