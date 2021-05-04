Als erstes wollen wir in der Singleton Klasse unseren AccountManager (= der Singleton) threadsicher erzeugen (über die getInstance() Methode).
Die AccountManager Klasse hat 2 Methoden 
	Eine die Überweisungen handhabt (also den Credit Wert verändert)
	Eine die den Betrag am Konto zurückliefert

Die 2 Clients haben jeweils eigene Funktionen
	Mit dem Desktop Client können wir lediglich Geld über den AccountManager einzahlen
	Mit dem Mobilen Client können wir über den AccountManager Geld abbuchen und uns den Kontostand ausgeben lassen. 

In der Bilanz Klasse wollen wir beide Clients Instanziieren, dann einen Betrag ein- und anschließend auszahlen. Dazwischen und danach wollen wir den Kontostand ausgeben lassen, um zu überprüfen ob alles funktioniert hat. 